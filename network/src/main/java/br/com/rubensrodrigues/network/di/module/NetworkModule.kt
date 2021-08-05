package br.com.rubensrodrigues.network.di.module

import br.com.rubensrodrigues.network.BuildConfig
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(ViewModelComponent::class)
class NetworkModule {

    @Provides
    @ViewModelScoped
    fun providesRetrofitBuilder(): Retrofit.Builder {
        return Retrofit
            .Builder()
            .baseUrl("")
            .addConverterFactory(GsonConverterFactory.create())
    }

    @Provides
    @ViewModelScoped
    fun providesOkHttp(
        loggingInterceptor: HttpLoggingInterceptor
    ): OkHttpClient.Builder {
        return OkHttpClient
            .Builder().apply {
                interceptors().add(loggingInterceptor)
            }
    }

    @Provides
    @ViewModelScoped
    fun providesLoggingInterceptor(): HttpLoggingInterceptor {
        return HttpLoggingInterceptor().apply {
            level = if (BuildConfig.DEBUG) HttpLoggingInterceptor.Level.BODY
            else HttpLoggingInterceptor.Level.NONE
        }
    }
}