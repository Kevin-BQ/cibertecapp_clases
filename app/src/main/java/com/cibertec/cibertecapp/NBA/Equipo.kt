package com.cibertec.cibertecapp.NBA

data class Equipo(
    val nombre: String,
    val puntos: Int,
    val imagen: Int,
)

data class Competition(
    val nombre: String,
    val equipos: List<Equipo>,
)
