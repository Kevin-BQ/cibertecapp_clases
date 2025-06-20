package com.cibertec.cibertecapp.news

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.cibertec.cibertecapp.R

// Administrar cada elemento
class NoticiasViewHolder(
    inflater: LayoutInflater,
    parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_news, parent, false)) {

    private val img: ImageView = itemView.findViewById(R.id.img)
    private val txtTitulo: TextView = itemView.findViewById(R.id.txtnews)
    private val txtDescripcion: TextView = itemView.findViewById(R.id.txtde)

    fun data(noticia: Noticia) {
        txtTitulo.text = noticia.titulo
        txtDescripcion.text = noticia.descripcion
        img.setImageResource(noticia.imagen)
    }

}