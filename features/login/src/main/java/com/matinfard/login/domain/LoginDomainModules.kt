package com.matinfard.login.domain

import com.matinfard.login.data.repository.AuthRepositoryImpl
import com.matinfard.login.domain.repository.LoginRepository
import org.koin.core.module.Module
import org.koin.dsl.module

val authDomainModule: Module = module {

    factory { AuthRepositoryImpl(get(), get()) as LoginRepository }
}