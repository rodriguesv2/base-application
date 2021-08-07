package br.com.rubensrodrigues.network.di.modules

import br.com.rubensrodrigues.network.BuildConfig
import br.com.rubensrodrigues.network.Constants
import br.com.rubensrodrigues.network.interceptors.HeaderInterceptor
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
            .baseUrl("https://api.themoviedb.org/3/")
            .addConverterFactory(GsonConverterFactory.create())
    }

    @Provides
    @ViewModelScoped
    fun providesOkHttp(
        loggingInterceptor: HttpLoggingInterceptor,
        headerInterceptor: HeaderInterceptor
    ): OkHttpClient.Builder {
        return OkHttpClient
            .Builder().apply {
                interceptors().add(loggingInterceptor)
                interceptors().add(headerInterceptor)
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

    @Provides
    @ViewModelScoped
    fun providesHeaderInterceptor(): HeaderInterceptor {
        return HeaderInterceptor(*Constants.headers)
    }
}