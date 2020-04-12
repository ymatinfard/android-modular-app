package com.matinfard.login.data.model

import com.matinfard.login.domain.model.UserTokenDomainModel

/**
 * Data model of token of user
 */
class UserTokenDataModel(private val token: String?){

    fun toUserToken() = UserTokenDomainModel(token)
}