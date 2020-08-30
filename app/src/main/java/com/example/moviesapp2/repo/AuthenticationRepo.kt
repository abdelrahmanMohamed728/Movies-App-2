package com.example.moviesapp2.repo

import android.util.Log
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import com.example.base.BaseActivity
import com.example.base.BaseRepo
import com.google.firebase.auth.FirebaseAuth


class AuthenticationRepo(private var activity : BaseActivity) : BaseRepo(){
    private val mAuth= FirebaseAuth.getInstance()
    var signUpSuccess : MutableLiveData<Boolean> = MutableLiveData()
    fun SignUp(email : String , password : String){
        mAuth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(activity
            ) { task ->
                if (task.isSuccessful) {
                    Log.d("auth", "createUserWithEmail:success")
                    signUpSuccess.postValue(true)
                } else {
                    Log.w("auth", "createUserWithEmail:failure", task.exception)
                    signUpSuccess.postValue(false)
                }
            }
    }
}