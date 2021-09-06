package com.example.motionlayout

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.constraintlayout.motion.widget.TransitionAdapter

class KeyTriggerActivity : AppCompatActivity() {

    lateinit var motionLayout: MotionLayout
    lateinit var imageView: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_key_trigger)
        motionLayout = findViewById<MotionLayout>(R.id.motionLayout)
        imageView = findViewById<ImageView>(R.id.imageView)


        motionLayout.setTransitionListener(object : TransitionAdapter() {
            override fun onTransitionTrigger(
                motionLayout: MotionLayout?,
                triggerId: Int,
                positive: Boolean,
                progress: Float
            ) {
                if (positive) {
                    imageView.setImageResource(R.drawable.ic_positive)
                    showToast("Position over 50")
                } else {
                    imageView.setImageResource(R.drawable.ic_negative)
                    showToast("Position under 50")
                }
            }
        })

    }

    private fun showToast(text: String) {
        Toast.makeText(
            this@KeyTriggerActivity,
            text,
            Toast.LENGTH_SHORT
        ).show()
    }
}