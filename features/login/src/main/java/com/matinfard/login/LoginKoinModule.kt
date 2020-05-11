package com.matinfard.login

import com.matinfard.login.data.loginDataModule
import com.matinfard.login.domain.loginDomainModule
import com.matinfard.login.presentation.loginPresentationModule
import org.koin.core.context.loadKoinModules

object AuthKoinModule {
    fun loadKoinModule() = loadKoinModules(
        listOf(
        loginDataModule,
        loginDomainModule,
        loginPresentationModule)
    )
}