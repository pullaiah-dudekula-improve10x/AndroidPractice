package com.improve10x.androidpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.improve10x.androidpractice.databinding.ActivityVerticalScrollView2Binding;

public class VerticalScrollViewActivity extends AppCompatActivity {
    private ActivityVerticalScrollView2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityVerticalScrollView2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}