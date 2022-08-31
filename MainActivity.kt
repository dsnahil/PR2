package com.example.madpractical2_20012011013

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var c : ConstraintLayout
    val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        c = findViewById(R.id.c)

        Log.i(TAG, "onCreate function called. ")
        Toast.makeText(this, "onCreate function called.", Toast.LENGTH_SHORT).show()
        Snackbar.make(c,"onCreate function called.",Snackbar.LENGTH_LONG).show()

    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume function called. ")
        Toast.makeText(this, "onResume function called.", Toast.LENGTH_SHORT).show()
        Snackbar.make(c,"onResume function called.",Snackbar.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause function called. ")
        Toast.makeText(this, "onPause function called.", Toast.LENGTH_SHORT).show()
        Snackbar.make(c,"onPause function called.",Snackbar.LENGTH_LONG).show()
    }
    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop function called. ")
        Toast.makeText(this, "onStop function called.", Toast.LENGTH_SHORT).show()
        Snackbar.make(c,"onStop function called.",Snackbar.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart function called. ")
        Toast.makeText(this, "onStart function called.", Toast.LENGTH_SHORT).show()
        Snackbar.make(c,"onStart function called.",Snackbar.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart function called. ")
        Toast.makeText(this, "onRestart function called.", Toast.LENGTH_SHORT).show()
        Snackbar.make(c,"onRestart function called.",Snackbar.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy function called. ")
        Toast.makeText(this, "onDestroy function called.", Toast.LENGTH_SHORT).show()
        Snackbar.make(c,"onDestroy function called.",Snackbar.LENGTH_LONG).show()
    }
}
