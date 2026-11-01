plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}
android {
    namespace = "com.offlinetalks"
    compileSdk = 35
    defaultConfig {
        applicationId = "com.offlinetalks"
        minSdk = 26
        targetSdk = 34
        versionCode = 30
        versionName = "2.0.0"
    }
}
dependencies {
    implementation("com.google.android.gms:play-services-nearby:19.3.0")
    implementation("androidx.core:core:1.15.0")
}
