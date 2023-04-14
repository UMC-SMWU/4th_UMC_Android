package com.example.umcstudy

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import com.example.umcstudy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    var temp = ""

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.e("onCreate","ENTER")

        binding.btn.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            val et = binding.edt.text.toString()
            intent.putExtra("text", et)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart();
        Log.e("onStart","ENTER")
        var welcome = "반갑습니다. 메모장 앱입니다."
        Toast.makeText(this,welcome,Toast.LENGTH_LONG).show()
    }
    override fun onResume() {
        super.onResume()
        Log.e("onResume","ENTER")

        //var welcome = "반갑습니다. 메모장 앱입니다."
        //Toast.makeText(this,welcome,Toast.LENGTH_LONG).show()

        // onPause에서 저장한 전역변수 welcome내용으로 EditIext text 설정하기
        if(temp!=null){
            binding.edt.setText(temp)
        }
        Log.e("onResume","temp 변수 띄움!")
    }
    override fun onPause() {
        super.onPause()

        /*Log.e("onPause","ENTER")
        var chk =0
        AlertDialog.Builder(this)
            .setTitle("경고")
            .setMessage("앱을 종료하시겠습니까?")
            .setPositiveButton("예", object : DialogInterface.OnClickListener {
                override fun onClick(dialog: DialogInterface, which: Int) {
                    Log.e("Dialog", "positive")
                    finish()
                }
            })
            .setNegativeButton("아니오", object : DialogInterface.OnClickListener {
                override fun onClick(dialog: DialogInterface, which: Int) {
                    Log.e("Dialog", "negative")
                    chk = 1
                }
            })
            .create()
            .show()
        if(chk ==1)
            super.onPause()
        else
            Log.e("onPause","DON'T ENTER")*/

        // 현재까지 작성한 내용 Activity 전역변수에 담아두기
        temp = binding.edt.text.toString()
        Log.e("onPause","temp변수에 중간 저장!")
    }
    override fun onStop() {
        super.onStop()
        Log.e("onStop","ENTER")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.e("onDestroy","ENTER")
    }
    override fun onRestart() {
        super.onRestart()
        Log.e("onRestart","ENTER")

        showDialog()
    }

    fun showDialog() {
        AlertDialog.Builder(this)
            .setTitle("경고")
            .setMessage("다시 작성하시겠습니까?")
            .setPositiveButton("예", object : DialogInterface.OnClickListener {
                override fun onClick(dialog: DialogInterface, which: Int) {
                    Log.e("Dialog", "positive")
                }
            })
            .setNegativeButton("아니오", object : DialogInterface.OnClickListener {
                override fun onClick(dialog: DialogInterface, which: Int) {
                    Log.e("Dialog", "negative")
                    temp=""
                    binding.edt.setText(temp)
                    Log.e("Dialog", "temp 중간 저장사항 삭제")
                }
            })
            .create()
            .show()
    }


}