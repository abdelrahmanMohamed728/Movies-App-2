package com.example.moviesapp2.koin

import com.example.base.BaseActivity
import com.example.moviesapp2.repo.AuthenticationRepo
import com.example.moviesapp2.ui.signin.SignInViewModel
import com.example.moviesapp2.ui.signup.SignUpViewModel
import com.example.moviesapp2.ui.splash.SplashViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModels = module {
    viewModel {
        SplashViewModel()
    }
    viewModel {
        SignUpViewModel(get())
    }
    viewModel {
        SignInViewModel(get())
    }
}

val repos = module {
    factory {
        AuthenticationRepo(get())
    }
}

val base = module {
    factory {
        BaseActivity()
    }
}