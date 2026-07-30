plugins {
    kotlin("jvm") version "2.1.0"
}

group = "com.dashboard"

version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {

    testImplementation(kotlin("test"))

}

tasks.test {

    useJUnitPlatform()

}

kotlin {

    jvmToolchain(17)

}
