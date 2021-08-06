package br.com.rubensrodrigues.network.interceptors

import okhttp3.Interceptor
import okhttp3.Response

class HeaderInterceptor(
    private vararg val headers: Header
): Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request()
        val newRequest = request
            .newBuilder()

        newRequest.apply {
            headers.forEach { header ->
                addHeader(
                    header.name,
                    header.value
                )
            }
        }


        return chain.proceed(newRequest.build())
    }

    data class Header(
        val name: String,
        val value: String
    )
}