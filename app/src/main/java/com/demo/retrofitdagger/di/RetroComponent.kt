package com.demo.retrofitdagger.di

import com.demo.retrofitdagger.MainActivityViewModel
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [RetroModule::class])
interface RetroComponent {

    fun inject(mainActivityViewModel: MainActivityViewModel)
}