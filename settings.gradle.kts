rootProject.name = "SimplePlugin"
include("simple-plugin")

pluginManagement {
    repositories {
        mavenLocal()
        maven { url = uri("https://maven.aliyun.com/repository/gradle-plugin/") }
        maven { url = uri("https://maven.aliyun.com/repository/public/") }
        maven { url = uri("https://mirrors.163.com/maven/repository/maven-public/") }
        // maven 中国镜像，提供加速
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
}
