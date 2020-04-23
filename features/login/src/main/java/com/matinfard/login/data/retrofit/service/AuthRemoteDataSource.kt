package com.matinfard.login.data.retrofit.service

import com.matinfard.login.data.model.UserTokenDataModel
import com.matinfard.login.domain.model.UserAuthDomainModel
import retrofit2.Response

interface AuthRemoteDataSource {
     suspend fun fetchUserToken(userAuthData: UserAuthDomainModel): Response<UserTokenDataModel>

}