package com.example.weatherexample.models

import java.io.Serializable

/**
 * @Author: Kamran Khan
 * @Date: 01,February,2023
 * @Accounts
 *      -> https://stackoverflow.com/users/17921670/kamran-khan
 */
data class Weather(
    val id : Int,
    val main : String,
    val description : String,
    val icon : String,
) : Serializable