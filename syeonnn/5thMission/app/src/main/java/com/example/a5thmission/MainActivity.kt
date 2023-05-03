package com.example.a5thmission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.a5thmission.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var getResultText: ActivityResultLauncher<Intent>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val memoList = arrayListOf<Memo>()

        binding.rvMemo.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvMemo.setHasFixedSize(true)
        //여기서 최초 생성되는 것 -> MemoAdapter의 인수로 memoList넘긱고 ...등등
        binding.rvMemo.adapter = MemoAdapter(memoList)

        binding.btnAdd.setOnClickListener {
            val intent = Intent(this, ReviseActivity::class.java)
            getResultText.launch(intent)
        }

        getResultText = registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()
        ) { result ->
            if (result.resultCode == RESULT_OK) {
                val mString = result.data?.getStringExtra("text").toString()
                memoList.add(Memo(mString))

            }
        }


    }
}