plugins {
    java
    id("org.springframework.boot") version "3.3.4"
    id("io.spring.dependency-management") version "1.1.6"
}

group = "ru.test.siyatovskiy"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

repositories {
    mavenCentral()
}

extra["jjwtVersion"] = "0.9.1"
extra["lombokVersion"] = "1.18.28"
extra["springCloudVersion"] = "2023.0.3"
extra["jakartaValidationVersion"] = "3.0.2"
extra["jakartaServletVersion"] = "5.0.0"

dependencies {

    implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.springframework.boot:spring-boot-starter-validation")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.postgresql:postgresql")
    implementation("io.jsonwebtoken:jjwt:${property("jjwtVersion")}")
    implementation("jakarta.servlet:jakarta.servlet-api:${property("jakartaServletVersion")}")

    annotationProcessor("org.projectlombok:lombok:${property("lombokVersion")}")
    compileOnly("org.projectlombok:lombok:${property("lombokVersion")}")

    testAnnotationProcessor("org.projectlombok:lombok:${property("lombokVersion")}")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.springframework.security:spring-security-test")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

dependencyManagement {
    imports {
        mavenBom("org.springframework.cloud:spring-cloud-dependencies:${property("springCloudVersion")}")
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
