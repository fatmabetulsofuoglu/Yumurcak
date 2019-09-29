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

public class BlogAdapter {
    public class EventAdapter extends BaseAdapter {
        ArrayList<blog_list> blogList;
        Context context;

        public EventAdapter ( ArrayList<blog_list> eventList, Context context){
            this.blogList = eventList;
            this.context= context;
        }
        @Override
        public int getCount() { return blogList.size ();
        }

        @Override
        public Object getItem(int position) {
            return blogList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View v = View.inflate(context, R.layout.design_blog_design, null);
            ImageView imgUserPhtEvnt=
                    (ImageView) v.findViewById(R.id.user_photo_blog);
            Button btnUserTxt=
                    (Button) v.findViewById(R.id.user_btn_blog);
            TextView txtUsertxt=
                    (TextView) v.findViewById(R.id.user_txt_blog);
            TextView txtTitle=
                    (TextView) v.findViewById(R.id.title_txt_blog);
            TextView txtindex=
                    (TextView) v.findViewById(R.id.index_txt_blog);
            imgUserPhtEvnt.setImageResource(blogList.get(position).userPhotoEvent);
            btnUserTxt.setOnClickListener(blogList.get(position).userTextEvent);
            txtUsertxt.setText(blogList.get(position).userTextEvent);
            txtTitle.setText(blogList.get(position).TitleEvent);
            txtindex.setText(blogList.get(position).IndexEvent);
            return v;
        }
    }

}
