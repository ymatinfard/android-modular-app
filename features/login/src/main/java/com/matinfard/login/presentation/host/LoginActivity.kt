package com.matinfard.login.presentation.host

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.matinfard.login.AuthKoinModule
import com.matinfard.login.R


class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
  //      AuthKoinModule.loadkoinModule()
    }
}
