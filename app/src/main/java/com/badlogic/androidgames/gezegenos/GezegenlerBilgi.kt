package com.badlogic.androidgames.gezegenos

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_gezegenler_bilgi.*

class GezegenlerBilgi : AppCompatActivity() {

    lateinit var tumGezBilgileri:ArrayList<Gezegen>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gezegenler_bilgi)

        PlanetsDataSource()

        var myBaseAdapter = GezegenBaseAdapter(this, tumGezBilgileri)
        listPlanets.adapter = myBaseAdapter

        listPlanets.setOnItemClickListener { parent, view, position, id ->
                var myIntent = Intent(this@GezegenlerBilgi, DetayActivity::class.java)
                myIntent.putExtra("GezegenBilgi",tumGezBilgileri)
                myIntent.putExtra("Gönder",position)
                startActivity(myIntent)
            }
        }

    private fun PlanetsDataSource() {

        tumGezBilgileri = ArrayList<Gezegen>(9)

        var GezAdi = resources.getStringArray(R.array.Gezegenler)
        var GezAciklama = resources.getStringArray(R.array.Baslik)
        var GezRes = arrayOf(R.drawable.mercury, R.drawable.venus, R.drawable.earth, R.drawable.mars, R.drawable.jupiter, R.drawable.saturn,
            R.drawable.uranus, R.drawable.neptun, R.drawable.pluto)
        var GezIcerikRes = arrayOf(R.drawable.pmercur, R.drawable.pvenus, R.drawable.pearth, R.drawable.pmars, R.drawable.pjupiter, R.drawable.psaturn,
        R.drawable.puranus, R.drawable.pneptun, R.drawable.ppluto)
        var GezGenelOzell = resources.getStringArray(R.array.GezAciklama)

        for (i in 0..8) {
            var arrayListeEklenecekler = Gezegen(GezAdi[i], GezAciklama[i], GezRes[i], GezIcerikRes[i], GezGenelOzell[i])
            tumGezBilgileri.add(arrayListeEklenecekler)
            }
        }
    }