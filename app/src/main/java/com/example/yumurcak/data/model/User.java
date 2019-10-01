package com.example.yumurcak.data.model;

import java.util.List;

public class User {

    private String backgroundPhotoURL; //Profil fotoğrafı arkasındaki kapak, arkaplan fotoğraf URL'i
    private String profilePhotoURL;
    private String nameSurname;
    private String userName;
    private String numberOfFollowers; //Takipçi sayısı
    private String numberOfFollowed; //Takip edilen sayısı
    private String numberOfEvents; //Paylaşılan Etkinlik sayısı
    private String numberofBlogs; //Paylaşılan Yazı sayısı
    private List<Event> userEvents;
    private List<Blog> userBlogs;

    public User(String backgroundPhotoURL, String profilePhotoURL, String nameSurname,
                String userName, String numberOfFollowers, String numberOfFollowed,
                String numberOfEvents, String numberofBlogs, List<Event> userEvents, List<Blog> userBlogs) {
        this.backgroundPhotoURL = backgroundPhotoURL;
        this.profilePhotoURL = profilePhotoURL;
        this.nameSurname = nameSurname;
        this.userName = userName;
        this.numberOfFollowers = numberOfFollowers;
        this.numberOfFollowed = numberOfFollowed;
        this.numberOfEvents = numberOfEvents;
        this.numberofBlogs = numberofBlogs;
        this.userEvents = userEvents;
        this.userBlogs = userBlogs;
    }

    public String getBackgroundPhotoURL() {
        return backgroundPhotoURL;
    }

    public void setBackgroundPhotoURL(String backgroundPhotoURL) {
        this.backgroundPhotoURL = backgroundPhotoURL;
    }

    public String getProfilePhotoURL() {
        return profilePhotoURL;
    }

    public void setProfilePhotoURL(String profilePhotoURL) {
        this.profilePhotoURL = profilePhotoURL;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNumberOfFollowers() {
        return numberOfFollowers;
    }

    public void setNumberOfFollowers(String numberOfFollowers) {
        this.numberOfFollowers = numberOfFollowers;
    }

    public String getNumberOfFollowed() {
        return numberOfFollowed;
    }

    public void setNumberOfFollowed(String numberOfFollowed) {
        this.numberOfFollowed = numberOfFollowed;
    }

    public String getNumberOfEvents() {
        return numberOfEvents;
    }

    public void setNumberOfEvents(String numberOfEvents) {
        this.numberOfEvents = numberOfEvents;
    }

    public String getNumberofBlogs() {
        return numberofBlogs;
    }

    public void setNumberofBlogs(String numberofBlogs) {
        this.numberofBlogs = numberofBlogs;
    }

    public List<Event> getUserEvents() {
        return userEvents;
    }

    public void setUserEvents(List<Event> userEvents) {
        this.userEvents = userEvents;
    }

    public List<Blog> getUserBlogs() {
        return userBlogs;
    }

    public void setUserBlogs(List<Blog> userBlogs) {
        this.userBlogs = userBlogs;
    }
}

