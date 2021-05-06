package com.example.layoutapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.WindowManager
import android.widget.Button
import android.widget.PopupMenu
import android.widget.PopupWindow
import android.widget.RelativeLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewapp.Adapter
import kotlinx.android.synthetic.main.pagerview_layout.*
import kotlinx.android.synthetic.main.recyclerview_layout.*
import me.relex.circleindicator.CircleIndicator
import me.relex.circleindicator.CircleIndicator3

class MainActivity : AppCompatActivity()
{
    private var popup: PopupWindow? = null
    var titleList= mutableListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main0)


        val popupButton =
            findViewById<Button>(R.id.btn_showDialog)
        popupButton.setOnClickListener { v ->
            val popUpClass = PopupClass()
            popUpClass.showPopupWindow(v)



            postToList()
            view_pager.adapter = ViewPagerAdapter(titleList)

            val indicator = findViewById<CircleIndicator3>(R.id.indicator)
            indicator.setViewPager(view_pager)
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