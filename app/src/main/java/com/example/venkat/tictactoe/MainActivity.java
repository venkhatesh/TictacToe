package com.example.venkat.tictactoe;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Buclick(View view) {
        bt = (Button) view;
        int id=0;
        switch ((bt.getId())) {
            case R.id.button1:
                id = 1;
                break;
            case R.id.button2:
                id = 2;
                break;
            case R.id.button3:
                id = 3;
                break;
            case R.id.button4:
                id = 4;
                break;
            case R.id.button5:
                id = 5;
                break;
            case R.id.button6:
                id = 6;
                break;
            case R.id.button7:
                id = 7;
                break;
            case R.id.button8:
                id = 8;
                break;
            case R.id.button9:
                id = 9;
                break;
        }
        play(id,bt);
    }
    int ActPlayer=1;
    ArrayList<Integer> Player1 = new ArrayList<>();
    ArrayList<Integer> Player2 = new ArrayList<>();
    void play(int id, Button bt){

        if(ActPlayer==1){
            bt.setBackgroundColor(Color.RED);
            bt.setText("X");
            Player1.add(id);
        //    Toast.makeText(this,"Well PLayed Player 1",Toast.LENGTH_SHORT).show();
            ActPlayer=2;
        }
        else if(ActPlayer==2){
            bt.setBackgroundColor(Color.GREEN);
            bt.setText("O");
            Player2.add(id);
        //    Toast.makeText(this,"Well PLayed Player 2",Toast.LENGTH_SHORT).show();
            ActPlayer=1;
        }
        bt.setEnabled(false);
        CheckWinner();
    }
    int Winner = -1;
    void CheckWinner(){
        if(Player1.contains(1)&&Player1.contains(2)&&Player1.contains(3)){
            Winner=1;
        }
        else if(Player2.contains(1)&&Player2.contains(2)&&Player2.contains(3)){
            Winner=2;
        }
        else if(Player1.contains(1)&&Player1.contains(4)&&Player1.contains(7)){
            Winner=1;
        }
        else if(Player2.contains(1)&&Player2.contains(4)&&Player2.contains(7)){
            Winner=2;
        }
        else if(Player1.contains(1)&&Player1.contains(5)&&Player1.contains(9)){
            Winner=1;
        }
        else if(Player2.contains(1)&&Player2.contains(5)&&Player2.contains(9)){
            Winner=2;
        }
        else if(Player1.contains(3)&&Player1.contains(6)&&Player1.contains(9)){
            Winner=1;
        }
        else if(Player2.contains(3)&&Player2.contains(6)&&Player2.contains(9)){
            Winner=2;
        }
        else if(Player1.contains(3)&&Player1.contains(5)&&Player1.contains(7)){
            Winner=1;
        }
        else if(Player2.contains(3)&&Player2.contains(5)&&Player2.contains(7)){
            Winner=2;
        }
        else if(Player1.contains(2)&&Player1.contains(5)&&Player1.contains(8)){
            Winner=1;
        }
        else if(Player2.contains(2)&&Player2.contains(5)&&Player2.contains(8)){
            Winner=2;
        }
        else if(Player1.contains(4)&&Player1.contains(5)&&Player1.contains(6)){
            Winner=1;
        }
        else if(Player2.contains(4)&&Player2.contains(5)&&Player2.contains(6)){
            Winner=2;
        }
        else if(Player1.contains(7)&&Player1.contains(8)&&Player1.contains(9)){
            Winner=1;
        }
        else if(Player2.contains(7)&&Player2.contains(8)&&Player2.contains(9)){
            Winner=2;
        }

        if(Winner!=-1){
            if (Winner==1){
                Toast.makeText(this,"Player1 is the Winner of this Game",Toast.LENGTH_LONG).show();
            }
            else if(Winner==2){
                Toast.makeText(this,"Player2 is the Winner of this Game",Toast.LENGTH_LONG).show();
            }
        }

    }
}
