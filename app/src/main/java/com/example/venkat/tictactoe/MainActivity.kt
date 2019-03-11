package com.example.venkat.tictactoe

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    internal lateinit var bt: Button
    internal var ActPlayer = 1
    internal var Player1 = ArrayList<Int>()
    internal var Player2 = ArrayList<Int>()
    internal var Winner = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Buclick(view: View) {
        bt = view as Button
        var id = 0
        when (bt.id) {
            R.id.button1 -> id = 1
            R.id.button2 -> id = 2
            R.id.button3 -> id = 3
            R.id.button4 -> id = 4
            R.id.button5 -> id = 5
            R.id.button6 -> id = 6
            R.id.button7 -> id = 7
            R.id.button8 -> id = 8
            R.id.button9 -> id = 9
        }
        play(id, bt)
    }

    internal fun play(id: Int, bt: Button) {

        if (ActPlayer == 1) {
            bt.setBackgroundColor(Color.RED)
            bt.text = "X"
            Player1.add(id)
            //    Toast.makeText(this,"Well PLayed Player 1",Toast.LENGTH_SHORT).show();
            ActPlayer = 2
        } else if (ActPlayer == 2) {
            bt.setBackgroundColor(Color.GREEN)
            bt.text = "O"
            Player2.add(id)
            //    Toast.makeText(this,"Well PLayed Player 2",Toast.LENGTH_SHORT).show();
            ActPlayer = 1
        }
        bt.isEnabled = false
        CheckWinner()
    }

    internal fun CheckWinner() {
        if (Player1.contains(1) && Player1.contains(2) && Player1.contains(3)) {
            Winner = 1
        } else if (Player2.contains(1) && Player2.contains(2) && Player2.contains(3)) {
            Winner = 2
        } else if (Player1.contains(1) && Player1.contains(4) && Player1.contains(7)) {
            Winner = 1
        } else if (Player2.contains(1) && Player2.contains(4) && Player2.contains(7)) {
            Winner = 2
        } else if (Player1.contains(1) && Player1.contains(5) && Player1.contains(9)) {
            Winner = 1
        } else if (Player2.contains(1) && Player2.contains(5) && Player2.contains(9)) {
            Winner = 2
        } else if (Player1.contains(3) && Player1.contains(6) && Player1.contains(9)) {
            Winner = 1
        } else if (Player2.contains(3) && Player2.contains(6) && Player2.contains(9)) {
            Winner = 2
        } else if (Player1.contains(3) && Player1.contains(5) && Player1.contains(7)) {
            Winner = 1
        } else if (Player2.contains(3) && Player2.contains(5) && Player2.contains(7)) {
            Winner = 2
        } else if (Player1.contains(2) && Player1.contains(5) && Player1.contains(8)) {
            Winner = 1
        } else if (Player2.contains(2) && Player2.contains(5) && Player2.contains(8)) {
            Winner = 2
        } else if (Player1.contains(4) && Player1.contains(5) && Player1.contains(6)) {
            Winner = 1
        } else if (Player2.contains(4) && Player2.contains(5) && Player2.contains(6)) {
            Winner = 2
        } else if (Player1.contains(7) && Player1.contains(8) && Player1.contains(9)) {
            Winner = 1
        } else if (Player2.contains(7) && Player2.contains(8) && Player2.contains(9)) {
            Winner = 2
        }

        if (Winner != -1) {
            if (Winner == 1) {
                Toast.makeText(this, "Player1 is the Winner of this Game", Toast.LENGTH_LONG).show()
            } else if (Winner == 2) {
                Toast.makeText(this, "Player2 is the Winner of this Game", Toast.LENGTH_LONG).show()
            }
        }

    }
}
