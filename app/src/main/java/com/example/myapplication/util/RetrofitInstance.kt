package com.example.myapplication.util

import com.example.myapplication.api.ApiServices
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private val retrofit by lazy {
        Retrofit
            .Builder()
            .baseUrl("https://ipapi.co/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val apiService: ApiServices by lazy {
        retrofit.create(ApiServices::class.java)
    }
}