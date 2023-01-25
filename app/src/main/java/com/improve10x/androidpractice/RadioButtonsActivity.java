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
        showRadioButtons();
    }

    private void showRadioButtons() {
        binding.showBtn.setOnClickListener(view -> {
            if(binding.radioButton1Btn.isChecked()) {
                Toast.makeText(this, "Male", Toast.LENGTH_SHORT).show();
            }
            if(binding.radioButton2Btn.isChecked()) {
                Toast.makeText(this, "Female", Toast.LENGTH_SHORT).show();
            }
        });
    }
}