package com.matinfard.librarybase.di

import kotlin.reflect.full.memberProperties

object ModuleDependency {

    const val APP = ":app"
    const val AUTHENTICATION = ":login"
    const val ORDER = ":order"
    const val PRODUCT = ":product"
    const val SETTINGS = ":settings"

    fun getAllModules() = ModuleDependency::class.memberProperties
        .filter { it.isConst }
        .map { it.getter.call().toString() }
        .toSet()
}