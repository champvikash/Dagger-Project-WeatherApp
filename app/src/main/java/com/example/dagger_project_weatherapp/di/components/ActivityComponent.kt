package com.example.dagger_project_weatherapp.di.components

import com.example.dagger_project_weatherapp.MainActivity
import com.example.dagger_project_weatherapp.di.ActivityScope
import com.example.dagger_project_weatherapp.di.modules.ActivityModule
import dagger.Component


@ActivityScope
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {

       fun inject(activity: MainActivity)
}