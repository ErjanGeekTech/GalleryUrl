package com.example.galleryurl.di

import android.content.Context
import android.content.SharedPreferences
import com.example.galleryurl.utils.MySharedPreferences
import com.example.geektechstartup.constants.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object SharedPreferencesModule {
    @Singleton
    @Provides
    fun provideSharedPreferences(@ApplicationContext context: Context) =
        context.getSharedPreferences(
            Constants.PREF_NAME, Context.MODE_PRIVATE
        )

    @Singleton
    @Provides
    fun provideName(preferences: SharedPreferences) =
        MySharedPreferences(preferences)


}