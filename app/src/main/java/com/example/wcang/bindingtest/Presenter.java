package com.example.wcang.bindingtest;

import android.util.Log;

/**
 * Created by wcang on 2/9/18.
 */

public class Presenter {
    private static final String TAG = "Presenter";

    public void quack() {
        Log.i(TAG, "quack: " + Thread.currentThread().getId());
    }
}
