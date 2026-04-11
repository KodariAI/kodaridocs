plugins {
    alias(libs.plugins.spring.boot)
}

dependencies {
    implementation(project(":docs"))

    implementation(rootProject.libs.spring.grpc.starter)
    implementation(rootProject.libs.dotenv)
}

tasks.bootRun {
    workingDir = rootProject.projectDir
}