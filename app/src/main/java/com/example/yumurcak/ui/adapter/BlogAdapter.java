package com.example.yumurcak.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.yumurcak.R;
import com.example.yumurcak.data.model.Blog;
import java.util.List;

public class BlogAdapter extends RecyclerView.Adapter<BlogAdapter.MyViewHolder> {

    private List<Blog> blogList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tvNameSurname, tvUserName, tvTitleBlog, tvContextBlog;
        public ImageButton btnUserPhotoURL;

        public MyViewHolder(View view) {
            super(view);
            tvNameSurname = (TextView) view.findViewById(R.id.tvNameSurname);
            tvUserName = (TextView) view.findViewById(R.id.tvUserName);
            tvTitleBlog = (TextView) view.findViewById(R.id.tvTitleBlog);
            tvContextBlog = (TextView) view.findViewById(R.id.tvContextBlog);
            btnUserPhotoURL = (ImageButton) view.findViewById(R.id.btnUserPhotoURL);
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
        holder.tvContextBlog.setText(blog.getBlogContext());
        holder.tvNameSurname.setText(blog.getNameSurname());
        holder.tvTitleBlog.setText(blog.getBlogTitle());
    }

    @Override
    public int getItemCount() {
        return blogList.size();
    }
}
