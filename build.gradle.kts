import io.spring.gradle.dependencymanagement.dsl.DependencyManagementExtension

plugins {
    java
    alias(libs.plugins.spring.boot) apply false
    alias(libs.plugins.dependency.management) apply false
    alias(libs.plugins.protobuf) apply false
}

subprojects {
    apply(plugin = "java")
    apply(plugin = "io.spring.dependency-management")

    repositories {
        mavenCentral()
    }

    configure<DependencyManagementExtension> {
        imports {
            mavenBom(rootProject.libs.spring.grpc.bom.get().toString())
        }
    }

    dependencies {
        compileOnly(rootProject.libs.lombok)
        annotationProcessor(rootProject.libs.lombok)

        implementation(rootProject.libs.slf4j.api)
    }

    java {
        toolchain {
            languageVersion = JavaLanguageVersion.of(25)
        }
    }
}
