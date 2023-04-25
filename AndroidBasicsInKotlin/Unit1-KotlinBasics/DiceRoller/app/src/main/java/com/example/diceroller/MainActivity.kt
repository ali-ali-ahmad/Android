package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
*/
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }

//        Do a dice roll when the app starts
        rollDice()
    }

    /**
     * Roll the dice and update the screen with the result
     */
    private fun rollDice() {
//        Create new Dice object with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()

//        Find the ImageView in the layout
        val diceImage: ImageView = findViewById(R.id.imageView)

//      Determine which drawable resource ID to use based on the dice roll
        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

//      Update the ImageView with the correct drawable resource ID
        diceImage.setImageResource(drawableResource)

//      Update the content description
        diceImage.contentDescription = diceRoll.toString()

//        Update the screen with the dice roll 1
//        val resultTextView1: TextView = findViewById(R.id.textView)
//        resultTextView1.text = diceRoll1.toString()

////        Create new dice object with 20 sides and roll it
//        val dice2 = Dice(20)
//        val diceRoll2 = dice2.roll()
//
////        Update the screen with dice roll 2
//        val resultTextView2: TextView = findViewById(R.id.textView2)
//        resultTextView2.text = diceRoll2.toString()

    }
}

class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}