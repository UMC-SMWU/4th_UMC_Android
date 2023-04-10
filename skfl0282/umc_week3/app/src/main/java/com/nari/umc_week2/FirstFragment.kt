package com.nari.umc_week2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import com.nari.umc_week2.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private lateinit var binding : FragmentFirstBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        binding.btnFragment.setOnClickListener {
            val result = binding.etFragment.text.toString()
            // Use the Kotlin extension in the fragment-ktx artifact
            requireActivity().supportFragmentManager.setFragmentResult("requestKey", bundleOf("bundleKey" to result))
        }
        return binding.root
    }

}