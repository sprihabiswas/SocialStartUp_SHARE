package com.example.sprihabiswas.share_draft1.model;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sprihabiswas.share_draft1.R;
import com.example.sprihabiswas.share_draft1.sb.Activity_EventDetails;

/**
 * Created by Spriha Biswas on 11/2/2015.
 */
public class NgoViewHolder extends RecyclerView.ViewHolder{


    public TextView NgoName;
    public TextView NgoField;
    public TextView NgoVol;

    public ImageView NgoImage;
    public CardView NgoCard;

    public NgoViewHolder(final View itemView) {
        super(itemView);
        NgoName = (TextView) itemView.findViewById(R.id.tv_ngo_card_name);
        NgoField = (TextView) itemView.findViewById(R.id.tv_ngo_card_field);
        NgoVol = (TextView) itemView.findViewById(R.id.tv_ngo_card_vol);


        NgoImage = (ImageView) itemView.findViewById(R.id.iv_ngo_card);
        NgoCard = (CardView) itemView.findViewById(R.id.ngo_card_view);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                /**Constants.EventPosition=getAdapterPosition();
                Context c = v.getContext();
                Intent i = new Intent(c, Activity_EventDetails.class);
                c.startActivity(i);*/
            }
        });
    }

}

