package com.yufutech.hatenablog.gof.template

class StringDisplay(private val str: String) : AbstractDisplay() {
    // 日本語だと幅合わない。。
    private val width = str.toByteArray().size

    override fun open() {
        printLine()
    }

    override fun print() {
        println("|$str|")
    }

    override fun close() {
        printLine()
    }

    private fun printLine() {
        print("+")

        repeat(width) {
            print("-")
        }

        print("+\n")
    }
}
