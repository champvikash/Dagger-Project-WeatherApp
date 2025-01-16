package com.example.dagger_project_weatherapp

import android.app.Application
import com.example.dagger_project_weatherapp.data.remote.HttpClient
import com.example.dagger_project_weatherapp.di.components.ApplicationComponent
import com.example.dagger_project_weatherapp.di.components.DaggerApplicationComponent
import com.example.dagger_project_weatherapp.di.modules.ApplicationModule
import javax.inject.Inject

class MyApplication : Application() {

    lateinit var applicationComponent: ApplicationComponent

    @Inject
    lateinit var httpClient: HttpClient
    override fun onCreate() {
        super.onCreate()
        getDep()


    }

    private fun getDep() {
        applicationComponent =
            DaggerApplicationComponent
                .builder()
                .applicationModule(ApplicationModule(this))
                .build()

        applicationComponent.inject(this)
    }
}