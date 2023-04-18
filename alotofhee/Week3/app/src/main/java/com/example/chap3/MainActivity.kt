package com.example.chap3

import android.content.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chap3.databinding.ActivityMainBinding
import com.example.chap3.databinding.ActivitySecondBinding
import com.example.chap3.FirstFragment
import com.example.chap3.SecondFragment

class MainActivity : AppCompatActivity() {
    private lateinit var viewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        supportFragmentManager
            .beginTransaction()
            .replace(viewBinding.frameFragment.id, FirstFragment())
            .commitAllowingStateLoss()

        viewBinding.btnFragment1.setOnClickListener{
            supportFragmentManager
                .beginTransaction()
                .replace(viewBinding.frameFragment.id, FirstFragment())
                .commitAllowingStateLoss()
        }

        viewBinding.btnFragment2.setOnClickListener{
            supportFragmentManager
                .beginTransaction()
                .replace(viewBinding.frameFragment.id, SecondFragment())
                .commitAllowingStateLoss()
        }
    }
}