package com.novel.reader.novelreader.base;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

import com.novel.reader.novelreader.di.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

/**
 * author : Angry-Banana
 * e-mail : scau_deng@outlook.com
 * desc   : 自定义Application
 */
public class MyApplication extends Application implements HasActivityInjector {

  @Inject
  DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

  private static Context context;

  public static Context getContext() {
    return context;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    DaggerAppComponent.create().inject(this);
    context = this.getApplicationContext();
  }

  @Override
  public AndroidInjector<Activity> activityInjector() {
    return dispatchingAndroidInjector;
  }
}
