package com.badlogic.androidgames.gezegenos

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.palette.graphics.Palette
import kotlinx.android.synthetic.main.activity_detay.*

class DetayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detay)

        val myText : TextView = findViewById(R.id.tvGezOzellikleri)
        val position = intent.extras?.get("Gönder") as Int
        val gezegenBilgi = intent.extras?.get("GezegenBilgi") as ArrayList<Gezegen>
        myText.setText(gezegenBilgi.get(position).GezGenelOzell)
        header.setImageResource(gezegenBilgi.get(position).gezIcerikRes)

        setSupportActionBar(anim_toolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        collapsing_toolbar.title = gezegenBilgi.get(position).gezAdi

        var bitmap = BitmapFactory.decodeResource(resources, gezegenBilgi.get(position).gezIcerikRes)
        Palette.from(bitmap).generate(object : Palette.PaletteAsyncListener{
            override fun onGenerated(palette: Palette?) {
                var color = palette?.getVibrantColor(R.attr.colorAccent)
                collapsing_toolbar.setContentScrimColor(color!!)
                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                    window.statusBarColor = color
                }

            }

        })



        //Toast.makeText(this, "gezegen sayısı: "+gezegenBilgi.toString(), Toast.LENGTH_LONG).show()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}