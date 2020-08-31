package com.example.moviesapp2.ui.signin

import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import com.example.base.BaseViewModel
import com.example.moviesapp2.repo.AuthenticationRepo

class SignInViewModel(var repo : AuthenticationRepo) : BaseViewModel() {
    var signInResponse = MediatorLiveData<Boolean>()
   fun addSignInObserver(){
       signInResponse.addSource(repo.signInSuccess){
           signInResponse.postValue(it)
       }
   }
    fun signIn(email : String , password : String){
        repo.SignIn(email,password)
    }
}