package com.example.myapplication.api

import com.example.myapplication.model.IpInfo
import retrofit2.http.GET

interface ApiServices {
    @GET("json/")
    suspend fun getIpInfo() : IpInfo
}