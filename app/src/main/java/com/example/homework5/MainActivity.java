package com.example.homework5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.homework5.Fragments.FirstFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().add(R.id.container_fragment,
                    FirstFragment.class,null).commit();
        }
    }
}