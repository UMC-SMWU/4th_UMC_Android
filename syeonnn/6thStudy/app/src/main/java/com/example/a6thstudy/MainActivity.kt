package com.example.a6thstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a6thstudy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val viewBinding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)

        supportFragmentManager
            .beginTransaction()
            .replace(viewBinding.containerFragment.id, HomeFragment())
            .commitAllowingStateLoss()

        viewBinding.bottomNavi.run {
            setOnItemSelectedListener {
                when (it.itemId) {
                    R.id.home_item -> {
                        supportFragmentManager
                            .beginTransaction()
                            .replace(viewBinding.containerFragment.id, HomeFragment())
                            .commitAllowingStateLoss()
                    }
                    R.id.weather_item->{
                        supportFragmentManager
                            .beginTransaction()
                            .replace(viewBinding.containerFragment.id, WeatherFragment())
                            .commitAllowingStateLoss()
                    }
                    R.id.music_item->{
                        supportFragmentManager
                            .beginTransaction()
                            .replace(viewBinding.containerFragment.id, MusicFragment())
                            .commitAllowingStateLoss()
                    }

                }
                true
            }
            selectedItemId = R.id.home_item
        }
    }
}