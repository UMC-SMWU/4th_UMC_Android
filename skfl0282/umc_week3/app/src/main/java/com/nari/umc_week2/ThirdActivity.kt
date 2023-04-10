package com.nari.umc_week2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.nari.umc_week2.databinding.ActivityThirdBinding
import com.nari.umc_week2.databinding.FragmentFirstBinding

class ThirdActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThirdBinding
    private lateinit var binding2: FragmentFirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)

        setContentView(binding.root)

        supportFragmentManager
            .beginTransaction()
            .replace(binding.fragmentContainer.id, FirstFragment())
            .commitAllowingStateLoss()

        binding.button1.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(binding.fragmentContainer.id, FirstFragment())
                .commitAllowingStateLoss()
        }

        binding.button2.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(binding.fragmentContainer.id, SecondFragment())
                .commitAllowingStateLoss()
        }

        supportFragmentManager
            .setFragmentResultListener("requestKey", this) { requestKey, bundle ->
                val result = bundle.getString("bundleKey")
                // Set the result to a TextView
                Toast.makeText(this,result,Toast.LENGTH_LONG).show()
            }
    }
}