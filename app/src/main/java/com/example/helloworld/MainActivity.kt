package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helloBtn: Button = findViewById(R.id.helloBtn)

        helloBtn.setOnClickListener {
            Log.i("helloBtn", "Button Clicked!")
            Toast.makeText(this, "Hello there!", Toast.LENGTH_SHORT).show()
        }
    }
}