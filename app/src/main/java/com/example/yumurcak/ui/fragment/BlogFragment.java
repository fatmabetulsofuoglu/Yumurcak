package com.example.yumurcak.ui.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yumurcak.R;

public class BlogFragment extends Fragment {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_blog, container, false);
    }

int userPhotoBlog;
    int userButtonBlog;
    String userTextBlog;
    String TitleBlog;
    String IndexBlog;

    public BlogFragment ( int userPhotoBlog ,int userButtonBlog, String userTextBlog, String TitleBlog, String IndexBlog){


        this.userPhotoBlog=userPhotoBlog;
        this.userButtonBlog= userButtonBlog;
        this.userTextBlog= userTextBlog;
        this.TitleBlog=TitleBlog;
        this.IndexBlog=IndexBlog;
    }


}
