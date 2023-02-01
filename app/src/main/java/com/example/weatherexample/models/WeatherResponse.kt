package com.example.weatherexample.models

import java.io.Serializable

/**
 * @Author: Kamran Khan
 * @Date: 01,February,2023
 * @Accounts
 *      -> https://stackoverflow.com/users/17921670/kamran-khan
 */
class WeatherResponse (

    val weather : List<Weather>,
    val main : Main,
    val wind : Wind,
    val sys : Sys,
    val name : String,
) : Serializable