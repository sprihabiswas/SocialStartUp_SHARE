package com.example.sprihabiswas.share_draft1.model;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sprihabiswas.share_draft1.R;
import com.example.sprihabiswas.share_draft1.sb.Activity_EventDetails;
import com.example.sprihabiswas.share_draft1.sb.Activity_Tabbed;

public class EventViewHolder extends RecyclerView.ViewHolder{


    public TextView EventName;
    public TextView EventAd;
    public TextView EventBy;
    public TextView EventDate;
    public TextView EventMonth;

    public ImageView EventImage;
    public CardView EventCard;

    Typeface tf;

    public EventViewHolder(final View itemView) {
        super(itemView);

        tf = Typeface.createFromAsset(itemView.getContext().getAssets(), Constants.fontpath_regular);
        EventName = (TextView) itemView.findViewById(R.id.tv_event_card_name);
        EventName.setTypeface(tf);

        tf = Typeface.createFromAsset(itemView.getContext().getAssets(), Constants.fontpath_light);
        EventAd = (TextView) itemView.findViewById(R.id.tv_event_card_ad);
        EventAd.setTypeface(tf);

        tf = Typeface.createFromAsset(itemView.getContext().getAssets(), Constants.fontpath_ultralight);
        EventBy = (TextView) itemView.findViewById(R.id.tv_event_card_by);
        EventBy.setTypeface(tf);
        EventDate = (TextView) itemView.findViewById(R.id.tv_event_card_date);
        EventDate.setTypeface(tf);
        EventMonth = (TextView) itemView.findViewById(R.id.tv_event_card_month);
        EventMonth.setTypeface(tf);

        EventImage = (ImageView) itemView.findViewById(R.id.iv_event_card);
        EventCard = (CardView) itemView.findViewById(R.id.event_card_view);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Constants.EventPosition=getAdapterPosition();
                Context c = v.getContext();
                Intent i = new Intent(c, Activity_EventDetails.class);
                c.startActivity(i);

            }
        });
    }

}
