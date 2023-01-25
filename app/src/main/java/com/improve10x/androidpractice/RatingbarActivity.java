package com.improve10x.androidpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.improve10x.androidpractice.databinding.ActivityRaringbarBinding;

public class RatingbarActivity extends AppCompatActivity {
    private ActivityRaringbarBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRaringbarBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Ratingbar");
        showRatingbar();
    }

    private void showRatingbar() {
        binding.submitBtn.setOnClickListener(view -> {
            String rating = String.valueOf(binding.ratingBar.getRating());
            Toast.makeText(this, rating, Toast.LENGTH_SHORT).show();
        });
    }
}