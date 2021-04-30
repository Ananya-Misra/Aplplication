package com.example.layoutapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewapp.Adapter
import kotlinx.android.synthetic.main.recyclerview_layout.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recyclerview_layout)

        var songsObject= mutableListOf<Song>()
        songsObject.add(Song("@layout/activity_main",R.drawable.ic_launcher_background))
        songsObject.add(Song("@layout/profile",R.drawable.ic_launcher_background))
        songsObject.add(Song("@layout/profile_of_man",R.drawable.ic_launcher_background))
        songsObject.add(Song("Hello",R.drawable.ic_launcher_background))
        songsObject.add(Song("Hello2",R.drawable.ic_launcher_background))
        songsObject.add(Song("Hello3",R.drawable.ic_launcher_background))
        songsObject.add(Song("Hello",R.drawable.ic_launcher_background))
        songsObject.add(Song("Hello2",R.drawable.ic_launcher_background))
        songsObject.add(Song("Hello3",R.drawable.ic_launcher_background))
        songList.adapter= Adapter(songsObject)
        songList.layoutManager=GridLayoutManager(this,1)


    }
}