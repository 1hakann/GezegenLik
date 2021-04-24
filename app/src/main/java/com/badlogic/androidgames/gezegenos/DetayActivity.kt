package com.badlogic.androidgames.gezegenos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class DetayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detay)

       // val myText : TextView = findViewById(R.id.tvDetayAciklama)
        val gezegenBilgi = intent.extras?.get("GezegenBilgi") as ArrayList<Gezegen>
       // myText.text = intent.extras?.get("GezegenBilgi").toString()


        //Toast.makeText(this, "gezegen sayısı: "+gezegenBilgi.toString(), Toast.LENGTH_LONG).show()
    }
}