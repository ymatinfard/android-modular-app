package com.matinfard.android_ordering_app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.matinfard.login.presentation.host.LoginActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // startActivity(NavigationActions.openLoginIntent(this))
        startActivity(Intent(this, LoginActivity::class.java))

    }
}
