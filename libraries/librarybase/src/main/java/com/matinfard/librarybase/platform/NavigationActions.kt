package com.matinfard.librarybase.platform

import android.content.Context
import android.content.Intent

object NavigationActions {

    fun openLoginIntent(context: Context) = internalIntent(context, Constants.LOGIN_URI)

    fun openRegistrationIntent(context: Context) = internalIntent(context, Constants.REGISTRATION_URI)

    fun openProductIntent(context: Context) = internalIntent(context, Constants.PRODUCT_URI)

    fun openOrderIntent(context: Context) = internalIntent(context, Constants.ORDER_URI)

    private fun internalIntent(context: Context, action: String) =
        Intent(action).setPackage(context.packageName)
}