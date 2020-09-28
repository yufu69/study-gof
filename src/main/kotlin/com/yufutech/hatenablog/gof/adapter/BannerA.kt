package com.yufutech.hatenablog.gof.adapter

open class BannerA(private val string: String) {
    fun showWithParen() {
        println("($string)")
    }

    fun showWithAster() {
        println("*$string*")
    }
}