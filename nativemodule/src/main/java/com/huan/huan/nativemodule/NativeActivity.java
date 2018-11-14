package com.huan.huan.nativemodule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.huan.huan.commonlibrary.router.PathConst;

@Route(path = PathConst.NATIVE_ACTIVITY)
public class NativeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_native);
    }
}
