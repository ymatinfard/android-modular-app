package com.matinfard.android_ordering_app

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

import timber.log.Timber

class AndroidOrderingApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@AndroidOrderingApplication)
            modules(applicationModule)
        }

        LoginKoinModule.loadkoinModule()

        if (BuildConfig.DEBUG) Timber.plant(Timber.DebugTree())
    }
}