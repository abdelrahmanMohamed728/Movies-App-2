package com.example.moviesapp2.ui.signup

import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import com.example.base.BaseViewModel
import com.example.moviesapp2.repo.AuthenticationRepo

class SignUpViewModel(private var repo : AuthenticationRepo) : BaseViewModel() {
   var signUpResponse = MediatorLiveData<Boolean>()
    fun addObserver(){
        signUpResponse.addSource(repo.signUpSuccess) {
            signUpResponse.postValue(it)
        }
    }
    fun signUp(email : String , password : String){
        repo.SignUp(email,password)
    }


}