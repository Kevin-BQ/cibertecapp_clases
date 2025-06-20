package com.cibertec.cibertecapp.NBA

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.cibertec.cibertecapp.R

class NbaViewHolder (
    inflater: LayoutInflater,
    parent: ViewGroup) :
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_vs, parent, false)) {

    val txtCompetition: TextView = itemView.findViewById(R.id.txtCompetition)

    private val equipo1View = itemView.findViewById<View>(R.id.equipo1)
    private val img1 = equipo1View.findViewById<ImageView>(R.id.imgEquipo)
    private val name1 = equipo1View.findViewById<TextView>(R.id.nameEquipo)
    private val score1 = equipo1View.findViewById<TextView>(R.id.scoreEquipo)

    private val equipo2View = itemView.findViewById<View>(R.id.equipo2)
    private val img2 = equipo2View.findViewById<ImageView>(R.id.imgEquipo)
    private val name2 = equipo2View.findViewById<TextView>(R.id.nameEquipo)
    private val score2 = equipo2View.findViewById<TextView>(R.id.scoreEquipo)

    fun data(competition: Competition) {
        val equipo1 = competition.equipos[0]
        val equipo2 = competition.equipos[1]

        txtCompetition.text = competition.nombre

        name1.text = equipo1.nombre
        score1.text = equipo1.puntos.toString()
        img1.setImageResource(equipo1.imagen)

        name2.text = equipo2.nombre
        score2.text = equipo2.puntos.toString()
        img2.setImageResource(equipo2.imagen)
    }

}