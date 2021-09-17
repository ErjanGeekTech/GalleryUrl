package com.example.galleryurl.ui.fragments.onBoard.two

import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.galleryurl.R
import com.example.galleryurl.base.BaseFragment
import com.example.galleryurl.databinding.FragmentTwoOnBoardBinding
import com.example.galleryurl.ui.adapters.StatisticsAdapter
import com.example.galleryurl.ui.fragments.onBoard.main.OnBoardViewModel
import com.example.galleryurl.utils.MySharedPreferences
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
@AndroidEntryPoint
class TwoOnBoardFragment :
    BaseFragment<FragmentTwoOnBoardBinding, OnBoardViewModel>(R.layout.fragment_two_on_board) {
    override val binding by viewBinding(FragmentTwoOnBoardBinding::bind)
    override val viewModel: OnBoardViewModel by activityViewModels()
    private val statisticsAdapter = StatisticsAdapter()

    override fun setupViews() {
        setupRecycler()
    }

    private fun setupRecycler() {
        binding.rv.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = statisticsAdapter
        }
    }

    override fun setupListener() {
        binding.btnStart.setOnClickListener {
            viewModel.saveNext()
            findNavController().navigate(R.id.action_onBoardFragment_to_galleryFragment)
        }
    }

    override fun setupRequests() {
        viewModel.statistics_count.observe(viewLifecycleOwner, {
            statisticsAdapter.addList(it)
        })
    }
}