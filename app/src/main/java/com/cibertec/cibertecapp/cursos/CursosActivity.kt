package com.cibertec.cibertecapp.cursos

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.cibertec.cibertecapp.R

class CursosActivity: Fragment(R.layout.activity_cursos) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerCursos)

        val listaCursos = arrayListOf(
            Curso(R.drawable.plato, "Curso de Android"),
            Curso(R.drawable.plato, "Curso de iOS"),
            Curso(R.drawable.plato, "Curso de Java"),
            Curso(R.drawable.plato, "Curso de Kotlin"),
            Curso(R.drawable.plato, "Curso de Python"),
            Curso(R.drawable.plato, "Curso de PHP"),
            Curso(R.drawable.plato, "Curso de C#"),
            Curso(R.drawable.plato, "Curso de C++"),
        )

        val adapter = CursosAdapter(listaCursos)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        // recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)

        //recyclerView.layoutManager = GridLayoutManager(this, 2)
        //recyclerView.layoutManager = StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)

    }
}