package com.sanketkumbhare.soccerapp.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.sanketkumbhare.soccerapp.R;
import com.sanketkumbhare.soccerapp.models.NextViewHolder;
import com.sanketkumbhare.soccerapp.models.Result;
import com.sanketkumbhare.soccerapp.models.ResultViewHolder;
import com.squareup.picasso.Picasso;

import java.util.List;

public class NextEventAdapter extends RecyclerView.Adapter<NextViewHolder> {
    Context mContext;
    List<Result> mNextEvent;
    private int lastPosition = -1;

    public NextEventAdapter(Context mContext, List<Result> mNextEvent) {
        this.mContext = mContext;
        this.mNextEvent = mNextEvent;
    }

    @NonNull
    @Override
    public NextViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(mContext).inflate(R.layout.adapter_next_event,null);
        return new NextViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull NextViewHolder holder, int position) {
        holder.text_next_event.setText(mNextEvent.get(position).getStrEvent());
        holder.text_next_time.setText(mNextEvent.get(position).getStrTime());
        holder.text_next_date.setText(mNextEvent.get(position).getStrDate());
        Picasso.with(mContext).load(R.drawable.jersey).into(holder.img_away_jersey);
        Picasso.with(mContext).load(R.drawable.jersey2).into(holder.img_home_jersey);
        setAnimation(holder.itemView,position);

    }

    @Override
    public int getItemCount() {
        return mNextEvent.size();
    }

    private void setAnimation(View viewToAnimate, int position)
    {
        // If the bound view wasn't previously displayed on screen, it's animated
        if (position > lastPosition)
        {
            Animation animation = AnimationUtils.loadAnimation(mContext,R.anim.item_animation_from_right);
            viewToAnimate.startAnimation(animation);
            lastPosition = position;
        }
    }
}
