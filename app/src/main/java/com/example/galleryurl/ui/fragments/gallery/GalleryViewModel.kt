package com.example.galleryurl.ui.fragments.gallery

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GalleryViewModel: ViewModel() {

    val list: MutableLiveData<List<String>> = MutableLiveData()

}