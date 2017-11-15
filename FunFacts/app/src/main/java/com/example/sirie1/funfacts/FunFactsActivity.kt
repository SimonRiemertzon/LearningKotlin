package com.example.sirie1.funfacts

import android.graphics.Color
import android.nfc.Tag
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView

class FunFactsActivity : AppCompatActivity() {
    // Declare our View values
    private lateinit var factTextView: TextView
    private lateinit var showFactButton: Button
    private lateinit var relativeLayout: RelativeLayout
    private val factBook = FactBook()
    private val colorWheel = ColorWheel()

    //TAG for debugging purposes.
    private val TAG : String = FunFactsActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fun_facts)
        //Assign the Views from the layout file to the corresponding variables.
        factTextView = findViewById(R.id.factTextView)
        showFactButton = findViewById(R.id.showFactButton)
        relativeLayout = findViewById(R.id.funFactsRL)

        Log.i(TAG, "Hello there! I'm logging from FunFactsActivity")


        showFactButton.setOnClickListener {
            factTextView.text = factBook.getFact()
            changeUIColors()
        }

    }

    fun changeUIColors() {
        val color = colorWheel.getColor()
        relativeLayout.setBackgroundColor(color)
        showFactButton.setTextColor(color)
    }

}
