import arrow.optics.Lens
import arrow.optics.optics

fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}

@optics data class Foobar(val name: String) {
    companion object
}

val lens: Lens<Foobar, String> = Foobar.name