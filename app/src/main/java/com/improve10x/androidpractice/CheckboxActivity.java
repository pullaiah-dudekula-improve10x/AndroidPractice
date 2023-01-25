package com.improve10x.androidpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.improve10x.androidpractice.databinding.ActivityCheckboxBinding;

public class CheckboxActivity extends AppCompatActivity {

    private ActivityCheckboxBinding binding;
    private StringBuilder result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCheckboxBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Checkbox");
        showCheckbox();
    }

    private void showCheckbox() {
        binding.submitBtn.setOnClickListener(view -> {
            int total = 0;
            result = new StringBuilder();
            result.append("selectedItems");
            if(binding.checkBox1Cb.isChecked()) {
                result.append("\nPizza 100rs");
                total+= 100;
            }

            if(binding.checkBox2Cb.isChecked()) {
                result.append("\nCoffe 50rs");
                total+=50;
            }

            if(binding.checkBox3Cb.isChecked()) {
                result.append("\nburger 25rs");
                total+= 25;
            }

            if(binding.checkBox4Cb.isChecked()) {
                result.append("\nsamosa 10rs");
                total+= 10;
            }

            result.append("\nTotal: " + total + "rs");
            Toast.makeText(this, result.toString(), Toast.LENGTH_SHORT).show();
        });
    }
}