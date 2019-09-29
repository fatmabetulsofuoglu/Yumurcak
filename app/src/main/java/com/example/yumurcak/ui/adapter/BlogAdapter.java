package com.example.yumurcak.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.yumurcak.R;
import com.example.yumurcak.data.model.Blog;
import java.util.List;

public class BlogAdapter extends RecyclerView.Adapter<BlogAdapter.MyViewHolder> {

    private List<Blog> blogList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, year, genre;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            genre = (TextView) view.findViewById(R.id.title);
            year = (TextView) view.findViewById(R.id.title);
        }
    }


    public BlogAdapter(List<Blog> blogList) {
        this.blogList = blogList;
    }

    @Override
    public BlogAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_blog, parent, false);

        return new BlogAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(BlogAdapter.MyViewHolder holder, int position) {
        Blog blog = blogList.get(position);
        /*holder.title.setText(event);
        holder.genre.setText(event.getGenre());
        holder.year.setText(event.getYear());*/
    }

    @Override
    public int getItemCount() {
        return blogList.size();
    }
}
