package com.example.galleryurl.ui.fragments.onBoard.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.galleryurl.utils.MySharedPreferences
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class OnBoardViewModel @Inject constructor(private val sharedPreferences: MySharedPreferences) : ViewModel() {

    val count: MutableLiveData<Int> = MutableLiveData()
    val statistics_count: MutableLiveData<String> = MutableLiveData()
    private var _count = 0

    fun plus() {
        _count++
        statistics_count.value = "Увеличилось на одно"
        count.value = _count
    }

    fun minus() {
        _count--
        statistics_count.value = "Уменьшилось на одно"
        count.value = _count
    }

    fun saveNext(){
        sharedPreferences.isOpen(false)
    }

}