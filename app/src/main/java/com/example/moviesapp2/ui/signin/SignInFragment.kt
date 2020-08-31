package com.example.moviesapp2.ui.signin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.example.base.OnSingleClickListener
import com.example.basemodule2.base.BaseFragment
import com.example.moviesapp2.R
import kotlinx.android.synthetic.main.sign_in_fragment.*
import kotlinx.android.synthetic.main.sign_up_fragment.*

class SignInFragment : BaseFragment<SignInViewModel>() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.sign_in_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    override fun initListeners() {
        super.initListeners()
        signInButton.setOnClickListener(object  : OnSingleClickListener(){
            override fun onSingleClick(v: View?) {
                viewModel.signIn(signInEmailET.text.toString(), signInPasswordET.text.toString())
                signInProgressBar.visibility = View.VISIBLE
            }

        })
    }

    override fun initObservers() {
        super.initObservers()
        viewModel.addSignInObserver()
        viewModel.signInResponse.observe(this , Observer {
            if (it) {
                showSnackBar(requireView(), getString(R.string.signInSuccessful))
            } else
                showSnackBar(requireView(), getString(R.string.signInFailed))
            signInProgressBar.visibility = View.GONE
        })
    }

}