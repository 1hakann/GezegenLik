package com.badlogic.androidgames.gezegenos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_option.*

class OptionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_option)

        btnKilo.setOnClickListener {
            var intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }

        btnInfo.setOnClickListener {
            var intent = Intent(applicationContext, GezegenlerBilgi::class.java)
            startActivity(intent)
        }
    }
}