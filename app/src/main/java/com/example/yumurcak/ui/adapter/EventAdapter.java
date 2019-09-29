package com.example.yumurcak.ui.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.yumurcak.R;
import com.example.yumurcak.ui.fragment.EventFragment;

import java.util.ArrayList;

public class EventAdapter extends BaseAdapter {
   ArrayList<EventFragment> eventList;
    Context context;

    public EventAdapter (ArrayList<EventFragment> eventList, Context context){
      this.eventList = eventList;
      this.context= context;
    }
    @Override
    public int getCount() { return eventList.size ();
    }

    @Override
    public Object getItem(int position) {
        return eventList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(context, R.layout.design_event_design, null);
        ImageView imgUserPhtEvnt=
                (ImageView) v.findViewById(R.id.user_photo_event);
        Button btnUserTxt=
                (Button) v.findViewById(R.id.user_btn_event);
        TextView txtUsertxt=
                (TextView) v.findViewById(R.id.user_txt_event);
        TextView txtTitle=
                (TextView) v.findViewById(R.id.title_txt_event);
        ImageView imageIndex=
                (ImageView) v.findViewById(R.id.index_image_event);
        ImageView imageIndex2=
                (ImageView) v.findViewById(R.id.index_image2_event);
        imgUserPhtEvnt.setImageResource(eventList.get(position).userPhotoEvent);
        btnUserTxt.setOnClickListener(eventList.get(position).userButtonEvent);
        txtUsertxt.setText(eventList.get(position).userTextEvent);
        txtTitle.setText(eventList.get(position).TitleEvent);
        imageIndex.setImageResource(eventList.get(position).indexEvent);
        imageIndex2.setImageResource(eventList.get(position).indexEvent2);
        return v;
    }
}
