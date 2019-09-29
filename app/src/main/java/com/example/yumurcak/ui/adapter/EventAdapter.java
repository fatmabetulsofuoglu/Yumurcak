package com.example.yumurcak.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.yumurcak.R;
import com.example.yumurcak.data.model.Event;

import java.util.List;

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.MyViewHolder> {

    private List<Event> eventList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tvNameSurname, tvUserName, tvTitleEvent,tvContextEvent;
        public ImageButton btnUserPhotoURL;
        ImageView ivEventPhotoURL1,ivEventPhotoURL2;

        public MyViewHolder(View view) {
            super(view);
            tvNameSurname = (TextView) view.findViewById(R.id.tvNameSurname);
            tvUserName = (TextView) view.findViewById(R.id.tvUserName);
            tvTitleEvent = (TextView) view.findViewById(R.id.tvTitleEvent);
            tvContextEvent = (TextView) view.findViewById(R.id.tvContextEvent);
            btnUserPhotoURL = (ImageButton) view.findViewById(R.id.btnUserPhotoURL);
            ivEventPhotoURL1 = (ImageView) view.findViewById(R.id.ivEventPhotoURL1);
            ivEventPhotoURL2 = (ImageView) view.findViewById(R.id.ivEventPhotoURL2);
        }
    }


    public EventAdapter(List<Event> eventList) {
        this.eventList = eventList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_blog, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Event event = eventList.get(position);
        holder.tvContextEvent.setText(event.getEventContext());
        holder.tvNameSurname.setText(event.getNameSurname());
        holder.tvTitleEvent.setText(event.getEventTitle());

    }

    @Override
    public int getItemCount() {
        return eventList.size();
    }
}
