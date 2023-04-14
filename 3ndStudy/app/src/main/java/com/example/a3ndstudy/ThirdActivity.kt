package com.example.a3ndstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.a3ndstudy.databinding.ActivityThirdBinding
import com.example.a3ndstudy.databinding.FragmentFirstBinding

class ThirdActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager
            .beginTransaction()
            .replace(binding.frameFragment.id, FirstFragment())
            .commitAllowingStateLoss()

        binding.btnFg1.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(binding.frameFragment.id, FirstFragment())
                .commitAllowingStateLoss()
        }

        binding.btnFg2.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(binding.frameFragment.id, SecondFragment())
                .commitAllowingStateLoss()
        }
    }
}