package com.demo.retrofitdagger

import android.app.Application
import com.demo.retrofitdagger.di.DaggerRetroComponent
import com.demo.retrofitdagger.di.RetroComponent
import com.demo.retrofitdagger.di.RetroModule

class MyApplication: Application() {

    private lateinit var retroComponent: RetroComponent

    override fun onCreate() {
        super.onCreate()

        retroComponent = DaggerRetroComponent.builder()
            .retroModule(RetroModule())
            .build()
    }

    fun getRetroComponent(): RetroComponent {
        return retroComponent
    }
}