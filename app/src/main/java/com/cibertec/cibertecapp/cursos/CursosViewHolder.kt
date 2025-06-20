package com.cibertec.cibertecapp.cursos

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.cibertec.cibertecapp.R

// Administrar cada elemento
class CursosViewHolder(
    inflater: LayoutInflater,
    parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_curso, parent, false)) {

    private val imgCurso: ImageView = itemView.findViewById(R.id.imgCurso)
    private val textCurso: TextView = itemView.findViewById(R.id.textCurso)

    fun data(curso: Curso) {
        textCurso.text = curso.nombre
        imgCurso.setImageResource(curso.imagen)
    }

}