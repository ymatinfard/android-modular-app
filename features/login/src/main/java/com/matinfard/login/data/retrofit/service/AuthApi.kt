package com.matinfard.login.data.retrofit.service

import com.matinfard.login.data.model.UserTokenDataModel
import com.matinfard.login.domain.model.UserAuthDomainModel
import com.matinfard.librarybase.platform.Constants
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

/**
 * Remote api call
 */
interface AuthApi {
    @POST(Constants.LOGIN_URL)
     suspend fun getUserToken(@Body body: UserAuthDomainModel): Response<UserTokenDataModel>
}