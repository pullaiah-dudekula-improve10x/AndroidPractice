package com.improve10x.androidpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;

import com.improve10x.androidpractice.databinding.ActivityCustomAlertDialogBinding;
import com.improve10x.androidpractice.databinding.CustomAlertDialogItemBinding;

public class CustomAlertDialogActivity extends AppCompatActivity {

    private ActivityCustomAlertDialogBinding binding;
    private Dialog dialog;
    private CustomAlertDialogItemBinding customAlertBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCustomAlertDialogBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleCustomAlert();
    }

    private void handleCustomAlert() {
        binding.alertBtn.setOnClickListener(view -> {
            dialog = new Dialog(this);
            customAlertBinding = CustomAlertDialogItemBinding.inflate(getLayoutInflater());
            dialog.setContentView(customAlertBinding.getRoot());
            customAlertBinding.dismisBtn.setOnClickListener(view1 -> {
                finish();
            });
            customAlertBinding.closeIb.setOnClickListener(view1 -> {
                dialog.dismiss();
            });
            customAlertBinding.alertMessageTxt.setText("Alert....!!!");
            dialog.show();
        });
    }
}