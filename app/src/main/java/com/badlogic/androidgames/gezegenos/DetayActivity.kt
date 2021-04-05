package com.badlogic.androidgames.gezegenos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detay)

        val myText : TextView = findViewById(R.id.tvDetayAdi)
        myText.text = intent.extras?.get("Gönder").toString()
    }
}