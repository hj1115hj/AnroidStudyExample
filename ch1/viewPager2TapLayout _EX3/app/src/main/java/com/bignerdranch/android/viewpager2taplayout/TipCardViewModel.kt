package com.bignerdranch.android.viewpager2taplayout

import androidx.lifecycle.ViewModel

class TipCardViewModel : ViewModel(){
    private lateinit var _tipCardDataList : List<TipCard>

    fun setInitTipCard() {
        _tipCardDataList = listOf(

            TipCard("매칭 성공률 200% 도전하기", "매칭 성공률 200%를 만든 꿀 노하우를 전수합니다"),
            TipCard("연애고수들의 tip 전수", "쉴틈없이 연애하는 연애고수들의 노하우를 전수받고 싶으세요? 이 팁에 모든 노하우가 기록되어있습니다. 클릭하여 지금 당장 확인하세요 성공 100%"),
            TipCard("매칭 성공률 200% 도전하기", "매칭 성공률 200%를 만든 꿀 노하우를 전수합니다")

        )
    }
    val tipCardDataList : List<TipCard>
        get() = _tipCardDataList

}
