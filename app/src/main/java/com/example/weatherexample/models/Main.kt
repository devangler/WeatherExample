package com.example.weatherexample.models

import java.io.Serializable

/**
 * @Author: Kamran Khan
 * @Date: 01,February,2023
 * @Accounts
 *      -> https://stackoverflow.com/users/17921670/kamran-khan
 */
data class Main (
    val temp: Double,
    val feels_like: Double,
    val temp_min: Double,
    val temp_max: Double,
    val pressure: Int,
    val humidity: Int
) : Serializable