package com.example.yumurcak.ui.activity;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.example.yumurcak.R;
import com.example.yumurcak.ui.fragment.BlogFragment;
import com.example.yumurcak.ui.fragment.BottomSheetAddFragment;
import com.example.yumurcak.ui.fragment.EventFragment;
import com.example.yumurcak.ui.fragment.ForumFragment;
import com.example.yumurcak.ui.fragment.NewPostFragment;
import com.example.yumurcak.ui.fragment.NotificationsFragment;
import com.example.yumurcak.ui.fragment.SaveEventFragment;
import com.example.yumurcak.ui.fragment.SaveBlogFragment;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottom;
    Fragment fragment;
    NavigationView navigationView;
    Toolbar toolbar;
    DrawerLayout drawerLayout;
    FloatingActionButton fabAdd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bottom = findViewById(R.id.bottom);
        fabAdd = findViewById(R.id.fabAdd);
        navigationView = findViewById(R.id.nav_view);
        toolbar = findViewById(R.id.toolbar);
        drawerLayout = findViewById(R.id.drawerLayout);

        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        fabAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetAddFragment dialog = new BottomSheetAddFragment();
                dialog.show(getSupportFragmentManager(),"BottomSheetAddFragment");
            }
        });
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
                } else if (menuItem.getItemId() == R.id.blog) {
                    fragment= new BlogFragment();
                } else if (menuItem.getItemId() == R.id.add) {
                    fragment= new NewPostFragment();
                } else if (menuItem.getItemId() == R.id.notifications) {
                    fragment= new NotificationsFragment();
                }
                LoadFragment(fragment);
                return true;
            }
        });
    }

    private void LoadFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.frame_layout, fragment);
        transaction.commit();
    }
}

