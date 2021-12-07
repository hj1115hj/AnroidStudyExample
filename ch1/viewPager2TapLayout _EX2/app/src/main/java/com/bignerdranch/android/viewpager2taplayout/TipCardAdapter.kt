package com.bignerdranch.android.viewpager2taplayout

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class TipCardAdapter(var tipCards: List<TipCard>) :RecyclerView.Adapter<TipCardHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TipCardHolder {
     return TipCardHolder(
         LayoutInflater.from(parent.context).inflate(R.layout.tipcard_layout,parent,false)
     )
    }

    override fun onBindViewHolder(holder: TipCardHolder, position: Int) {
        holder.bind(tipCards[position])
    }

    override fun getItemCount(): Int {
       return tipCards.size
    }
}