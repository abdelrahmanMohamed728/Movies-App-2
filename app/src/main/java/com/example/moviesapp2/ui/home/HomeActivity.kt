package com.example.moviesapp2.ui.home

import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.base.BaseActivity
import com.example.moviesapp2.R
import kotlinx.android.synthetic.main.activity_home.*


class HomeActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        initBottomNav()
    }

    private fun initBottomNav() {
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.home_frag_host) as NavHostFragment?
        NavigationUI.setupWithNavController(
            bottom_nav_bar,
            navHostFragment!!.navController
        )
    }

    fun openSearch() {

    }
}