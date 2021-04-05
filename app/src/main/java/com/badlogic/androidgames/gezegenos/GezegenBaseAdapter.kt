package com.badlogic.androidgames.gezegenos

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.tek_satir.view.*

class GezegenBaseAdapter(context: Context, tumGezBilgileri:ArrayList<Gezegen>) : BaseAdapter() {
    var tumGezegenler:ArrayList<Gezegen>
    var context:Context

    init {
        this.tumGezegenler = tumGezBilgileri
        this.context = context
    }


    override fun getCount(): Int {
        return tumGezegenler.size
    }

    override fun getItem(position: Int): Any {
        return tumGezegenler.get(position)
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        var tek_satir_view = convertView
        var viewHolder:ViewHolder2

        if(tek_satir_view == null) {
            var myInflater = LayoutInflater.from(context)
            tek_satir_view = myInflater.inflate(R.layout.tek_satir, parent, false)
            Log.e("TEST","inflation applied ${tek_satir_view.tvGezAdi}")
            viewHolder = ViewHolder2(tek_satir_view)
            tek_satir_view.tag = viewHolder
        } else {
            viewHolder = tek_satir_view.getTag() as ViewHolder2
        }

        viewHolder.gezAdi.setText(tumGezegenler.get(position).gezAdi)
        viewHolder.gezAciklama.setText(tumGezegenler.get(position).gezAciklama)
        viewHolder.gezImg.setImageResource(tumGezegenler.get(position).gezImg)

        return tek_satir_view
    }

    class ViewHolder2(tek_satir_view:View) {

        var gezAdi:TextView
        var gezAciklama:TextView
        var gezImg:ImageView

        init {
            this.gezAdi = tek_satir_view.tvGezAdi
            this.gezAciklama = tek_satir_view.tvGezAcikl
            this.gezImg = tek_satir_view.ivGezegen
        }

    }
}