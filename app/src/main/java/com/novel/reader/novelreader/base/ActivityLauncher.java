package com.novel.reader.novelreader.base;

import android.content.Context;
import android.content.Intent;

import com.novel.reader.novelreader.view.FindBookActivity;

/**
 * author : Angry-Banana
 * e-mail : scau_deng@outlook.com
 * desc   : 启动Activity的逻辑统一写在这里
 */
public class ActivityLauncher {
  /**
   * 跳转到FindBookActivity
   *
   * @param context 跳转的上下文
   */
  public static void goToFindBookActivity(Context context) {
    Intent intent = new Intent(context, FindBookActivity.class);
    context.startActivity(intent);
  }
}
