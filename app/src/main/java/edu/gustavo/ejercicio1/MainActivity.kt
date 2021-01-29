package edu.gustavo.ejercicio1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun saltar(view:View) {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }
}