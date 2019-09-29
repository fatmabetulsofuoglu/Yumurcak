package com.example.yumurcak.ui.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yumurcak.R;
import com.example.yumurcak.data.model.Event;
import com.example.yumurcak.ui.adapter.EventAdapter;

import java.util.ArrayList;
import java.util.List;

public class EventFragment extends Fragment {
    RecyclerView rvEvent;
    private EventAdapter mAdapter;
    List<Event> eventList;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mAdapter=new EventAdapter(null);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        rvEvent.setLayoutManager(mLayoutManager);
        rvEvent.setAdapter(mAdapter);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_event, container, false);
        rvEvent = view.findViewById(R.id.rvEvent);
        return view;
    }

}