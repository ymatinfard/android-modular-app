package com.matinfard.android_ordering_app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.matinfard.librarybase.platform.NavigationActions
import com.matinfard.login.presentation.host.AuthActivity
import com.matinfard.product.ProductActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // startActivity(NavigationActions.openLoginIntent(this))
        startActivity(Intent(this, AuthActivity::class.java))

    }
}
