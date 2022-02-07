package com.example.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CharactersAdapter(val characters:List<String>):RecyclerView.Adapter<CharactesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharactesViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return CharactesViewHolder(layoutInflater.inflate(R.layout.item_charactes,parent, false))
    }

    override fun getItemCount():Int = characters.size

    override fun onBindViewHolder(holder: CharactesViewHolder, position: Int) {
        val item:String = characters[position]
        holder.bind(item)
    }

}