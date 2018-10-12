package com.novel.reader.novelreader.di;

import com.novel.reader.novelreader.base.MyApplication;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * author : Angry-Banana
 * e-mail : scau_deng@outlook.com
 * desc   :
 */
@Component(modules = {
        AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class,
        ActivityModule.class
})
public interface AppComponent {
  void inject(MyApplication application);
}
