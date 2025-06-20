package com.cibertec.cibertecapp.weather

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.cibertec.cibertecapp.R


class ClimaViewHolder(
    inflater: LayoutInflater,
    parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_weather1, parent, false)) {

    private val img: ImageView = itemView.findViewById(R.id.img)
    private val txtTitulo: TextView = itemView.findViewById(R.id.title)
    private val txtDescripcion: TextView = itemView.findViewById(R.id.info)

    fun data(clima: Clima) {
        txtTitulo.text = clima.title
        txtDescripcion.text = clima.temperatura
        img.setImageResource(clima.icono)
    }

}

class Clima2ViewHolder(
    inflater: LayoutInflater,
    parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_weather2, parent, false)) {

    private val img: ImageView = itemView.findViewById(R.id.img)
    private val txtDescripcion: TextView = itemView.findViewById(R.id.info)

    fun data(infoExtra: InfoExtra) {
        txtDescripcion.text = infoExtra.descripcion
        img.setImageResource(infoExtra.icono)
    }

}