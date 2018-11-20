package com.huan.huan.rnmodule.module;

import android.app.Activity;
import android.content.Intent;
import android.provider.MediaStore;
import android.widget.Toast;

import com.alibaba.android.arouter.launcher.ARouter;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.huan.huan.commonlibrary.router.PathConst;
import com.huan.huan.rnmodule.ReactActivity;

@ReactModule(name = "CameraModule")
public class CameraModule extends ReactContextBaseJavaModule {

    public CameraModule(ReactApplicationContext reactContext) {
        super(reactContext);
//        reactContext.addActivityEventListener(mActivityEventListener);
    }

    @Override
    public String getName() {
        return "CameraModule";
    }

    @ReactMethod
    public void showToast(String msg) {
        
        ARouter.getInstance().build(PathConst.ZXING_ACTIVITY).navigation(getCurrentActivity(), 5);
    }

}
