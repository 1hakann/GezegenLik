package com.badlogic.androidgames.gezegenos

import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    // 6- View.OnCLickListener implemente ediyoruz. tıklanma olayları için.
    // 1- Sabitlerimizi ekleyelim
    val KgToPound = 2.2046226218
    val PoundToKg = 0.45359237

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

        Glide.with(this).load(R.drawable.solar_system).into(imageView2)

        //- dinleyicileri ekleyelim
        cBmercury.setOnClickListener(this)
        cBvenus2.setOnClickListener(this)
        cBearth2.setOnClickListener(this)
        cBmars.setOnClickListener(this)
        cBjupiter2.setOnClickListener(this)
        cBsaturn.setOnClickListener(this)
        cBuranus.setOnClickListener(this)
        cBneptun.setOnClickListener(this)
        cBpluto.setOnClickListener(this)

        // 2- Değişkenlerimizi tanımlayalım //9- başl. eklediğimiz değişkenleri kaldırdık. null değer dönmesine sebp olacak çünkü. yenisini ekliyoruz.
        //val etSonuc = findViewById<TextView>(R.id.tvSonuc) && userKg = ptInput.text.toString()

        // 4- Butona işlev kazandıralım //btn kaldırıldı
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

    // 7- İmp. metoumuzu kodlayalım 10-// pt boş iken hata versin istemiyoruz
        override fun onClick(v: View?) {
        v as CheckBox
        var isChecked:Boolean = v.isChecked

        if (!TextUtils.isEmpty(ptInput.text.toString()))
        {
            var userKg = ptInput.text.toString().toDouble()
            var userPound = kiloToPound(userKg)

            when(v.id) {
                R.id.cBmercury -> if(isChecked) {
                    hesaplaPound(userPound, v)
                    cBvenus2.isChecked = false
                    cBmars.isChecked = false
                    cBearth2.isChecked = false
                    cBjupiter2.isChecked = false
                    cBsaturn.isChecked = false
                    cBneptun.isChecked = false
                    cBuranus.isChecked = false
                    cBpluto.isChecked = false

                }
                R.id.cBvenus2 -> if(isChecked) {
                    hesaplaPound(userPound, v)
                    cBmercury.isChecked = false
                    cBmars.isChecked = false
                    cBearth2.isChecked = false
                    cBjupiter2.isChecked = false
                    cBsaturn.isChecked = false
                    cBneptun.isChecked = false
                    cBuranus.isChecked = false
                    cBpluto.isChecked = false

                }
                R.id.cBearth2 -> if(isChecked) {
                    hesaplaPound(userPound, v)
                    cBvenus2.isChecked = false
                    cBmars.isChecked = false
                    cBmercury.isChecked = false
                    cBjupiter2.isChecked = false
                    cBsaturn.isChecked = false
                    cBneptun.isChecked = false
                    cBuranus.isChecked = false
                    cBpluto.isChecked = false

                }
                R.id.cBmars -> if(isChecked) {
                    hesaplaPound(userPound, v)
                    cBvenus2.isChecked = false
                    cBmercury.isChecked = false
                    cBearth2.isChecked = false
                    cBjupiter2.isChecked = false
                    cBsaturn.isChecked = false
                    cBneptun.isChecked = false
                    cBuranus.isChecked = false
                    cBpluto.isChecked = false

                }
                R.id.cBjupiter2-> if(isChecked) {
                    hesaplaPound(userPound, v)
                    cBvenus2.isChecked = false
                    cBmars.isChecked = false
                    cBearth2.isChecked = false
                    cBmercury.isChecked = false
                    cBsaturn.isChecked = false
                    cBneptun.isChecked = false
                    cBuranus.isChecked = false
                    cBpluto.isChecked = false

                }
                R.id.cBsaturn -> if(isChecked) {
                    hesaplaPound(userPound, v)
                    cBvenus2.isChecked = false
                    cBmars.isChecked = false
                    cBearth2.isChecked = false
                    cBjupiter2.isChecked = false
                    cBmercury.isChecked = false
                    cBneptun.isChecked = false
                    cBuranus.isChecked = false
                    cBpluto.isChecked = false

                }
                R.id.cBuranus -> if(isChecked) {
                    hesaplaPound(userPound, v)
                    cBvenus2.isChecked = false
                    cBmars.isChecked = false
                    cBearth2.isChecked = false
                    cBjupiter2.isChecked = false
                    cBsaturn.isChecked = false
                    cBneptun.isChecked = false
                    cBmercury.isChecked = false
                    cBpluto.isChecked = false

                }
                R.id.cBneptun -> if(isChecked) {
                    hesaplaPound(userPound, v)
                    cBvenus2.isChecked = false
                    cBmars.isChecked = false
                    cBearth2.isChecked = false
                    cBjupiter2.isChecked = false
                    cBsaturn.isChecked = false
                    cBmercury.isChecked = false
                    cBuranus.isChecked = false
                    cBpluto.isChecked = false

                }
                R.id.cBpluto -> if(isChecked) {
                    hesaplaPound(userPound, v)
                    cBvenus2.isChecked = false
                    cBmars.isChecked = false
                    cBearth2.isChecked = false
                    cBjupiter2.isChecked = false
                    cBsaturn.isChecked = false
                    cBneptun.isChecked = false
                    cBuranus.isChecked = false
                    cBmercury.isChecked = false
                }
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
        tvSonuc.text = sonucToKg.formatter(2)

    }
}