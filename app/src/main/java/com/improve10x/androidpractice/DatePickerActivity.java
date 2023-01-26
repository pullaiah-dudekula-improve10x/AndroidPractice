package com.improve10x.androidpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.improve10x.androidpractice.databinding.ActivityDatePickerBinding;

public class DatePickerActivity extends AppCompatActivity {
    private ActivityDatePickerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDatePickerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        updateDate();
    }

    private void updateDate() {
        binding.changeDateBtn.setOnClickListener(view -> {
            int date = binding.datePicker.getDayOfMonth();
            int month = binding.datePicker.getMonth();
            int year = binding.datePicker.getYear();
            binding.currentDateTxt.setText(date +"/"+ month +"/" + year);
        });
    }
}
