package com.vaca.photo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val gg=PhotoAll.getAllPhoto(applicationContext)









        Log.e("fuck",gg.size.toString())
    }
}