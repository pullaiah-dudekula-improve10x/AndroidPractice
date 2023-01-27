package com.improve10x.androidpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.improve10x.androidpractice.databinding.ActivityTaggedButtonBinding;

public class TaggedButtonActivity extends AppCompatActivity {

    private ActivityTaggedButtonBinding binding;

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
            String result = getData(status1, status2);
            Toast.makeText(this, result , Toast.LENGTH_SHORT).show();
        });
    }

    private String getData(String status1, String status2) {
        String status1Check = "button1 : " + status1 + "\n";
        String status2Check = "button2 : " + status2;
        String result = status1Check += status2Check;
        return  result;
    }
}