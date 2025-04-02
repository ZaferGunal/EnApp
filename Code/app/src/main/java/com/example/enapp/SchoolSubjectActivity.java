package com.example.enapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class SchoolSubjectActivity extends AppCompatActivity {

    LinearLayout home,cards ,othercrds,exercices;

    Intent intent2cards_,intent2other,intent2excercices,intent2home;


   Intent intent2CardsMenu;
   Intent intentUnit3,intentUnit4,intentUnit5,intentUnit6;
   ImageButton back2CardsMenuButton;
    ScrollView  mScrollView;


    LinearLayout unit3b ,unit4b,unit5b,unit6b;

    ImageButton menuButton;
    LinearLayout menu;
    DrawerLayout drawerlayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_school_subject);

        intent2CardsMenu = new Intent(SchoolSubjectActivity.this,CardsActivity.class);
        intentUnit4 = new Intent(SchoolSubjectActivity.this,Unit4Activity.class);
        intentUnit5 = new Intent(SchoolSubjectActivity.this,Unit5Activity.class);
        intentUnit6 = new Intent(SchoolSubjectActivity.this,Unit6Activity.class);





        menu = findViewById(R.id.drawer_content);
        menuButton = findViewById(R.id.menuId);
        drawerlayout = findViewById(R.id.drawer_layout);
        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerlayout.openDrawer(menu);

            }
        });



        unit4b = findViewById(R.id.unit4Id);
        unit5b = findViewById(R.id.unit5Id);
        unit6b = findViewById(R.id.unit6Id);

        back2CardsMenuButton = findViewById(R.id.back2CardsMenuButtonId);


        back2CardsMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent2CardsMenu);
            }
        });



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





        intent2cards_ = new Intent(SchoolSubjectActivity.this,CardsActivity.class);
        intent2other = new Intent(SchoolSubjectActivity.this,OtherActivity.class);
        intent2home =  new Intent(SchoolSubjectActivity.this,MainActivity.class);
        intent2excercices= new Intent(SchoolSubjectActivity.this,ExcercicesActivity.class);





        cards = findViewById(R.id.cardspagetoId);
        othercrds = findViewById(R.id.schooltoId);
        home = findViewById(R.id.homepagetoId);
        exercices = findViewById(R.id.exercisespagetoId);




        cards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent2cards_);
            }
        });

        othercrds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent2other);
            }
        });

        exercices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent2excercices);
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