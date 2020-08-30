package com.example.moviesapp2.ui.signup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.example.base.OnSingleClickListener
import com.example.basemodule2.base.BaseFragment
import com.example.moviesapp2.R
import kotlinx.android.synthetic.main.sign_up_fragment.*

class SignUpFragment : BaseFragment<SignUpViewModel>() {

    companion object {
        fun newInstance() = SignUpFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.sign_up_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.addObserver()
    }

    override fun initListeners() {
        super.initListeners()
        signUpButton.setOnClickListener(object : OnSingleClickListener() {
            override fun onSingleClick(v: View?) {
                viewModel.signUp(signUpEmailET.text.toString(), SignUpPasswordET.text.toString())
                signUpProgressBar.visibility = View.VISIBLE
            }

        })
    }

    override fun initObservers() {
        super.initObservers()
        viewModel.signUpResponse.observe(this, Observer {
            if (it) {
                showSnackBar(requireView(), "Log in successful")
            } else
                showSnackBar(requireView(), "Log in failed")
            signUpProgressBar.visibility = View.GONE
        })
    }

}