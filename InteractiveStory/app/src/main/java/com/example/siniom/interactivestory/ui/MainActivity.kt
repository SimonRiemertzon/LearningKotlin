package com.example.siniom.interactivestory.ui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.siniom.interactivestory.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startButton.setOnClickListener {
            val name = nameEditText.text
            startStory(name.toString())
        }

    }

    private fun startStory(name: String) {
        val intent = Intent(this, StoryActivity::class.java)
        intent.putExtra(getString(R.string.key_name), name)

        startActivity(intent)
    }
}