package com.example.galleryurl.ui.fragments.onBoard.main

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.galleryurl.R
import com.example.galleryurl.databinding.FragmentOnBoardBinding
import com.example.galleryurl.ui.adapters.OnBoardAdapter

class OnBoardFragment : Fragment(R.layout.fragment_on_board) {

    private val binding by viewBinding(FragmentOnBoardBinding::bind)
    private lateinit var onBoardAdapter: OnBoardAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupViews()
    }

    private fun setupViews() {
        setupViewPager2()
    }

    private fun setupViewPager2() {
        onBoardAdapter = OnBoardAdapter(requireActivity().supportFragmentManager, lifecycle)
        binding.viewPager2.adapter = onBoardAdapter
    }

}