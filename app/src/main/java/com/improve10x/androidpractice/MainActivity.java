package com.improve10x.androidpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.improve10x.androidpractice.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        handleButton();
        handleToast();
        handleCustomToast();
        handleTaggedBtn();
        handleRadioButton();
        handleRatingBar();
        handleCheckbox();
        handlerSeekbar();
        handleDatePicker();
        handleTimePicker();
        handleProgressbar();
        handleVerticalScrollView();
        handleHorizontalScrollbar();
        handleListview();
        handleCustomListview();
        handleAlertDialogBox();
        handleProgressDialog();
        handleWebView();
    }
    private void handleButton() {
        binding.buttons.setOnClickListener(view -> {
            Intent intent = new Intent(this, ButtonsActivity.class);
            startActivity(intent);
        });
    }

    private void handleToast() {
        binding.toastTxt.setOnClickListener(view -> {
            Intent intent = new Intent(this, ToastActivity.class);
            startActivity(intent);
        });
    }

    private void handleCustomToast() {
        binding.customeToastTxt.setOnClickListener(view -> {
            Intent intent = new Intent(this, CustomToastActivity.class);
            startActivity(intent);
        });
    }

    private void handleTaggedBtn() {
        binding.toggedBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, TaggedButtonActivity.class);
            startActivity(intent);
        });
    }

    private void handleRadioButton() {
        binding.radioButtonBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, RadioButtonsActivity.class);
            startActivity(intent);
        });
    }

    private void handleRatingBar() {
        binding.ratingbarBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, RatingbarActivity.class);
            startActivity(intent);
        });
    }

    private void handleCheckbox() {
        binding.chechboxBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, CheckboxActivity.class);
            startActivity(intent);
        });
    }

    private void handlerSeekbar() {
        binding.seekbarBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, SeekbarActivity.class);
            startActivity(intent);
        });
    }

    private void handleDatePicker() {
        binding.datepickerBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, DatePickerActivity.class);
            startActivity(intent);
        });
    }

    private void handleTimePicker() {
        binding.timePickerBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, TimePickerActivity.class);
            startActivity(intent);
        });
    }

    private void handleProgressbar() {
        binding.progressbarBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, ProgressbarActivity.class);
            startActivity(intent);
        });
    }

    private void handleVerticalScrollView() {
        binding.verticalScrollViewBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, VerticalScrollViewActivity.class);
            startActivity(intent);
        });
    }

    private void handleHorizontalScrollbar() {
        binding.horizontalSb.setOnClickListener(view -> {
            Intent intent = new Intent(this, HorizontalScrollviewActivity.class);
            startActivity(intent);
        });
    }

    private void handleListview() {
        binding.listviewBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, ListviewActivity.class);
            startActivity(intent);
        });
    }

    private void handleCustomListview() {
        binding.cutomListViewBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, CustomListviewActivity.class);
            startActivity(intent);
        });
    }

    private void handleAlertDialogBox() {
        binding.alertDialgBoxBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, AlertDialogBoxActivity.class);
            startActivity(intent);
        });
    }

    private void handleProgressDialog() {
        binding.progressDialogBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, ProgressDialogActivity.class);
            startActivity(intent);
        });
    }

    private void handleWebView() {
        binding.webViewBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this, WebViewActivity.class);
            startActivity(intent);
        });
    }
}