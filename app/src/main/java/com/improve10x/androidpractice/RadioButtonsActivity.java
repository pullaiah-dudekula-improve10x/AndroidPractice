package com.improve10x.androidpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.improve10x.androidpractice.databinding.ActivityRadioButtonsBinding;

public class RadioButtonsActivity extends AppCompatActivity {

    private ActivityRadioButtonsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRadioButtonsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Radio Buttons");
       handleRadioButtons();
    }

    private void handleRadioButtons() {
        binding.showBtn.setOnClickListener(view -> {
            boolean radioButton1IsChecked = binding.radioButton1Btn.isChecked();
            boolean radioButton2IsChecked = binding.radioButton2Btn.isChecked();
            String result = selectGender(radioButton1IsChecked, radioButton2IsChecked);
            Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
        });
    }

    private String selectGender(boolean radioButton1IsChecked, boolean radioButton2IsChecked) {
        String result = "Select Gender : ";
        if(radioButton1IsChecked) {
            result += "Male";
        }

        if(radioButton2IsChecked) {
            result += "Female";

        }
        return  result;
    }
}