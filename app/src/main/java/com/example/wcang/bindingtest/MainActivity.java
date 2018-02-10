package com.example.wcang.bindingtest;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.wcang.bindingtest.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private Presenter presenter = new Presenter();
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mainBinding.setPresenter(presenter);
        Log.i(TAG, "onCreate: thread id " + Thread.currentThread().getId() + " thread name " + Thread.currentThread().getName());

    }
}
