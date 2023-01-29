package com.improve10x.androidpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.improve10x.androidpractice.databinding.ActivitySpinnerBinding;

import java.util.ArrayList;

public class SpinnerActivity extends AppCompatActivity {

    private ActivitySpinnerBinding binding;
    private ArrayList<String> countries;
    private Spinner countriesSp;
    private ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySpinnerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setData();
        spinner();
    }

    private void setData() {
        countries = new ArrayList<>();
        countries.add("India");
        countries.add("USA");
        countries.add("UA");
        countries.add("Canada");
        countries.add("Poland");
    }

    private void spinner() {
        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, countries);
        binding.spinnerSp.setAdapter(arrayAdapter);
        binding.spinnerSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(SpinnerActivity.this, countries.get(i), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}