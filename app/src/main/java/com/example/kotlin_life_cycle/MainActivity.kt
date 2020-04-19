package com.example.kotlin_life_cycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.ActionMode

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.i ("Ahlam","on start is called")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Ahlam", "on resume is called")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Ahlam", "on pause is called")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Ahlam","on stop is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Ahlam","on destroy is called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("Ahlam","on destroy is called")

    }




}
