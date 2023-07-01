package com.android.problempractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.atoast.AToast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        AToast.showToast(this,"Hello Arvind, Welcome to AToast Library!!")
    }
}