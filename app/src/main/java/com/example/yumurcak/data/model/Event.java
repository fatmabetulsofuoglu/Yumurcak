package com.example.yumurcak.data.model;

import java.util.Date;
import java.util.List;

public class Event {
    private String profilePhotoURL;
    private String nameSurname;
    private String userName;
    private String eventTittle;
    private String eventContext;
    private List<String> eventPhotosURL; //Etkinlik ile ilgili fotoğraflar
    private Date createEventDate;
    private List<Comment> comment;
    private String like;
    private String doneActivities; // "Yaptım" etkinlik sayısı
    private String willDoneActivities;  // "Yapacağım" etkinlik sayısı

    public Event(String profilePhotoURL, String nameSurname, String userName, String eventTittle,
                 String eventContext, List<String> eventPhotosURL, Date createEventDate, List<Comment> comment,
                 String like, String doneActivities, String willDoneActivities) {
        this.profilePhotoURL = profilePhotoURL;
        this.nameSurname = nameSurname;
        this.userName = userName;
        this.eventTittle = eventTittle;
        this.eventContext = eventContext;
        this.eventPhotosURL = eventPhotosURL;
        this.createEventDate = createEventDate;
        this.comment = comment;
        this.like = like;
        this.doneActivities = doneActivities;
        this.willDoneActivities = willDoneActivities;
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

    public List<String> getEventPhotosURL() {
        return eventPhotosURL;
    }

    public void setEventPhotosURL(List<String> eventPhotosURL) {
        this.eventPhotosURL = eventPhotosURL;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getDoneActivities() {
        return doneActivities;
    }

    public void setDoneActivities(String doneActivities) {
        this.doneActivities = doneActivities;
    }

    public String getWillDoneActivities() {
        return willDoneActivities;
    }

    public void setWillDoneActivities(String willDoneActivities) {
        this.willDoneActivities = willDoneActivities;
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

    public String getEventTittle() {
        return eventTittle;
    }

    public void setEventTittle(String eventTittle) {
        this.eventTittle = eventTittle;
    }

    public String getEventContext() {
        return eventContext;
    }

    public void setEventContext(String eventContext) {
        this.eventContext = eventContext;
    }

    public Date getCreateEventDate() {
        return createEventDate;
    }

    public void setCreateEventDate(Date createEventDate) {
        this.createEventDate = createEventDate;
    }

    public List<Comment> getComment() {
        return comment;
    }

    public void setComment(List<Comment> comment) {
        this.comment = comment;
    }
}
