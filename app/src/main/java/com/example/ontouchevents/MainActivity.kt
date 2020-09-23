package com.example.ontouchevents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.widget.Toast
import androidx.core.view.MotionEventCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Do Nothing
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        return when (MotionEventCompat.getActionMasked(event)) {
            MotionEvent.ACTION_MOVE -> {
                Toast.makeText(applicationContext,"Action was MOVE",Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onTouchEvent(event)
        }
    }
}