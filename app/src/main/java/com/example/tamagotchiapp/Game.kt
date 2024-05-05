package com.example.tamagotchiapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.appcompat.app.AppCompatActivity

class Game : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        val imageView = findViewById<ImageView>(R.id.imageView)
        val feedbtn1 = findViewById<Button>(R.id.feedbtn1)
        val cleanbtn2 = findViewById<Button>(R.id.cleanbtn2)
        val playbtn3 = findViewById<Button>(R.id.playbtn3)
        val progressbar1 = findViewById<ProgressBar>(R.id.progressBar1)
        val progressbar2 = findViewById<ProgressBar>(R.id.progressBar2)
        val progressBar3 = findViewById<ProgressBar>(R.id.progressBar3)
        imageView.setImageResource(R.drawable.capture111)

        feedbtn1.setOnClickListener {
            test(imageView, R.drawable.eat)
            updateHungerProgress(progressbar1)
        }

        cleanbtn2.setOnClickListener {
            test(imageView, R.drawable.clean)
            updatecleanProgress(progressbar2)
        }
        playbtn3.setOnClickListener {
            test(imageView, R.drawable.play)
            updateplayProgress(progressBar3)
        }

        feedbtn1.setOnClickListener {
            test(imageView, R.drawable.eat)
        }

        cleanbtn2.setOnClickListener {
            test(imageView, R.drawable.clean)
        }

        playbtn3.setOnClickListener {
            test(imageView, R.drawable.play)

        }
    }

    private fun updateHungerProgress(progressBar: ProgressBar){
        if (progressBar.progress + 10 <= progressBar.max){
            progressBar.progress += 10
        } else {
            progressBar.progress = progressBar.max
        }
    }

    private fun updateplayProgress(progressBar: ProgressBar){
        if (progressBar.progress + 10 <= progressBar.max){
            progressBar.progress += 10
        } else {
            progressBar.progress = progressBar.max
        }
    }
    private fun updatecleanProgress(progressBar: ProgressBar){
        if (progressBar.progress + 10 <= progressBar.max){
            progressBar.progress += 10
        } else {
            progressBar.progress = progressBar.max
        }
    }
    private fun test(imageView: ImageView, drawableId: Int) {
        imageView.setImageResource(drawableId)
    }



    }
