package com.example.dagger_project_weatherapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dagger_project_weatherapp.data.remote.HttpClient
import com.example.dagger_project_weatherapp.di.components.DaggerActivityComponent
import com.example.dagger_project_weatherapp.di.modules.ActivityModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var httpClient: HttpClient

    @Inject
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getDep()

    }

    private fun getDep() {
        DaggerActivityComponent
            .builder()
            .applicationComponent((application as MyApplication).applicationComponent)
            .activityModule(ActivityModule(this))
            .build()
            .inject(this)
    }
}