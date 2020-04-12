package com.matinfard.login.data

import com.matinfard.login.data.retrofit.service.AuthRemoteDataSource
import com.matinfard.login.data.retrofit.service.AuthRemoteDataSourceImpl
import org.koin.core.module.Module
import org.koin.dsl.module

val authDataModule: Module = module {
    factory { AuthRemoteDataSourceImpl() as AuthRemoteDataSource }
//    single { NetworkHandler(get()) }
}