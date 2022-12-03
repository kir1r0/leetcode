import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    idea
    java
    kotlin("jvm") version "1.7.20"
}

group = "kirill.romanov"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // Kotlin
    implementation(kotlin("stdlib-jdk8"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.7.20")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.3")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactive:1.3.3")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-guava:1.3.0")

    testImplementation(kotlin("test"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.5.1")
    testImplementation("io.mockk:mockk:1.9.3")
    testImplementation("org.powermock:powermock-core:2.0.9")
}

tasks.test {
    useJUnitPlatform()
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "11"
    }

    compileTestKotlin {
        kotlinOptions.jvmTarget = "11"
    }

}
