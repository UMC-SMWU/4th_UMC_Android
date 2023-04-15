package com.nari.umc_week2

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import com.nari.umc_week2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var getResultText: ActivityResultLauncher<Intent>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.buttonto2.setOnClickListener {
            val text1 = binding.et.text.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("text", text1)
            getResultText.launch(intent)
        }

        getResultText = registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()
        ) { result ->
            if (result.resultCode == RESULT_OK) {
                val mString = result.data?.getStringExtra("result")
                Toast.makeText(this,mString,Toast.LENGTH_LONG).show()
            }
        }
    }

}

