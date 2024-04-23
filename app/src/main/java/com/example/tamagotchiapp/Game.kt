package com.example.tamagotchiapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Game : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        val imageView = findViewById<ImageView>(R.id.imageView)
        val feedbtn1 = findViewById<Button>(R.id.feedBtn1)
        val cleanbtn2 = findViewById<Button>(R.id.cleanbtn2)
        val playbtn3 = findViewById<Button>(R.id.playbtn3)

        feedbtn1.setOnClickListener {
            test(imageView, R.drawable.feed)
        }

        cleabtn2.setOnClickListener {
            test(imageView, R.drawable.clean)
        }

        playbtn3.setOnClickListener {
            test(imageView, R.drawable.play)

        }
    }

    private fun test(imageView: ImageView, drawableId: Int) {
        imageView.setImageResource(drawableId)
    }



    }
}