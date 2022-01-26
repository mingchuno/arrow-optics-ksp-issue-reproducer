package example

import arrow.optics.optics

@optics
data class Foobar(val name: String, val bar: Int, val baz: Boolean, val boo: String) {
  companion object
}
