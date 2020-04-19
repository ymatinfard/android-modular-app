package com.matinfard.android_ordering_app.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.matinfard.android_ordering_app.R
import com.matinfard.librarybase.platform.NavigationActions

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startActivity(NavigationActions.openLoginIntent(this))

    }
}
