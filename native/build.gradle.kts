plugins {
    `java-library`
    `maven-publish`
    id("velocity-publish")
}

dependencies {
    implementation(libs.guava)
    implementation(libs.netty.handler)
    implementation(libs.checker.qual)
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            groupId = project.group as String
            artifactId = "velocity-native"
            version = project.version as String
            from(components["java"])
        }
    }
}
