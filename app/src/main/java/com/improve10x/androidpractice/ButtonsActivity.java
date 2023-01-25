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
            int a = Integer.parseInt(firstValue);
            int b = Integer.parseInt(secondValue);
            int sum = a + b;
            Toast.makeText(this, String.valueOf(sum), Toast.LENGTH_SHORT).show();
        });
    }
}