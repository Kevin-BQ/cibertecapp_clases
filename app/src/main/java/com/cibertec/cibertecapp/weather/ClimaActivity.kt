package com.cibertec.cibertecapp.weather

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cibertec.cibertecapp.R

class ClimaActivity: Fragment(R.layout.weather_activity) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val recycler = view.findViewById<RecyclerView>(R.id.recyclerWeather)

        val items: List<WeatherListItem> = listOf(
            Clima("Lima", "25°C", R.drawable.baseline_cloud_24),
            InfoExtra(R.drawable.baseline_cloud_24, "Lluvia moderada por la tarde"),
            InfoExtra(R.drawable.baseline_cloud_24, "Vientos fríos"),
            Clima("Cusco", "15°C", R.drawable.baseline_cloud_24),
            InfoExtra(R.drawable.baseline_cloud_24, "Lluvia moderada por la tarde"),
            InfoExtra(R.drawable.baseline_cloud_24, "Vientos fríos"),
            Clima("Arequipa", "20°C", R.drawable.baseline_cloud_24),
            InfoExtra(R.drawable.baseline_cloud_24, "Viento fuerte"),
            InfoExtra(R.drawable.baseline_cloud_24, "Viento fuerte"),
            Clima("Ica", "18°C", R.drawable.baseline_cloud_24),
            InfoExtra(R.drawable.baseline_cloud_24, "Viento fuerte", )
        )
        recycler.adapter = MixedWeatherAdapter(items)

        recycler.layoutManager = LinearLayoutManager(requireContext())
    }
}
