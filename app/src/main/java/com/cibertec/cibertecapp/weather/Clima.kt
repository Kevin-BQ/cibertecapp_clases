package com.cibertec.cibertecapp.weather

interface WeatherListItem {
}

data class Clima(
    val title: String,
    val temperatura: String,
    val icono: Int
) : WeatherListItem

data class InfoExtra(
    val icono: Int,
    val descripcion: String
) : WeatherListItem