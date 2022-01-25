package example

import arrow.optics.optics

@optics
data class Foobar(val name: String) {
  companion object
}
