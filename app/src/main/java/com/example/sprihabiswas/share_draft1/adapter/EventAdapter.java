package com.example.sprihabiswas.share_draft1.adapter;

import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.sprihabiswas.share_draft1.R;
import com.example.sprihabiswas.share_draft1.model.EventData;
import com.example.sprihabiswas.share_draft1.model.EventViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Spriha Biswas on 10/29/2015.
 */

public class EventAdapter extends RecyclerView.Adapter<EventViewHolder>{


    private List<EventData> events;

    public EventAdapter(List<EventData> events) {
        this.events = new ArrayList<>();
        this.events.addAll(events);
    }

    @Override
    public EventViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        final View itemView = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.card_view_event, viewGroup, false);

        return new EventViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(EventViewHolder eventViewHolder, int i) {
        EventData event = events.get(i);
        eventViewHolder.EventName.setText(event.getEventName());
        eventViewHolder.EventAd.setText(event.getEventAd());
        eventViewHolder.EventBy.setText(event.getEventBy());
        eventViewHolder.EventDate.setText(event.getEventDate());
        eventViewHolder.EventMonth.setText(event.getEventMonth());
        eventViewHolder.EventImage.setImageResource(event.getEventPhotoId());

    }



    @Override
    public int getItemCount() {
        return events.size();
    }
}

