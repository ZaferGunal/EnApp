package com.example.enapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class Unit4Activity extends AppCompatActivity {

    LinearLayout sclayout;
    ImageButton backButton ;

    Intent intent2Units;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit4);


        sclayout = findViewById(R.id.sclayout_);
        backButton = findViewById(R.id.back2UnitsId);




        intent2Units = new Intent(Unit4Activity.this,SchoolSubjectActivity.class);


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



        ArrayList<WordBox> list= new ArrayList<WordBox>();


        for(int b = 0 ;b < 78 ;b++){
            list.add(new WordBox(this));
            list.get(b).setLayoutParams(layoutParams);
        }



        list.get(0).setWord("aches and pains");
        list.get(0).setDefinition("general bodily discomfort or soreness");

        list.get(1).setWord("adapt/adaptation");
        list.get(1).setDefinition("to adjust to new conditions; the process of adjusting or modifying");

        list.get(2).setWord("address");
        list.get(2).setDefinition("to deal with or discuss a matter");

        list.get(3).setWord("adjust/adjustment");
        list.get(3).setDefinition("to modify or alter to fit new conditions; the process of modifying or altering");

        list.get(4).setWord("advise");
        list.get(4).setDefinition("to recommend or give counsel");

        list.get(5).setWord("alter/alteration");
        list.get(5).setDefinition("to change or modify; the act of changing or modifying");

        list.get(6).setWord("amend/amendment");
        list.get(6).setDefinition("to make minor changes or corrections; a minor change or improvement");

        list.get(7).setWord("armed conflicts");
        list.get(7).setDefinition("conflicts involving the use of weapons or military force");

        list.get(8).setWord("blurt");
        list.get(8).setDefinition("to say something impulsively or without thinking");

        list.get(9).setWord("caution");
        list.get(9).setDefinition("to warn or advise against potential danger or risk");

        list.get(10).setWord("chant");
        list.get(10).setDefinition("to repeat or sing a phrase rhythmically");

        list.get(11).setWord("conceive");
        list.get(11).setDefinition("to form a notion or idea; to become pregnant");

        list.get(12).setWord("conjecture");
        list.get(12).setDefinition("to speculate or guess");

        list.get(13).setWord("convert/conversion");
        list.get(13).setDefinition("to change into a different form or state; the act of changing");

        list.get(14).setWord("cosmetic");
        list.get(14).setDefinition("relating to superficial or surface changes");

        list.get(15).setWord("crash");
        list.get(15).setDefinition("to collide violently; to fail suddenly");

        list.get(16).setWord("dead and buried");
        list.get(16).setDefinition("completely finished or resolved");

        list.get(17).setWord("dos and don'ts");
        list.get(17).setDefinition("rules or guidelines for what is acceptable or advised");

        list.get(18).setWord("dramatic");
        list.get(18).setDefinition("striking or noticeable; theatrical or exaggerated");

        list.get(19).setWord("discard");
        list.get(19).setDefinition("to get rid of or dispose of");

        list.get(20).setWord("distribute");
        list.get(20).setDefinition("to give out or spread");

        list.get(21).setWord("drastic");
        list.get(21).setDefinition("severe or extreme");

        list.get(22).setWord("dwindle");
        list.get(22).setDefinition("to diminish or decrease");

        list.get(23).setWord("elicit");
        list.get(23).setDefinition("to draw out or evoke");

        list.get(24).setWord("ensure");
        list.get(24).setDefinition("to make certain or guarantee");

        list.get(25).setWord("entreat");
        list.get(25).setDefinition("to plead or request earnestly");

        list.get(26).setWord("epidemics");
        list.get(26).setDefinition("widespread outbreaks of infectious diseases");

        list.get(27).setWord("escalate");
        list.get(27).setDefinition("to increase in intensity or scope");

        list.get(28).setWord("evolve/evolution");
        list.get(28).setDefinition("to develop gradually; the process of development");

        list.get(29).setWord("fair and square");
        list.get(29).setDefinition("in a just and honest manner");

        list.get(30).setWord("famine");
        list.get(30).setDefinition("extreme scarcity of food");

        list.get(31).setWord("flatline");
        list.get(31).setDefinition("to reach a stable and unchanging level");

        list.get(32).setWord("fluctuate");
        list.get(32).setDefinition("to change irregularly; to vary");

        list.get(33).setWord("fundamental");
        list.get(33).setDefinition("essential or basic");

        list.get(34).setWord("global capitalism");
        list.get(34).setDefinition("economic system characterized by private ownership and free markets on a global scale");

        list.get(35).setWord("high and dry");
        list.get(35).setDefinition("left in a difficult or helpless situation");

        list.get(36).setWord("highlight");
        list.get(36).setDefinition("to emphasize or draw attention to");

        list.get(37).setWord("hiss");
        list.get(37).setDefinition("to make a sharp sibilant sound");

        list.get(38).setWord("keep pace with");
        list.get(38).setDefinition("to maintain the same speed or rate as");

        list.get(39).setWord("lag behind");
        list.get(39).setDefinition("to fall behind in progress or development");

        list.get(40).setWord("level off");
        list.get(40).setDefinition("to stabilize or reach a plateau");

        list.get(41).setWord("life expectancy");
        list.get(41).setDefinition("the average age that a person is expected to live");

        list.get(42).setWord("make or break");
        list.get(42).setDefinition("to be crucial or decisive in determining success or failure");

        list.get(43).setWord("marginal");
        list.get(43).setDefinition("relating to or at the edge or margin; minimal");

        list.get(44).setWord("marked");
        list.get(44).setDefinition("clearly noticeable or distinct");

        list.get(45).setWord("minimal");
        list.get(45).setDefinition("smallest or least possible");

        list.get(46).setWord("modify/modification");
        list.get(46).setDefinition("to change or alter; the act of changing or altering");

        list.get(47).setWord("momentous");
        list.get(47).setDefinition("of great importance or significance");

        list.get(48).setWord("mount");
        list.get(48).setDefinition("to increase or grow larger");

        list.get(49).setWord("mouth");
        list.get(49).setDefinition("to speak in a particular manner");

        list.get(50).setWord("mushroom");
        list.get(50).setDefinition("to expand rapidly; to grow or develop quickly");

        list.get(51).setWord("mutate/mutation");
        list.get(51).setDefinition("to undergo genetic change; the process of genetic alteration");

        list.get(52).setWord("nag");
        list.get(52).setDefinition("to annoy or irritate by persistent fault-finding or urging");

        list.get(53).setWord("neat and tidy");
        list.get(53).setDefinition("clean and well-organized");

        list.get(54).setWord("nose-dive");
        list.get(54).setDefinition("to plunge or drop suddenly");

        list.get(55).setWord("outpace");
        list.get(55).setDefinition("to exceed or surpass in speed or progress");

        list.get(56).setWord("outstrip");
        list.get(56).setDefinition("to surpass or exceed in performance or achievement");

        list.get(57).setWord("overtake");
        list.get(57).setDefinition("to catch up with and pass by");

        list.get(58).setWord("pick and choose");
        list.get(58).setDefinition("to select carefully from a number of possibilities");

        list.get(59).setWord("plateau");
        list.get(59).setDefinition("to reach a stable level or stage");

        list.get(60).setWord("plummet");
        list.get(60).setDefinition("to fall or drop suddenly and steeply");

        list.get(61).setWord("plunge");
        list.get(61).setDefinition("to fall suddenly or dive downward");

        list.get(62).setWord("population growth");
        list.get(62).setDefinition("increase in the number of individuals within a population");

        list.get(63).setWord("poverty");
        list.get(63).setDefinition("state of being extremely poor");

        list.get(64).setWord("probe");
        list.get(64).setDefinition("to investigate or examine thoroughly");

        list.get(65).setWord("prove");
        list.get(65).setDefinition("to demonstrate or establish the truth or validity of");

        list.get(66).setWord("radical");
        list.get(66).setDefinition("extreme or revolutionary");

        list.get(67).setWord("refugees");
        list.get(67).setDefinition("individuals who have been forced to leave their homes due to conflict or persecution");

        list.get(68).setWord("remain constant");
        list.get(68).setDefinition("to stay unchanged or consistent");

        list.get(69).setWord("retort");
        list.get(69).setDefinition("to respond sharply or angrily");

        list.get(70).setWord("revise/revision");
        list.get(70).setDefinition("to amend or alter; the act of amending or altering");

        list.get(71).setWord("rough and ready");
        list.get(71).setDefinition("simple and unsophisticated but effective");

        list.get(72).setWord("rumour");
        list.get(72).setDefinition("unverified information or hearsay");

        list.get(73).setWord("safe and sound");
        list.get(73).setDefinition("unharmed or uninjured");

        list.get(74).setWord("scold");
        list.get(74).setDefinition("to reprimand or criticize angrily");

        list.get(75).setWord("seek");
        list.get(75).setDefinition("to attempt or try to find or obtain");

        list.get(76).setWord("short and sweet");
        list.get(76).setDefinition("brief and to the point");

        list.get(77).setWord("sick and tired");
        list.get(77).setDefinition("completely fed up or annoyed");




        for(int i = 0; i < 78; i ++){
            sclayout.addView(list.get(i));
        }








    }
}