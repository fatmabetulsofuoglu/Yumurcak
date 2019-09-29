package com.example.yumurcak.ui.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.yumurcak.R;

import java.util.ArrayList;

public class NotificationAdapter extends BaseAdapter {


    ArrayList<notificate_list> notificateList;
    Context context;

    public NotificationAdapter ( ArrayList<notificate_list> eventList, Context context){
        this.notificateList = eventList;
        this.context= context;
    }
    @Override
    public int getCount() { return notificateList.size ();
    }

    @Override
    public Object getItem(int position) {
        return notificateList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(context, R.layout.design_notification_design, null);
        ImageView imgUserPhtNt=
                (ImageView) v.findViewById(R.id.user_photo_notificate);
        TextView txtNotificate=
                (TextView) v.findViewById(R.id.txt_notification);
        imgUserPhtNt.setImageResource(notificateList.get(position).userPhotoNotificate);
        txtNotificate.setText(notificateList.get(position).textNotification);
        return v;
    }
}
