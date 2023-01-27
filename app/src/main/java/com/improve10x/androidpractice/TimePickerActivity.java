package com.improve10x.androidpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.improve10x.androidpractice.databinding.ActivityDatePickerBinding;
import com.improve10x.androidpractice.databinding.ActivityTimePickerBinding;

public class TimePickerActivity extends AppCompatActivity {

    private ActivityTimePickerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTimePickerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        showTimePicker();
    }

    @SuppressLint("NewApi")
    private void showTimePicker() {
        binding.changeTimeBtn.setOnClickListener(view -> {
            binding.timePicker.setIs24HourView(true);
           int hour = binding.timePicker.getHour();
           int minute = binding.timePicker.getMinute();
           String result = getData (hour, minute);
           binding.currentTimeTxt.setText(result);
        });
    }

    private String getData(int hour, int minute) {
        String currentHour = String.valueOf(hour);
        String currentMinute = String.valueOf(minute);
        String currentTime = "Current Time - " + currentHour + ":" + currentMinute;
        return currentTime;
    }
}

