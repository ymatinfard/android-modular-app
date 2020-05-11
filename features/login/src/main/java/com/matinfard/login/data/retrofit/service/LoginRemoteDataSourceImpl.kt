package com.matinfard.login.data.retrofit.service

import com.matinfard.login.data.model.UserTokenDataModel
import com.matinfard.login.domain.model.UserAuthDomainModel
import org.koin.core.KoinComponent
import org.koin.core.inject
import retrofit2.Response
import retrofit2.Retrofit

/**
 *
 */
class AuthRemoteDataSourceImpl : AuthRemoteDataSource, KoinComponent {

    private val retrofit: Retrofit by inject()

    private val kitchenService = retrofit.create(AuthApi::class.java)

     override suspend fun fetchUserToken(userAuthData: UserAuthDomainModel): Response<UserTokenDataModel> =
        kitchenService.getUserToken(userAuthData)

    }


