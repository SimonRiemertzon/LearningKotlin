package com.example.siniom.interactivestory

import android.content.Intent
import android.nfc.Tag
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class StoryActivity : AppCompatActivity() {

    val TAG: String = StoryActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story)

        val intent: Intent? = intent
        var name = intent?.getStringExtra(getString(R.string.key_name))


        if (name.isNullOrEmpty()) {
            Log.d(TAG, "Chosen name is null or empty. Setting default name.")
            name = "Friend"
        }

        Log.d(TAG, name)
    }
}
