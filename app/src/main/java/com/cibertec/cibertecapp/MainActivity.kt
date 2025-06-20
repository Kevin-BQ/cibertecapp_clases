package com.cibertec.cibertecapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.cibertec.cibertecapp.NBA.NbaActivity
import com.cibertec.cibertecapp.cursos.CursosActivity
import com.cibertec.cibertecapp.news.NoticiasActivity
import com.cibertec.cibertecapp.playstore.AppActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var menu_bar = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        menu_bar.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.apps -> {
                    fragment(AppActivity())
                }
                R.id.cursos -> {
                    fragment(CursosActivity())
                }
                R.id.nba -> {
                    fragment(NbaActivity())
                }
            }
            true
        }

    }

    fun fragment(fragment: Fragment) {
        var fragment_manager = supportFragmentManager
        var transaction = fragment_manager.beginTransaction()
        transaction.replace(R.id.frameLayout, fragment)
        transaction.commit()
    }
}