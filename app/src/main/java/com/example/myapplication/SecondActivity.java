package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myapplication.databinding.ActivityMainBinding;
import com.example.myapplication.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
    private @NonNull ActivitySecondBinding menubinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        menubinding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(menubinding.getRoot());
    }
}