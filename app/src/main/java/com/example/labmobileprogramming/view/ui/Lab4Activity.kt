package com.example.labmobileprogramming.view.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.labmobileprogramming.R

class Lab4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lab4)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }

}
