package com.yufutech.hatenablog.gof.factorymethod.idcard

import com.yufutech.hatenablog.gof.factorymethod.framework.Factory
import com.yufutech.hatenablog.gof.factorymethod.framework.Product

class IDCardFactory : Factory() {
    private var owners = mutableListOf<String>()

    override fun createProduct(owner: String): Product {
        return IDCard(owner)
    }

    override fun registerProduct(product: Product) {
        owners.add((product as IDCard).getOwner())
    }

    fun getOwners(): List<String> {
        return owners
    }
}