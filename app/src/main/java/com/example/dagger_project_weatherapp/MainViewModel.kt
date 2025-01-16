package com.example.dagger_project_weatherapp

import com.example.dagger_project_weatherapp.data.remote.HttpClient
import com.example.dagger_project_weatherapp.di.ActivityScope
import javax.inject.Inject


@ActivityScope
class MainViewModel @Inject constructor(
    private val httpClient: HttpClient
) {
}