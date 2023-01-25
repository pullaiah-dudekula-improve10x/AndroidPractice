package com.improve10x.androidpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.improve10x.androidpractice.databinding.ActivitySeekbarBinding;

public class SeekbarActivity extends AppCompatActivity {
    private ActivitySeekbarBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySeekbarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Seekbar");
        showSeekbar();
    }

    private void showSeekbar() {
        binding.submitBtn.setOnClickListener(view -> {
            int progress = binding.seekBarSb.getProgress();
            Toast.makeText(this, String.valueOf(progress), Toast.LENGTH_SHORT).show();
        });
    }
}