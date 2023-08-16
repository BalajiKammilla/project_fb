import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "3.1.2"
	id("io.spring.dependency-management") version "1.1.2"
	kotlin("jvm") version "1.8.22"
	kotlin("plugin.spring") version "1.8.22"
	kotlin("plugin.jpa") version "1.8.22"
	id("com.sidneysimmons.gradle-plugin-docker") version "0.0.7"
}

	group = "com.example"
	version = "0.0.1-SNAPSHOT"

	java {
		sourceCompatibility = JavaVersion.VERSION_17
	}

	repositories {
		mavenCentral()
	}





dependencies {
		implementation("org.springframework.boot:spring-boot-starter-data-jpa:3.0.4")
		implementation("org.springframework.boot:spring-boot-starter-web:3.1.0")
		implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.14.2")
		implementation("org.jetbrains.kotlin:kotlin-reflect:1.8.20-RC")
		developmentOnly("org.springframework.boot:spring-boot-devtools:3.0.4")
		implementation("org.postgresql:postgresql:42.5.4")
		testImplementation("org.springframework.boot:spring-boot-starter-test:3.1.0")
	}

	tasks.withType<KotlinCompile> {
		kotlinOptions {
			freeCompilerArgs += "-Xjsr305=strict"
			jvmTarget = "17"
		}
	}

	tasks.withType<Test> {
		useJUnitPlatform()
	}

//1st added then docker then jar and then terminal docker build

//by idea google



