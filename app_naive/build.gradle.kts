plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

setupAll()

android {
    defaultConfig {
        applicationId = "moe.cb4a.naive"
        versionCode = 1
        versionName = "118.0.5993.65-1"
        splits.abi {
            reset()
            include("arm64-v8a", "x86_64")
        }
    }
}
