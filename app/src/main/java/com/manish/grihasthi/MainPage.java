package com.manish.grihasthi;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;


public class MainPage extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    FloatingActionButton fab,fab1,fab2;
    Animation FabOpen,FabClose,FabRClockwise,FabRAnticlockwise;
    boolean isOpen= false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        fab=(FloatingActionButton) findViewById(R.id.fab);

        fab1=(FloatingActionButton)findViewById(R.id.fab1);
        fab2=(FloatingActionButton)findViewById(R.id.fab2);
        FabOpen= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fab_open);
        FabClose= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fab_close);
        FabRClockwise= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_clockwise);
        FabRAnticlockwise = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate_anticlockwise);

        fab.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                fab.setVisibility(View.VISIBLE);
                if(isOpen){
                    fab1.startAnimation(FabClose);
                    fab2.startAnimation(FabClose);
                    fab.startAnimation(FabRAnticlockwise);
                    fab1.setClickable(false);
                    fab2.setClickable(false);
                    isOpen=false;
                }
                else {
                fab1.startAnimation(FabOpen);
                fab2.startAnimation(FabOpen);
                fab.startAnimation(FabRClockwise);
                fab1.setClickable(true);
                fab2.setClickable(true);
                isOpen=true;
                }
                //Snackbar.make(v, "Replace with your own action", Snackbar.LENGTH_LONG)
                        //.setAction("Action", null).show();
            }
        });

        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {

                Intent addupdateActivityIntent=new Intent(getApplicationContext(),AddProduct.class);
                startActivity(addupdateActivityIntent);
            }
        });
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {

                Intent addupdateActivityIntent=new Intent(getApplicationContext(),AddProduct.class);
                startActivity(addupdateActivityIntent);
            }
        });



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.add_product_nav) {

            Intent addActivityIntent=new Intent(getApplicationContext(),AddProduct.class);
            startActivity(addActivityIntent);

        } else if (id == R.id.update_product_nav) {
            Intent updateActivityIntent=new Intent(getApplicationContext(),UpdateProduct.class);
            startActivity(updateActivityIntent);
        } else if (id == R.id.add_company_nav) {

        } else if (id == R.id.company_stock_nav) {

        } else if (id == R.id.product_stock_nav) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
