package com.example.apilocalapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Call

class PublicacionesActivity : AppCompatActivity() {
    lateinit var config: Config
    var servicio: ApiService? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_publicaciones)

        val n = findViewById<EditText>(R.id.nombre)
        val d = findViewById<EditText>(R.id.descripcion)
        val btnSave = findViewById<Button>(R.id.btnSave)
        getPublicaciones();
        btnSave.setOnClickListener {
            if(n.text.toString().isEmpty())
                config.Mensaje(getApplicationContext(),"INGRESE NOMBRE");
            else if(d.text.toString().isEmpty())
                config.Mensaje(getApplicationContext(),"INGRESE DESCRIPCIÓN");
            else{
                servicio?.savePublicacion(
                    n.text.toString(),
                    d.text.toString()
                );
            }
        }
    }

    private fun getPublicaciones() {
        val n : String? = null
        val d : String? = null





        val call: Call<Publicaciones?>? = servicio?.savePublicacion(n, d)
    }
}