package com.yufutech.hatenablog.gof.factorymethod.idcard

import com.yufutech.hatenablog.gof.factorymethod.framework.Product

class IDCard(private val owner: String) : Product() {
    init {
        println("${owner}のカードを作ります。")
    }

    override fun use() {
        println("${owner}のカードを使います。")
    }

    fun getOwner(): String {
        return owner
    }
}