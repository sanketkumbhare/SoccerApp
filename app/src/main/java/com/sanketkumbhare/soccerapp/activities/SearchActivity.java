package com.sanketkumbhare.soccerapp.activities;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.sanketkumbhare.soccerapp.R;
import com.sanketkumbhare.soccerapp.adapter.ViewPagerAdapter;
import com.sanketkumbhare.soccerapp.fragments.search_player_fragment;
import com.sanketkumbhare.soccerapp.fragments.search_team_fragment;
import com.sanketkumbhare.soccerapp.utils.NetworkConnection;

import java.util.Objects;

public class SearchActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        settoolbar(getIntent().getStringExtra("Query"));
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new search_team_fragment(), "Team");
        adapter.addFragment(new search_player_fragment(), "Player");
        viewPager.setAdapter(adapter);
    }


    public void settoolbar(String title){
        Toolbar toolbar = (Toolbar) findViewById(R.id.search_toolbar);
        setSupportActionBar(toolbar);
        setTitle(title);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }
   }
