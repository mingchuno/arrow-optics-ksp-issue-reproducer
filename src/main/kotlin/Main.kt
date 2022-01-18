package example

import arrow.optics.Every
import arrow.optics.Lens

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications:
    // https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    val foobar = Foobar("Hello World", listOf(Hello("world")))
    println(foobar)
    val lens: Lens<Foobar, String> = Foobar.name
    println(lens.modify(foobar) { it.uppercase() })
    println(Every.list<Hello>().run { Foobar.hellos.every.world.modify(foobar) { it.uppercase() } })
}
