package com.example.yumurcak.ui.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.yumurcak.R;

public class NewPostFragment extends BottomSheetDialogFragment {

    ImageButton btnShareEvent;
    ImageButton btnShareBlog;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_bottom_sheet_add, container,false);
        return v;

    }
}
