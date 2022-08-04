package com.orgjr.businesscard

import android.app.Application
import com.orgjr.businesscard.data.AppDatabase
import com.orgjr.businesscard.data.BusinessCardRepository

class App : Application() {
    val database by lazy {AppDatabase.getDatabase(this)}
    val repository by lazy {BusinessCardRepository(database.businessDao())}
}