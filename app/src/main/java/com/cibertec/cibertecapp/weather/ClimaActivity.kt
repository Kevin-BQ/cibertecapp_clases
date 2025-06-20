package com.cibertec.cibertecapp.weather

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cibertec.cibertecapp.R

class WeatherActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.weather_activity)

        val recycler = findViewById<RecyclerView>(R.id.recyclerWeather)
        recycler.layoutManager = LinearLayoutManager(this)

        val items: List<WeatherListItem> = listOf(
            Clima("Lima", "25°C", R.drawable.baseline_cloud_24),
            InfoExtra(R.drawable.baseline_cloud_24, "Lluvia moderada por la tarde"),
            InfoExtra(R.drawable.baseline_cloud_24, "Vientos fríos"),
            //Clima("Cusco", "15°C", R.drawable.baseline_cloud_24),
            InfoExtra(R.drawable.baseline_cloud_24, "Lluvia moderada por la tarde"),
            InfoExtra(R.drawable.baseline_cloud_24, "Vientos fríos"),
            InfoExtra(R.drawable.baseline_cloud_24, "Viento fuerte"),
            InfoExtra(R.drawable.baseline_cloud_24, "Viento fuerte"),
            InfoExtra(R.drawable.baseline_cloud_24, "Viento fuerte", )
        )

        recycler.adapter = MixedWeatherAdapter(items)
    }
}
