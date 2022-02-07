package com.example.myapplication

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ItemCharactesBinding
import com.squareup.picasso.Picasso

class CharactesViewHolder(view:View):RecyclerView.ViewHolder(view) {

    private val binding = ItemCharactesBinding.bind(view)
    fun bind(image:String) {
        Picasso.get().load(image).into(binding.ivCharacter)
    }
}