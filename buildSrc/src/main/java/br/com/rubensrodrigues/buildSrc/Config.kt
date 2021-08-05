package br.com.rubensrodrigues.buildSrc

object Config {

    const val applicationId = "br.com.rubensrodrigues.baseapplication"

    object AppVersion {
        private const val MAJOR = 0
        private const val MINOR = 0
        private const val PATCH = 1
        private const val HOTFIX = 0

        const val versionName = "$MAJOR.$MINOR.$PATCH"
        const val versionCode = MAJOR * 100000000 + MINOR * 100000 + PATCH * 100 + HOTFIX
    }

    object SdkVersion {
        const val minSdk = 21
        const val targetSdk = 30
        const val compileSdk = 30
        const val buildToolsVersion = "30.0.2"
    }
}