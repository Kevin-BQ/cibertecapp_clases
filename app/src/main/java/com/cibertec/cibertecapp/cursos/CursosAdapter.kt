package com.cibertec.cibertecapp.cursos

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

// Gestionar todos los elementos
class CursosAdapter(val listaCursos: List<Curso>):
    RecyclerView.Adapter<CursosViewHolder>() {

    // Inicializar el viewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CursosViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return CursosViewHolder(inflater, parent)
    }

    // Indicar el numero de elementos a mostrar
    override fun getItemCount(): Int {
        return listaCursos.size
    }

    // Asignar datos al viewHolder
    override fun onBindViewHolder(holder: CursosViewHolder, position: Int) {
        val curso = listaCursos[position]
        holder.data(curso)
    }

}