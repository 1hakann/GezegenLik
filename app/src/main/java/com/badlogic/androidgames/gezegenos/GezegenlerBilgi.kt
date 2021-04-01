package com.badlogic.androidgames.gezegenos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_gezegenler_bilgi.*
import kotlinx.android.synthetic.main.tek_satir.*

class GezegenlerBilgi : AppCompatActivity() {

    var Gezegenler = arrayOf("Mercury","Venus","Earth","Mars","Saturn","Jupiter","Uranus","Neptun","Pluto")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gezegenler_bilgi)

        var gezegenAdapter = ArrayAdapter<String>(this, R.layout.tek_satir, R.id.tvPlanet , Gezegenler)
        listView.adapter = gezegenAdapter
        listView.setOnItemClickListener { parent, view, position, id ->

            var gecici = view as TextView
            Toast.makeText(this@GezegenlerBilgi, "Gezegen: "+gecici.text.toString() +" position: "+position, Toast.LENGTH_SHORT)
        }


    }


}