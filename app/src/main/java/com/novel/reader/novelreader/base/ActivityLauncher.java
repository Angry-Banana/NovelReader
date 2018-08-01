package com.novel.reader.novelreader.base;

import android.app.Activity;
import android.content.Intent;

import com.novel.reader.novelreader.view.FindBookActivity;

/**
 * 用于启动Activity
 */
public class ActivityLauncher {
    public static void goToFindBookActivity(Activity activity) {
        Intent intent = new Intent(activity, FindBookActivity.class);
        activity.startActivity(intent);
    }
}
