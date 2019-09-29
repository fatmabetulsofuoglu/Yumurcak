package com.example.yumurcak.ui.fragment;
import android.support.v4.app.Fragment;

public class NotificationsFragment extends Fragment {

    int userPhotoNotificate;
    String textNotification;

    public NotificationsFragment (int userPhotoNotificate, String textNotification){
        this.userPhotoNotificate= userPhotoNotificate;
        this.textNotification= textNotification;
    }
}
