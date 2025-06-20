package com.cibertec.cibertecapp.playstore

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.cibertec.cibertecapp.R
import com.cibertec.cibertecapp.news.Noticia

class AppViewHolder (
    inflater: LayoutInflater,
    parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_app, parent, false)) {

    private val img: ImageView = itemView.findViewById(R.id.imgapp)
    private val txtTitulo: TextView = itemView.findViewById(R.id.appname)
    private val txtDescripcion: TextView = itemView.findViewById(R.id.appdowload)

    fun data(app: App) {
        txtTitulo.text = app.name
        txtDescripcion.text = app.download
        img.setImageResource(app.logo)
    }

}