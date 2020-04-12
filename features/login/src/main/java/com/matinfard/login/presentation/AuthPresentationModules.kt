package com.matinfard.login.presentation

import com.matinfard.login.domain.usecase.GetUserToken
import com.matinfard.login.presentation.login.LoginViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

val authPresentationModule: Module = module {
    factory { GetUserToken(get()) }
    viewModel { LoginViewModel(get(), get()) }
}