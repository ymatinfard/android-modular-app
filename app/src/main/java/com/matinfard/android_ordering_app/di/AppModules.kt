package com.matinfard.android_ordering_app.di


import com.matinfard.librarybase.platform.Constants
import com.matinfard.librarybase.platform.SharedPrefToken
import com.matinfard.librarybase.platform.NetworkHandler
import okhttp3.OkHttpClient
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val applicationModule = module (override = true) {


    factory { SharedPrefToken(androidContext()) }

    factory { NetworkHandler(androidContext()) }

    single {
        Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .client(OkHttpClient())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }



//    single {
//      Room.databaseBuilder(
//        androidContext().applicationContext,
//        OrderDataBase::class.java,
//        "order_database"
//      ).build()
//    }


}