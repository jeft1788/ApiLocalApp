package com.example.apilocalapp

import android.content.Context
import android.widget.Toast
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class Config {
    private val BASEURL = "http://192.168.56.1/arequipa/public/api/"
    private var retrofit: Retrofit? = null
    fun getRetrofit(): Retrofit? {
        if (retrofit == null) {
            retrofit = Retrofit.Builder()
                .baseUrl(BASEURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
        return retrofit
    }
    fun Mensaje(context: Context?, mensaje: String?) {
        Toast.makeText(context, mensaje, Toast.LENGTH_LONG).show()
    }

}
