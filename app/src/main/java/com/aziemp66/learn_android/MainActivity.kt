package com.aziemp66.learn_android

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
  private lateinit var nameEditText: EditText
  private lateinit var sayHelloButton: Button
  private lateinit var sayHelloTextView: TextView
  private lateinit var switchActivityButton: Button
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
//    enableEdgeToEdge()
//    ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.hello_world)) { v, insets ->
//      val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//      v.setPadding(systemBars.left, systemBars.top+30, systemBars.right, systemBars.bottom)
//      insets
//    }
    setContentView(R.layout.hello_world)

    initComponents()

    sayHelloTextView.text = "Hello World"

    sayHelloButton.setOnClickListener{
      Log.i("AMP","click say hello button")
      val name : String = nameEditText.text.toString()
      sayHelloTextView.text = "Hello World From $name"
    }

    switchActivityButton.setOnClickListener {
      val intent = Intent(this,SecondaryActivity::class.java)

      startActivity(intent)
    }
  }

  private fun initComponents(){
    nameEditText = findViewById(R.id.nameEditText)
    sayHelloButton = findViewById(R.id.sayHelloButton)
    sayHelloTextView = findViewById(R.id.sayHelloTextView)
    switchActivityButton = findViewById(R.id.switchActivityButton)
  }

}