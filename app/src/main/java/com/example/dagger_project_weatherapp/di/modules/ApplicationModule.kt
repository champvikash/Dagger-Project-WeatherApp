package com.example.dagger_project_weatherapp.di.modules

import android.content.Context
import com.example.dagger_project_weatherapp.MyApplication
import com.example.dagger_project_weatherapp.data.remote.HttpClient
import com.example.dagger_project_weatherapp.di.ApplicationContext
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class ApplicationModule(private val application: MyApplication) {

    @ApplicationContext
    @Provides
    fun provideContext(): Context {
        return application
    }


    @Singleton
    @Provides
    fun provideHttpClient(): HttpClient {
        return HttpClient()
    }

}