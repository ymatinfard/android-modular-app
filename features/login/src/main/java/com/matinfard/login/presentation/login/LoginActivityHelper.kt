package com.matinfard.login.presentation.login

import android.util.Patterns
import android.view.View
import com.matinfard.login.R
import com.matinfard.login.domain.model.UserAuthDomainModel
import com.matinfard.librarybase.platform.Constants
import kotlinx.android.synthetic.main.fragment_login.view.*

fun progressbarVisibilityStatus(
    view: View,
    isLoading: Boolean
) {
    if (isLoading) {
        view.btn_login.setBackgroundResource(R.drawable.border_login_button_deactive)
        view.progressbar.visibility = View.VISIBLE
        view.tv_login_error.text = ""
    } else {
        view.btn_login.setBackgroundResource(R.drawable.border_login_button)
        view.progressbar.visibility = View.GONE
    }
    view.apply {
        et_username.isEnabled = !isLoading
        et_password.isEnabled = !isLoading
        btn_login.isEnabled = !isLoading
    }
}

fun showErrorMessage(view: View) {
    view.tv_login_error.text = Constants.LOGIN_ERROR_MESSAGE
}

fun usernamePasswordSanitizer(username: String, password: String): UserAuthDomainModel? {
    return if ((username.trim().isNotEmpty()
                && Patterns.EMAIL_ADDRESS.toRegex().matches(username)) && (password.trim().isNotEmpty())
    )
        UserAuthDomainModel(username, password)
    else
        null
}

fun dataIsLoading(view: View, isLoading: Boolean) {
 //   view.progressbar_product.visibility = if (isLoading) View.VISIBLE else View.GONE
}
