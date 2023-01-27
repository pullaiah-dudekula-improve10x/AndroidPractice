package com.improve10x.androidpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.improve10x.androidpractice.databinding.ActivityCheckboxBinding;

public class CheckboxActivity extends AppCompatActivity {

    private ActivityCheckboxBinding binding;
    private StringBuilder result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCheckboxBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Checkbox");
        handleOrder();
    }

    private void handleOrder() {
        binding.submitBtn.setOnClickListener(view -> {
            boolean pizzaIsSelected = binding.checkBox1Cb.isChecked();
            boolean coffeeIsSelected = binding.checkBox2Cb.isChecked();
            boolean burgerIsSelected = binding.checkBox3Cb.isChecked();
            boolean samosaIsSelected = binding.checkBox4Cb.isChecked();
            String orderDetails = createOrder (pizzaIsSelected, coffeeIsSelected, burgerIsSelected, samosaIsSelected);
            Toast.makeText(this, orderDetails, Toast.LENGTH_SHORT).show();
        });
    }

    private String createOrder(boolean pizzaIsSelected, boolean coffeeIsSelected, boolean burgerIdSelected, boolean samosaIsSelected) {
            int total = 0;
            String orderDetails = "Selecetd Items";
            if(pizzaIsSelected) {
                total += 100;
                orderDetails += "\nPizza : rs100";
            }

            if(coffeeIsSelected) {
                total += 50;
                orderDetails += "\nCoffee : rs50";
            }

            if(burgerIdSelected) {
                total += 25;
                orderDetails += "\nburger : rs25";
            }

            if(samosaIsSelected) {
                total += 10;
                orderDetails += "\nsamosa: rs10";
            }
            orderDetails += "\nTotal : rs. " + total;
            return orderDetails;
    }
}