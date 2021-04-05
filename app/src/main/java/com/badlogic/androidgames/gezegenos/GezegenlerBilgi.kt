package com.badlogic.androidgames.gezegenos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
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
                myIntent.putExtra("Gönder",position)
                startActivity(myIntent)
            }
        }

    private fun PlanetsDataSource() {

        tumGezBilgileri = ArrayList<Gezegen>(9)

        var GezAdi = resources.getStringArray(R.array.Gezegenler)
        var GezAciklama = resources.getStringArray(R.array.Aciklamalar)
        var GezRes = arrayOf(R.drawable.mercury, R.drawable.venus, R.drawable.earth, R.drawable.mars, R.drawable.jupiter, R.drawable.saturn,
            R.drawable.uranus, R.drawable.neptun, R.drawable.pluto)

        for (i in 0..8) {
            var arrayListeEklenecekler = Gezegen(GezAdi[i], GezAciklama[i], GezRes[i])
            tumGezBilgileri.add(arrayListeEklenecekler)
            }
        }
    }