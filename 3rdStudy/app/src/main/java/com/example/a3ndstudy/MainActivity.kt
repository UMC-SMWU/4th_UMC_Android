package com.example.a3ndstudy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import com.example.a3ndstudy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var getResultText: ActivityResultLauncher<Intent>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        getResultText = registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()
        ) { result ->
            if (result.resultCode == RESULT_OK) {
                val mString = result.data?.getStringExtra("result")
                Toast.makeText(this,mString,Toast.LENGTH_LONG).show()
            }
        }

        binding.button.setOnClickListener {
            val text = binding.editText.text.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("text", text)
            getResultText.launch(intent)
        }


    }

}