package com.example.yumurcak.ui.fragment;

import android.support.v4.app.Fragment;

public class EventFragment extends Fragment {

int userPhotoEvent;
String userTextEvent;
int userButtonEvent;
String TitleEvent;
int indexEvent;
int indexEvent2;

public EventFragment(int userPhotoEvent, int userButtonEvent, String userTextEvent, String TitleEvent, int indexEvent, int indexEvent2) {

    this.userButtonEvent = userButtonEvent;
    this.userPhotoEvent = userPhotoEvent;
    this.userTextEvent = userTextEvent;
    this.TitleEvent = TitleEvent;
    this.indexEvent = indexEvent;
    this.indexEvent2 = indexEvent2;
   }
}