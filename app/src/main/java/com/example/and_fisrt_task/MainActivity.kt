package com.example.and_fisrt_task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView.text = "Resolved conflict"

        Log.d("TAG", "DEBAG HELLO");
        Log.e("TAG", "ERROR HELLO");
        Log.w("TAG", "WARN HELLO");
        Log.i("TAG", "INFO HELLO");

    }
}