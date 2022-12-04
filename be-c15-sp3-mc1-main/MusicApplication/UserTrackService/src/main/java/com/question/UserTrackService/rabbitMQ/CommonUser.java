package com.question.UserTrackService.rabbitMQ;

public class CommonUser {
    private String userId;
    private String userName;
    private String userAddress;
    private String password;

    public CommonUser() {
    }

    public CommonUser(String userId, String userName, String userAddress, String password) {
        this.userId = userId;
        this.userName = userName;
        this.userAddress = userAddress;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "CommonUser{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
