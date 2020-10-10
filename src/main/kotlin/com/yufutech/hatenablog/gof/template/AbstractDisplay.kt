package com.yufutech.hatenablog.gof.template

abstract class AbstractDisplay {
    protected abstract fun open()
    protected abstract fun print()
    protected abstract fun close()

    fun display() {
        open()

        repeat(5) {
            print()
        }

        close()
        println()
    }
}