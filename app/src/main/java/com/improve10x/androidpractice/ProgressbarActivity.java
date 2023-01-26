package com.improve10x.androidpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.improve10x.androidpractice.databinding.ActivityProgressbarBinding;

public class ProgressbarActivity extends AppCompatActivity {
    private ActivityProgressbarBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProgressbarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Progressbar");
        showProgressbar();
    }

    private void showProgressbar() {
        binding.submitBtn.setOnClickListener(view -> {
            binding.progressbarGroup.setVisibility(View.VISIBLE);
        });
        binding.progressbarGroup.setVisibility(View.GONE);
    }
}