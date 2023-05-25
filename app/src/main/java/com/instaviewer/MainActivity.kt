package com.instaviewer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.net.Uri
import android.webkit.WebView
import android.widget.Button
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Dichiarazione variabile "Bottone SIGN IN"
        val btnInstagramviewer: Button = findViewById(R.id.btnInstagramviewer)

        // Click "Bottone SIGN IN"
        btnInstagramviewer.setOnClickListener {

        // Passa alla "Seconda attività"
            val intent = Intent(this, Logininsta::class.java)
            startActivity(intent)     // Start seconda attività
        }

    }
}

