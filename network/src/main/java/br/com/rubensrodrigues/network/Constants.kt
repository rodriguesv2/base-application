package br.com.rubensrodrigues.network

import br.com.rubensrodrigues.core.BuildConfig
import br.com.rubensrodrigues.network.interceptors.HeaderInterceptor.Header

object Constants {

    val headers = listOf(
        Header(
            name = "Authentication",
            value = "Bearer ${BuildConfig.API_KEY}"
        )
    ).toTypedArray()
}