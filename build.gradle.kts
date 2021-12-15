import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.0"
}

group = "me.nes"
version = "1.0"

repositories {
    jcenter()
    mavenCentral()
}
dependencies {
    testImplementation(kotlin("test" ))
    implementation(kotlin("reflect"))
    implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.3.1")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2-native-mt")
//    implementation ("org.jetbrains.lets-plot:lets-plot-kotlin-jvm:3.0.1")
    implementation(kotlin("stdlib"))
    implementation(kotlin("script-runtime"))
    testImplementation("io.mockk:mockk:1.12.1")
//    implementation ("io.github.microutils:kotlin-logging-jvm:2.0.10") // or 2.1.15

}
tasks.test {
    useJUnit()
}
tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "11"
}