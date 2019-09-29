package com.example.yumurcak.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentTransaction;

import com.example.yumurcak.R;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class BottomSheetAddFragment extends BottomSheetDialogFragment {

    ImageButton btnActivityShare;
    ImageButton btnBlogShare;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        btnActivityShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.add(R.id.frame_layout, new EventShareFragment());
                transaction.addToBackStack("EventShareFragment").commit();
                dismiss();
            }
        });
        btnBlogShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bottom_sheet_add, container, false);
        btnActivityShare = view.findViewById(R.id.btn_activity_share);
        btnBlogShare = view.findViewById(R.id.btn_blog_share);

        return view;
    }
}
