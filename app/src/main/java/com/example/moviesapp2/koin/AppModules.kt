package com.example.moviesapp2.koin

import com.example.moviesapp2.ui.splash.SplashViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModels = module {
    viewModel {
        SplashViewModel()
    }
}