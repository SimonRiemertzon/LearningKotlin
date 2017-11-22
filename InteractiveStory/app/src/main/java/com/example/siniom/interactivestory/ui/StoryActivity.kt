package com.example.siniom.interactivestory.ui

import android.content.Intent
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v4.content.ContextCompat
import android.util.Log
import android.util.MutableInt
import com.example.siniom.interactivestory.R
import com.example.siniom.interactivestory.model.Page
import com.example.siniom.interactivestory.model.Story
import kotlinx.android.synthetic.main.activity_story.*

class StoryActivity : AppCompatActivity() {

    val TAG: String = StoryActivity::class.java.simpleName
    private val story = Story()
    private val name: String? = null

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

        loadPage(0)

    }

    private fun loadPage(pageNumber: Int) {
        val page = story.getPage(pageNumber)
        val image = ContextCompat.getDrawable(this, page.imageId)
        storyImageView_xml.setImageDrawable(image)

        var pageText = getString(page.textId)
        pageText = String.format(pageText, name)

    }
}
