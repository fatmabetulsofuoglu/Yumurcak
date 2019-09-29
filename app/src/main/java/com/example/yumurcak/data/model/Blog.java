package com.example.yumurcak.data.model;

public class Blog {
    private String profilePhotoURL;
    private String nameSurname;
    private String userName;
    private String blogTitle;
    private String blogContext;

    public Blog(String profilePhotoURL, String nameSurname, String userName, String blogTitle, String blogContext) {
        this.profilePhotoURL = profilePhotoURL;
        this.nameSurname = nameSurname;
        this.userName = userName;
        this.blogTitle = blogTitle;
        this.blogContext = blogContext;
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

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }

    public String getBlogContext() {
        return blogContext;
    }

    public void setBlogContext(String blogContext) {
        this.blogContext = blogContext;
    }
}
