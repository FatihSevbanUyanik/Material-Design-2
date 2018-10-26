package com.example.fatihpc.materialdesign2.CollapsingToolbarLayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.fatihpc.materialdesign2.AppBarLayout.AppBarLayoutActivity;
import com.example.fatihpc.materialdesign2.NavigationDrawer1.NavigationDrawer1Activity;
import com.example.fatihpc.materialdesign2.NavigationDrawer2.NavigationDrawer2Activity;
import com.example.fatihpc.materialdesign2.NavigationDrawer3.NavigationDrawer3Activity;
import com.example.fatihpc.materialdesign2.R;

public class CollapsingToolbarActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapsing_toolbar);
        setRecyclerView();

        toolbar = findViewById( R.id.toolbar );
        setSupportActionBar(toolbar);
    }

    private void setRecyclerView()
    {
        RecyclerView recyclerView = findViewById( R.id.landscapeRecyclerView );
        LandscapeAdapter landscapeAdapter = new LandscapeAdapter
                ( this , LandscapeListData.getData() );

        recyclerView.setAdapter( landscapeAdapter );

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        linearLayoutManager.setAutoMeasureEnabled(true);
        recyclerView.setLayoutManager(linearLayoutManager);
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

        return super.onOptionsItemSelected(item);
    }

}
