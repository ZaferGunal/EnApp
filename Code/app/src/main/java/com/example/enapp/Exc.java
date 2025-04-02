package com.example.enapp;


import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;

import com.example.enapp.R;

public class Exc extends LinearLayout

{

    TextView wordTextView ,definitionTextView;
    LinearLayout wordLayout,defLayout;
    String wordStr,defStr;


    public Exc(Context context) {
        super(context);
        initMethod(context,null);

    }

    public Exc(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initMethod(context,attrs);
    }


    public void initMethod(Context context,AttributeSet attrbset){
        LayoutInflater inflater  = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.wordbox_layout,this,true);






        wordTextView.setText(wordStr);
        definitionTextView.setText(defStr);

        wordLayout.setVisibility(VISIBLE);
        defLayout.setVisibility(GONE);


        setOnClickListener(v -> toggleControl());

    }

    private void toggleControl() {
        if (wordLayout.getVisibility() == GONE && defLayout.getVisibility() == VISIBLE) {
            wordLayout.setVisibility(VISIBLE);
            defLayout.setVisibility(GONE);

        }
        else if(wordLayout.getVisibility() == VISIBLE && defLayout.getVisibility() == GONE){
            wordLayout.setVisibility(GONE);
            defLayout.setVisibility(VISIBLE);
        }


    }


    public void setWord(String word){
        wordTextView.setText(word);
    }


    public void setDefinition(String definition){
        definitionTextView.setText(definition);
    }




}
