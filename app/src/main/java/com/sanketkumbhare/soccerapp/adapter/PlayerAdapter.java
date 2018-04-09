package com.sanketkumbhare.soccerapp.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.sanketkumbhare.soccerapp.R;
import com.sanketkumbhare.soccerapp.activities.PlayerActivity;
import com.sanketkumbhare.soccerapp.models.NewsViewHolder;
import com.sanketkumbhare.soccerapp.models.Player;
import com.sanketkumbhare.soccerapp.models.PlayerViewHolder;
import com.squareup.picasso.Picasso;

import java.util.List;

public class PlayerAdapter extends RecyclerView.Adapter<PlayerViewHolder> {
    Context mContext;
    List<Player> mPlayerList;
    private int lastPosition=-1;


    public PlayerAdapter(Context mContext, List<Player> mPlayerList) {
        this.mContext = mContext;
        this.mPlayerList = mPlayerList;
    }

    @NonNull
    @Override
    public PlayerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(mContext).inflate(R.layout.adapter_player,null);
        return new PlayerViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull PlayerViewHolder holder, int position) {

        holder.text_player_name.setText("Name :"+mPlayerList.get(position).getStrPlayer());
        if(mPlayerList.get(position).getStrNationality() == null || mPlayerList.get(position).getStrNationality().isEmpty()){
            holder.text_nationality.setVisibility(View.GONE);
        }else {
            holder.text_nationality.setText("Nationality :"+mPlayerList.get(position).getStrNationality());
        }
        if(mPlayerList.get(position).getStrPosition() == null || mPlayerList.get(position).getStrPosition().isEmpty()){
            holder.text_player_position.setVisibility(View.GONE);
        }else {
            holder.text_player_position.setText("Position :" +mPlayerList.get(position).getStrPosition());
        }
        if(mPlayerList.get(position).getStrHeight() == null || mPlayerList.get(position).getStrHeight().isEmpty()){
            holder.text_player_height.setVisibility(View.GONE);
        }else {
            holder.text_player_height.setText("Height :"+mPlayerList.get(position).getStrHeight());
        }
        if(mPlayerList.get(position).getStrWeight()== null || mPlayerList.get(position).getStrWeight().isEmpty()){
            holder.text_player_weight.setVisibility(View.GONE);
        }else {
            holder.text_player_weight.setText("Weight :"+mPlayerList.get(position).getStrWeight());
        }
        if(mPlayerList.get(position).getDateBorn() == null || mPlayerList.get(position).getDateBorn().isEmpty()){
            holder.text_player_birth.setVisibility(View.GONE);
        }else {
            holder.text_player_birth.setText("DOB :"+mPlayerList.get(position).getDateBorn());
        }
        Picasso.with(mContext).load(mPlayerList.get(position).getStrCutout())
                        .placeholder(R.drawable.user)
                        .into(holder.img_player);

        setAnimation(holder.itemView,position);
    }

    @Override
    public int getItemCount() {
        return mPlayerList.size();
    }

    private void setAnimation(View viewToAnimate, int position)
    {
        // If the bound view wasn't previously displayed on screen, it's animated
        if (position > lastPosition)
        {
            Animation animation = AnimationUtils.loadAnimation(mContext, R.anim.item_animation_from_right);
            viewToAnimate.startAnimation(animation);
            lastPosition = position;
        }
    }
}
