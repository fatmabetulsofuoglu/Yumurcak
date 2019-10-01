package com.example.yumurcak.data.model;

import java.util.List;

public class User {

    private String backgroundPhotoURL; //Profil fotoğrafı arkasındaki kapak, arkaplan fotoğraf URL'i
    private String profilePhotoURL;
    private String name;
    private String surname;
    private String genderInfo; //Anne-Baba seçimi
    private String userName;
    private String email;
    private String password;
    private String numberOfFollowers; //Takipçi sayısı
    private String numberOfFollowed; //Takip edilen sayısı
    private String numberOfEvents; //Paylaşılan Etkinlik sayısı
    private String numberofBlogs; //Paylaşılan Yazı sayısı
    private List<Event> userEvents;
    private List<Blog> userBlogs;


    public User(){

    }

    public User(String backgroundPhotoURL, String profilePhotoURL, String name, String surname,
                String genderInfo, String userName, String email, String password, String numberOfFollowers,
                String numberOfFollowed, String numberOfEvents, String numberofBlogs, List<Event> userEvents,
                List<Blog> userBlogs) {
        this.backgroundPhotoURL = backgroundPhotoURL;
        this.profilePhotoURL = profilePhotoURL;
        this.name = name;
        this.surname = surname;
        this.genderInfo = genderInfo;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.numberOfFollowers = numberOfFollowers;
        this.numberOfFollowed = numberOfFollowed;
        this.numberOfEvents = numberOfEvents;
        this.numberofBlogs = numberofBlogs;
        this.userEvents = userEvents;
        this.userBlogs = userBlogs;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGenderInfo() {
        return genderInfo;
    }

    public void setGenderInfo(String genderInfo) {
        this.genderInfo = genderInfo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

