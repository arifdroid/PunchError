package com.example.afinal.fingerPrint_Login.final_fingerprint_btm_nav;

import android.os.Bundle;

import com.example.afinal.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Final_fingerprint_bottom_nav extends AppCompatActivity {


    //for admin and evening,

    //image

    private ImageView imageViewEvening, imageViewAdmin;

    //cardview
    private CardView cardViewEvening, cardViewAdmin;

    //bar
    private ConstraintLayout constraintLayout_bar_admin, constraintLayout_bar_evening;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_wifi:



                    break;
                case R.id.navigation_location:



                    break;
                case R.id.navigation_morning_constraint:

                    break;
                case R.id.navigation_evening_constraint:

                    constraintLayout_bar_admin.setVisibility(View.INVISIBLE);
                    cardViewAdmin.setVisibility(View.INVISIBLE);
                    imageViewAdmin.setVisibility(View.INVISIBLE);

                    constraintLayout_bar_evening.setVisibility(View.VISIBLE);
                    cardViewEvening.setVisibility(View.VISIBLE);
                    imageViewEvening.setVisibility(View.VISIBLE);

                    break;
                case R.id.navigation_admin:

                    constraintLayout_bar_admin.setVisibility(View.VISIBLE);
                    cardViewAdmin.setVisibility(View.VISIBLE);
                    imageViewAdmin.setVisibility(View.VISIBLE);

                    constraintLayout_bar_evening.setVisibility(View.INVISIBLE);
                    cardViewEvening.setVisibility(View.INVISIBLE);
                    imageViewEvening.setVisibility(View.INVISIBLE);

                    break;


            }
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_fingerprint_bottom_nav);
        BottomNavigationView navView = findViewById(R.id.nav_view);

        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navView.setItemIconTintList(null);

        //evening, admin
        // imageview
        imageViewEvening = findViewById(R.id.imageViewFinal_evening);
        imageViewAdmin = findViewById(R.id.imageViewFinal_admin_now);

        //cardview
        cardViewAdmin = findViewById(R.id.cardViewFinal_admin_now);
        cardViewEvening = findViewById(R.id.cardviewFinal_Evening);

        //bar

        constraintLayout_bar_admin = findViewById(R.id.constraintLayoutFinal_bar5);
        constraintLayout_bar_evening = findViewById(R.id.constraintLayoutFinal_bar4);
    }

}
