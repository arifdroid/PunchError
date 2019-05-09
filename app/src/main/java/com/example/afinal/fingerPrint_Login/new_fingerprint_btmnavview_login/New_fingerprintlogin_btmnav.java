package com.example.afinal.fingerPrint_Login.new_fingerprint_btmnavview_login;

import android.os.Bundle;

import com.example.afinal.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.ViewPager;

import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class New_fingerprintlogin_btmnav extends AppCompatActivity {


    //view pager handler, for menu

    private OurFragmentWifi fragmentWifi;
    private OurFragmentLocation fragmentLocation;
    private OurFragmentMorning fragmentMorning;
    private OurFragmentEvening fragmentEvening;
    private OurFragmentAdmin fragmentAdmin;


    //////// view pager

    ///custom card view

    private CardView cardView_wifi_icon, cardView_location_icon , cardView_morning_icon, cardView_evening_icon, cardView_admin_icon;

    private ImageView imageView_wifi_bar, imageView_location_bar, imageView_bar_morning, imageView_bar_evening, imageView_bar_admin;


    //calculate linear layout

    LinearLayout linearLayout;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_wifi:


                    imageView_bar_morning.setVisibility(View.INVISIBLE);
                    cardView_morning_icon.setVisibility(View.INVISIBLE);


                    imageView_bar_evening.setVisibility(View.INVISIBLE);
                    cardView_evening_icon.setVisibility(View.INVISIBLE);


                    imageView_bar_admin.setVisibility(View.INVISIBLE);
                    cardView_admin_icon.setVisibility(View.INVISIBLE);

                    imageView_location_bar.setVisibility(View.INVISIBLE);
                    cardView_location_icon.setVisibility(View.INVISIBLE);


                    imageView_wifi_bar.setVisibility(View.VISIBLE);
                     cardView_wifi_icon.setVisibility(View.VISIBLE);


                    break;
                case R.id.navigation_location:


                    imageView_bar_morning.setVisibility(View.INVISIBLE);
                    cardView_morning_icon.setVisibility(View.INVISIBLE);


                    imageView_bar_evening.setVisibility(View.INVISIBLE);
                    cardView_evening_icon.setVisibility(View.INVISIBLE);


                    imageView_bar_admin.setVisibility(View.INVISIBLE);
                    cardView_admin_icon.setVisibility(View.INVISIBLE);

                    imageView_wifi_bar.setVisibility(View.INVISIBLE);
                    cardView_wifi_icon.setVisibility(View.INVISIBLE);


                    imageView_wifi_bar.setVisibility(View.INVISIBLE);
                    cardView_wifi_icon.setVisibility(View.INVISIBLE);


                    imageView_location_bar.setVisibility(View.VISIBLE);
                    cardView_location_icon.setVisibility(View.VISIBLE);



                    break;
                case R.id.navigation_morning_constraint:



                    imageView_bar_morning.setVisibility(View.VISIBLE);
                    cardView_morning_icon.setVisibility(View.VISIBLE);


                    imageView_bar_evening.setVisibility(View.INVISIBLE);
                    cardView_evening_icon.setVisibility(View.INVISIBLE);


                    imageView_bar_admin.setVisibility(View.INVISIBLE);
                    cardView_admin_icon.setVisibility(View.INVISIBLE);

                    imageView_wifi_bar.setVisibility(View.INVISIBLE);
                    cardView_wifi_icon.setVisibility(View.INVISIBLE);


                    imageView_wifi_bar.setVisibility(View.INVISIBLE);
                    cardView_wifi_icon.setVisibility(View.INVISIBLE);


                    imageView_location_bar.setVisibility(View.INVISIBLE);
                    cardView_location_icon.setVisibility(View.INVISIBLE);




                    break;

                case R.id.navigation_evening_constraint:



                    imageView_bar_morning.setVisibility(View.INVISIBLE);
                    cardView_morning_icon.setVisibility(View.INVISIBLE);


                    imageView_bar_evening.setVisibility(View.VISIBLE);
                    cardView_evening_icon.setVisibility(View.VISIBLE);


                    imageView_bar_admin.setVisibility(View.INVISIBLE);
                    cardView_admin_icon.setVisibility(View.INVISIBLE);

                    imageView_wifi_bar.setVisibility(View.INVISIBLE);
                    cardView_wifi_icon.setVisibility(View.INVISIBLE);


                    imageView_wifi_bar.setVisibility(View.INVISIBLE);
                    cardView_wifi_icon.setVisibility(View.INVISIBLE);


                    imageView_location_bar.setVisibility(View.INVISIBLE);
                    cardView_location_icon.setVisibility(View.INVISIBLE);




                    break;



                case R.id.navigation_admin:



                    imageView_bar_morning.setVisibility(View.INVISIBLE);
                    cardView_morning_icon.setVisibility(View.INVISIBLE);


                    imageView_bar_evening.setVisibility(View.INVISIBLE);
                    cardView_evening_icon.setVisibility(View.INVISIBLE);


                    imageView_bar_admin.setVisibility(View.VISIBLE);
                    cardView_admin_icon.setVisibility(View.VISIBLE);

                    imageView_wifi_bar.setVisibility(View.INVISIBLE);
                    cardView_wifi_icon.setVisibility(View.INVISIBLE);


                    imageView_wifi_bar.setVisibility(View.INVISIBLE);
                    cardView_wifi_icon.setVisibility(View.INVISIBLE);


                    imageView_location_bar.setVisibility(View.INVISIBLE);
                    cardView_location_icon.setVisibility(View.INVISIBLE);


                    break;
            }
            return true;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_fingerprintlogin_btmnav);
        final BottomNavigationView navView = findViewById(R.id.nav_view);

        //set card view

        cardView_wifi_icon = findViewById(R.id.cardviewWifiiconiD);
        cardView_location_icon = findViewById(R.id.cardviewLocationIcon);
        cardView_morning_icon = findViewById(R.id.cardViewMorningID);
        cardView_evening_icon = findViewById(R.id.cardViewEveningID);
        cardView_admin_icon = findViewById(R.id.cardViewAdminID);

        //bar imageview

        imageView_wifi_bar = findViewById(R.id.imageView2);
        imageView_location_bar = findViewById(R.id.imageView3);
        imageView_bar_morning= findViewById(R.id.imageView4);
        imageView_bar_evening = findViewById(R.id.imageView5);
        imageView_bar_admin = findViewById(R.id.imageView6);


        //linear layout
        linearLayout = findViewById(R.id.linearLayoutiD);

        //linearLay;

        navView.setItemIconTintList(null);

        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


    }


}
