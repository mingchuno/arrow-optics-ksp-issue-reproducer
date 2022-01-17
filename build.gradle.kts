import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.0"
    application
    id("com.google.devtools.ksp") version "1.6.0-1.0.2"
}

group = "com.github.mingchuno"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val arrowVersion = "1.0.2-alpha.28"

dependencies {
    testImplementation(kotlin("test"))
    implementation("io.arrow-kt:arrow-optics:$arrowVersion")
    ksp("io.arrow-kt:arrow-optics-ksp-plugin:$arrowVersion")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}

application {
    mainClass.set("MainKt")
}