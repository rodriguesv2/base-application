package br.com.rubensrodrigues.buildSrc

/*
 * To verify if some dependency is outdated, run in terminal the following command
 * ./gradlew checkDependencyUpdates
 *
 * The output should be:
 *
 * > Task :checkDependencyUpdates
 * New dependency version: com.google.dagger:hilt-android-gradle-plugin: 2.37 -> 2.38
 * New dependency version: org.jetbrains.kotlin:kotlin-gradle-plugin: 1.5.20 -> 1.5.21
 */
object Version {

    const val kotlin = "1.5.21"
    const val googleService = "4.3.8"
    const val crashlyticsGradle = "2.7.1"
    const val gradle = "4.2.2"
    const val navigationSafeArgs = "2.3.5"
    const val remal = "1.4.1"

    const val firebaseBom = "26.2.0"
    const val hilt = "2.38"
    const val playServiceAuth = "19.0.0"
    const val playServiceAuthPhone = "17.1.0"

    const val multidex = "1.0.3"
    const val appCompat = "1.3.0"
    const val cardView = "1.0.0"
    const val constraintLayout = "2.0.4"
    const val recyclerView = "1.2.1"
    const val core = "1.6.0"
    const val viewpager = "1.0.0"
    const val material = "1.4.0"
    const val navigationFragment = "2.3.5"
    const val navigationUi = "2.3.5"
    const val anko = "0.10.8"
    const val lifecycleExtensions = "2.2.0"
    const val lifecycleViewModelKtx = "2.3.1"
    const val lifecycleKtx = "2.3.1"
    const val retrofit = "2.9.0"
    const val gson = "2.9.0"
    const val loggingInterceptor = "4.9.0"
    const val glide = "4.11.0"
    const val analytics = "19.0.0"
    const val crashlytics = "18.1.0"

    const val junit = "4.13.2"
    const val mockitoInline = "3.3.3"
    const val mockito = "2.2.0"
    const val coreTesting = "1.1.1"

    //Compose
    const val compose = "1.0.0"
    const val constraintLayoutCompose = "1.0.0-beta01"
    const val navigation = "2.4.0-alpha06"
    const val viewBinding = "1.0.0"
    const val coil = "1.3.0"
    const val viewModel = "1.0.0-alpha07"
}