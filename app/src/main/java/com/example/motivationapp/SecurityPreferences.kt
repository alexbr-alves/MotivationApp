package com.example.motivationapp

import android.content.Context
import android.content.SharedPreferences

class SecurityPreferences(context: Context) {
    object KEY {
        const val USER_NAME = "USER_NAME"
    }

    private val security: SharedPreferences =
        context.getSharedPreferences("Motivation", Context.MODE_PRIVATE)

    fun storeString(key: String, str: String) {
        security.edit().putString(key, str).apply()
    }

    fun getString(key: String): String {
        return security.getString(key, "") ?: ""
    }
}