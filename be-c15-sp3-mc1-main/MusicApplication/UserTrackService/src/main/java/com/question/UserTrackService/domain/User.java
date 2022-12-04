package com.question.UserTrackService.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class User {
    @Id
    private String userId;
    private String userName;
    private String userAddress;
    private String password;
    private List<Track> trackList;

    public User(){}

    public User(String userId, String userName, String userAddress, String password, List<Track> trackList) {
        this.userId = userId;
        this.userName = userName;
        this.userAddress = userAddress;
        this.password = password;
        this.trackList = trackList;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public List<Track> getTrackList() {
        return trackList;
    }

    public void setTrackList(List<Track> trackList) {
        this.trackList = trackList;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", password='" + password + '\'' +
                ", trackList=" + trackList +
                '}';
    }
}
