package com.example.myapplication.data

import com.example.myapplication.data.models.CurrentWeather
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {
    @GET("weather?")
    suspend fun getCurrentWeather(

        @Query("q") city : String,
        @Query("units") unit : String,
        @Query("appid") apiKey : String,

        ): Response<CurrentWeather>
}
