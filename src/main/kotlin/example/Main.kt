package example

fun main(args: Array<String>) {
  println("Hello World!")

  // Try adding program arguments via Run/Debug configuration.
  // Learn more about running applications:
  // https://www.jetbrains.com/help/idea/running-applications.html.
  println("Program arguments: ${args.joinToString()}")
  println(Foobar.name.modify(Foobar("hello", 1, true, "world")) { it.uppercase() })
}
