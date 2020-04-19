package com.matinfard.login.data

import com.matinfard.login.data.retrofit.service.LoginRemoteDataSource
import com.matinfard.login.data.retrofit.service.LoginRemoteDataSourceImpl
import org.koin.core.module.Module
import org.koin.dsl.module

val authDataModule: Module = module {
    factory { LoginRemoteDataSourceImpl() as LoginRemoteDataSource }
}