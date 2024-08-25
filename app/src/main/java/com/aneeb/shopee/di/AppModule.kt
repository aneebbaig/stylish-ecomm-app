package com.aneeb.shopee.di

import com.aneeb.shopee.data.remote.ApiService
import com.aneeb.shopee.data.repository.auth.AuthRepositoryImpl
import com.aneeb.shopee.data.repository.auth.IAuthRepository
import com.aneeb.shopee.data.repository.category.CategoryRepositoryImpl
import com.aneeb.shopee.data.repository.category.ICategoryRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder().baseUrl("http://10.0.2.2:8000/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun provideApiService(retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }

    @Singleton
    @Provides
    fun provideAuthRepository(apiService: ApiService): IAuthRepository {
        return AuthRepositoryImpl(apiService)
    }

    @Provides
    @Singleton
    fun provideCategoryRepository(apiService: ApiService): ICategoryRepository {
        return CategoryRepositoryImpl(apiService)
    }


}