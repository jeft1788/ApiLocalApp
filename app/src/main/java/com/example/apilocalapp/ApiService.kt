package com.example.apilocalapp

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST


interface ApiService {
    @GET("publicaciones")
    fun getPublicaciones(): Call<List<Publicaciones?>?>?

    @POST("publicaciones")
    @FormUrlEncoded
    fun savePublicacion(
        @Field("nombre") nombre: String?,
        @Field("descripcion") descripcion: String?
    ): Call<Publicaciones?>?
}