package com.example.weatherexample.models

import java.io.Serializable

/**
 * @Author: Kamran Khan
 * @Date: 01,February,2023
 * @Accounts
 *      -> https://stackoverflow.com/users/17921670/kamran-khan
 */
data class Sys (
    val type: Int,
    val id: Long,
    val country: String,
    val sunrise: Long,
    val sunset: Long
) : Serializable