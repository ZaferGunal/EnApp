package com.example.enapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import org.checkerframework.common.reflection.qual.NewInstance;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import kotlin.Unit;

public class Unit3Activity extends AppCompatActivity {

    ImageButton backButton ;

   LinearLayout layoutsc;
    Intent  intent2Units;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit3);

        intent2Units = new Intent(Unit3Activity.this,SchoolSubjectActivity.class);

        layoutsc = findViewById(R.id.idsclayout);

        backButton = findViewById(R.id.back2UnitsId);


        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent2Units);
            }
        });

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, // Genişlik - ekrana tamamen yayılacak
                LinearLayout.LayoutParams.WRAP_CONTENT // Yükseklik - içeriğe göre otomatik ayarlanacak
        );



        // Layout margin (düzen kenar boşluğu) ayarları
        int leftMargin = 20; // Sol kenar boşluğu pixel cinsinden
        int topMargin = 20; // Üst kenar boşluğu pixel cinsinden
        int rightMargin = 20; // Sağ kenar boşluğu pixel cinsinden
        int bottomMargin = 20; // Alt kenar boşluğu pixel cinsinden

        layoutParams.setMargins(leftMargin, topMargin, rightMargin, bottomMargin);


        ArrayList<WordBox>  list = new ArrayList<WordBox>();


       /* WordBox w1 = new WordBox(this);
        w1.setWord("naber");
        w1.setDefinition("nasıl");
        w1.setLayoutParams(layoutParams);
        layoutsc.addView(w1);
*/
         for(int b = 0 ;b < 102 ;b++){
             list.add(new WordBox(this));
             list.get(b).setLayoutParams(layoutParams);
         }


         for(int i = 0; i < 102; i ++){
             layoutsc.addView(list.get(i));
         }










        /*WordBox w2 = new WordBox(this);
        w2.setWord("hayır");
        w2.setDefinition("fır");
        w2.setLayoutParams(layoutParams);
        layoutsc.addView(w2);


        WordBox w3 = new WordBox(this);
        w3.setWord("");
        w3.setDefinition("");
        w3.setLayoutParams(layoutParams);
        layoutsc.addView(w3);



        WordBox w4= new WordBox(this);
        w4.setWord("");
        w4.setDefinition("");
        w4.setLayoutParams(layoutParams);
        layoutsc.addView(w4);

        WordBox w5= new WordBox(this);
        w5.setWord("");
        w5.setDefinition("");
        w5.setLayoutParams(layoutParams);
        layoutsc.addView(w5);


        WordBox w6= new WordBox(this);
        w6.setWord("");
        w6.setDefinition("");
        w6.setLayoutParams(layoutParams);
        layoutsc.addView(w6);

*/



    }

}