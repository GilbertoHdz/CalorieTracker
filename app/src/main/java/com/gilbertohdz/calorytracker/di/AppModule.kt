package com.gilbertohdz.calorytracker.di

import android.app.Application
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import com.gilbertohdz.core.domain.DefaultPreferences
import com.gilbertohdz.core.domain.preferences.Preferences
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import javax.inject.Singleton

@Module
@InstallIn
object AppModule {

  @Provides
  @Singleton
  fun provideSharedPreferences(
    app: Application
  ): SharedPreferences {
    return app.getSharedPreferences("shared_pref", MODE_PRIVATE)
  }

  @Provides
  @Singleton
  fun providePreferences(sharedPreferences: SharedPreferences): Preferences {
    return DefaultPreferences(sharedPreferences)
  }
}