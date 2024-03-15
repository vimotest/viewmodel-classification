import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.20"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}


task("step2_MultiVocalLiteratureMain-chatgpt-next-chunk", JavaExec::class) {
    group = "step2"
    mainClass.set("step2_search_process.multivocal.MultiVocalLiteratureMainKt")
    classpath = sourceSets["main"].runtimeClasspath
    args("chatgpt-next-chunk")
}

task("step2_MultiVocalLiteratureMain-chatgpt-scan-results", JavaExec::class) {
    group = "step2"
    mainClass.set("step2_search_process.multivocal.MultiVocalLiteratureMainKt")
    classpath = sourceSets["main"].runtimeClasspath
    args("chatgpt-scan-results")
}

task("step2_MultiVocalLiteratureMain-chatgpt-unsure-check", JavaExec::class) {
    group = "step2"
    mainClass.set("step2_search_process.multivocal.MultiVocalLiteratureMainKt")
    classpath = sourceSets["main"].runtimeClasspath
    args("chatgpt-unsure-check")
}

task("step2_PaperLiteratureMain-join-search-results", JavaExec::class) {
    group = "step2"
    mainClass.set("step2_search_process.papers.PaperLiteratureMainKt")
    classpath = sourceSets["main"].runtimeClasspath
    args("join-search-results")
}

task("step2_PaperLiteratureMain-initial-classification", JavaExec::class) {
    group = "step2"
    mainClass.set("step2_search_process.papers.PaperLiteratureMainKt")
    classpath = sourceSets["main"].runtimeClasspath
    args("initial-classification")
}

task("step4_WebsiteStepByStepCheck", JavaExec::class) {
    group = "step4"
    mainClass.set("step4_data_extraction.WebsiteStepByStepCheckKt")
    classpath = sourceSets["main"].runtimeClasspath
}

task("step4_PaperStepByStepCheck", JavaExec::class) {
    group = "step4"
    mainClass.set("step4_data_extraction.PaperStepByStepCheckKt")
    classpath = sourceSets["main"].runtimeClasspath
}
