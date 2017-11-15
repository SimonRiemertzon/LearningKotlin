package com.example.sirie1.funfacts

import android.graphics.Color
import java.util.*

// Created by sirie1 on 2017-11-15.
class ColorWheel {

    private val colors = arrayOf( "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
)

    private val randomGenerator = Random()

    fun getColor(): Int {
        var colorStr: String = colors[randomGenerator.nextInt(colors.size)]
        var colorInt: Int = Color.parseColor(colorStr)
        return colorInt
    }
}