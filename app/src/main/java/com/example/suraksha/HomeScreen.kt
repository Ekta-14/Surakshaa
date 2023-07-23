package com.example.suraksha

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeScreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)
        val bottom_nav = findViewById<BottomNavigationView>(R.id.bottom_nav)
        bottom_nav.setOnItemSelectedListener { menuItem ->
            if (menuItem.itemId == R.id.nav_guard)
                inflateFragment(GuardFragment.newInstance())
            else if (menuItem.itemId == R.id.nav_home)
                inflateFragment(HomeFragment.newInstance())
            true
        }
    }

    private fun inflateFragment(fragment: Fragment) {
        val transaction =
            supportFragmentManager.beginTransaction()//meanse to move from fragment to other..so this statement strts our tarnsaction
        transaction.replace(
            R.id.container,
            fragment
        )//this statent actually replace the container(frame layout) with the the fragment we want
        transaction.commit()//commit the replacement or change we have done in conatiner
    }
}