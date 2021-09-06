package com.example.motionlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonConstraintSet: Button = findViewById(R.id.button_constraint_set)
        val buttonKeyFrames: Button = findViewById(R.id.button_key_frames)
        val buttonListExample: Button = findViewById(R.id.button_list_example)
        val buttonClickAndSwipe: Button = findViewById(R.id.button_click_and_swipe)
        val buttonKeyCycle: Button = findViewById(R.id.button_key_cycle)
        val buttonKeyTimeCycle: Button = findViewById(R.id.button_key_time_cycle)
        val buttonCreate: Button = findViewById(R.id.button_create)

        buttonConstraintSet.setOnClickListener {
            startActivity(Intent(this, ConstraintSetActivity::class.java))
        }

        buttonKeyFrames.setOnClickListener {
            startActivity(Intent(this, KeyFramesActivity::class.java))
        }

        buttonListExample.setOnClickListener {
            startActivity(Intent(this, ListActivity::class.java))
        }

        buttonClickAndSwipe.setOnClickListener {
            startActivity(Intent(this, ClickSwipeActivity::class.java))
        }

        buttonKeyCycle.setOnClickListener {
            startActivity(Intent(this, KeyCycleActivity::class.java))
        }

        buttonKeyTimeCycle.setOnClickListener {
            startActivity(Intent(this, KeyTimeCycleActivity::class.java))
        }

        buttonCreate.setOnClickListener {
            startActivity(Intent(this, CreateMotionActivity::class.java))
        }



    }
}