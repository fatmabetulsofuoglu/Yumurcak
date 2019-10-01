package com.example.yumurcak.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yumurcak.R;
import com.example.yumurcak.data.api.FirebaseService;
import com.example.yumurcak.data.model.Blog;
import com.example.yumurcak.ui.adapter.BlogAdapter;
import com.example.yumurcak.utils.IResponseListener;

import java.util.List;

public class BlogFragment extends Fragment {
    RecyclerView rvBlog;
    private BlogAdapter mAdapter;
    FirebaseService service;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        service = new FirebaseService();
        service.getBlogList(new IResponseListener<List<Blog>>() {
            @Override
            public void OnResponse(List<Blog> blogs) {
                mAdapter = new BlogAdapter(blogs);
                RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
                rvBlog.setLayoutManager(mLayoutManager);
                rvBlog.setAdapter(mAdapter);
            }

            @Override
            public void OnError(String error) {
                Toast.makeText(getContext(),error,Toast.LENGTH_LONG);
            }
        });
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blog, container, false);
        rvBlog = view.findViewById(R.id.rvBlog);
        return view;
    }


}
