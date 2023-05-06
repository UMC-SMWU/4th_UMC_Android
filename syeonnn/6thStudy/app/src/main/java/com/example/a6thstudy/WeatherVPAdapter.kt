package com.example.a6thstudy

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class WeatherVPAdapter(fragment: Fragment): FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0->OneFragment()
            1->TwoFragment()
            2->ThreeFragment()
            else->TwoFragment()
        }
    }


}