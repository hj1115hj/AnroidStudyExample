package com.bignerdranch.android.viewpager2taplayout

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2


class TipCardAdapter(var tipCards: List<TipCard>) : RecyclerView.Adapter<TipCardHolder>() {
    private lateinit var viewPager: ViewPager2
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TipCardHolder {
        return TipCardHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.tipcard_layout, parent, false)
        )
    }

    override fun onAttachedToRecyclerView(recyclerView: RecyclerView) {
        super.onAttachedToRecyclerView(recyclerView)
        viewPager = recyclerView.parent as ViewPager2
    }


    override fun onBindViewHolder(holder: TipCardHolder, position: Int) {
        holder.bind(tipCards[position])
        updateHeight(holder.itemView)
    }

    fun updateHeight(tipCardView: View?) {
        tipCardView?.post {
            val wMeasureSpec =
                View.MeasureSpec.makeMeasureSpec(tipCardView.width, View.MeasureSpec.EXACTLY)
            val hMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED)
            tipCardView.measure(wMeasureSpec, hMeasureSpec)

            viewPager.apply {
                if (layoutParams.height != tipCardView.measuredHeight) {
                    layoutParams = layoutParams.apply { height = tipCardView.measuredHeight }
                }
            }

        }
    }

    override fun getItemCount(): Int {
        return tipCards.size
    }
}