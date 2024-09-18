package com.aziemp66.learn_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondaryActivity : AppCompatActivity() {
  private lateinit var switchActivityButton: Button
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.secondary_activity)

    initializeComponent()

    switchActivityButton.setOnClickListener{
      val intent = Intent(this,MainActivity::class.java)

      startActivity(intent)
    }
  }

  private fun initializeComponent() {
    switchActivityButton = findViewById(R.id.switchActivityButton)
  }
}

