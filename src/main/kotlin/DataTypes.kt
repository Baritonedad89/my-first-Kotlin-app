fun main() {
    println("numbers")
    println(Byte.MIN_VALUE)
    println(Byte.MAX_VALUE)
    println()
    println(Short.MIN_VALUE)
    println(Short.MAX_VALUE)
    println()
    println(Int.MIN_VALUE)
    println(Int.MAX_VALUE)
    println()
    println(Long.MIN_VALUE)
    println(Long.MAX_VALUE)
    println()
    println(Float.MIN_VALUE)
    println(Float.MAX_VALUE)
    println()
    println(1.0.toInt())
    println(Double.MIN_VALUE)
    println(Double.MAX_VALUE)

    // different ways to represent 1
    println(1L)
    println(1)
    println(0x01)
    println(0b01)
    println(1.0)

    //numeric conversion

    println(1.toLong())
    println(1.toByte())
    println(1.toShort())
    println(1.toDouble())

    // math

    println(2+2)
    println(7/3.toFloat())
    println(7/3.toDouble())
    println(7 * 2 + 1 /16 - 32)

    println()

    //binary

    println(4 shr 2) // 0b100 ->

    // underscores to make numbers more readable

    println(1_000_000)
    println(1234_5678_2345_3333L)

    // Characters

    println('a')
    println(97.toChar())
    println('\t')
    println('b')
    println('\n')
    println('c')

    println("sda")
    println("""
        abcd
        efg     ad
    """.trimIndent())
    println("Int: ${2+5}")

    // Booleans

    println(false && true)

    // arrays

    println(Array(size = 5){ it * it})
    Array(size = 5) { it * it }.forEach { println(it) }
    println()
    println(intArrayOf(0,1,2,3,4))
    intArrayOf(0,1,2,3,4).forEach { println(it) }

}