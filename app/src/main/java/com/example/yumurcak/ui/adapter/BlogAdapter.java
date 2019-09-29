package com.example.yumurcak.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.yumurcak.R;
import com.example.yumurcak.data.model.Event;

import java.util.ArrayList;
import java.util.List;

public class BlogAdapter extends RecyclerView.Adapter<BlogAdapter.MyViewHolder> {

    private List<Event> eventList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, year, genre;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            genre = (TextView) view.findViewById(R.id.title);
            year = (TextView) view.findViewById(R.id.title);
        }
    }


    public BlogAdapter(List<Event> eventList) {
        this.eventList = eventList;
    }

    @Override
    public BlogAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_blog, parent, false);

        return new BlogAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(BlogAdapter.MyViewHolder holder, int position) {
        Event event = eventList.get(position);
        /*holder.title.setText(event);
        holder.genre.setText(event.getGenre());
        holder.year.setText(event.getYear());*/
    }

    @Override
    public int getItemCount() {
        return eventList.size();
    }
}
