package com.example.recipeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Looper
import java.util.logging.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        android.os.Handler(Looper.getMainLooper())
            .postDelayed(
                {
                    startActivity(Intent(this,HomeActivity::class.java))
                    finish()
                },2000
            )
    }
}