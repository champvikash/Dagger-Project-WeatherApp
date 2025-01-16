package com.example.dagger_project_weatherapp.di.modules

import android.content.Context
import com.example.dagger_project_weatherapp.MainActivity
import com.example.dagger_project_weatherapp.MainViewModel
import com.example.dagger_project_weatherapp.data.remote.HttpClient
import com.example.dagger_project_weatherapp.di.ActivityScope
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class ActivityModule(private val activity: MainActivity) {


    @ActivityScope
    @Provides
    fun provideContext(): Context {
        return activity
    }
    

//    @Singleton
//    @Provides
//    fun provideViewModel(httpClient: HttpClient) : MainViewModel{
//        return MainViewModel(httpClient)
//    }


}