package com.sanketkumbhare.soccerapp.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sanketkumbhare.soccerapp.R;
import com.sanketkumbhare.soccerapp.adapter.NewsAdapter;
import com.sanketkumbhare.soccerapp.models.LiveScore;
import com.sanketkumbhare.soccerapp.models.News;

import java.util.ArrayList;
import java.util.List;

public class livescore_fragment extends Fragment {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager mLayoutmanager;
    NewsAdapter mNewsAdapter;
    List<LiveScore> mLivelist = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_livescore,container,false);

        return view;
    }
}
