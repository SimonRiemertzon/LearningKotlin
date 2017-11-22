package com.example.siniom.interactivestory.model

import android.util.MutableInt
import android.widget.Toast
import com.example.siniom.interactivestory.R
import com.example.siniom.interactivestory.R.drawable.page0

// Created by sirie1 on 2017-11-21.
class Story {

   var  pages  = arrayOf(
           Page(
                   R.drawable.page0,
                   R.string.page0,
                   Choice(R.string.page0_choice1, 1),
                   Choice(R.string.page0_choice2, 2)),
           Page(R.drawable.page1,
                   R.string.page1,
                   Choice(R.string.page1_choice1, 3),
                   Choice(R.string.page1_choice2, 4)),
           Page(R.drawable.page2,
                   R.string.page2,
                   Choice(R.string.page2_choice1, 4),
                   Choice(R.string.page2_choice2, 6)),
           Page(R.drawable.page3,
                   R.string.page3,
                   Choice(R.string.page3_choice1, 4),
                   Choice(R.string.page3_choice2, 5)),
           Page(R.drawable.page4,
                   R.string.page4,
                   Choice(R.string.page4_choice1, 5),
                   Choice(R.string.page4_choice2, 6)),
           Page(R.drawable.page5, R.string.page5, isFinalPage = true),
           Page(R.drawable.page6, R.string.page6, isFinalPage = true)

         /*
         Note to self. See the Page.class. There we have set the Choice to be null by default.
         When we initialize the page WITH these choices and these initial values, INSTEAD of the default.
         For example:
         ...
         Page(...Choice(R.string...., Choice(R.string...)))
         ...

         Does it get overwritten properly? It probably will, but this is something to watch closely.

          */
   )

   fun getPage(pageNumber: Int): Page = if(pageNumber >= pages.size) pages[pageNumber] else pages[0]



}