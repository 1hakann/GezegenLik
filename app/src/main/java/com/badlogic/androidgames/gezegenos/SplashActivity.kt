package com.badlogic.androidgames.gezegenos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        var asagidanGelenButton = AnimationUtils.loadAnimation(this, R.anim.fromdowntoupbutton)
        var donenImage = AnimationUtils.loadAnimation(this, R.anim.rotateimage)
        var yukaridanGelenButton = AnimationUtils.loadAnimation(this, R.anim.fromuptodownbutton)
        var asagidanGelenImage = AnimationUtils.loadAnimation(this, R.anim.fromdowntoupimage)


        btnGiris.animation = asagidanGelenButton
        ivsplash.animation = donenImage

        btnGiris.setOnClickListener {
            btnGiris.animation = yukaridanGelenButton
            ivsplash.animation = asagidanGelenImage

            object : CountDownTimer(1000, 1000)
            {
                override fun onTick(millisUntilFinished: Long) {

                }

                override fun onFinish() {
                    var intent = Intent(applicationContext, OptionActivity::class.java)
                    startActivity(intent)
                }

            }.start()

        }

    }
}