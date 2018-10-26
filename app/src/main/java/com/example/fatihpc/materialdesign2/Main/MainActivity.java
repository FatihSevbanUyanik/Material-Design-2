package com.example.fatihpc.materialdesign2.Main;

import android.content.Intent;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.fatihpc.materialdesign2.AppBarLayout.AppBarLayoutActivity;
import com.example.fatihpc.materialdesign2.CollapsingToolAndNavDraw.CollapsingToolAndNavDraw;
import com.example.fatihpc.materialdesign2.CollapsingToolbarLayout.CollapsingToolbarActivity;
import com.example.fatihpc.materialdesign2.NavigationDrawer1.NavigationDrawer1Activity;
import com.example.fatihpc.materialdesign2.NavigationDrawer2.NavigationDrawer2Activity;
import com.example.fatihpc.materialdesign2.NavigationDrawer3.NavigationDrawer3Activity;
import com.example.fatihpc.materialdesign2.R;
import com.example.fatihpc.materialdesign2.TabBarLayout.CustomTabBar.CustomTabBarActivity;
import com.example.fatihpc.materialdesign2.TabBarLayout.IconTabBar.IconTabBarActivity;
import com.example.fatihpc.materialdesign2.TabBarLayout.IconTextTabBar.IconTextTabBarActivity;
import com.example.fatihpc.materialdesign2.TabBarLayout.TextTabBar.TextTabBarActivity;
import com.example.fatihpc.materialdesign2.ViewPager.ViewPagerActivity;
import com.example.fatihpc.materialdesign2.ViewPagerWithFragment.FragmentPagerActivity;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setToolbar();
    }

    private void setToolbar() {
        toolbar = findViewById( R.id.include );
        setSupportActionBar( toolbar );
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate( R.menu.menu_main , menu );
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if ( item.getItemId() == R.id.menuItemNavigationDrawer1 ){
            Intent intent = new Intent( this , NavigationDrawer1Activity.class );
            startActivity( intent );
        }

        else if ( item.getItemId() == R.id.menuItemNavigationDrawer2 ){
            Intent intent = new Intent( this , NavigationDrawer2Activity.class );
            startActivity( intent );
        }

        else if ( item.getItemId() == R.id.menuItemNavigationDrawer3 ){
            Intent intent = new Intent( this , NavigationDrawer3Activity.class );
            startActivity( intent );
        }

        else if ( item.getItemId() == R.id.menuItemAppBarLayout ){
            Intent intent = new Intent( this , AppBarLayoutActivity.class );
            startActivity( intent );
        }

        else if ( item.getItemId() == R.id.menuItemCollapsingToolbarLayout ){
            Intent intent = new Intent( this , CollapsingToolbarActivity.class );
            startActivity( intent );
        }

        else if ( item.getItemId() == R.id.menuItemCollapsingToolAndNavDraw ){
            Intent intent = new Intent( this , CollapsingToolAndNavDraw.class );
            startActivity( intent );
        }

        else if ( item.getItemId() == R.id.menuItemViewPager ){
            Intent intent = new Intent( this , ViewPagerActivity.class );
            startActivity( intent );
        }

        else if ( item.getItemId() == R.id.menuItemFragmentPager ){
            Intent intent = new Intent( this , FragmentPagerActivity.class );
            startActivity( intent );
        }

        else if ( item.getItemId() == R.id.menuItemTextTabBar ){
            Intent intent = new Intent( this , TextTabBarActivity.class );
            startActivity( intent );
        }

        else if ( item.getItemId() == R.id.menuItemIconTabBar ){
            Intent intent = new Intent( this , IconTabBarActivity.class );
            startActivity( intent );
        }

        else if ( item.getItemId() == R.id.menuItemIconTextTabBar ){
            Intent intent = new Intent( this , IconTextTabBarActivity.class );
            startActivity( intent );
        }

        else if ( item.getItemId() == R.id.menuItemCustomTabBar ){
            Intent intent = new Intent( this , CustomTabBarActivity.class );
            startActivity( intent );
        }

        return super.onOptionsItemSelected(item);
    }
}
