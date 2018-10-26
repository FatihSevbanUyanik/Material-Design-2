package com.example.fatihpc.materialdesign2.AppBarLayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.example.fatihpc.materialdesign2.R;

public class AppBarLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_bar_layout);
        setRecyclerView();
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
}