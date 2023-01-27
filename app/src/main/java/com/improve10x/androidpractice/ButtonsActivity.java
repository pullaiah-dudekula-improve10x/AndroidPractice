package com.improve10x.androidpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.improve10x.androidpractice.databinding.ActivityButtonsBinding;

public class ButtonsActivity extends AppCompatActivity {
    private ActivityButtonsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityButtonsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Sum of two Numbers");
        sumOfTwoNumbers();
    }

    private void sumOfTwoNumbers() {
        binding.add.setOnClickListener(view -> {
          String firstValue = binding.sum1.getText().toString();
          String secondValue = binding.sum2.getText().toString();
          String sum = add (firstValue, secondValue);
          Toast.makeText(this, String.valueOf(sum), Toast.LENGTH_SHORT).show();
        });
    }

    private String add(String value1, String value2) {
        int num1 = Integer.parseInt(value1);
        int num2 = Integer.parseInt(value2);
        int sum = num1 + num2;
        return String.valueOf(sum);
    }
}