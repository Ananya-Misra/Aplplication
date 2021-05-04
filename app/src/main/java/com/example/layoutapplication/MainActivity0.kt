package com.example.layoutapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main0.*

class MainActivity0 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main0)
        btn_showDialog.setOnClickListener{
           val intent= Intent(this,MainActivity::class.java)
                startActivity(intent)
            }
    }
}