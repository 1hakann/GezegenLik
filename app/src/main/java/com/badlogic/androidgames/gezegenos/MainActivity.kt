package com.badlogic.androidgames.gezegenos

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //  1- Sabitlerimizi ekleyelim
    val KgToPound = 2.2046226218
    val PoundToKg = 0.45359237
    val Mercury = 0.38

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 2- Değişkenlerimizi tanımlayalım
        //val userKg = findViewById<TextView>(R.id.ptInput)
        var userKg = ptInput.text
        //val btnHesapla = findViewById<Button>(R.id.btnHesapla)
        //val etSonuc = findViewById<TextView>(R.id.tvSonuc)


        // 4- Butona işlev kazandıralım
        btnHesapla.setOnClickListener {
            var userPound = kiloToPound(userKg.toString().toDouble())
            var mercuryPound = userPound * Mercury
            var mercuryKg = poundToKilo(mercuryPound)

            // 6- formatter metodunu ekleyelim
            tvSonuc.text = mercuryKg.formatter(2).toString()
        }
    }

    // 3 - Dönüştürücü func. ı50mızı yazalım
    fun kiloToPound(kilo: Double) : Double {
        return kilo * KgToPound
    }

    fun poundToKilo(pound: Double) : Double {
        return pound * PoundToKg
    }

    // 5- sonuç sayının virgülden sonraki göstermek istediğimiz basamak mikt. belirliyoruz
    fun Double.formatter(numberCount:Int) = java.lang.String.format("%.${numberCount}f", this)
}