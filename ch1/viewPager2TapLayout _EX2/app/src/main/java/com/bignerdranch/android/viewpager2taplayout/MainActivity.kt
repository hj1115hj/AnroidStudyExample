package com.bignerdranch.android.viewpager2taplayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
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

        tipCardViewPager2.adapter =  TipCardAdapter(tipCardDataViewModel.tipCardDataList)
        tipCardViewPager2.registerOnPageChangeCallback(object:ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
            }

        })

    }
}