package com.example.galleryurl.utils.extensions

import android.widget.EditText
import android.widget.ImageView
import com.squareup.picasso.Picasso

fun ImageView.setPicasso(url: String) {
    Picasso.get().load(url).resize(200, 200).into(this)
}

fun EditText.isValid(): Boolean {
    if (getTextE().isEmpty()) {
        error = "Incorrect"
        return false
    }
    return true
}

fun EditText.getTextE() = text.toString().trim()