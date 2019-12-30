package com.gaston.viewpagerexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.google.android.material.badge.BadgeDrawable
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val adapter by lazy { ViewPagerAdapter(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pager.adapter = adapter
        val tabLayoutMediator = TabLayoutMediator(tab_layout,pager,
            TabLayoutMediator.TabConfigurationStrategy { tab, position ->
                when(position + 1){
                    1 -> {
                        tab.text = "Opcion 1"
                        tab.setIcon(R.drawable.ic_beach_access_black_24dp)
                        val badge:BadgeDrawable = tab.orCreateBadge
                        badge.backgroundColor = ContextCompat.getColor(applicationContext, R.color.colorAccent)
                        badge.isVisible = true
                    }
                    2 -> {
                        tab.text = "Opcion 2"
                        tab.setIcon(R.drawable.ic_bookmark_black_24dp)
                        val badge:BadgeDrawable = tab.orCreateBadge
                        badge.backgroundColor = ContextCompat.getColor(applicationContext, R.color.colorAccent)
                        badge.number = 10
                        badge.isVisible = true
                    }
                    3 -> {
                        tab.text = "Opcion 3"
                        tab.setIcon(R.drawable.ic_camera_alt_black_24dp)
                        val badge:BadgeDrawable = tab.orCreateBadge
                        badge.backgroundColor = ContextCompat.getColor(applicationContext, R.color.colorAccent)
                        badge.number = 100
                        badge.maxCharacterCount = 3
                        badge.isVisible = true
                    }
                }
            })
        tabLayoutMediator.attach()

    }
}
