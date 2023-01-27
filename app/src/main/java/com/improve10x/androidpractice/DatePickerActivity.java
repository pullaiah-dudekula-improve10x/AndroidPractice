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
            String result = getData(date, month, year);
            binding.currentDateTxt.setText(result);
        });
    }

    private String getData(int date, int month, int year) {
        String currentDate = String.valueOf(date);
        String currentMonth = String.valueOf(month);
        String currentYear = String.valueOf(year);
        String data = "Current Date : " + currentDate + "-" + currentMonth + "-" + currentYear;
        return data;
    }
}
