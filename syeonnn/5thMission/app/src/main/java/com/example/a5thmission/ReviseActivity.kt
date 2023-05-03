package com.example.a5thmission

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.ActivityResultLauncher
import com.example.a5thmission.databinding.ActivityReviseBinding

class ReviseActivity : AppCompatActivity() {
    private lateinit var binding: ActivityReviseBinding
    private lateinit var getResultText: ActivityResultLauncher<Intent>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReviseBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_revise)


        binding.btnSave.setOnClickListener{
            val text = binding.etMemo.toString()
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra("text",text)
            setResult(Activity.RESULT_OK, intent)
            finish()
        }
    }

}