package com.cibertec.cibertecapp.playstore

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cibertec.cibertecapp.R

class AppActivity: Fragment(R.layout.play_store) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerPlayStore)
        val recyclerView2 = view.findViewById<RecyclerView>(R.id.recyclerSugerencias)
        val recyclerView3 = view.findViewById<RecyclerView>(R.id.recyclerOtrasApps)
        val recyclerView4 = view.findViewById<RecyclerView>(R.id.recyclerExtraApps)

        val listaApp = arrayListOf(
            App(R.drawable.bembos_logo, "Bembos", "60MB"),
            App(R.drawable.plato, "Android", "60MB"),
            App(R.drawable.logo_cibertec, "Cibertec", "60MB"),
            App(R.drawable.baseline_book_24, "Cursos", "60MB"),
            App(R.drawable.favorito, "Favoritos", "60MB"),
            App(R.drawable.baseline_cloud_24, "Cloud", "60MB"),
        )

        val appsRecientes = listaApp.shuffled()
        val appsSugeridas = listaApp.shuffled()
        val appsOtras = listaApp.shuffled()
        val appsExtra = listaApp.shuffled()

        val adapter = AppAdapter(appsRecientes)
        val adapter2 = AppAdapter(appsSugeridas)
        val adapter3 = AppAdapter(appsOtras)
        val adapter4 = AppAdapter(appsExtra)

        recyclerView.adapter = adapter
        recyclerView2.adapter = adapter2
        recyclerView3.adapter = adapter3
        recyclerView4.adapter = adapter4

        // recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)
        recyclerView2.layoutManager = LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)
        recyclerView3.layoutManager = LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)
        recyclerView4.layoutManager = LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)

        //recyclerView.layoutManager = GridLayoutManager(this, 2)
        //recyclerView.layoutManager = StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)

    }
}