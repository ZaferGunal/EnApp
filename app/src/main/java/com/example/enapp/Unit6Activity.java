package com.example.enapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class Unit6Activity extends AppCompatActivity {

    ImageButton backButton ;

    LinearLayout sclayout;
    Intent intent2Units;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit6);

        backButton = findViewById(R.id.back2UnitsId);


        intent2Units= new Intent(Unit6Activity.this,SchoolSubjectActivity.class);


        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent2Units);
            }
        });


        sclayout = findViewById(R.id.sclayout_);


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


        for(int b = 0 ;b < 91 ;b++){
            list.add(new WordBox(this));
            list.get(b).setLayoutParams(layoutParams);
        }


        list.get(0).setWord("accomplish");
        list.get(0).setDefinition("to achieve or complete a mission");

        list.get(1).setWord("achieve");
        list.get(1).setDefinition("to successfully reach a goal");

        list.get(2).setWord("attain");
        list.get(2).setDefinition("to succeed in reaching a desired objective");

        list.get(3).setWord("fulfil");
        list.get(3).setDefinition("to satisfy or meet an aspiration");

        list.get(4).setWord("meet");
        list.get(4).setDefinition("to achieve or reach an objective");

        list.get(5).setWord("actor");
        list.get(5).setDefinition("a person who performs in plays or movies");

        list.get(6).setWord("actress");
        list.get(6).setDefinition("a female actor");

        list.get(7).setWord("air steward");
        list.get(7).setDefinition("a person who serves passengers on an airplane");

        list.get(8).setWord("air stewardess");
        list.get(8).setDefinition("a female air steward");

        list.get(9).setWord("alone");
        list.get(9).setDefinition("being by oneself; without others");

        list.get(10).setWord("anxiety");
        list.get(10).setDefinition("a feeling of worry, nervousness, or unease");

        list.get(11).setWord("attitude");
        list.get(11).setDefinition("a settled way of thinking or feeling about someone or something");

        list.get(12).setWord("barman");
        list.get(12).setDefinition("a man who serves drinks at a bar");

        list.get(13).setWord("barmaid");
        list.get(13).setDefinition("a female barman");

        list.get(14).setWord("becoming");
        list.get(14).setDefinition("attractive or suitable on someone");

        list.get(15).setWord("blend");
        list.get(15).setDefinition("to mix together");

        list.get(16).setWord("businessman");
        list.get(16).setDefinition("a man engaged in business");

        list.get(17).setWord("businesswoman");
        list.get(17).setDefinition("a woman engaged in business");

        list.get(18).setWord("chaperone");
        list.get(18).setDefinition("to accompany and look after someone");

        list.get(19).setWord("cleaning lady");
        list.get(19).setDefinition("a woman employed to clean and tidy a building");

        list.get(20).setWord("condemn");
        list.get(20).setDefinition("to express complete disapproval of something");

        list.get(21).setWord("consternation");
        list.get(21).setDefinition("a feeling of anxiety or dismay");

        list.get(22).setWord("converge");
        list.get(22).setDefinition("to come together from different directions");

        list.get(23).setWord("cowardly");
        list.get(23).setDefinition("lacking courage; fearful");

        list.get(24).setWord("critical");
        list.get(24).setDefinition("expressing adverse or disapproving comments");

        list.get(25).setWord("crystallise");
        list.get(25).setDefinition("to become definite");

        list.get(26).setWord("demeanour");
        list.get(26).setDefinition("outward behavior or bearing");

        list.get(27).setWord("dire");
        list.get(27).setDefinition("extremely serious or urgent");

        list.get(28).setWord("disappointed");
        list.get(28).setDefinition("feeling sad or displeased because something is not as good as expected");

        list.get(29).setWord("dismal");
        list.get(29).setDefinition("depressing; dreary");

        list.get(30).setWord("dismay");
        list.get(30).setDefinition("to cause someone to feel distressed or disheartened");

        list.get(31).setWord("distinguished");
        list.get(31).setDefinition("successful, authoritative, and commanding great respect");

        list.get(32).setWord("dreary");
        list.get(32).setDefinition("dull, bleak, and lifeless");

        list.get(33).setWord("escort");
        list.get(33).setDefinition("to accompany someone or something");

        list.get(34).setWord("fainthearted");
        list.get(34).setDefinition("lacking courage; timid");

        list.get(35).setWord("fall out");
        list.get(35).setDefinition("to have a disagreement or argument");

        list.get(36).setWord("fearless");
        list.get(36).setDefinition("lacking fear; brave");

        list.get(37).setWord("fitting");
        list.get(37).setDefinition("appropriate or suitable");

        list.get(38).setWord("foreshadow");
        list.get(38).setDefinition("to be a warning or indication of a future event");

        list.get(39).setWord("get on");
        list.get(39).setDefinition("to have a good relationship");

        list.get(40).setWord("get over");
        list.get(40).setDefinition("to recover from an illness or setback");

        list.get(41).setWord("get up");
        list.get(41).setDefinition("to rise from bed or a sitting position");

        list.get(42).setWord("ghost");
        list.get(42).setDefinition("the spirit of a dead person");

        list.get(43).setWord("go off");
        list.get(43).setDefinition("to explode or fire");

        list.get(44).setWord("great");
        list.get(44).setDefinition("remarkably large in size or degree");

        list.get(45).setWord("hair-raising");
        list.get(45).setDefinition("very frightening or alarming");

        list.get(46).setWord("have no time for");
        list.get(46).setDefinition("to have a strong dislike for someone or something");

        list.get(47).setWord("have the time of your life");
        list.get(47).setDefinition("to have a wonderful and exciting experience");

        list.get(48).setWord("ideas");
        list.get(48).setDefinition("thoughts or concepts");

        list.get(49).setWord("improper");
        list.get(49).setDefinition("not in accordance with accepted standards or rules");

        list.get(50).setWord("in the nick of time");
        list.get(50).setDefinition("just in time to prevent something bad from happening");

        list.get(51).setWord("in time");
        list.get(51).setDefinition("sufficiently early");

        list.get(52).setWord("insignificant");
        list.get(52).setDefinition("too small or unimportant to be worth consideration");

        list.get(53).setWord("intolerant");
        list.get(53).setDefinition("unwilling to accept views, beliefs, or behavior that differ from one's own");

        list.get(54).setWord("leave out");
        list.get(54).setDefinition("to omit or exclude someone or something");

        list.get(55).setWord("liberal");
        list.get(55).setDefinition("open to new behavior or opinions and willing to discard traditional values");

        list.get(56).setWord("living on borrowed time");
        list.get(56).setDefinition("continuing to survive despite a near encounter with death");

        list.get(57).setWord("make up");
        list.get(57).setDefinition("to invent a story or excuse");

        list.get(58).setWord("make up for lost time");
        list.get(58).setDefinition("to work or act more quickly than usual to compensate for time lost");

        list.get(59).setWord("mankind");
        list.get(59).setDefinition("the human race");

        list.get(60).setWord("negligible");
        list.get(60).setDefinition("so small or unimportant as to be not worth considering");

        list.get(61).setWord("notion");
        list.get(61).setDefinition("a conception of or belief about something");

        list.get(62).setWord("obscure");
        list.get(62).setDefinition("to keep from being seen; conceal");

        list.get(63).setWord("policeman");
        list.get(63).setDefinition("a male officer of the law");

        list.get(64).setWord("policewoman");
        list.get(64).setDefinition("a female officer of the law");

        list.get(65).setWord("postman");
        list.get(65).setDefinition("a person who delivers mail");

        list.get(66).setWord("put on");
        list.get(66).setDefinition("to start to wear");

        list.get(67).setWord("put out");
        list.get(67).setDefinition("to extinguish or quench");

        list.get(68).setWord("quiet");
        list.get(68).setDefinition("making little or no noise");

        list.get(69).setWord("resonate");
        list.get(69).setDefinition("to evoke images, memories, and emotions");

        list.get(70).setWord("revive");
        list.get(70).setDefinition("to restore to life or consciousness");

        list.get(71).setWord("right place at the right time");
        list.get(71).setDefinition("being in a favorable situation or position");

        list.get(72).setWord("salesman");
        list.get(72).setDefinition("a man who sells goods or services");

        list.get(73).setWord("settle down");
        list.get(73).setDefinition("to establish a stable life; to calm down");

        list.get(74).setWord("spectre");
        list.get(74).setDefinition("a ghostly apparition");

        list.get(75).setWord("spokesman");
        list.get(75).setDefinition("a person who speaks on behalf of a group or organization");

        list.get(76).setWord("spokeswoman");
        list.get(76).setDefinition("a female spokesperson");

        list.get(77).setWord("subdued");
        list.get(77).setDefinition("quiet and reflective; lacking in vitality");

        list.get(78).setWord("switch off");
        list.get(78).setDefinition("to turn off");

        list.get(79).setWord("take in");
        list.get(79).setDefinition("to absorb or comprehend information");

        list.get(80).setWord("take off");
        list.get(80).setDefinition("to leave the ground and begin flight");

        list.get(81).setWord("thrilling");
        list.get(81).setDefinition("causing excitement or adventure");

        list.get(82).setWord("unaccompanied");
        list.get(82).setDefinition("alone or without a companion");

        list.get(83).setWord("unbiased");
        list.get(83).setDefinition("fair and impartial");

        list.get(84).setWord("unknown");
        list.get(84).setDefinition("not known or familiar");

        list.get(85).setWord("unsuitable");
        list.get(85).setDefinition("not appropriate or fitting");

        list.get(86).setWord("valiant");
        list.get(86).setDefinition("brave and courageous");

        list.get(87).setWord("waiter");
        list.get(87).setDefinition("a man who serves food in a restaurant");

        list.get(88).setWord("waitress");
        list.get(88).setDefinition("a female waiter");

        list.get(89).setWord("wife");
        list.get(89).setDefinition("a married woman");

        list.get(90).setWord("husband");
        list.get(90).setDefinition("a married man");

        for(int i = 0; i < 91; i ++){
            sclayout.addView(list.get(i));
        }


    }
}