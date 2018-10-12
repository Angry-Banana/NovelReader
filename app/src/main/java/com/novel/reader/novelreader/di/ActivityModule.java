package com.novel.reader.novelreader.di;

import com.novel.reader.novelreader.view.BookShelfActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * author : Angry-Banana
 * e-mail : scau_deng@outlook.com
 * desc   :
 */
@Module
public abstract class ActivityModule {

  @ContributesAndroidInjector
  abstract BookShelfActivity contributeBookShelfActivity();
}
