package com.improve10x.androidpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.improve10x.androidpractice.databinding.ActivityTaggedButtonBinding;

public class TaggedButtonActivity extends AppCompatActivity {

    private ActivityTaggedButtonBinding binding;
    private ToggleButton toggleButton;
    private ToggleButton toggleButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTaggedButtonBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        showToggleButtons();
    }

    private void showToggleButtons() {
        binding.submitBtn.setOnClickListener(view -> {
            String status1 = binding.toggleButtonBtn.getText().toString();
            String status2 = binding.toggleButton2Btn.getText().toString();
            Toast.makeText(this, "toggleButton1 " + status1 + "/ntoggleButton2 " + status2 , Toast.LENGTH_SHORT).show();
        });
    }
}