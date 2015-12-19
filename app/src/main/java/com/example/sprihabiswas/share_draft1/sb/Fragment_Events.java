package com.example.sprihabiswas.share_draft1.sb;

import android.app.usage.UsageEvents;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import com.example.sprihabiswas.share_draft1.R;
import com.example.sprihabiswas.share_draft1.adapter.EventAdapter;
import com.example.sprihabiswas.share_draft1.model.EventData;

import java.util.ArrayList;

/**
 * Created by Spriha Biswas on 10/28/2015.
 */
public class Fragment_Events extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view =inflater.inflate(R.layout.fragment_events,null);
        RecyclerView rv = (RecyclerView) view.findViewById(R.id.event_card_list);
        //rv.setHasFixedSize(true);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rv.setLayoutManager(llm);

        EventAdapter adapter = new EventAdapter(generateData());
        rv.setAdapter(adapter);

        return view;
    }
    private ArrayList<EventData> generateData() {
        ArrayList<EventData> events= new ArrayList<>();
        events.add(new EventData("Juhu Beach Clean Up Drive", "Juhu, Mumbai","By Youth Club","15","NOV", R.drawable.event1));
        events.add(new EventData("Run for A Cause", "Powai,Mumbai", "By Hiranandani", "29", "DEC", R.drawable.event2));
        events.add(new EventData("Food for All", "Bandra,Mumbai","By Akshaya Patra","30","JAN", R.drawable.event3));



        return events;
    }


    /**@Override
    public void onItemClick(AdapterView<?> parent, View view, int position,
                            long id) {

        Constants.pe=position;
        Intent i = new Intent(getActivity(), EventsDetailsActivity.class);
        startActivity(i);
        //getActivity().finish();*/


    }


