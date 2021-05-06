package com.example.layoutapplication

import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.*
import androidx.viewpager2.widget.ViewPager2
import me.relex.circleindicator.CircleIndicator3

class PopupClass {
    var titleList= mutableListOf<String>()
    //PopupWindow display method
    fun showPopupWindow(view: View) {



        //Create a View object yourself through inflater
        val inflater = view.context
            .getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val popupView = inflater.inflate(R.layout.popup_window, null)

        //Specify the length and width through constants
        val width = LinearLayout.LayoutParams.WRAP_CONTENT
        val height = LinearLayout.LayoutParams.WRAP_CONTENT

        //Make Inactive Items Outside Of PopupWindow
        val focusable = true

        //Create a window with our parameters
        val popupWindow = PopupWindow(popupView, width, height, focusable)

        //Set the location of the window on the screen
        popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0)

        //Initialize the elements of our window, install the handler
   /*     val test2 = popupView.findViewById<TextView>(R.id.titleText)
        test2.setText(R.string.textTitle)
       *//* val buttonEdit =
            popupView.findViewById<Button>(R.id.messageButton)
        buttonEdit.setOnClickListener { //As an example, display the message
            Toast.makeText(view.context, "Wow, popup action button", Toast.LENGTH_SHORT)
                .show()
        }*/

        postToList()
        val view_pager = popupView.findViewById<ViewPager2>(R.id.view_pager)
        view_pager.adapter = ViewPagerAdapter(titleList)
//
            val indicator = popupView.findViewById<CircleIndicator3>(R.id.indicator)
            indicator.setViewPager(view_pager)

        //Handler for clicking on the inactive zone of the window
        popupView.setOnTouchListener { v, event -> //Close the window when clicked
            popupWindow.dismiss()
            true
        }
    }

    private fun addToList(topic:String){
        titleList.add(topic)

    }
    private fun postToList(){
        for(i in 1..5){
            addToList("Topic $i")
        }
    }
}