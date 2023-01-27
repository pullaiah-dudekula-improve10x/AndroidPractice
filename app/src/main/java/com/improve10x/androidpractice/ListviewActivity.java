package com.improve10x.androidpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.improve10x.androidpractice.databinding.ActivityListviewBinding;

import java.util.ArrayList;

public class ListviewActivity extends AppCompatActivity {

    private ActivityListviewBinding binding;
    private ArrayList<String> arrayList;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityListviewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setData();
        listViewAdapter();
    }

    private void setData() {
        arrayList = new ArrayList<>();
        arrayList.add("Balakrishna");
        arrayList.add("Chiranjeevi");
        arrayList.add("Kalyan ram");
        arrayList.add("Harikrishna");
        arrayList.add("Pullaiah");
    }

    private void listViewAdapter() {
        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arrayList);
        binding.listviewLv.setAdapter(arrayAdapter);
        binding.listviewLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ListviewActivity.this, String.valueOf(arrayList), Toast.LENGTH_SHORT).show();
            }
        });
    }
}