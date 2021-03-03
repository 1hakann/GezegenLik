package com.badlogic.androidgames.gezegenos

import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.CheckBox
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    // 6- View.OnCLickListener implemente ediyoruz. tıklanma olayları için.
    //  1- Sabitlerimizi ekleyelim
    val KgToPound = 2.2046226218
    val PoundToKg = 0.45359237

    var userKg : String = ""

    val Mercury = 0.38
    val Venus = 0.91
    val Earth = 1.00
    val Mars = 0.38
    val Jupiter = 2.34
    val Saturn = 1.06
    val Uranus = 0.92
    val Neptune = 1.19
    val Pluto = 0.06

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 2- Değişkenlerimizi tanımlayalım
        //val userKg = findViewById<TextView>(R.id.ptInput)
        //val btnHesapla = findViewById<Button>(R.id.btnHesapla)
        //val etSonuc = findViewById<TextView>(R.id.tvSonuc)
        userKg = ptInput.text.toString()



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

    // 7- İmp. metoumuzu kodlayalım
    override fun onClick(v: View?) {
        v as CheckBox
        var isChecked:Boolean = v.isChecked

        when(v.id) {
            R.id.cBmercury -> if(isChecked && !TextUtils.isEmpty(ptInput.toString())) {

            }
            R.id.cBvenus2 -> if(isChecked && !TextUtils.isEmpty(ptInput.toString())) {

            }
            R.id.cBearth2 -> if(isChecked && !TextUtils.isEmpty(ptInput.toString())) {

            }
            R.id.cBmars -> if(isChecked && !TextUtils.isEmpty(ptInput.toString())) {

            }
            R.id.cBjupiter2-> if(isChecked && !TextUtils.isEmpty(ptInput.toString())) {

            }
            R.id.cBsaturn -> if(isChecked && !TextUtils.isEmpty(ptInput.toString())) {

            }
            R.id.cBuranus -> if(isChecked && !TextUtils.isEmpty(ptInput.toString())) {

            }
            R.id.cBneptun -> if(isChecked && !TextUtils.isEmpty(ptInput.toString())) {

            }
            R.id.cBpluto -> if(isChecked && !TextUtils.isEmpty(ptInput.toString())) {

            }
        }
    }

    // 8 - pound türünden hesaplayalım
    fun hesaplaPound(pound: Double, checkBox: CheckBox) {
        var sonuc : Double = 0.0

        when(checkBox.id) {
            R.id.cBmercury -> sonuc = pound * Mercury
            R.id.cBvenus2 -> sonuc = pound * Venus
            R.id.cBearth2 -> sonuc = pound * Earth
            R.id.cBmars -> sonuc = pound * Mars
            R.id.cBjupiter2 -> sonuc = pound * Jupiter
            R.id.cBsaturn -> sonuc = pound * Saturn
            R.id.cBneptun -> sonuc = pound * Neptune
            R.id.cBuranus -> sonuc = pound * Uranus
            R.id.cBpluto -> sonuc = pound * Pluto
            else -> sonuc = 0.0
        }

        var sonucToKg = poundToKilo(sonuc)
        tvSonuc.text = sonucToKg.toString()

    }
}