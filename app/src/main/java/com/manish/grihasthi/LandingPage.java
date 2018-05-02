package com.manish.grihasthi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class LandingPage extends AppCompatActivity {


    private TextView tv;
    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);
        tv=(TextView)findViewById(R.id.landing_header);
        iv=(ImageView)findViewById(R.id.logo_home);

        Animation anim= (Animation) AnimationUtils.loadAnimation(this,R.anim.landing_page_animation);
        tv.startAnimation(anim);
        iv.startAnimation(anim);
        final Intent i=new Intent(this,MainPage.class);
        Thread timer =new Thread(){

             public void run() {

                 try {
                    sleep(5000);
                 } catch (InterruptedException e1) {
                     e1.printStackTrace();
                 } finally {

                     startActivity(i);
                     finish();
                 }
             }
            };

        timer.start();


    }
}
