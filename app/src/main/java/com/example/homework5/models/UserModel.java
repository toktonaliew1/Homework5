package com.example.homework5.models;

public class UserModel {
    private int avatar;
    private  String name;



    public UserModel(int avatar, String name){
        this.avatar = avatar;
        this.name = name;
    }

    public int  getAvatar(){
        return avatar;
    }
    public void   setAvatar(int avatar){
        this.avatar=avatar;
    }
    public String  getName(){
        return name;
    }
    public void   setName(String name){
        this.name =name;
    }

}
