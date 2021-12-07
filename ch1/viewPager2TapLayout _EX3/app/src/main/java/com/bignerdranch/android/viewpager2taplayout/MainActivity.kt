package com.bignerdranch.android.viewpager2taplayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2


class MainActivity : AppCompatActivity() {
    private lateinit var tipCardViewPager2: ViewPager2

    private val tipCardDataViewModel : TipCardViewModel by lazy{
        ViewModelProvider(this).get(TipCardViewModel::class.java)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tipCardViewPager2 = findViewById(R.id.tipcard_view_pager2)
        tipCardDataViewModel.setInitTipCard()

        val tipCardAdapter = TipCardAdapter(tipCardDataViewModel.tipCardDataList)
        tipCardViewPager2.adapter = tipCardAdapter

        tipCardViewPager2.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                //val tipCardView = (tipCardViewPager2[0] as RecyclerView).layoutManager?.findViewByPosition(position)
                val tipCardView = (tipCardViewPager2.getChildAt(0) as RecyclerView).findViewHolderForAdapterPosition(position)?.itemView
                tipCardAdapter.updateHeight(tipCardView)
            }
        })

    }



}