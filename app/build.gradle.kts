plugins {
    application
    id("java")
    checkstyle
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"
application { mainClass.set("hexlet.code.Main") }

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}

checkstyle {
    toolVersion = "10.3.3"
}
tasks.withType<Checkstyle>().configureEach {
    reports {
        sarif.required = true
    }
}

tasks.test {
    useJUnitPlatform()
}