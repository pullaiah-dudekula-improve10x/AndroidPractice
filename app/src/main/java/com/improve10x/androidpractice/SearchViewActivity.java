package com.improve10x.androidpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.SearchView;
import android.widget.Toast;

import com.improve10x.androidpractice.databinding.ActivitySearchViewBinding;

import java.util.ArrayList;
import java.util.Queue;

public class SearchViewActivity extends AppCompatActivity {

    private ActivitySearchViewBinding binding;
    private ArrayList<String> list;
    private ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySearchViewBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setData();
        searchViewSpinner();
    }

    private void setData() {
        list = new ArrayList<>();
        list.add("India");
        list.add("Canada");
        list.add("Usa");
        list.add("Ua");
        list.add("Ukraine");
        list.add("Japan");
        list.add("Srilanka");
        list.add("China");
        list.add("Saudi Arabia");
        list.add("Indonesia");
        list.add("Tokyo");
    }

    private void searchViewSpinner() {
        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,list);
        binding.listviewLv.setAdapter(arrayAdapter);
        binding.searchViewIb.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                if(list.contains(s)) {
                    arrayAdapter.getFilter().filter(s);
                } else {
                    Toast.makeText(SearchViewActivity.this, "No match Found", Toast.LENGTH_SHORT).show();
                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                return false;
            }
        });
    }
}