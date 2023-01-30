package com.improve10x.androidpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.improve10x.androidpractice.databinding.ActivityTextWatcherBinding;

import java.util.ArrayList;

public class TextWatcherActivity extends AppCompatActivity {

    private ActivityTextWatcherBinding binding;
    private ArrayList<String> arrayList;
    private ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTextWatcherBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setData();
        handleColorsLv();
    }

    private void setData() {
        arrayList = new ArrayList<>();
        arrayList.add("Blue");
        arrayList.add("Orange");
        arrayList.add("Green");
        arrayList.add("Purple");
        arrayList.add("Yellow");
        arrayList.add("Brown");
        arrayList.add("Azone");
        arrayList.add("Red");
        arrayList.add("Black");
        arrayList.add("Maroon");
        arrayList.add("Charcoal");
        arrayList.add("Lime");
    }

    private void handleColorsLv() {
        arrayAdapter = new ArrayAdapter<>(this, R.layout.text_watcher_item, R.id.product_names_txt, arrayList);
        binding.listviewLv.setAdapter(arrayAdapter);
        binding.searchTxt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                arrayAdapter.getFilter().filter(charSequence);
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                Toast.makeText(TextWatcherActivity.this, "Before Text Change", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void afterTextChanged(Editable editable) {
                Toast.makeText(TextWatcherActivity.this, "After Text Change", Toast.LENGTH_SHORT).show();
            }
        });

    }
}