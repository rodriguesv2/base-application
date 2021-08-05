package br.com.rubensrodrigues.baseapplication

import android.support.multidex.MultiDexApplication
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class Application: MultiDexApplication()