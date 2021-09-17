package com.example.galleryurl.utils

import android.content.SharedPreferences
import com.example.geektechstartup.constants.Constants
import com.example.geektechstartup.constants.Constants.STATISTICS
import javax.inject.Inject

class MySharedPreferences @Inject constructor(private val preferences: SharedPreferences) {


    fun getIsOpen() = preferences.getBoolean(STATISTICS, true)

    fun isOpen(value: Boolean) {
        val editors = preferences.edit()
        editors.putBoolean(STATISTICS, value)
        editors.apply()
    }
}