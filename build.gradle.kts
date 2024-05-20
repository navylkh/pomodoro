//import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

/*buildscript {
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.21")
    }
}*/

plugins {
    id("org.springframework.boot") version "2.7.4"
    id("io.spring.dependency-management") version "1.0.14.RELEASE"

    //id("org.jetbrains.kotlin.plugin.scripting") version "1.8.22"
    //id("com.codingfeline.buildkonfig") version "0.13.3"

    kotlin("jvm") version "1.6.21"
    kotlin("plugin.spring") version "1.6.21"
    application
}

group = "co.wordbe"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
    //google()
    mavenCentral()

}

dependencies {
    //implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.springframework.boot:spring-boot-starter-data-r2dbc")
    implementation("org.springframework.boot:spring-boot-starter-webflux")

    implementation("io.projectreactor.kotlin:reactor-kotlin-extensions") // 리액티브 스트림 구현체
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor") // 코틀린의 coroutine 기능

    // 기존 자바에서 사용하는 기능을 코틀린에서도 사용할 수 있도록 추가되는 의존성
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin") // jakson
    implementation("org.jetbrains.kotlin:kotlin-reflect") // reflect
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8") // jdk8

    runtimeOnly("com.h2database:h2")
    runtimeOnly("io.r2dbc:r2dbc-h2")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("io.projectreactor:reactor-test")
    //testImplementation(kotlin("test"))
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "17"
    }
}

tasks.test {
    useJUnitPlatform()
}

/*kotlin {
    jvmToolchain(11)
}*/

application {
    //mainClass.set("MainKt")
    mainClass.set("PornodoroApplicationKt")
}
