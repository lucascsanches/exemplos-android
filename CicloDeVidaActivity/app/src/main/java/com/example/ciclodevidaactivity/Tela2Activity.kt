package com.example.ciclodevidaactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class Tela2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        val pessoa = intent.getParcelableExtra<Pessoa>("pessoa")
        if (pessoa != null) {
            findViewById<TextView>(R.id.textNome).text = pessoa.nome
            findViewById<TextView>(R.id.textIdade).text = pessoa.idade.toString()
        }

        Log.i("NGVL", "Tela2::onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i("NGVL", "Tela2::onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("NGVL", "Tela2::onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("NGVL", "Tela2::onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("NGVL", "Tela2::onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("NGVL", "Tela2::onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("NGVL", "Tela2::onDestroy")
    }

}