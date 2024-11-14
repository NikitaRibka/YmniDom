package com.example.ymnidom

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

object SharedPreferenceHelper {

    private const val KEY_DATA = "my_data"

    fun saveData(context: Context, data: MyData) {
        val sharedPref = context.getSharedPreferences("my_prefs", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        val gson = Gson()
        val json = gson.toJson(data)
        editor.putString(KEY_DATA, json)
        editor.apply()
    }

    fun loadData(context: Context): MyData {
        val sharedPref = context.getSharedPreferences("my_prefs", Context.MODE_PRIVATE)
        val gson = Gson()
        val json = sharedPref.getString(KEY_DATA, null)
        return if (json != null) {
            val type = object : TypeToken<MyData>() {}.type
            gson.fromJson(json, type)
        } else {
            MyData() // Возвращаем пустой объект, если данных нет
        }
    }
}