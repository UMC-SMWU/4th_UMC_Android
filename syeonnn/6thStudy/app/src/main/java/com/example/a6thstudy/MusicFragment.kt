package com.example.a6thstudy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.a6thstudy.databinding.FragmentHomeBinding
import com.example.a6thstudy.databinding.FragmentMusicBinding

class MusicFragment : Fragment() {
    private lateinit var viewBinding: FragmentMusicBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewBinding = FragmentMusicBinding.inflate(layoutInflater)
        return viewBinding.root //setContentView 대신
    }
}