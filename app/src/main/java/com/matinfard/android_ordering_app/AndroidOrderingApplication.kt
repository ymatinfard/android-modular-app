package com.matinfard.android_ordering_app

import android.app.Application
<<<<<<< HEAD
=======
import com.matinfard.android_ordering_app.di.applicationModule
import com.matinfard.login.AuthKoinModule
>>>>>>> parent of 8f3afa5... remove unused constants
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

        AuthKoinModule.loadkoinModule()

        if (BuildConfig.DEBUG) Timber.plant(Timber.DebugTree())
    }
}