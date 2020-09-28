package com.yufutech.hatenablog.gof.adapter

class PrintBannerB(private val string: String) : PrintB() {
    private val banner = BannerB(string)

    override fun printWeak() {
        banner.showWithParen()
    }

    override fun printStrong() {
        banner.showWithAster()
    }
}