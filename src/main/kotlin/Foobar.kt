package example

import arrow.optics.optics

@optics
data class Foobar(val name: String, val hellos: List<Hello>) {
    companion object
}

@optics
data class Hello(val world: String) {
    companion object
}