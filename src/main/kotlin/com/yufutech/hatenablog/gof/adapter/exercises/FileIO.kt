package com.yufutech.hatenablog.gof.adapter.exercises

interface FileIO {
    fun readFromFile(fileName: String)
    fun writeToFile(fileName: String)
    fun setValue(key: String, value: String)
    fun getValue(key: String): String
}