package com.example.enapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout cards ,schoolcrds,othercards,exercises;

    Intent intent2cards_,intent2school,intent2other,intent2exercises;




    Intent intent2Cards,intent2Excercices;

    ImageButton menuButton;
    LinearLayout menu;
    DrawerLayout drawerlayout;

    LinearLayout cardsLayout,excLayout;
    WordBox wordBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intent2Cards = new Intent(MainActivity.this, CardsActivity.class);


        intent2Excercices = new Intent(MainActivity.this,ExcercicesActivity.class);



        intent2cards_ = new Intent(MainActivity.this,CardsActivity.class);
        intent2school = new Intent(MainActivity.this,SchoolSubjectActivity.class);
        intent2other =  new Intent(MainActivity.this,OtherActivity.class);
        intent2exercises = new Intent(MainActivity.this,ExcercicesActivity.class);




        cardsLayout = findViewById(R.id.cardsLayoutId);
        excLayout = findViewById(R.id.excLayoutId);
        cards = findViewById(R.id.cardspagetoId);
        schoolcrds = findViewById(R.id.shcooltoId);
        othercards = findViewById(R.id.othertoId);
        exercises  = findViewById(R.id.exercisespagetoId);


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
        exercises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent2exercises);
            }
        });












        cardsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent2Cards);
            }
        });


        excLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent2Excercices);
            }
        });




        menu = findViewById(R.id.drawer_content);
        menuButton = findViewById(R.id.menuId);
        drawerlayout = findViewById(R.id.drawer_layout);
        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerlayout.openDrawer(menu);

            }
        });




    }



}