package com.cibertec.cibertecapp.news

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

// Gestionar todos los elementos
class NoticiasAdapter(val listaNoticia: List<Noticia>):
    RecyclerView.Adapter<NoticiasViewHolder>() {

    // Inicializar el viewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoticiasViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return NoticiasViewHolder(inflater, parent)
    }

    // Indicar el numero de elementos a mostrar
    override fun getItemCount(): Int {
        return listaNoticia.size
    }

    // Asignar datos al viewHolder
    override fun onBindViewHolder(holder: NoticiasViewHolder, position: Int) {
        val noticia = listaNoticia[position]
        holder.data(noticia)
    }

}