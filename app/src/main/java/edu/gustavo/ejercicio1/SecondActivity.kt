package edu.gustavo.ejercicio1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    fun volver(view: View) {
        finish()
    }

    fun cargar(view: View) {
        val imagen = findViewById<View>(R.id.imageView) as ImageView
        imagen.setImageResource(R.drawable.sample_image)
    }

    fun saltar(view: View) {
        val intent = Intent(this, ThirdActivity::class.java)
        startActivity(intent)
    }
}