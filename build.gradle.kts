plugins {
    java
    alias(libs.plugins.spring.boot)
    alias(libs.plugins.dependency.management)
    alias(libs.plugins.protobuf)
}

allprojects {
    apply(plugin = "java")

    repositories {
        mavenCentral()
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

dependencies {
    implementation(project(":autogen"))

    implementation(libs.spring.boot.starter.web)
    implementation(libs.grpc.services)
    implementation(libs.spring.grpc.starter)

    implementation(libs.dotenv)
    implementation(libs.anthropic)
}

dependencyManagement {
    imports {
        mavenBom(libs.spring.grpc.bom.get().toString())
    }
}

protobuf {
    protoc {
        artifact = "com.google.protobuf:protoc"
    }
    plugins {
        register("grpc") {
            artifact = "io.grpc:protoc-gen-grpc-java"
        }
    }
    generateProtoTasks {
        all().forEach { task ->
            task.plugins {
                register("grpc") {
                    option("@generated=omit")
                }
            }
        }
    }
}