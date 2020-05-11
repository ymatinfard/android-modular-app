package com.matinfard.login.domain

import android.util.Patterns
import com.matinfard.login.domain.model.UserAuthDomainModel


fun usernamePasswordSanitizer(username: String, password: String): UserAuthDomainModel {
    return if ((username.trim().isNotEmpty()
                && Patterns.EMAIL_ADDRESS.toRegex().matches(username)) && (password.trim().isNotEmpty())
    )
        UserAuthDomainModel(username, password)
    else
        UserAuthDomainModel("", "")
}

