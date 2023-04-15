package com.nari.umc_week4

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.nari.umc_week4.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val text = intent.getStringExtra("text")
        val edit = intent.getStringExtra("edittext")
        Log.d("intent",text.toString())
        binding.textView.text = edit
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"두번째 액티비티가 종료되었습니다.",Toast.LENGTH_SHORT).show()

    }

}