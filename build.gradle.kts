import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "2.0.0"
}

repositories {
    mavenCentral()
    google()
    gradlePluginPortal()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test:1.6.0")
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.6.0")
    implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.4.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.6.0")
    implementation("org.jetbrains.kotlin:kotlin-script-runtime:1.6.0")

    implementation("org.mongodb:mongodb-driver-kotlin-coroutine:5.0.0")

    testImplementation("io.mockk:mockk:1.13.2")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.9.0")

}


tasks.run {
    withType<KotlinCompile>() {
        kotlinOptions.jvmTarget = "11"
    }
}