package com.improve10x.androidpractice;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.improve10x.androidpractice.databinding.ActivityAlertDialogboxBinding;

public class AlertDialogBoxActivity extends AppCompatActivity {

    private ActivityAlertDialogboxBinding binding;
   private AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAlertDialogboxBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        builder = new AlertDialog.Builder(this);
        handleClose();
    }

    private void handleClose() {
        binding.closeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                builder.setMessage("Welcome To Alert Dialog").setTitle("AlertDialog");
                builder.setMessage("Do You Want to close the Application")
                        .setCancelable(false)
                        .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();
                                Toast.makeText(AlertDialogBoxActivity.this, "You Choose Yes Action for Dialobox", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int i) {
                                dialog.cancel();
                                Toast.makeText(AlertDialogBoxActivity.this, "You Choose No for Action", Toast.LENGTH_SHORT).show();
                            }
                        });

                AlertDialog alertDialog = builder.create();
                alertDialog.setTitle("AlertDialogMessage");
                alertDialog.show();
            }
        });
    }
}