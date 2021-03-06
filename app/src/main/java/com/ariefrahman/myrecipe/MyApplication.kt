package com.ariefrahman.myrecipe

import android.app.Application
import com.ariefrahman.core.di.databaseModule
import com.ariefrahman.core.di.networkModule
import com.ariefrahman.core.di.repositoryModule
import com.ariefrahman.myrecipe.di.useCaseModule
import com.ariefrahman.myrecipe.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.NONE)
            androidContext(this@MyApplication)
            modules(
                listOf(
                    databaseModule,
                    networkModule,
                    repositoryModule,
                    useCaseModule,
                    viewModelModule
                )
            )

        }
    }
}