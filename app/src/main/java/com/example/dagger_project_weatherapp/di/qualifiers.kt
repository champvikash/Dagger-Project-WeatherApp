package com.example.dagger_project_weatherapp.di

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class DatabaseName



@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class NetworkApiKey

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class DatabaseVersion


@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class ApplicationContext
