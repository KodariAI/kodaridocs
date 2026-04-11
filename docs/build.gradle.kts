plugins {
    alias(libs.plugins.protobuf)
}

dependencies {
    implementation(rootProject.libs.spring.grpc.starter)
    implementation(rootProject.libs.grpc.services)
    implementation(rootProject.libs.anthropic)
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