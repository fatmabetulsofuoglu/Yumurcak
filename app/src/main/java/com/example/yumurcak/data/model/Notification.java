package com.example.yumurcak.data.model;

public class Notification {
    private String userPhotoURL;
    private String userName;
    private String notificationsContext; //Bildirim text kısmı.

    public Notification(String userPhotoURL, String userName, String notificationsContext) {
        this.userPhotoURL = userPhotoURL;
        this.userName = userName;
        this.notificationsContext = notificationsContext;
    }

    public String getUserPhotoURL() {
        return userPhotoURL;
    }

    public void setUserPhotoURL(String userPhotoURL) {
        this.userPhotoURL = userPhotoURL;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNotificationsContext() {
        return notificationsContext;
    }

    public void setNotificationsContext(String notificationsContext) {
        this.notificationsContext = notificationsContext;
    }
}
