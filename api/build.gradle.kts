plugins {
    java
    application
}

group = "ru.netology"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":db"))
    implementation(project(":service"))
}

application {
    mainClass.set("ru.netology.api.Main")
}