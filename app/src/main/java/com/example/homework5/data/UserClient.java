package com.example.homework5.data;

import com.example.homework5.R;
import com.example.homework5.models.UserModel;

import java.util.ArrayList;

public class UserClient {


    public static ArrayList<UserModel> list = new ArrayList<>();
    public static ArrayList<UserModel> getUserData(){

        list.add(new UserModel(R.drawable.ic_launcher_foreground,"Android"));
        list.add(new UserModel(R.drawable.ic_launcher_foreground,"Android"));
        list.add(new UserModel(R.drawable.ic_launcher_foreground,"Android"));
        list.add(new UserModel(R.drawable.ic_launcher_foreground,"Android"));
        list.add(new UserModel(R.drawable.ic_launcher_foreground,"Android"));
        return  list;
    }
}
