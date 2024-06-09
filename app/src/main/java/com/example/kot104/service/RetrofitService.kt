package com.example.kot104.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

open class RetrofitService {
    private val retrofit: Retrofit = Retrofit.Builder()
        //.baseUrl("http://10.0.2.2:3000/")
        .baseUrl("https://66654fa7d122c2868e404b30.mockapi.io/api/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val movieService: MovieService by lazy {
        retrofit.create(MovieService::class.java)
    }
}