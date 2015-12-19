package com.example.sprihabiswas.share_draft1.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sprihabiswas.share_draft1.R;
import com.example.sprihabiswas.share_draft1.model.NgoData;
import com.example.sprihabiswas.share_draft1.model.NgoViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Spriha Biswas on 11/2/2015.
 */

public class NgoAdapter extends RecyclerView.Adapter<NgoViewHolder>{


    private List<NgoData> events;

    public NgoAdapter(List<NgoData> events) {
        this.events = new ArrayList<>();
        this.events.addAll(events);
    }

    @Override
    public NgoViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        final View itemView = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.card_view_ngo, viewGroup, false);

        return new NgoViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(NgoViewHolder eventViewHolder, int i) {
        NgoData event = events.get(i);
        eventViewHolder.NgoName.setText(event.getNgoName());
        eventViewHolder.NgoField.setText(event.getNgoField());
        eventViewHolder.NgoVol.setText(event.getNgoVol());

        eventViewHolder.NgoImage.setImageResource(event.getNgoPhotoId());

    }

    @Override
    public int getItemCount() {
        return events.size();
    }
}

