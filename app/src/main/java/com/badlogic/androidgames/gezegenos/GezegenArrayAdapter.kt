package com.badlogic.androidgames.gezegenos

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.tek_satir.view.*

class GezegenArrayAdapter(var gelenContext: Context, resource: Int, textViewResourceId: Int, var Gezegenler:Array<String>, var GezAciklama:Array<String>, var GezRes:Array<Int>)
    : ArrayAdapter<String>(gelenContext, resource, textViewResourceId, Gezegenler) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tek_satir_view = convertView
        var viewHolder:ViewHolder? = null
        if (tek_satir_view == null) {
            val myInflater = LayoutInflater.from(gelenContext)
            tek_satir_view = myInflater.inflate(R.layout.tek_satir, parent, false)
            viewHolder = ViewHolder(tek_satir_view)
            tek_satir_view.tag = viewHolder
            Log.e("HAKAN","Inflation Yapıldı ${Gezegenler[position]}")
        } else {
           // viewHolder = ViewHolder(tek_satir_view) yerine
            viewHolder = tek_satir_view.getTag() as ViewHolder

        }

        viewHolder.gezegenAdi.setText(Gezegenler[position])
        viewHolder.gezAciklama.setText(GezAciklama[position])
        viewHolder.gezResim.setImageResource(GezRes[position])

        return tek_satir_view!!
    }

    inner class ViewHolder(tek_satir_view:View) {
        var gezegenAdi : TextView
        var gezAciklama : TextView
        var gezResim : ImageView

        init {
            this.gezegenAdi = tek_satir_view.tvGezAdi
            this.gezAciklama = tek_satir_view.tvGezAcikl
            this.gezResim = tek_satir_view.ivGezegen
        }

    }
}