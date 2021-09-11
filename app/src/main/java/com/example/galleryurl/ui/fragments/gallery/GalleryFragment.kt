package com.example.galleryurl.ui.fragments.gallery

import android.util.Log
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.galleryurl.R
import com.example.galleryurl.base.BaseFragment
import com.example.galleryurl.databinding.FragmentGalleryBinding
import com.example.galleryurl.ui.adapters.GalleryAdapter
import com.squareup.picasso.Picasso

class GalleryFragment : BaseFragment<FragmentGalleryBinding, GalleryViewModel>(R.layout.fragment_gallery) {

    override val binding  by viewBinding(FragmentGalleryBinding::bind)
    override val viewModel: GalleryViewModel by activityViewModels()
    private val galleryAdapter: GalleryAdapter = GalleryAdapter()

    override fun setupViews() {
        setupRecycler()
    }

    private fun setupRecycler() {
        binding.rv.apply {
            layoutManager = GridLayoutManager(requireContext(), 3)
            adapter = galleryAdapter
        }
    }

    override fun setupRequests() {
        viewModel.list.observe(viewLifecycleOwner, {
            galleryAdapter.submitList(it)
        })
    }

}