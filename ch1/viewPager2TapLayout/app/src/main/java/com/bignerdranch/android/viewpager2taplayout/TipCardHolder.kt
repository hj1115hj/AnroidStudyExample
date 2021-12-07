package com.bignerdranch.android.viewpager2taplayout

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TipCardHolder(view: View) :RecyclerView.ViewHolder(view){

  private val titleTextView : TextView = itemView.findViewById(R.id.tipcard_title)
  private val descriptionTextView : TextView = itemView.findViewById(R.id.tipcard_description)

  fun bind(tipCard: TipCard){
    titleTextView.text =  tipCard.title
    descriptionTextView.text = tipCard.details

  }
}