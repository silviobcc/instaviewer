package com.instaviewer

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity



class Logininsta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_insta)

        val webView = findViewById<WebView>(R.id.webview) // Dichiarazione variabile "Webview"
        webView.setWebViewClient(WebViewClient()) // Permanenza all'interno dell' App

        // Caricamento Sito login + attivazione javascript + zoom supportato
        webView.loadUrl("https://www.instagram.com/accounts/login/?next=%2F&source=mobile_nav")
        webView.settings.javaScriptEnabled = true
        webView.settings.setSupportZoom(true)
    }
}