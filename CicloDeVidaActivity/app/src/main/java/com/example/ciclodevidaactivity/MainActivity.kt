package com.example.ciclodevidaactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import android.util.Log
import android.widget.Button

@Parcelize
data class Pessoa(val nome: String, val idade: Int) : Parcelable


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("NGVL", "Tela1::onCreate")

        val buttonTela2 = findViewById<Button>(R.id.buttonTela2)
        buttonTela2.setOnClickListener {
            val intent = Intent(this, Tela2Activity::class.java)
            intent.putExtra("pessoa", Pessoa("Lucas",22))
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("NGVL", "Tela1::onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("NGVL", "Tela1::onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("NGVL", "Tela1::onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("NGVL", "Tela1::onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("NGVL", "Tela1::onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("NGVL", "Tela1::onDestroy")
    }

}