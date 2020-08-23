package com.example.moviesapp2.ui.splash

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.basemodule2.base.BaseFragment
import com.example.moviesapp2.R
import io.saeid.fabloading.LoadingView
import kotlinx.android.synthetic.main.splash_fragment.*

class SplashFragment : BaseFragment<SplashViewModel>() {

    companion object {
        fun newInstance() = SplashFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.splash_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initLoadingView()
    }

    private fun initLoadingView() {
        loadingView.addAnimation(Color.WHITE,R.drawable.ic_batman, LoadingView.FROM_LEFT)
        loadingView.addAnimation(Color.WHITE,R.drawable.ic_marvel, LoadingView.FROM_TOP)
        loadingView.addAnimation(Color.WHITE,R.drawable.ic_superhero, LoadingView.FROM_RIGHT)
        loadingView.addAnimation(Color.WHITE,R.drawable.ic_superman, LoadingView.FROM_BOTTOM)
        loadingView.startAnimation()
    }

}