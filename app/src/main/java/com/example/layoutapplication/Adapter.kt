package com.example.recyclerviewapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.layoutapplication.R
import com.example.layoutapplication.Song

class Adapter(val songs:List<Song>):RecyclerView.Adapter<Adapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater :LayoutInflater= LayoutInflater.from(parent.context)
        val view=inflater.inflate(R.layout.list_grid_item,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return songs.size

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.title.text=songs[position].title

        holder.image.setImageResource(songs[position].image)

    }

    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var title= itemView.findViewById<TextView>(R.id.tvTitle)
        var image=itemView.findViewById<ImageView>(R.id.imgImage)
    }
}

