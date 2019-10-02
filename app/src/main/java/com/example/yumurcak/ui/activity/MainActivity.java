package com.example.yumurcak.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.yumurcak.R;
import com.example.yumurcak.data.api.FirebaseService;
import com.example.yumurcak.ui.fragment.BlogFragment;
import com.example.yumurcak.ui.fragment.BottomSheetAddFragment;
import com.example.yumurcak.ui.fragment.EventFragment;
import com.example.yumurcak.ui.fragment.ForumFragment;
import com.example.yumurcak.ui.fragment.NewPostFragment;
import com.example.yumurcak.ui.fragment.NotificationsFragment;
import com.example.yumurcak.ui.fragment.ProfileFragment;
import com.example.yumurcak.ui.fragment.SaveEventFragment;
import com.example.yumurcak.ui.fragment.SaveBlogFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottom;
    Fragment fragment;
    NavigationView navigationView;
    Toolbar toolbar;
    DrawerLayout drawerLayout;
    FirebaseService service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        service = new FirebaseService();

        setContentView(R.layout.activity_main);
        bottom = findViewById(R.id.bottom);
        navigationView = findViewById(R.id.nav_view);
        toolbar = findViewById(R.id.toolbar);
        drawerLayout = findViewById(R.id.drawerLayout);
        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);

        fragment = new EventFragment();
        LoadFragment(fragment);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id = menuItem.getItemId();
                if (id == R.id.navSavesActivity) {
                    fragment = new SaveEventFragment();
                } else if (id == R.id.navSavesBlogs) {
                    fragment = new SaveBlogFragment();
                } else if (id == R.id.navForum) {
                    fragment = new ForumFragment();
                } else if (id == R.id.navLogout) {
                    service.firebaseAuth.signOut();
                    startActivity(new Intent(MainActivity.this, LoginActivity.class));
                    finish();
                }
                LoadFragment(fragment);

                return false;
            }
        });

        bottom.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                if (menuItem.getItemId() == R.id.activity) {
                    fragment = new EventFragment();
                    LoadFragment(fragment);
                } else if (menuItem.getItemId() == R.id.blog) {
                    fragment = new BlogFragment();
                    LoadFragment(fragment);
                } else if (menuItem.getItemId() == R.id.add) {
                    BottomSheetAddFragment dialog = new BottomSheetAddFragment();
                    dialog.show(getSupportFragmentManager(), "BottomSheetAddFragment");
                } else if (menuItem.getItemId() == R.id.notifications) {
                    fragment = new NotificationsFragment();
                    LoadFragment(fragment);
                } else if (menuItem.getItemId() == R.id.profile) {
                    fragment = new ProfileFragment();
                    LoadFragment(fragment);
                }
                return true;
            }
        });
    }

    private void LoadFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout, fragment);
        transaction.addToBackStack(fragment.getTag()).commit();
    }
}

