package com.cibertec.cibertecapp.NBA

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cibertec.cibertecapp.playstore.App
import com.cibertec.cibertecapp.playstore.AppViewHolder


class NbaAdapter (val listaNba: List<Competition>):
    RecyclerView.Adapter<NbaViewHolder>() {

    // Inicializar el viewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NbaViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return NbaViewHolder(inflater, parent)
    }

    // Indicar el numero de elementos a mostrar
    override fun getItemCount(): Int {
        return listaNba.size
    }

    // Asignar datos al viewHolder
    override fun onBindViewHolder(holder: NbaViewHolder, position: Int) {
        val data = listaNba[position]
        holder.data(data)
    }

}