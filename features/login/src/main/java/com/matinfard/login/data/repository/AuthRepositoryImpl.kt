package com.matinfard.login.data.repository

import com.matinfard.login.data.model.UserTokenDataModel
import com.matinfard.login.data.retrofit.service.AuthRemoteDataSource
import com.matinfard.login.domain.model.UserTokenDomainModel
import com.matinfard.login.domain.repository.AuthRepository
import com.matinfard.librarybase.data.BaseDataSource
import com.matinfard.login.domain.model.UserAuthDomainModel
import com.matinfard.librarybase.exception.Failure
import com.matinfard.librarybase.functional.Result
import com.matinfard.librarybase.platform.NetworkHandler
import org.koin.core.KoinComponent

/**
 * Provides data for other components. Manges data retrieval from remote or local source.
 */

class AuthRepositoryImpl(
    private val authRemoteDataSource: AuthRemoteDataSource,
    private val networkHandler: NetworkHandler
) : AuthRepository, BaseDataSource(), KoinComponent {

    override suspend fun getUserToken(userAuthData: UserAuthDomainModel): Result<Failure, UserTokenDomainModel> =
        when (networkHandler.isConnected()) {
            true -> request({ authRemoteDataSource.fetchUserToken(userAuthData) }, {
                it.toUserToken()
            }, UserTokenDataModel(null))
            false, null -> Result.Failure(Failure.NetworkConnection)
        }
}





