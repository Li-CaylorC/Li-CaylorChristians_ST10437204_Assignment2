package com.example.tamagotchiapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView

class DogcareActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dogcare)


        val imageView = findViewById<ImageView>(R.id.imageView2)
        val feedbtn1 = findViewById<Button>(R.id.feedbtn1)
        val cleanbtn2 = findViewById<Button>(R.id.cleanbtn2)
        val playbtn3 = findViewById<Button>(R.id.playbtn3)
        val progressbar1 = findViewById<ProgressBar>(R.id.progressBar1)
        val progressbar2 = findViewById<ProgressBar>(R.id.progressBar2)
        val progressBar3 = findViewById<ProgressBar>(R.id.progressBar3)
        imageView.setImageResource(R.drawable.capture111)



        feedbtn1.setOnClickListener {
            test(imageView, R.drawable.eat,progressbar1)

        }

        cleanbtn2.setOnClickListener {
            test(imageView, R.drawable.clean,progressbar2 )

        }
        playbtn3.setOnClickListener {
            test(imageView, R.drawable.play,progressBar3)

        }
        

    }

    private fun test(imageView: ImageView, drawableId: Int,progressBar: ProgressBar) {
        imageView.setImageResource(drawableId)
        if (progressBar.progress + 10 <= progressBar.max){
            progressBar.progress += 10
        } else {
            progressBar.progress = progressBar.max
        }
    }
}
















