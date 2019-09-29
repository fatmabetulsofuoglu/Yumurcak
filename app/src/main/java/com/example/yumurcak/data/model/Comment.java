package com.example.yumurcak.data.model;

import java.util.Date;

public class Comment {
    private String userPhotoURL;
    private String userName;
    private String commentContext;
    private Date createCommentDate;

    public Comment(String userPhotoURL, String userName, String commentContext, Date createCommentDate) {
        this.userPhotoURL = userPhotoURL;
        this.userName = userName;
        this.commentContext = commentContext;
        this.createCommentDate = createCommentDate;
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

    public String getCommentContext() {
        return commentContext;
    }

    public void setCommentContext(String commentContext) {
        this.commentContext = commentContext;
    }

    public Date getCreateCommentDate() {
        return createCommentDate;
    }

    public void setCreateCommentDate(Date createCommentDate) {
        this.createCommentDate = createCommentDate;
    }
}
