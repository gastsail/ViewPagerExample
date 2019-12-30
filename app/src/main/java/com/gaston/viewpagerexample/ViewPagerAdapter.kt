package com.gaston.viewpagerexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

/**
 * Created by Gastón Saillén on 30 December 2019
 */
class ViewPagerAdapter(fa: FragmentActivity): FragmentStateAdapter(fa) {

    companion object{
        private const val ARG_OBJECT = "object"
    }

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> { DemoObjectFragment()}
            1 -> { Fragment2() }
            2 -> {DemoObjectFragment()}
            else -> DemoObjectFragment()
        }
    }


}