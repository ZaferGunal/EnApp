package com.example.enapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;





public class CardsActivity extends AppCompatActivity {

    LinearLayout home,schoolcrds,othercards,exercises;

    Intent intent2home_,intent2school,intent2other,intent2exercises;



    LinearLayout menu;
    DrawerLayout drawerlayout ;
    Intent  intent2Menu,intent2SchoolSubjects,intent2OtherSubjects;

     ImageButton back2menuButton;
     LinearLayout schoolLayout ,otherLayout;
ImageButton    menuButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cards);


        intent2OtherSubjects = new Intent(CardsActivity.this,OtherActivity.class);
   intent2SchoolSubjects = new Intent(CardsActivity.this,SchoolSubjectActivity.class);
   intent2Menu = new Intent(CardsActivity.this,MainActivity.class);

        back2menuButton = findViewById(R.id.backArrowButtonId);
        schoolLayout = findViewById(R.id.cardsLayoutId);
        otherLayout = findViewById(R.id.excLayoutId);

        back2menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent2Menu);
            }
        });

        schoolLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent2SchoolSubjects);
            }
        });



        otherLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent2OtherSubjects);
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



        intent2home_ = new Intent(CardsActivity.this,MainActivity.class);
        intent2school = new Intent(CardsActivity.this,SchoolSubjectActivity.class);
        intent2other =  new Intent(CardsActivity.this,OtherActivity.class);
        intent2exercises = new Intent(CardsActivity.this,ExcercicesActivity.class);




        home = findViewById(R.id.homepagetoId);
        schoolcrds = findViewById(R.id.shcooltoId);
        othercards = findViewById(R.id.othertoId);
        exercises  = findViewById(R.id.exercisespagetoId);


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent2home_);
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



    }


}