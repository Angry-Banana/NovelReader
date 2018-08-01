package com.novel.reader.novelreader.di;

import com.novel.reader.novelreader.view.BookShelfActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract BookShelfActivity contributeBookShelfActivity();
}
