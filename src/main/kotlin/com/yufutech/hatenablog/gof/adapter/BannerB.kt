package com.yufutech.hatenablog.gof.adapter

class BannerB(private val string: String) {
    fun showWithParen() {
        println("($string)")
    }

    fun showWithAster() {
        println("*$string*")
    }
}