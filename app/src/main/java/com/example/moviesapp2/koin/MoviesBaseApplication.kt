package com.example.moviesapp2.koin

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MoviesBaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MoviesBaseApplication)
            modules(listOf(viewModels, base , repos))
        }
    }
}