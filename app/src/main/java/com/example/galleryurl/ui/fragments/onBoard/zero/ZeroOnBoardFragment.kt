package com.example.galleryurl.ui.fragments.onBoard.zero

import androidx.fragment.app.activityViewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.galleryurl.R
import com.example.galleryurl.base.BaseFragment
import com.example.galleryurl.databinding.FragmentZeroOnBoardBinding
import com.example.galleryurl.ui.fragments.onBoard.main.OnBoardViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ZeroOnBoardFragment :
    BaseFragment<FragmentZeroOnBoardBinding, OnBoardViewModel>(R.layout.fragment_zero_on_board) {
    override val binding by viewBinding(FragmentZeroOnBoardBinding::bind)
    override val viewModel: OnBoardViewModel by activityViewModels()

    override fun setupListener() {
        clickPlus()
        clickMinus()
    }

    private fun clickMinus() {
        binding.btnMainPlus.setOnClickListener {
            viewModel.plus()
        }
    }

    private fun clickPlus() {
        binding.btnMainMinus.setOnClickListener {
            viewModel.minus()
        }
    }
}