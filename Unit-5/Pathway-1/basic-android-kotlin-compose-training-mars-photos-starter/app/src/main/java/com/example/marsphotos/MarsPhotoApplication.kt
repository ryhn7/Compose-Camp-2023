package com.example.marsphotos

import android.app.Application
import com.example.marsphotos.di.AppContainer
import com.example.marsphotos.network.MarsApiConfig

class MarsPhotoApplication : Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = MarsApiConfig(this)
    }
}