plugins {
    `java-library`
    `maven-publish`
    id("velocity-publish")
}

dependencies {
    implementation(libs.bundles.log4j)
    annotationProcessor(libs.log4j.core)
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            groupId = project.group as String
            artifactId = "velocity-proxy-log4j2-plugin"
            version = project.version as String
            from(components["java"])
        }
    }
}