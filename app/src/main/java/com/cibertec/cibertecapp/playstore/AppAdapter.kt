package com.cibertec.cibertecapp.playstore

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AppAdapter(val listaApp: List<App>):
    RecyclerView.Adapter<AppViewHolder>() {

    // Inicializar el viewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return AppViewHolder(inflater, parent)
    }

    // Indicar el numero de elementos a mostrar
    override fun getItemCount(): Int {
        return listaApp.size
    }

    // Asignar datos al viewHolder
    override fun onBindViewHolder(holder: AppViewHolder, position: Int) {
        val app = listaApp[position]
        holder.data(app)
    }

}