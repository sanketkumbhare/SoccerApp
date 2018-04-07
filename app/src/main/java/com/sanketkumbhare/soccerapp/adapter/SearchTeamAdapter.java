package com.sanketkumbhare.soccerapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sanketkumbhare.soccerapp.R;
import com.sanketkumbhare.soccerapp.activities.PlayerActivity;
import com.sanketkumbhare.soccerapp.models.SearchViewHolder;
import com.sanketkumbhare.soccerapp.models.Team;
import com.squareup.picasso.Picasso;

import java.util.List;

public class SearchTeamAdapter extends RecyclerView.Adapter<SearchViewHolder> {

    private Context mContext;
    private List<Team> mSearchList;

    public SearchTeamAdapter(Context mContext, List<Team> mSearchList) {
        this.mContext = mContext;
        this.mSearchList = mSearchList;
    }

    @NonNull
    @Override
    public SearchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(mContext).inflate(R.layout.adapter_search_team,null);
        return new SearchViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SearchViewHolder holder, final int position) {
        holder.text_sreach_name.setText(mSearchList.get(position).getStrTeam());
        holder.text_search_stadium.setText(mSearchList.get(position).getStrStadium());
        holder.text_search_sport.setText(mSearchList.get(position).getStrSport());
        holder.text_search_league.setText(mSearchList.get(position).getStrLeague());
        if(mSearchList.get(position).getStrTeamBadge()!=null&&!mSearchList.get(position).getStrTeamBadge().isEmpty())
        Picasso.with(mContext).load(mSearchList.get(position).getStrTeamBadge())
                .placeholder(R.drawable.badge)
                .error(R.drawable.badge)
                .into(holder.img_home_badge);
        else {
            Picasso.with(mContext).load(R.drawable.badge).into(holder.img_home_badge);
        }
        if(mSearchList.get(position).getStrTeamJersey()!=null&&!mSearchList.get(position).getStrTeamJersey().isEmpty())
        Picasso.with(mContext).load(mSearchList.get(position).getStrTeamJersey())
                .error(R.drawable.jersey)
                .placeholder(R.drawable.jersey)
                .into(holder.img_home_jersy);
        else {
            Picasso.with(mContext).load(R.drawable.jersey).into(holder.img_home_jersy);
        }
        holder.card_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mContext, PlayerActivity.class);
                intent.putExtra("teamId",String.valueOf(mSearchList.get(position).getIdTeam()))
                        .putExtra("teamName",mSearchList.get(position).getStrTeam());
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mSearchList.size();
    }
}
