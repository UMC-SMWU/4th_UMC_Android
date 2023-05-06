package com.example.a6thstudy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.example.a6thstudy.databinding.FragmentWeatherBinding
import com.google.android.material.tabs.TabLayoutMediator

class WeatherFragment : Fragment() {
    private lateinit var viewBinding: FragmentWeatherBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        viewBinding = FragmentWeatherBinding.inflate(layoutInflater)

        val weatherVPAdapter = WeatherVPAdapter(this)
        viewBinding.vpWeather.adapter = weatherVPAdapter

        val tabTitleArray = arrayOf(
            "어제",
            "오늘",
            "내일"
        )

        TabLayoutMediator(viewBinding.tabWeather, viewBinding.vpWeather) { tab, position ->
            tab.text = tabTitleArray[position]
        }.attach()

        return viewBinding.root //setContentView 대신
    }
}