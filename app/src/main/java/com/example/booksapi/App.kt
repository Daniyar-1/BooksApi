package com.example.booksapi

import android.app.Application
import com.example.booksapi.di.appModule
import com.example.booksapi.di.dataModule
import com.example.booksapi.di.domainModule
import com.example.booksapi.di.networkModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App:Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin{
            androidContext(this@App)
            modules(listOf(appModule,dataModule,domainModule,networkModule))
        }
    }
}