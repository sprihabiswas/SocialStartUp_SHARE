package com.example.sprihabiswas.share_draft1.sb;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sprihabiswas.share_draft1.R;
import com.example.sprihabiswas.share_draft1.adapter.EventAdapter;
import com.example.sprihabiswas.share_draft1.adapter.NgoAdapter;
import com.example.sprihabiswas.share_draft1.model.EventData;
import com.example.sprihabiswas.share_draft1.model.NgoData;

import java.util.ArrayList;

/**
 * Created by Spriha Biswas on 10/28/2015.
 */
public class Fragment_Orgs extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_orgs, null);
        RecyclerView rv = (RecyclerView) view.findViewById(R.id.ngo_card_list);
        //rv.setHasFixedSize(true);

        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rv.setLayoutManager(llm);

        NgoAdapter adapter = new NgoAdapter(generateData());
        rv.setAdapter(adapter);

        return view;
    }

    private ArrayList<NgoData> generateData() {
        ArrayList<NgoData> events = new ArrayList<>();
        events.add(new NgoData("Teach For India", "Education", "4000 volunteers",R.drawable.ngo1));
        events.add(new NgoData("Umeed Foundation", "Child Welfare", "2000 volunteers",R.drawable.ngo2));
        events.add(new NgoData("Akshaya Patra Foundation", "Food for all","3000 volunteers", R.drawable.ngo3));



        return events;
    }
}
