package com.badlogic.androidgames.gezegenos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_detay.*

class DetayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detay)

        val myText : TextView = findViewById(R.id.tvGezOzellikleri)
        val position = intent.extras?.get("Gönder") as Int
        val gezegenBilgi = intent.extras?.get("GezegenBilgi") as ArrayList<Gezegen>
        myText.setText(gezegenBilgi.get(position).GezGenelOzell)


        //Toast.makeText(this, "gezegen sayısı: "+gezegenBilgi.toString(), Toast.LENGTH_LONG).show()
    }
}