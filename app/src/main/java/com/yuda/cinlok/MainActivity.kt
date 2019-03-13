package com.yuda.cinlok

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.yuda.cinlok.R
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_putar.setOnClickListener { Pasangan() }

    }

    private fun Pasangan() {
        val randomCowok = Random().nextInt(3) + 1
        val randomCewek = Random().nextInt(3) + 1
        val drawableResCowok = when (randomCowok) {
            1 -> R.drawable.pa1
            2 -> R.drawable.pa3
            else -> R.drawable.pa5
        }
        val drawableResCewek = when (randomCewek) {
            1 -> R.drawable.pi1
            2 -> R.drawable.pi3
            else -> R.drawable.pi5
        }

        ivDadu1.setImageResource(drawableResCowok)
        ivDadu2.setImageResource(drawableResCewek)
    }
}

