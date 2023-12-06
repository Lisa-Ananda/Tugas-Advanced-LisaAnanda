package com.example.hewanpedia

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class SplashScreenActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val backgrounding : ImageView = findViewById(R.id.imageView)
        val slideAnimation = AnimationUtils.loadAnimation(this,R.anim.slide)
        backgrounding.startAnimation(slideAnimation)

        val textView : TextView = findViewById(R.id.tvicon)
        val slideAnimation1 = AnimationUtils.loadAnimation(this,R.anim.slide)
        textView.startAnimation(slideAnimation1)


        Handler().postDelayed({
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }, 4000)
    }
}