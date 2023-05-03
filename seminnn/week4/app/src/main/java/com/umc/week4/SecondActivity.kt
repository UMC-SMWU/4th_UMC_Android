package com.umc.week4

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.umc.week4.databinding.ActivityMainBinding
import com.umc.week4.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity(){


    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySecondBinding.inflate(layoutInflater)
        val view =binding.root
        setContentView(view)

        binding.txtSecond.text=intent.getStringExtra("data")
}}