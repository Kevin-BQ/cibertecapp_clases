package com.cibertec.cibertecapp.NBA

import android.os.Bundle
import android.view.View
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cibertec.cibertecapp.R
import com.cibertec.cibertecapp.playstore.App
import com.cibertec.cibertecapp.playstore.AppAdapter

class NbaActivity: Fragment(R.layout.activity_competition) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerCompeticiones)

        val lista = arrayListOf(
            Competition("Final",
                listOf(
                    Equipo("Lakers", 98, R.drawable.bembos_logo),
                    Equipo("Celtics", 102, R.drawable.baseline_cloud_24)
                )
            ),
            Competition("Semifinal",
                listOf(
                    Equipo("Bulls", 91, R.drawable.logo_cibertec),
                    Equipo("Heat", 88, R.drawable.plato)
                )
            ),
            Competition("Final",
                listOf(
                    Equipo("Lakers", 98, R.drawable.bembos_logo),
                    Equipo("Celtics", 102, R.drawable.baseline_cloud_24)
                )
            ),
            Competition("Semifinal",
                listOf(
                    Equipo("Bulls", 91, R.drawable.logo_cibertec),
                    Equipo("Heat", 88, R.drawable.plato)
                )
            ),
            Competition("Final",
                listOf(
                    Equipo("Lakers", 98, R.drawable.bembos_logo),
                    Equipo("Celtics", 102, R.drawable.baseline_cloud_24)
                )
            )
        )

        val adapter = NbaAdapter(lista)

        recyclerView.adapter = adapter

        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        //recyclerView.layoutManager = LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)

        //recyclerView.layoutManager = GridLayoutManager(this, 2)
        //recyclerView.layoutManager = StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)

    }
}