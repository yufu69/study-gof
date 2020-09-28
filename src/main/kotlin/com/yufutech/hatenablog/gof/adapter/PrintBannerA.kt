package com.yufutech.hatenablog.gof.adapter

class PrintBannerA(string: String) : BannerA(string), PrintA {
    override fun printWeak() {
        showWithParen()
    }

    override fun printStrong() {
        showWithAster()
    }
}