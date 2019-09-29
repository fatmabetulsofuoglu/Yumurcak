package com.example.yumurcak.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.yumurcak.R;
import com.example.yumurcak.data.model.Notification;

import java.util.List;

public class NotificationAdapter  extends RecyclerView.Adapter<NotificationAdapter.MyViewHolder> {

    private List<Notification> notifications;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, year, genre;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            genre = (TextView) view.findViewById(R.id.title);
            year = (TextView) view.findViewById(R.id.title);
        }
    }


    public NotificationAdapter(List<Notification> notifications) {
        this.notifications = notifications;
    }

    @Override
    public NotificationAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_blog, parent, false);

        return new NotificationAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(NotificationAdapter.MyViewHolder holder, int position) {
        Notification notification = notifications.get(position);
        /*holder.title.setText(event);
        holder.genre.setText(event.getGenre());
        holder.year.setText(event.getYear());*/
    }

    @Override
    public int getItemCount() {
        return notifications.size();
    }
}
