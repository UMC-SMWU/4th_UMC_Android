package com.example.a5thstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.a5thstudy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        lateinit var binding: ActivityMainBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //setContentView(R.layout.activity_main)

        val profileList = arrayListOf(
            Profiles(R.drawable.woman, "박드로이드",24, "학생",isChecked = false),
            Profiles(R.drawable.man, "홍드로이드",27, "안드로이드 앱 개발자",false),
            Profiles(R.drawable.woman, "김드롱리드",30, "아이폰 앱 개발자",isChecked = false),
            Profiles(R.drawable.man, "안드로이드",33, "웹 앱 개발자", isChecked = false),
            Profiles(R.drawable.woman, "최드로이드",22, "빵집 사장님", isChecked = false),
            Profiles(R.drawable.woman, "윤홍드로이드",50, "치킨집 사장님", isChecked = false),
            Profiles(R.drawable.man, "노드로이드",44, "고등학교 교사", isChecked = false),
            Profiles(R.drawable.woman, "봉드로이드",31, "바리스타", isChecked = false),
            Profiles(R.drawable.man, "엔드로이드",49, "숙명여대 교수", isChecked = false),
            Profiles(R.drawable.woman, "옹드로이드",46, "인테리어 전문가", isChecked = false),
            Profiles(R.drawable.woman, "아드로이드",36, "이혼 전문 변호사", isChecked = false),
            Profiles(R.drawable.man, "킼드로이드",29, "미술관 큐레이터", isChecked = false)
        )

        val recyclerView: RecyclerView = findViewById(R.id.rv_profile)

        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ProfileAdapter(profileList)
    }
}