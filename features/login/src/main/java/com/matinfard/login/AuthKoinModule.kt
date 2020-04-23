package com.matinfard.login

import com.matinfard.login.data.authDataModule
import com.matinfard.login.domain.authDomainModule
import com.matinfard.login.presentation.authPresentationModule
import org.koin.core.context.loadKoinModules

object AuthKoinModule {
    fun loadkoinModule() = loadKoinModules(
        listOf(
        authDataModule,
        authDomainModule,
        authPresentationModule)
    )
}