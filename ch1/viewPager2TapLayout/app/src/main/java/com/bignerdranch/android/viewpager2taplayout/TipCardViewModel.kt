package com.bignerdranch.android.viewpager2taplayout

import androidx.lifecycle.ViewModel

class TipCardViewModel : ViewModel(){
    private lateinit var _tipCardDataList : List<TipCard>

    fun setInitTipCard() {
        _tipCardDataList = listOf(
            TipCard("첫 이용 가이드", "처음 사용하시는 분들 위한 앱 사용 가이드"),
            TipCard("매칭 성공률 200% 도전하기", "매칭 성공률 200%를 만든 꿀 노하우를 전수합니다")
        )
    }
    val tipCardDataList : List<TipCard>
        get() = _tipCardDataList

}
