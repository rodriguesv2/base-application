package br.com.rubensrodrigues.buildSrc

object Dependency {

    object Classpath {
        private const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.kotlin}"
        private const val googleService = "com.google.gms:google-services:${Version.googleService}"
        private const val crashlytics =
            "com.google.firebase:firebase-crashlytics-gradle:${Version.crashlyticsGradle}"
        private const val gradle = "com.android.tools.build:gradle:${Version.gradle}"
        private const val hilt = "com.google.dagger:hilt-android-gradle-plugin:${Version.hilt}"
        private const val navigationSafeArgs =
            "androidx.navigation:navigation-safe-args-gradle-plugin:${Version.navigationSafeArgs}"
        private const val remal = "name.remal:gradle-plugins:${Version.remal}"

        val list = listOf(
            kotlin,
            googleService,
            crashlytics,
            gradle,
            hilt,
            navigationSafeArgs,
            remal
        )
    }

    object App {
        private const val hilt = "com.google.dagger:hilt-android:${Version.hilt}"

        val list = listOf(
            hilt
        )
    }

    object Core {
        private const val multidex = "com.android.support:multidex:${Version.multidex}"

        private const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Version.kotlin}"

        private const val appCompat = "androidx.appcompat:appcompat:${Version.appCompat}"
        private const val cardView = "androidx.cardview:cardview:${Version.cardView}"
        private const val constraintLayout =
            "androidx.constraintlayout:constraintlayout:${Version.constraintLayout}"
        private const val recyclerView =
            "androidx.recyclerview:recyclerview:${Version.recyclerView}"
        private const val core = "androidx.core:core-ktx:${Version.core}"
        private const val viewpager = "androidx.viewpager2:viewpager2:${Version.viewpager}"
        private const val material = "com.google.android.material:material:${Version.material}"
        private const val navigationFragment =
            "androidx.navigation:navigation-fragment-ktx:${Version.navigationFragment}"
        private const val navigationUi =
            "androidx.navigation:navigation-ui-ktx:${Version.navigationUi}"
        private const val anko = "org.jetbrains.anko:anko:${Version.anko}"
        private const val playServiceAuth =
            "com.google.android.gms:play-services-auth:${Version.playServiceAuth}"
        private const val playServiceAuthPhone =
            "com.google.android.gms:play-services-auth-api-phone:${Version.playServiceAuthPhone}"

        private const val lifecycleExtensions =
            "androidx.lifecycle:lifecycle-extensions:${Version.lifecycleExtensions}"
        private const val lifecycleViewModelKtx =
            "androidx.lifecycle:lifecycle-viewmodel-ktx:${Version.lifecycleViewModelKtx}"
        private const val lifecycleKtx =
            "androidx.lifecycle:lifecycle-livedata-ktx:${Version.lifecycleKtx}"

        private const val retrofit = "com.squareup.retrofit2:retrofit:${Version.retrofit}"
        private const val gson = "com.squareup.retrofit2:converter-gson:${Version.gson}"
        private const val loggingInterceptor =
            "com.squareup.okhttp3:logging-interceptor:${Version.loggingInterceptor}"

        private const val glide = "com.github.bumptech.glide:glide:${Version.glide}"

        private const val analytics =
            "com.google.firebase:firebase-analytics-ktx:${Version.analytics}"
        private const val crashlytics =
            "com.google.firebase:firebase-crashlytics:${Version.crashlytics}"
        const val hilt = "com.google.dagger:hilt-android:${Version.hilt}"

        val list = listOf(
            multidex,
            kotlin,
            appCompat,
            cardView,
            constraintLayout,
            recyclerView,
            core,
            viewpager,
            material,
            navigationFragment,
            navigationUi,
            anko,
            playServiceAuth,
            playServiceAuthPhone,
            lifecycleExtensions,
            lifecycleViewModelKtx,
            lifecycleKtx,
            retrofit,
            gson,
            loggingInterceptor,
            glide,
            analytics,
            crashlytics,
            hilt
        )
    }

    object Compose {
        private const val compose = "androidx.compose.ui:ui:${Version.compose}"
        private const val material = "androidx.compose.material:material:${Version.compose}"
        private const val toolingPreview =
            "androidx.compose.ui:ui-tooling-preview:${Version.compose}"
        const val tooling = "androidx.compose.ui:ui-tooling:${Version.compose}"
        private const val constraintLayout =
            "androidx.constraintlayout:constraintlayout-compose:${Version.constraintLayoutCompose}"
        private const val navigation =
            "androidx.navigation:navigation-compose:${Version.navigation}"
        private const val viewBinding = "androidx.compose.ui:ui-viewbinding:${Version.viewBinding}"
        private const val coil = "io.coil-kt:coil-compose:${Version.coil}"
        private const val viewModel =
            "androidx.lifecycle:lifecycle-viewmodel-compose:${Version.viewModel}"
        private const val liveData = "androidx.compose.runtime:runtime-livedata:${Version.compose}"

        val list = listOf(
            compose,
            material,
            toolingPreview,
            tooling,
            constraintLayout,
            navigation,
            viewBinding,
            coil,
            viewModel,
            liveData
        )
    }

    object Test {
        private const val junit = "junit:junit:${Version.junit}"
        private const val mockitoInline = "org.mockito:mockito-inline:${Version.mockitoInline}"
        private const val mockito = "com.nhaarman.mockitokotlin2:mockito-kotlin:${Version.mockito}"
        private const val coreTesting = "android.arch.core:core-testing:${Version.coreTesting}"

        val list = listOf(
            junit,
            mockito,
            mockitoInline,
            coreTesting
        )
    }

    object Kapt {
        const val hiltCompiler = "com.google.dagger:hilt-compiler:${Version.hilt}"
    }
}