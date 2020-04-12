package com.matinfard.login.domain.repository

import com.matinfard.login.domain.model.UserAuthDomainModel
import com.matinfard.login.domain.model.UserTokenDomainModel
import com.matinfard.librarybase.exception.Failure
import com.matinfard.librarybase.functional.Result


interface AuthRepository {

    suspend fun getUserToken(userAuthData: UserAuthDomainModel): Result<Failure, UserTokenDomainModel>

}