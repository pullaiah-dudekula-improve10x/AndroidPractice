package com.improve10x.androidpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;

import com.improve10x.androidpractice.databinding.ActivityProgressDialogBinding;

public class ProgressDialogActivity extends AppCompatActivity {

    private ActivityProgressDialogBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProgressDialogBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleClick();
    }

    private void handleClick() {
        binding.saveBtn.setOnClickListener(view -> {
            ProgressDialog builder = new ProgressDialog(this);
            builder.setTitle("This is Title");
            builder.setMessage("Please Wait Loading");
            builder.show();
        });
    }
}