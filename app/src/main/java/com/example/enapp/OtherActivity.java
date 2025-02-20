package com.example.enapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class OtherActivity extends AppCompatActivity {


    LinearLayout home,cards ,schoolcrds,exercices;

    Intent intent2cards_,intent2school,intent2excercices,intent2home;


    DrawerLayout drawerlayout ;



    ImageButton  backButton,menuButton;
     Intent  intent2Topics, intent2Add;

     Dialog mydialog;

     EditText wordEditText,defEditText;

     TextView saveButton;

     String newWord,newDef;



     LinearLayout sclayout,menu;
     DatabaseHelper dthelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

         View dialogLayout = inflater.inflate(R.layout.dialog, null);


         menu = findViewById(R.id.drawer_content);
         menuButton = findViewById(R.id.menuId);
         drawerlayout = findViewById(R.id.drawer_layout);
         menuButton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 drawerlayout.openDrawer(menu);

             }
         });






        dthelper = new DatabaseHelper(this);

        sclayout = findViewById(R.id.scrollLayoutId);
        backButton = findViewById(R.id.back2TopicsId);



        intent2Topics = new Intent(OtherActivity.this,CardsActivity.class);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent2Topics);
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


        ArrayList<WordBox> list = new ArrayList<WordBox>();




        for(int b = 0 ;b < 135 ;b++){
            list.add(new WordBox(this));
            list.get(b).setLayoutParams(layoutParams);
        }


        for(int i = 0; i < 135; i ++){
            sclayout.addView(list.get(i));
        }


        list.get(0).setWord("indignant");
        list.get(0).setDefinition("angry because of something that is wrong or not fair");

        list.get(1).setWord("incredulous");
        list.get(1).setDefinition("not too willing to believe what you are told");

        list.get(2).setWord("credulous");
        list.get(2).setDefinition("being easily deceived");

        list.get(3).setWord("declivities");
        list.get(3).setDefinition("an area that is lower than surrounding areas");

        list.get(4).setWord("frowning");
        list.get(4).setDefinition("to bring your eyebrows together");

        list.get(5).setWord("abdicate");
        list.get(5).setDefinition("give up");

        list.get(6).setWord("clamorously");
        list.get(6).setDefinition("noisily");

        list.get(7).setWord("sussuration");
        list.get(7).setDefinition("a soft, low noise like someone whispering");

        list.get(8).setWord("restlessness");
        list.get(8).setDefinition("the quality of being unwilling or unable to stay still or to be calm, because you are worried");

        list.get(9).setWord("extinguish");
        list.get(9).setDefinition("to stop a fire or a light burning");

        list.get(10).setWord("dubious");
        list.get(10).setDefinition("thought not to be completely true or not able to be trusted, doubtful");

        list.get(11).setWord("trivial");
        list.get(11).setDefinition("having little value or importance");

        list.get(12).setWord("contempt for sth");
        list.get(12).setDefinition("a strong feeling of disliking and having no respect for someone or something");

        list.get(13).setWord("belligerence");
        list.get(13).setDefinition("the wish to fight or argue");

        list.get(14).setWord("obedient");
        list.get(14).setDefinition("being willing to obey");

        list.get(15).setWord("incursion");
        list.get(15).setDefinition("a sudden attack on or act of going into a place");

        list.get(16).setWord("clumsy");
        list.get(16).setDefinition("someone causing accidents because of lack of attention");

        list.get(17).setWord("coil");
        list.get(17).setDefinition("a length of rope, hair, or wire, arranged into a series of circles, one above or outside the other");

        list.get(18).setWord("funnel");
        list.get(18).setDefinition("an object that has a wide round opening at the top, sloping sides, and a narrow tube at the bottom, used for pouring liquids or powders into containers with narrow necks");

        list.get(19).setWord("ravenous");
        list.get(19).setDefinition("extremely hungry");

        list.get(20).setWord("endow");
        list.get(20).setDefinition("to give a large amount of money to pay for creating a college, hospital, etc., or to provide an income for it");

        list.get(21).setWord("wickedness");
        list.get(21).setDefinition("the fact of being morally very wrong or bad");

        list.get(22).setWord("ferocity");
        list.get(22).setDefinition("the state of being frightening and violent");

        list.get(23).setWord("exigent");
        list.get(23).setDefinition("needing urgent attention, or demanding too much from other people");

        list.get(24).setWord("hegemony");
        list.get(24).setDefinition("superiority");

        list.get(25).setWord("impinge on");
        list.get(25).setDefinition("to have an effect on something, often by limiting it in some way");

        list.get(26).setWord("obstreperous");
        list.get(26).setDefinition("difficult to deal with and noisy");

        list.get(27).setWord("punctilious");
        list.get(27).setDefinition("very careful to behave correctly or to give attention to details");

        list.get(28).setWord("umbrage");
        list.get(28).setDefinition("offence or annoyance");

        list.get(29).setWord("accretion");
        list.get(29).setDefinition("gradual growth, increase");

        list.get(30).setWord("aspersion");
        list.get(30).setDefinition("a criticism, suggestion, or remark that damages another person's reputation");

        list.get(31).setWord("shrug sth off");
        list.get(31).setDefinition("to treat something as if it is not important or not a problem");

        list.get(32).setWord("contravene");
        list.get(32).setDefinition("to do something that a law or rule does not allow");

        list.get(33).setWord("cupidity");
        list.get(33).setDefinition("a strong feeling of wanting to have something");

        list.get(34).setWord("ephemeral");
        list.get(34).setDefinition("lasting for a short time, temporary");

        list.get(35).setWord("emend");
        list.get(35).setDefinition("to correct or improve a text");

        list.get(36).setWord("abhor");
        list.get(36).setDefinition("to hate a way of behaving or thinking, often because you think it is not moral, detest");

        list.get(37).setWord("entreat");
        list.get(37).setDefinition("to try very hard to persuade someone to do something");

        list.get(38).setWord("circumvent");
        list.get(38).setDefinition("prevent");

        list.get(39).setWord("interminable");
        list.get(39).setDefinition("endless");

        list.get(40).setWord("recluse");
        list.get(40).setDefinition("a person who lives alone and avoids going outside or talking to other people");

        list.get(41).setWord("profusion");
        list.get(41).setDefinition("an extremely large amount of something");

        list.get(42).setWord("abundance");
        list.get(42).setDefinition("a huge amount of something, profusion");

        list.get(43).setWord("prosperity");
        list.get(43).setDefinition("the state of being successful and having a lot of money");

        list.get(44).setWord("paucity");
        list.get(44).setDefinition("lack");

        list.get(45).setWord("unbiased");
        list.get(45).setDefinition("able to judge fairly because you are not influenced by your own opinions");

        list.get(46).setWord("discernible");
        list.get(46).setDefinition("distinguishable");

        list.get(47).setWord("encompass");
        list.get(47).setDefinition("to include different types of things");

        list.get(48).setWord("obviate");
        list.get(48).setDefinition("to remove a difficulty, especially so that action to deal with it becomes unnecessary");

        list.get(49).setWord("entails");
        list.get(49).setDefinition("require");

        list.get(50).setWord("renounce");
        list.get(50).setDefinition("publicly state that you gave up");


        list.get(51).setWord("tenuous");
        list.get(51).setDefinition("very weak or slight; insubstantial");

        list.get(52).setWord("indecipherable");
        list.get(52).setDefinition("impossible to understand or read");

        list.get(53).setWord("obscure (n)");
        list.get(53).setDefinition("the state of being unknown, inconspicuous, or not easily understood");

        list.get(54).setWord("contrive");
        list.get(54).setDefinition("to create or bring about (an object or a situation) by deliberate use of skill and artifice");

        list.get(55).setWord("jarring");
        list.get(55).setDefinition("incongruous in a striking or shocking way; clashing");

        list.get(56).setWord("disperse");
        list.get(56).setDefinition("distribute or spread over a wide area");

        list.get(57).setWord("arbitrary");
        list.get(57).setDefinition("based on random choice or personal whim, rather than any reason or system");

        list.get(58).setWord("impede");
        list.get(58).setDefinition("delay or prevent (someone or something) by obstructing them; hinder");

        list.get(59).setWord("subdue");
        list.get(59).setDefinition("bring under control or overcome; quieten");

        list.get(60).setWord("subversive");
        list.get(60).setDefinition("seeking or intended to subvert an established system or institution");

        list.get(61).setWord("reinforce");
        list.get(61).setDefinition("strengthen or support (an object or substance)");

        list.get(62).setWord("anticipate");
        list.get(62).setDefinition("regard as probable; expect or predict");

        list.get(63).setWord("epitomize");
        list.get(63).setDefinition("be a perfect example of");

        list.get(64).setWord("transcend");
        list.get(64).setDefinition("be or go beyond the range or limits of (something abstract, typically a conceptual field or division)");

        list.get(65).setWord("perceptible");
        list.get(65).setDefinition("able to be seen or noticed");

        list.get(66).setWord("proponent");
        list.get(66).setDefinition("a person who advocates a theory, proposal, or project");

        list.get(67).setWord("apiary");
        list.get(67).setDefinition("a place where bees are kept; a collection of beehives");

        list.get(68).setWord("disheveled");
        list.get(68).setDefinition("of a person's hair, clothes, or appearance) untidy; disordered");

        list.get(69).setWord("expound");
        list.get(69).setDefinition("present and explain (a theory or idea) systematically and in detail");

        list.get(70).setWord("perspicacity");
        list.get(70).setDefinition("the quality of having a ready insight into things; shrewdness");

        list.get(71).setWord("mere");
        list.get(71).setDefinition("used to emphasize how small or insignificant someone or something is");

        list.get(72).setWord("capacious");
        list.get(72).setDefinition("having a lot of space inside; roomy");

        list.get(73).setWord("nuisance");
        list.get(73).setDefinition("a person, thing, or circumstance causing inconvenience or annoyance");

        list.get(74).setWord("elicit");
        list.get(74).setDefinition("evoke or draw out (a reaction, answer, or fact) from someone");

        list.get(75).setWord("conducive");
        list.get(75).setDefinition("making a certain situation or outcome likely or possible");

        list.get(76).setWord("foraging");
        list.get(76).setDefinition("searching widely for food or provisions");

        list.get(77).setWord("uniform (ordinary)");
        list.get(77).setDefinition("not different or changing; remaining the same in all cases and at all times");

        list.get(78).setWord("be devoid of");
        list.get(78).setDefinition("completely lacking in");

        list.get(79).setWord("void");
        list.get(79).setDefinition("completely empty; having no legal force or effect");

        list.get(80).setWord("induce");
        list.get(80).setDefinition("succeed in persuading or influencing (someone) to do something");

        list.get(81).setWord("mitigate");
        list.get(81).setDefinition("make less severe, serious, or painful");

        list.get(82).setWord("compensate");
        list.get(82).setDefinition("give (someone) something, typically money, in recognition of loss, suffering, or injury");

        list.get(83).setWord("prolong");
        list.get(83).setDefinition("extend the duration of");

        list.get(84).setWord("cryptic");
        list.get(84).setDefinition("having a meaning that is mysterious or obscure");

        list.get(85).setWord("foster");
        list.get(85).setDefinition("encourage the development of (something, typically something regarded as good)");

        list.get(86).setWord("inception");
        list.get(86).setDefinition("the establishment or starting point of an institution or activity");

        list.get(87).setWord("prominent");
        list.get(87).setDefinition("important; famous");

        list.get(88).setWord("inherent");
        list.get(88).setDefinition("existing as a permanent, essential, or characteristic attribute");

        list.get(89).setWord("confer");
        list.get(89).setDefinition("grant or bestow (a title, degree, benefit, or right)");

        list.get(90).setWord("yield");
        list.get(90).setDefinition("produce or provide (a natural, agricultural, or industrial product)");

        list.get(91).setWord("refinement");
        list.get(91).setDefinition("the process of removing impurities or unwanted elements from a substance");

        list.get(92).setWord("infer");
        list.get(92).setDefinition("deduce or conclude (information) from evidence and reasoning rather than from explicit statements");

        list.get(93).setWord("mystifying");
        list.get(93).setDefinition("causing confusion or perplexity; bewildering");

        list.get(94).setWord("contaminate");
        list.get(94).setDefinition("make (something) impure by exposure to or addition of a poisonous or polluting substance");

        list.get(95).setWord("precarious");
        list.get(95).setDefinition("not securely held or in position; dangerously likely to fall or collapse");

        list.get(96).setWord("conflate");
        list.get(96).setDefinition("combine (two or more texts, ideas, etc.) into one");

        list.get(97).setWord("adherence");
        list.get(97).setDefinition("attachment or commitment to a person, cause, or belief");

        list.get(98).setWord("afflict");
        list.get(98).setDefinition("cause pain or suffering to; affect or trouble");

        list.get(99).setWord("evade");
        list.get(99).setDefinition("escape or avoid, especially by cleverness or trickery");

        list.get(100).setWord("evasive");
        list.get(100).setDefinition("tending to avoid commitment or self-revelation, especially by responding only indirectly");

        list.get(101).setWord("subvert");
        list.get(101).setDefinition("undermine the power and authority of (an established system or institution)");

        list.get(102).setWord("conventional");
        list.get(102).setDefinition("based on or in accordance with what is generally done or believed");

        list.get(103).setWord("venture");
        list.get(103).setDefinition("a risky or daring journey or undertaking");

        list.get(104).setWord("defy");
        list.get(104).setDefinition("openly resist or refuse to obey");

        list.get(105).setWord("concurring");
        list.get(105).setDefinition("be of the same opinion; agree");

        list.get(106).setWord("engrossing");
        list.get(106).setDefinition("absorbing all one's attention or interest");

        list.get(107).setWord("deviate");
        list.get(107).setDefinition("depart from an established course");

        list.get(108).setWord("reductive");
        list.get(108).setDefinition("serving to simplify or reduce something to a fundamental or essential level");

        list.get(109).setWord("inadvertently");
        list.get(109).setDefinition("without intention; accidentally");

        list.get(110).setWord("infirmity");
        list.get(110).setDefinition("physical or mental weakness");

        list.get(111).setWord("foreseen");
        list.get(111).setDefinition("known or predicted beforehand");

        list.get(112).setWord("discredit");
        list.get(112).setDefinition("harm the good reputation of (someone or something)");

        list.get(113).setWord("underscore");
        list.get(113).setDefinition("emphasize or make evident");

        list.get(114).setWord("implicit");
        list.get(114).setDefinition("implied though not plainly expressed");

        list.get(115).setWord("insulating");
        list.get(115).setDefinition("protecting something by interposing material that prevents the loss of heat or the intrusion of sound");

        list.get(116).setWord("antagonistic");
        list.get(116).setDefinition("showing or feeling active opposition or hostility towards someone or something");

        list.get(117).setWord("contemplate");
        list.get(117).setDefinition("look thoughtfully for a long time at");

        list.get(118).setWord("elated");
        list.get(118).setDefinition("make (someone) ecstatically happy");

        list.get(119).setWord("myriad");
        list.get(119).setDefinition("a countless or extremely great number");

        list.get(120).setWord("meager");
        list.get(120).setDefinition("lacking in quantity or quality; inadequate");

        list.get(121).setWord("unduly");
        list.get(121).setDefinition("to an unwarranted degree; excessively");

        list.get(122).setWord("indifference");
        list.get(122).setDefinition("lack of interest, concern, or sympathy");

        list.get(123).setWord("invigorating");
        list.get(123).setDefinition("making one feel strong, healthy, and full of energy");

        list.get(124).setWord("ratified");
        list.get(124).setDefinition("sign or give formal consent to (a treaty, contract, or agreement), making it officially valid");

        list.get(125).setWord("allocate");
        list.get(125).setDefinition("distribute (resources or duties) for a particular purpose");

        list.get(126).setWord("subsist");
        list.get(126).setDefinition("maintain or support oneself, especially at a minimal level");

        list.get(127).setWord("conceal");
        list.get(127).setDefinition("keep from sight; hide");

        list.get(128).setWord("entice");
        list.get(128).setDefinition("attract or tempt by offering pleasure or advantage");

        list.get(129).setWord("effulgence");
        list.get(129).setDefinition("radiant splendor; brilliance");

        list.get(130).setWord("intricacies");
        list.get(130).setDefinition("details, especially of an involved or perplexing subject");

        list.get(131).setWord("sturdy");
        list.get(131).setDefinition("strongly and solidly built");

        list.get(132).setWord("cunning");
        list.get(132).setDefinition("having or showing skill in achieving one's ends by deceit or evasion");

        list.get(133).setWord("envy");
        list.get(133).setDefinition("a feeling of discontented or resentful longing aroused by someone else's possessions, qualities, or luck");

        list.get(134).setWord("latent");
        list.get(134).setDefinition("obscurely, secretly, needing to be activated");


        intent2cards_ = new Intent(OtherActivity.this,CardsActivity.class);
        intent2school = new Intent(OtherActivity.this,SchoolSubjectActivity.class);
        intent2home =  new Intent(OtherActivity.this,MainActivity.class);
        intent2excercices= new Intent(OtherActivity.this,ExcercicesActivity.class);





        cards = findViewById(R.id.cardspagetoId);
        schoolcrds = findViewById(R.id.school2Id);
        home = findViewById(R.id.homepagetoId);
        exercices = findViewById(R.id.exercisespagetoId);



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