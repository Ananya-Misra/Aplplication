package com.example.layoutapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class ViewPagerAdapter(private var topic:List<String>):
    RecyclerView.Adapter<ViewPagerAdapter.Pager2ViewHolder>() {

    inner class Pager2ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        val itemTitle:TextView=itemView.findViewById(R.id.tvAbout)
        val itemImage:ImageView=itemView.findViewById(R.id.imgProfile)

        init{
            itemImage.setOnClickListener{v:View ->
            val position:Int=absoluteAdapterPosition
            Toast.makeText(itemView.context,"You clicked on item ${position+1}",Toast.LENGTH_SHORT).show()}
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerAdapter.Pager2ViewHolder {
        return Pager2ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_page,parent,false))
    }

    override fun getItemCount(): Int {
        return topic.size
    }

    override fun onBindViewHolder(holder: ViewPagerAdapter.Pager2ViewHolder, position: Int) {
        holder.itemTitle.text=topic[position]
//        holder.itemImage.setImageResource(images[position])
    }
}