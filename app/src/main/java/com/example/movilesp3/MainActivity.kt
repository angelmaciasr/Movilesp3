package com.example.movilesp3

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
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

        val bottomNavView = findViewById<BottomNavigationView>(R.id.bottomNavigation)
        val navHostFragment = findNavController(R.id.navHostFragment)
        bottomNavView.setupWithNavController(navHostFragment)

        val appBarConfig = AppBarConfiguration(
            setOf(R.id.saludoFragment, R.id.historicoFragment, R.id.detallesFragment)
        )
        setupActionBarWithNavController(navHostFragment,appBarConfig)
    }
}