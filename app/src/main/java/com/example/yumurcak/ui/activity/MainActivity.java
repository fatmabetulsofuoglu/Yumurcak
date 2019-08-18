package com.example.yumurcak.ui.activity;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.yumurcak.R;
import com.example.yumurcak.ui.fragment.Activity_Fragment;
import com.example.yumurcak.ui.fragment.BlogFragment;
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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bottom = findViewById(R.id.bottom);

        navigationView = findViewById(R.id.nav_view);
        toolbar = findViewById(R.id.toolbar);
        drawerLayout = findViewById(R.id.drawerLayout);

        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {



            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id = menuItem.getItemId();


                if (id == R.id.navSavesActivity) {
                    fragment = new SaveEventFragment();
                    LoadFragment(fragment);
                }

                else if (id == R.id.navSavesBlogs) {
                    fragment = new SaveBlogFragment();
                    LoadFragment(fragment);
                }

                else if (id == R.id.navForum) {
                    fragment = new ForumFragment();
                    LoadFragment(fragment);
                }

                return false;
            }
        });

        bottom.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                if(menuItem.getItemId()==R.id.activity){
                    fragment = new Activity_Fragment();
                    LoadFragment(fragment);
                }

                else if(menuItem.getItemId()==R.id.blog){
                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame_layout, new BlogFragment());
                    transaction.commit();
                }

                else if(menuItem.getItemId()==R.id.add){
                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame_layout, new NewPostFragment());
                    transaction.commit();
                }

                else if(menuItem.getItemId()==R.id.notifications){
                    FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.frame_layout, new NotificationsFragment());
                    transaction.commit();
                }
                return true;
            }
        });
    }
    private void LoadFragment(Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_layout, new Activity_Fragment());
        transaction.commit();
    }
}

