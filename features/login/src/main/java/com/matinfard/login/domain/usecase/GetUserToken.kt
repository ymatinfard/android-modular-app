package com.matinfard.login.domain.usecase

import com.matinfard.login.domain.repository.LoginRepository
import com.matinfard.librarybase.exception.Failure
import com.matinfard.login.domain.model.UserAuthDomainModel
import com.matinfard.login.domain.model.UserTokenDomainModel
import com.matinfard.librarybase.functional.Result
import com.matinfard.librarybase.interactor.UseCase

class GetUserToken(private val repository: LoginRepository): UseCase<UserTokenDomainModel, GetUserToken.Params>() {

    override suspend fun run(params: Params): Result<Failure, UserTokenDomainModel> =
        repository.getUserToken(params.userAuthData)

    data class Params(val userAuthData: UserAuthDomainModel)
}