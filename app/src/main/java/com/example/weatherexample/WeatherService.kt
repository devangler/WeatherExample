package com.example.weatherexample

import com.example.weatherexample.models.WeatherResponse
import retrofit.Call
import retrofit.http.GET
import retrofit.http.Query

/**
 * @Author: Kamran Khan
 * @Date: 01,February,2023
 * @Accounts
 *      -> https://stackoverflow.com/users/17921670/kamran-khan
 */
interface WeatherService {
    @GET("2.5/weather")
    fun getWeather(
        @Query("lat") lat : Double,
        @Query("lon") lon : Double,
        @Query("appid") appid : String,
        @Query("lang") lang : String,
        @Query("units") units : String
    ) : Call<WeatherResponse>
}