@file:OptIn(ExperimentalComposeLibrary::class)

import org.jetbrains.compose.ExperimentalComposeLibrary
import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    alias(libs.plugins.kotlinJvm)
    alias(libs.plugins.composeCompiler)
    alias(libs.plugins.composeMultiplatform)
}

group = "org.easybangumi.next"
version = 1

kotlin {
    jvmToolchain(21)

}
java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

dependencies {
    implementation(libs.vlcj)
    implementation(projects.libplayerApi)

    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.kotlinx.datetime)
    implementation(libs.kotlinx.coroutines.swing)

    implementation(compose.ui)
    implementation(compose.foundation)
    implementation(compose.desktop.currentOs)

    testImplementation(kotlin("test"))
    testImplementation(compose.desktop.uiTestJUnit4)
    implementation(compose.uiTest)



}

tasks.test {
    useJUnitPlatform() // 启用 JUnit 5
}
