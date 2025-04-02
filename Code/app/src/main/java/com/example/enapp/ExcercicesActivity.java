package com.example.enapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class ExcercicesActivity extends AppCompatActivity {

    LinearLayout home,cards ,schoolcrds,othercards;

    Intent intent2cards_,intent2school,intent2other,intent2home;


    LinearLayout unit4b,unit5b,unit6b;
    Intent intentUnit4,intentUnit5,intentUnit6;

   DrawerLayout drawerlayout;
   LinearLayout menu;
      ImageButton buttonMenu;


    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_excercices);

 back = findViewById(R.id.back2homeId);

        intentUnit4 = new Intent(ExcercicesActivity.this,ex4.class);
        intentUnit5 = new Intent(ExcercicesActivity.this,ex5.class);
        intentUnit6 = new Intent(ExcercicesActivity.this,ex6.class);


        unit4b = findViewById(R.id.unit4Id);
        unit5b = findViewById(R.id.unit5Id);
        unit6b = findViewById(R.id.unit6Id);

        unit4b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentUnit4)  ;          }
        });

        unit5b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentUnit5)  ;          }
        });

        unit6b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intentUnit6)  ;          }
        });


 intent2home = new Intent(ExcercicesActivity.this,MainActivity.class);

 back.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {
         startActivity(intent2home);
     }
 });


        menu = findViewById(R.id.drawer_content);
         buttonMenu = findViewById(R.id.menuId);
        drawerlayout = findViewById(R.id.drawer_layout);
        buttonMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerlayout.openDrawer(menu);

            }
        });

        intent2cards_ = new Intent(ExcercicesActivity.this,CardsActivity.class);
        intent2school = new Intent(ExcercicesActivity.this,SchoolSubjectActivity.class);
        intent2other =  new Intent(ExcercicesActivity.this,OtherActivity.class);
        intent2home = new Intent(ExcercicesActivity.this,MainActivity.class);


        cards = findViewById(R.id.cardspagetoId);
        schoolcrds = findViewById(R.id.shcooltoId);
        othercards = findViewById(R.id.othertoId);
        home = findViewById(R.id.homepagetoId);


        cards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent2cards_);
            }
        });

        schoolcrds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent2school);
            }
        });

        othercards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent2other);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent2home);
            }
        });







    }
}