package com.yufutech.hatenablog.gof.iterator

interface Iterator {
    fun hasNext(): Boolean
    fun next(): Any
}