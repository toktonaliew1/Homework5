package com.example.homework5.Adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homework5.databinding.ListHolderBinding;
import com.example.homework5.models.UserModel;

import java.util.ArrayList;

public class UserNameAdapter extends RecyclerView.Adapter<UserNameAdapter.UserHolder> {

    ArrayList <UserModel> list = new ArrayList<>();
    @NonNull
    @Override
    public UserNameAdapter.UserHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UserHolder(ListHolderBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull UserNameAdapter.UserHolder holder, int position) {
        holder.onBind(list.get(position));


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @SuppressLint("NotifyDataSetChanged")
    public void setData(ArrayList<UserModel> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    public class UserHolder extends RecyclerView.ViewHolder{
        private ListHolderBinding  binding;

        public UserHolder(@NonNull ListHolderBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void onBind(UserModel userModel) {
            binding.imAvatars.setImageResource(userModel.getAvatar());
            binding.tvName.setText(userModel.getName());
        }
    }
}
