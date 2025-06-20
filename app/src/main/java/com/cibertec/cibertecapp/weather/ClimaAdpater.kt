package com.cibertec.cibertecapp.weather

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MixedWeatherAdapter(private val items: List<WeatherListItem>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val TYPE_CLIMA = 1
    private val TYPE_INFO = 2

    override fun getItemViewType(position: Int): Int {
        return when (items[position]) {
            is Clima -> TYPE_CLIMA
            is InfoExtra -> TYPE_INFO
            else -> throw IllegalArgumentException("Tipo desconocido")
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return when (viewType) {
            TYPE_CLIMA -> ClimaViewHolder(inflater, parent)
            TYPE_INFO -> Clima2ViewHolder(inflater, parent)
            else -> throw IllegalArgumentException("Tipo de vista inválido")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (val item = items[position]) {
            is Clima -> (holder as ClimaViewHolder).data(item)
            is InfoExtra -> (holder as Clima2ViewHolder).data(item)
        }
    }

    override fun getItemCount(): Int = items.size
}

