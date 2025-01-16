package com.example.dagger_project_weatherapp.di.components

import com.example.dagger_project_weatherapp.MyApplication
import com.example.dagger_project_weatherapp.data.remote.HttpClient
import com.example.dagger_project_weatherapp.di.modules.ApplicationModule
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    fun inject(application: MyApplication)

    fun getHttpClient(): HttpClient
}