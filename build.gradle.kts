import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
  kotlin("jvm") version "1.6.0"
  application
  id("com.google.devtools.ksp") version "1.6.0-1.0.2"
}

group = "com.github.mingchuno"

version = "1.0-SNAPSHOT"

repositories { mavenCentral() }

val arrowVersion = "1.0.2-alpha.43"

dependencies {
  testImplementation(kotlin("test"))
  implementation("io.arrow-kt:arrow-optics:$arrowVersion")
  ksp("io.arrow-kt:arrow-optics-ksp-plugin:$arrowVersion")
}

kotlin {
  sourceSets.main { kotlin.srcDir("build/generated/ksp/main/kotlin") }
  sourceSets.test { kotlin.srcDir("build/generated/ksp/test/kotlin") }
}

tasks.test { useJUnitPlatform() }

tasks.withType<KotlinCompile> { kotlinOptions.jvmTarget = "11" }

application { mainClass.set("example.MainKt") }
