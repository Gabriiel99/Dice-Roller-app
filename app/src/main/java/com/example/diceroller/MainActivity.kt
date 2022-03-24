package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the Button in the layout
        val rollButton: Button = findViewById(R.id.button)
        val rollButton2: Button = findViewById(R.id.button2)

        // Set a click listener on the button to roll the dice when the user taps the button
        rollButton.setOnClickListener { rollDice() }
        rollButton2.setOnClickListener { rollDice2() }
    }


    private fun rollDice() {
        // Create new Dice object with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()



        // Update the screen with the dice roll
        val resultTextView: TextView = findViewById(R.id.textView2)
        resultTextView.text = diceRoll.toString()


    }

    private fun rollDice2() {


        val dice2 = Dice(6)
        val diceRoll2 = dice2.roll2()



        val resultTextView2: TextView = findViewById(R.id.textView3)
        resultTextView2.text = diceRoll2.toString()
    }
}


class Dice(private val numSides: Int) {


    fun roll(): Int {
        return (1..numSides).random()
    }

    fun roll2(): Int {
        return (1..numSides).random()
    }
}