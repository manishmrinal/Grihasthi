package com.manish.grihasthi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainLoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login_page);

        Button AddUpdateProduct=(Button)findViewById(R.id.AddUpdateProductButton);
        AddUpdateProduct.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v) {
                    AddUpdateProductActivity();
                    }
                });
    }

    public void AddUpdateProductActivity(){

        Intent addupdateActivityIntent=new Intent(this,AddUpdateProduct.class);
        startActivity(addupdateActivityIntent);
    }
}
