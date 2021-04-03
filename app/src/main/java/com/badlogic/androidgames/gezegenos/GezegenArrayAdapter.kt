package com.badlogic.androidgames.gezegenos

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.tek_satir.view.*

class GezegenArrayAdapter(var gelenContext: Context, resource: Int, textViewResourceId: Int, var Gezegenler:Array<String>, var GezAciklama:Array<String>, var GezRes:Array<Int>)
    : ArrayAdapter<String>(gelenContext, resource, textViewResourceId, Gezegenler) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tek_satir_view = convertView
        if (tek_satir_view == null) {
            val myInflater = LayoutInflater.from(gelenContext)
            tek_satir_view = myInflater.inflate(R.layout.tek_satir, parent, false)
            Log.e("HAKAN","Inflation Yapıldı ${Gezegenler[position]}")
        }

        var gezegenAdi = tek_satir_view?.tvGezAdi
        var gezAciklama = tek_satir_view?.tvGezAcikl
        var gezResim = tek_satir_view?.ivGezegen

        gezegenAdi?.setText(Gezegenler[position])
        gezAciklama?.setText(GezAciklama[position])
        gezResim?.setImageResource(GezRes[position])

        return tek_satir_view!!
    }
}