package com.improve10x.androidpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.SearchView;

import com.improve10x.androidpractice.databinding.ActivityToolbarSearchBinding;

import java.util.ArrayList;

public class ToolbarSearchActivity extends AppCompatActivity {

    private ActivityToolbarSearchBinding binding;
    private ArrayAdapter<String> arrayAdapter;
    private ArrayList<String> arrayList;
    private MenuItem searchItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityToolbarSearchBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setData();
        searchViewOnToolbar();
    }

    private void setData() {
        arrayList = new ArrayList<>();
        arrayList.add("PawanKalyan");
        arrayList.add("Chiranjeevi");
        arrayList.add("SaiDharamTej");
        arrayList.add("PanjaViashnav");
        arrayList.add("SaiDharamTej");
        arrayList.add("NagaBabu");
        arrayList.add("Niharika");
        arrayList.add("RenuDesai");
        arrayList.add("RamCharan");
        arrayList.add("Upasana");
        arrayList.add("Surekha");
    }

    private void searchViewOnToolbar() {
        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrayList);
        binding.listviewLv.setAdapter(arrayAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.text_watcher_menu,menu);
        searchItem = menu.findItem(R.id.search_item);
        SearchView searchView = (SearchView) searchItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                searchView.clearFocus();
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                arrayAdapter.getFilter().filter(s);
                return false;
            }
        });
        return true;
    }
}