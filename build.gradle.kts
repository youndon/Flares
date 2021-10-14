import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.31"
}

group = "me.nes"
version = "1.0"

repositories {
    jcenter()
    mavenCentral()
}
dependencies {
    testImplementation(kotlin("test"))
    implementation(kotlin("reflect"))
    implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.2.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2")
    implementation ("org.jetbrains.lets-plot:lets-plot-kotlin-jvm:3.0.0")
    implementation(kotlin("stdlib"))
}
tasks.test {
    useJUnit()
}
tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "11"
}