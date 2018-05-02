package com.manish.grihasthi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddUpdateProduct extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_update_product);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

       /* Button AddProduct=(Button)findViewById(R.id.AddProduct);
        AddProduct.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        AddProductActivity();
                    }
                });

        Button UpdateProduct=(Button)findViewById(R.id.UpdateProduct);
        UpdateProduct.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                        UpdateProductActivity();
                    }
                });



    }

    public void AddProductActivity()
    {

        Intent addProductActivityIntent=new Intent(this,AddProduct.class);
        startActivity(addProductActivityIntent);
    }

    public void UpdateProductActivity()
    {

        Intent updateProductActivityIntent=new Intent(this,UpdateProduct.class);
        startActivity(updateProductActivityIntent);
    }*/

    }
}
