package com.example.shoplist.presentation

import android.app.Application
import com.example.shoplist.di.DaggerApplicationComponent

class ShopApplication : Application() {

    val component by lazy {
        DaggerApplicationComponent.factory().create(this)
    }
}
