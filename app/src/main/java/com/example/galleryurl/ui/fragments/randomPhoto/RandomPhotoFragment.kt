package com.example.galleryurl.ui.fragments.randomPhoto

import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.galleryurl.R
import com.example.galleryurl.base.BaseFragment
import com.example.galleryurl.databinding.FragmentRandomPhotoBinding
import com.example.galleryurl.ui.fragments.gallery.GalleryViewModel
import com.squareup.picasso.Picasso
import java.util.*
import kotlin.collections.ArrayList

class RandomPhotoFragment : BaseFragment<FragmentRandomPhotoBinding, GalleryViewModel>(R.layout.fragment_random_photo) {

    override val binding by viewBinding(FragmentRandomPhotoBinding::bind)
    override val viewModel: GalleryViewModel by activityViewModels()

    private var list: ArrayList<String> = ArrayList()


    override fun initialize() {
        addList()
        viewModel.list.value = list
    }

    override fun setupListener() {
        setupClickOk()
        setupClickRandom()
    }

    private fun setupClickRandom() {
        binding.btnRandom.setOnClickListener {
            val random = Random().nextInt(list.size)
            Picasso.get().load(list[random]).into(binding.imageRandom)
        }
    }

    private fun addList() {
        list.apply {
            add("https://rickandmortyapi.com/api/character/avatar/1.jpeg")
            add("https://rickandmortyapi.com/api/character/avatar/2.jpeg")
            add("https://rickandmortyapi.com/api/character/avatar/361.jpeg")
            add("https://rickandmortyapi.com/api/character/avatar/183.jpeg")
            add("https://i.pinimg.com/564x/98/13/33/981333a599250e2fa60e6e073eb304be.jpg")
        }
    }

    private fun setupClickOk() {
        binding.btnOk.setOnClickListener {
            list.add(binding.etInputUrl.text.toString())
            viewModel.list.value = list
            binding.etInputUrl.setText("")
        }
    }

}