package com.example.galleryurl.ui.fragments.randomPhoto

import androidx.fragment.app.activityViewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.galleryurl.R
import com.example.galleryurl.base.BaseFragment
import com.example.galleryurl.databinding.FragmentRandomPhotoBinding
import com.example.galleryurl.ui.fragments.gallery.GalleryViewModel
import com.example.galleryurl.utils.extensions.getTextE
import com.example.galleryurl.utils.extensions.isValid
import com.example.galleryurl.utils.extensions.setPicasso
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RandomPhotoFragment : BaseFragment<FragmentRandomPhotoBinding, GalleryViewModel>(R.layout.fragment_random_photo) {

    override val binding by viewBinding(FragmentRandomPhotoBinding::bind)
    override val viewModel: GalleryViewModel by activityViewModels()

    override fun initialize() {
        viewModel.addList()
    }

    override fun setupListener() {
        setupClickOk()
        setupClickRandom()
    }

    private fun setupClickRandom() {
        binding.btnRandom.setOnClickListener {
            binding.imageRandom.setPicasso(viewModel.setupRandomPhoto())
        }
    }

    private fun setupClickOk() {
        binding.btnOk.setOnClickListener {
            if (binding.etInputUrl.isValid()) {
                viewModel.addUrlInList(binding.etInputUrl.getTextE())
                binding.etInputUrl.setText("")
            }
        }
    }
}