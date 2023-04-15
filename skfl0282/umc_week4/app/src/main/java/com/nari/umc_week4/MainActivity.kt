package com.nari.umc_week4

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AlertDialog
import com.nari.umc_week4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var edittext: String?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d("Log","onCreate")


        binding.buttonto2.setOnClickListener {
            val  intent= Intent(this, SecondActivity::class.java)
            edittext = binding.edtext.text.toString()
            intent.putExtra("text", "text")
            intent.putExtra("edittext",edittext)
            startActivity(intent)

        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("Log","onStart")

    }
    override fun onRestart() {
        super.onRestart()
        Log.d("Log","onRestart")
        AlertDialog.Builder(this)
            .setTitle("Title")
            .setMessage("다시 작성하실건가요?")
            .setPositiveButton("네", object : DialogInterface.OnClickListener {
                override fun onClick(dialog: DialogInterface, which: Int) {
                    edittext = null
                    onResume()
                }
            })
            .setNegativeButton("아니요", object : DialogInterface.OnClickListener {
                override fun onClick(dialog: DialogInterface, which: Int) {
                    onResume()
                }
            })
            .create()
            .show()


    }

    override fun onResume() {
        super.onResume()
        Log.d("Log","onResume")
        binding.edtext.setText(edittext)



    }

    override fun onPause() {
        super.onPause()
        Log.d("Log","onPause")
        edittext = binding.edtext.text.toString()

    }

    override fun onStop() {
        super.onStop()
        Log.d("Log","onStop")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Log","onDestroy")

    }


}