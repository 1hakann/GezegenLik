package com.badlogic.androidgames.gezegenos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_gezegenler_bilgi.*
import kotlinx.android.synthetic.main.tek_satir.*

class GezegenlerBilgi : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gezegenler_bilgi)

        var GezAdi = resources.getStringArray(R.array.Gezegenler)
        var GezAciklama = resources.getStringArray(R.array.Aciklamalar)
        var GezRes = arrayOf(R.drawable.mercury, R.drawable.venus, R.drawable.earth, R.drawable.mars, R.drawable.jupiter, R.drawable.saturn,
            R.drawable.uranus, R.drawable.neptun, R.drawable.pluto)

        var myAdapter = GezegenArrayAdapter(this, R.layout.tek_satir, R.id.tvGezAdi, GezAdi, GezAciklama, GezRes)
        listView.adapter = myAdapter
        listView.setOnItemClickListener { parent, view, position, id ->

            var gecici = view as TextView
            Toast.makeText(this@GezegenlerBilgi, "Gezegen: "+gecici.text.toString() +" position: "+position, Toast.LENGTH_SHORT)
        }


    }


}