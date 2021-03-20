package br.com.rubensrodrigues.baseapplication

object Dependencies {

    object Classpath {
        const val gradle = "com.android.tools.build:gradle:${Version.gradle}"
        const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.kotlin}"
        const val navigationSafeArgs = "androidx.navigation:navigation-safe-args-gradle-plugin:${Version.navigation}"
        const val hilt = "com.google.dagger:hilt-android-gradle-plugin:${Version.hilt}"
    }

    object Language {
        const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Version.kotlin}"
    }

    object Core {
        const val core = "androidx.core:core-ktx:${Version.core}"
    }

    object UI {
        const val appCompat = "androidx.appcompat:appcompat:${Version.appCompat}"
        const val material = "com.google.android.material:material:${Version.material}"
        const val constraintLayout =
            "androidx.constraintlayout:constraintlayout:${Version.constraintLayout}"
        const val recyclerView = "androidx.recyclerview:recyclerview:${Version.recyclerView}"
        const val glide = "com.github.bumptech.glide:glide:${Version.glide}"
    }

    object Architecture {
        const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Version.lifecycle}"
        const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Version.lifecycle}"
        const val runtime = "androidx.lifecycle:lifecycle-runtime-ktx:${Version.lifecycle}"
        const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Version.coroutines}"
        const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:${Version.navigation}"
        const val navigation = "androidx.navigation:navigation-ui-ktx:${Version.navigation}"
        const val hilt = "com.google.dagger:hilt-android:${Version.hilt}"
    }

    object Networking {
        const val retrofit = "com.squareup.retrofit2:retrofit:${Version.retrofit}"
        const val gson = "com.google.code.gson:gson:${Version.gson}"
    }

    object Kapt {
        const val hilt = "com.google.dagger:hilt-android-compiler:${Version.hilt}"
    }
}