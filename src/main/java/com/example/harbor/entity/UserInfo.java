package com.example.harbor.entity;


public class UserInfo {

  private String userId;
  private String userName;
  private long userPhone;
  private String userPwd;
  private String userProfile;
  private long userLevel;


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


  public long getUserPhone() {
    return userPhone;
  }

  public void setUserPhone(long userPhone) {
    this.userPhone = userPhone;
  }


  public String getUserPwd() {
    return userPwd;
  }

  public void setUserPwd(String userPwd) {
    this.userPwd = userPwd;
  }


  public String getUserProfile() {
    return userProfile;
  }

  public void setUserProfile(String userProfile) {
    this.userProfile = userProfile;
  }


  public long getUserLevel() {
    return userLevel;
  }

  public void setUserLevel(long userLevel) {
    this.userLevel = userLevel;
  }

}
