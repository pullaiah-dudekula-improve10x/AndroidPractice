package com.improve10x.androidpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.improve10x.androidpractice.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleButton();
        handleToast();
        handleCustomToast();
        handleTaggedBtn();
    }
    private void handleButton() {
        binding.buttons.setOnClickListener(view -> {
            Intent intent = new Intent(this, ButtonsActivity.class);
            startActivity(intent);
        });
    }

    private void handleToast() {
        binding.toastTxt.setOnClickListener(view -> {
            Intent intent = new Intent(this, ToastActivity.class);
            startActivity(intent);
        });
    }

    private void handleCustomToast() {
        binding.customeToastTxt.setOnClickListener(view -> {
            Intent intent = new Intent(this, CustomToastActivity.class);
            startActivity(intent);
        });
    }

    private void handleTaggedBtn() {
        binding.taggedBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, TaggedButtonActivity.class);
            startActivity(intent);
        });
    }
}