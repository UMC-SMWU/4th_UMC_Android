package com.example.chap3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chap3.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private  lateinit var viewBinding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivitySecondBinding.inflate(layoutInflater)

        setContentView(viewBinding.root)

//        val extras = intent.extras
//        val data = extras!!["text"] as String

//        viewBinding.textView.text = data
    }
}