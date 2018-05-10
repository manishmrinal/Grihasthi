package com.manish.grihasthi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class UpdateProduct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_product);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
