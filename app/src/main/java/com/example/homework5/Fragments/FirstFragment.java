package com.example.homework5.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.homework5.Adapter.UserNameAdapter;
import com.example.homework5.R;
import com.example.homework5.databinding.FragmentFirstBinding;
import com.example.homework5.models.UserModel;

import java.util.ArrayList;


public class FirstFragment extends Fragment {
    FragmentFirstBinding binding;
    ArrayList<UserModel> list = new ArrayList<>();
    private UserNameAdapter userNameAdapter = new UserNameAdapter();



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(inflater,container,false);

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initi();
        addData();
    }
    private void initi() {
        binding.recyclerView.setAdapter(userNameAdapter);
    }

    private void addData() {
        list.add(new UserModel(R.drawable.ic_launcher_foreground,"Android"));
        list.add(new UserModel(R.drawable.ic_launcher_foreground,"Android"));
        list.add(new UserModel(R.drawable.ic_launcher_foreground,"Android"));
        list.add(new UserModel(R.drawable.ic_launcher_foreground,"Android"));
        list.add(new UserModel(R.drawable.ic_launcher_foreground,"Android"));


        userNameAdapter.setData(list);
    }


}