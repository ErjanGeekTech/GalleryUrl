package com.example.galleryurl.ui.fragments.onBoard.one

import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.galleryurl.R
import com.example.galleryurl.base.BaseFragment
import com.example.galleryurl.databinding.FragmentOneOnBoardBinding
import com.example.galleryurl.ui.fragments.onBoard.main.OnBoardViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class OneOnBoardFragment :
    BaseFragment<FragmentOneOnBoardBinding, OnBoardViewModel>(R.layout.fragment_one_on_board) {
    override val binding by viewBinding(FragmentOneOnBoardBinding::bind)
    override val viewModel: OnBoardViewModel by activityViewModels()

    override fun setupRequests() {
        viewModel.count.observe(viewLifecycleOwner, {
            binding.textMainCount.text = it.toString()
        })
    }
}