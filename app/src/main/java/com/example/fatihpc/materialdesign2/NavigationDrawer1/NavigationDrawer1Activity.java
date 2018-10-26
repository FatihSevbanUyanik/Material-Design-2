package com.example.fatihpc.materialdesign2.NavigationDrawer1;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.fatihpc.materialdesign2.R;

public class NavigationDrawer1Activity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private Toolbar toolbar;
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer1);
        setToolbar();
        setNavigationView();
    }

    private void setNavigationView() {
        drawerLayout = findViewById( R.id.drawerLayout );
        NavigationView navigationView = findViewById( R.id.navigationView );
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this ,
                drawerLayout , toolbar , R.string.drawer_opened , R.string.drawer_closed);
        drawerLayout.addDrawerListener( actionBarDrawerToggle );
        actionBarDrawerToggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    private void setToolbar() {
        toolbar = findViewById( R.id.include1 );
        setSupportActionBar( toolbar );
    }

    private void closeNavigationView() {
        drawerLayout.closeDrawer(GravityCompat.START);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        String itemTitle = item.getTitle().toString();
        Toast.makeText( getApplicationContext() , itemTitle , Toast.LENGTH_SHORT ).show();
        closeNavigationView();
        return false;
    }

    @Override
    public void onBackPressed() {
        if ( drawerLayout.isDrawerOpen(Gravity.START) )
            closeNavigationView();
        else
            super.onBackPressed();
    }

}