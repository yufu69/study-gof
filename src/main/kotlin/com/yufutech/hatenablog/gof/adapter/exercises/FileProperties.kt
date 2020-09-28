package com.yufutech.hatenablog.gof.adapter.exercises

import java.io.File
import java.util.*

class FileProperties : FileIO, Properties() {
    private val header = "#written by FileProperties"

    override fun readFromFile(fileName: String) {
        val inputStream =
            javaClass.classLoader.getResourceAsStream(
                "com/yufutech/hatenablog/gof/adapter/exercises/$fileName"
            )

        load(inputStream)
    }

    override fun writeToFile(fileName: String) {

        val outputFile = File(fileName)
        outputFile.createNewFile()
        store(outputFile.outputStream(), header)
    }

    override fun setValue(key: String, value: String) {
        setProperty(key, value)
    }

    override fun getValue(key: String): String {
        return getProperty(key)
    }
}