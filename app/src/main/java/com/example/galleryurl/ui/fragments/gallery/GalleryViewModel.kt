package com.example.galleryurl.ui.fragments.gallery

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.*
import kotlin.collections.ArrayList

class GalleryViewModel : ViewModel() {

    val mutableLiveData: MutableLiveData<List<String>> = MutableLiveData()
    private var list: ArrayList<String> = ArrayList()

    fun addList() {
        list = arrayListOf(
            "https://rickandmortyapi.com/api/character/avatar/1.jpeg",
            "https://rickandmortyapi.com/api/character/avatar/2.jpeg",
            "https://rickandmortyapi.com/api/character/avatar/361.jpeg",
            "https://rickandmortyapi.com/api/character/avatar/183.jpeg",
            "https://i.pinimg.com/564x/98/13/33/981333a599250e2fa60e6e073eb304be.jpg"
        )
        mutableLiveData.value = list
    }

    fun setupRandomPhoto() = list[Random().nextInt(list.size)]

    fun addUrlInList(url: String) {
        list.add(url)
        mutableLiveData.value = list
    }
}