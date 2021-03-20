package br.com.rubensrodrigues.baseapplication

object Dependencies {

    object Language {
        const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib:${Version.kotlin}"
    }

    object Core {
        const val core = "androidx.core:core-ktx:${Version.core}"
    }

    object UI {
        const val appCompat = "androidx.appcompat:appcompat:${Version.appCompat}"
        const val material = "com.google.android.material:material:${Version.material}"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Version.constraintLayout}"
    }
}