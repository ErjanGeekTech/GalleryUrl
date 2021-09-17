package com.example.galleryurl.ui.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.galleryurl.ui.fragments.onBoard.one.OneOnBoardFragment
import com.example.galleryurl.ui.fragments.onBoard.two.TwoOnBoardFragment
import com.example.galleryurl.ui.fragments.onBoard.zero.ZeroOnBoardFragment

class OnBoardAdapter(fm: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fm, lifecycle) {

    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                ZeroOnBoardFragment()
            }
            1 -> {
                OneOnBoardFragment()
            }
            2 -> {
                TwoOnBoardFragment()
            }
            else -> {
                Fragment()
            }
        }
    }
}