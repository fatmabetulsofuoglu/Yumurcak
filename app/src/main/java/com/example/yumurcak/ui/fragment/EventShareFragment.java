package com.example.yumurcak.ui.fragment;

import android.app.ProgressDialog;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.yumurcak.R;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

public class EventShareFragment extends Fragment {

    private static final int IMAGE_REQUEST = 111;

    TextView textTitleEvent;
    ImageView imageShareAdd;
    TextView textShareAdd;
    ImageButton addCameraPhoto, addGalleryPhoto;
    private StorageReference mStorageRef;
    ProgressDialog progressDialog;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mStorageRef = FirebaseStorage.getInstance().getReference();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
       View view= inflater.inflate (R.layout.activity_event_share,container,false);
       addCameraPhoto=view.findViewById(R.id.add_camera_photo);
       addGalleryPhoto=view.findViewById(R.id.add_gallery_photo);
       textTitleEvent=view.findViewById(R.id.txt_title_event);
       textShareAdd=view.findViewById(R.id.text_share_add);
       imageShareAdd=view.findViewById(R.id.image_share_add);
       addCameraPhoto.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               selectPhoto();
           }
       });
       addGalleryPhoto.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               selectphoto();
           }
       });

        return view;
    }

         @Override
        public void onActivityResult (int requestCode, int resultCode, Intent data){
         super.onActivityResult(requestCode,resultCode,data);

         if (requestCode==IMAGE_REQUEST && data !=null && data.getData() !=null){
             filePath=data.getData();
             try{
                 Picasso.with(getActivity()).load(filePath).fit().centerCrop().into(imageShareAdd);
             } catch (Exception e){
                 e.printStackTrace();
             }
         }
    }

private void























}