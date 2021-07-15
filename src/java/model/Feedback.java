/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author USER
 */
public class Feedback {
    private static final long serialVersionUID = 1L;
    private int user_id;
    private String username;
    private String like;
    private String feedback;

    public Feedback(String username, String like, String feedback) {
        this.username = username;
        this.like = like;
        this.feedback = feedback;
    }

    public Feedback(int user_id, String username, String like, String feedback) {
        this.user_id = user_id;
        this.username = username;
        this.like = like;
        this.feedback = feedback;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
