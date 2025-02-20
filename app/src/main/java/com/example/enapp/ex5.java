package com.example.enapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

public class ex5 extends AppCompatActivity {
    WordBox currentWordBox;

    ImageButton back;
    Drawable redass ,greenass,blackass;
    ImageButton button;

    TextView correctOne;
    TextView word,firstDef,secondDef;

    ArrayList<WordBox> list= new ArrayList<WordBox>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex5);

        word = findViewById(R.id.quest);
        firstDef = findViewById(R.id.firstId);
        secondDef = findViewById(R.id.secondId);


        redass = getResources().getDrawable(R.drawable.redass);
        greenass = getResources().getDrawable(R.drawable.greenass);
        blackass = getResources().getDrawable(R.drawable.darkass);

        back = findViewById(R.id.back2UnitsId);
        back.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(ex5.this,ExcercicesActivity.class));
                    }
                }

        );

        for(int b = 0 ;b < 89 ;b++){
            list.add(new WordBox(this));

        }

        list.get(0).setWord("a danger to");
        list.get(0).setDefinition("poses a threat or risk to");

        list.get(1).setWord("absolutely freezing");
        list.get(1).setDefinition("extremely cold");

        list.get(2).setWord("admit");
        list.get(2).setDefinition("to confess or acknowledge");

        list.get(3).setWord("allies");
        list.get(3).setDefinition("partners or associates in a common cause");

        list.get(4).setWord("announce");
        list.get(4).setDefinition("to make a public statement about something");

        list.get(5).setWord("appeal for");
        list.get(5).setDefinition("to request earnestly or urgently");

        list.get(6).setWord("appeal to");
        list.get(6).setDefinition("to attract or invite someone's interest or support");

        list.get(7).setWord("argue");
        list.get(7).setDefinition("to present reasons for or against something");

        list.get(8).setWord("asymmetric warfare");
        list.get(8).setDefinition("a conflict between opposing forces that differ significantly in power, strategy, and resources");

        list.get(9).setWord("atrocities");
        list.get(9).setDefinition("horrific and cruel acts, especially in war");

        list.get(10).setWord("available to someone");
        list.get(10).setDefinition("accessible or obtainable by someone");

        list.get(11).setWord("bitterly regret");
        list.get(11).setDefinition("to deeply feel sorrow or remorse");

        list.get(12).setWord("boast");
        list.get(12).setDefinition("to talk with excessive pride about oneself or one's achievements");

        list.get(13).setWord("border");
        list.get(13).setDefinition("the dividing line between countries or regions");

        list.get(14).setWord("break the stalemate");
        list.get(14).setDefinition("to overcome a situation where neither side can make progress");

        list.get(15).setWord("carry out a suicide attack");
        list.get(15).setDefinition("to conduct an attack in which the perpetrator intends to die");

        list.get(16).setWord("civilian government");
        list.get(16).setDefinition("a government comprised of non-military individuals");

        list.get(17).setWord("claim");
        list.get(17).setDefinition("to assert ownership or right to");

        list.get(18).setWord("claim victory");
        list.get(18).setDefinition("to assert that one has won");

        list.get(19).setWord("coalition");
        list.get(19).setDefinition("an alliance or partnership");

        list.get(20).setWord("complain");
        list.get(20).setDefinition("to express dissatisfaction or annoyance about something");

        list.get(21).setWord("compulsively gripping");
        list.get(21).setDefinition("holding one's attention firmly or irresistibly");

        list.get(22).setWord("concede");
        list.get(22).setDefinition("to admit defeat or acknowledge the validity of something");

        list.get(23).setWord("confirm");
        list.get(23).setDefinition("to verify or establish the truth of something");

        list.get(24).setWord("declare war");
        list.get(24).setDefinition("to formally announce a state of war");

        list.get(25).setWord("deeply touched");
        list.get(25).setDefinition("strongly affected emotionally");

        list.get(26).setWord("defend someone against");
        list.get(26).setDefinition("to protect or support someone against attack or criticism");

        list.get(27).setWord("deny");
        list.get(27).setDefinition("to state that something is not true");

        list.get(28).setWord("differ from");
        list.get(28).setDefinition("to be unlike or distinct from");

        list.get(29).setWord("differ with");
        list.get(29).setDefinition("to have a different opinion or perspective from");

        list.get(30).setWord("disapprove of");
        list.get(30).setDefinition("to regard with disapproval or condemnation");

        list.get(31).setWord("dismiss");
        list.get(31).setDefinition("to refuse to consider or take seriously");

        list.get(32).setWord("disregard for");
        list.get(32).setDefinition("lack of consideration or respect for");

        list.get(33).setWord("doubt");
        list.get(33).setDefinition("to feel uncertain or skeptical about");

        list.get(34).setWord("enquire");
        list.get(34).setDefinition("to ask for information");

        list.get(35).setWord("excuse someone for");
        list.get(35).setDefinition("to forgive or pardon someone for an offense");

        list.get(36).setWord("ferociously steep");
        list.get(36).setDefinition("extremely steep or sharp");

        list.get(37).setWord("form of");
        list.get(37).setDefinition("type or variety of");

        list.get(38).setWord("guerrilla raids");
        list.get(38).setDefinition("sudden and unexpected attacks by small groups of fighters");

        list.get(39).setWord("have/lose sympathy for");
        list.get(39).setDefinition("to feel understanding or compassion towards/away from");

        list.get(40).setWord("highly probable");
        list.get(40).setDefinition("very likely to occur or be true");

        list.get(41).setWord("highly successful");
        list.get(41).setDefinition("very successful or achieving great results");

        list.get(42).setWord("improve on");
        list.get(42).setDefinition("to enhance or make better than before");

        list.get(43).setWord("improvement (in)");
        list.get(43).setDefinition("the act or process of making something better");

        list.get(44).setWord("inflict casualties");
        list.get(44).setDefinition("to cause injuries or deaths");

        list.get(45).setWord("inform");
        list.get(45).setDefinition("to give information or report on");

        list.get(46).setWord("injustice of");
        list.get(46).setDefinition("unfairness or violation of rights");

        list.get(47).setWord("insist");
        list.get(47).setDefinition("to demand forcefully or persistently");

        list.get(48).setWord("insurgency");
        list.get(48).setDefinition("an active revolt or uprising against authority");

        list.get(49).setWord("intent on");
        list.get(49).setDefinition("determined or focused on");

        list.get(50).setWord("invasion");
        list.get(50).setDefinition("an incursion or entry into a place or territory");

        list.get(51).setWord("issue an ultimatum");
        list.get(51).setDefinition("to present a final demand or threat");

        list.get(52).setWord("justified in");
        list.get(52).setDefinition("having a valid reason or justification for");

        list.get(53).setWord("leader");
        list.get(53).setDefinition("a person who leads or commands a group or organization");

        list.get(54).setWord("limit to");
        list.get(54).setDefinition("to restrict or confine to a certain extent");

        list.get(55).setWord("lose one's life");
        list.get(55).setDefinition("to die");

        list.get(56).setWord("make a breakthrough");
        list.get(56).setDefinition("to achieve a significant advance or discovery");

        list.get(57).setWord("make up");
        list.get(57).setDefinition("to constitute or comprise");

        list.get(58).setWord("means of");
        list.get(58).setDefinition("a method or way of achieving something");

        list.get(59).setWord("mention");
        list.get(59).setDefinition("to refer to or speak about briefly");

        list.get(60).setWord("object (to)");
        list.get(60).setDefinition("to express disapproval or disagreement with");

        list.get(61).setWord("remark");
        list.get(61).setDefinition("to comment or say something");

        list.get(62).setWord("resent");
        list.get(62).setDefinition("to feel bitterness or indignation towards");

        list.get(63).setWord("resort to");
        list.get(63).setDefinition("to turn to or adopt as a last resort");

        list.get(64).setWord("responsible for");
        list.get(64).setDefinition("being the cause or originator of");

        list.get(65).setWord("restrict to");
        list.get(65).setDefinition("to limit or confine to a specific scope or extent");

        list.get(66).setWord("result in");
        list.get(66).setDefinition("to cause or bring about as an effect or outcome");

        list.get(67).setWord("reveal");
        list.get(67).setDefinition("to make known or disclose");

        list.get(68).setWord("ridiculously expensive");
        list.get(68).setDefinition("extremely costly or exorbitant");

        list.get(69).setWord("security");
        list.get(69).setDefinition("the state of being free from danger or threat");

        list.get(70).setWord("seize power");
        list.get(70).setDefinition("to take control, especially by force");

        list.get(71).setWord("special forces");
        list.get(71).setDefinition("elite military units trained for unconventional warfare");

        list.get(72).setWord("stage a protest");
        list.get(72).setDefinition("to organize and carry out a public demonstration");

        list.get(73).setWord("stage an ambush");
        list.get(73).setDefinition("to plan and execute a surprise attack");

        list.get(74).setWord("station troops (in)");
        list.get(74).setDefinition("to deploy soldiers in a specific location");

        list.get(75).setWord("strongly suggest");
        list.get(75).setDefinition("to recommend or indicate strongly");

        list.get(76).setWord("suffer losses");
        list.get(76).setDefinition("to experience casualties or setbacks");

        list.get(77).setWord("supply arms (to)");
        list.get(77).setDefinition("to provide weapons to");

        list.get(78).setWord("terrorist-training camps");
        list.get(78).setDefinition("facilities where individuals are trained for terrorist activities");

        list.get(79).setWord("terrorists");
        list.get(79).setDefinition("individuals who engage in acts of terror");

        list.get(80).setWord("threat of");
        list.get(80).setDefinition("the possibility or likelihood of danger or harm");

        list.get(81).setWord("threat to");
        list.get(81).setDefinition("something that poses a danger or risk to");

        list.get(82).setWord("threaten");
        list.get(82).setDefinition("to express an intention to harm or cause distress");

        list.get(83).setWord("troops");
        list.get(83).setDefinition("a group of soldiers");

        list.get(84).setWord("unrelentingly dangerous");
        list.get(84).setDefinition("continuously posing a serious threat");

        list.get(85).setWord("warn");
        list.get(85).setDefinition("to notify or alert about a potential danger or problem");

        list.get(86).setWord("warn someone about");
        list.get(86).setDefinition("to advise or caution someone regarding a specific threat or issue");

        list.get(87).setWord("warn someone against");
        list.get(87).setDefinition("to advise someone not to do something");

        list.get(88).setWord("withdraw someone's forces");
        list.get(88).setDefinition("to pull back or remove troops or military presence");




        WordBox displayed = list.get((int) (Math.random() * 78));
        word.setText(displayed.getWordStr());
        if(Math.random() <0.5){
            firstDef.setText(displayed.getDefStr());
            secondDef.setText(list.get((int) (Math.random() * 78)).getDefStr());
            currentWordBox = displayed;
        }
        else{
            firstDef.setText(list.get((int) (Math.random() * 78)).getDefStr());
            secondDef.setText(displayed.getDefStr());
            currentWordBox = displayed;
        }









        firstDef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentWordBox.getDefStr().equals(firstDef.getText().toString())){
                    checkAnswer(true,firstDef);
                }
                else{
                    checkAnswer(false,firstDef);
                }
            }

        });



        secondDef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(currentWordBox.getDefStr().equals(secondDef.getText().toString())){
                    checkAnswer(true,secondDef);

                }
                else{
                    checkAnswer(false,secondDef);
                }
            }

        });










    }

    private void showNextWord(){


        WordBox disp = list.get((int) (Math.random() * 78));
        word.setText(disp.getWordStr());
        if(Math.random() <0.5){
            firstDef.setText(disp.getDefStr());
            secondDef.setText(list.get((int) (Math.random() * 78)).getDefStr());
            currentWordBox = disp;
        }
        else{
            firstDef.setText(list.get((int) (Math.random() * 78)).getDefStr());
            secondDef.setText(disp.getDefStr());
            currentWordBox = disp;

        }



    }




    private void checkAnswer(boolean isCorrect,TextView temp) {
        if (isCorrect) {
            temp.setBackground(greenass); // Doğru ise yeşil yap
        } else {
            temp.setBackground(redass); // Yanlış ise kırmızı yap
        }

        // Belirli bir süre sonra renkleri sıfırla
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                temp.setBackground(blackass); // Doğru kelimenin rengini sıfırla

                if (isCorrect) {
                    showNextWord();
                } else {

                }
            }
        }, 1000);
    }





    public void testfirst(){
        if(word.getText().toString().equals(firstDef.getText().toString())){
            checkAnswer(true,firstDef);
        }
        else{
            checkAnswer(false,firstDef);
        }

    }


}