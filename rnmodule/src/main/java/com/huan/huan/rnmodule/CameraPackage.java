package com.huan.huan.rnmodule;

import android.content.Intent;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.huan.huan.rnmodule.module.CameraModule;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CameraPackage implements ReactPackage {
    private CameraModule mCameraModule;

    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        List<NativeModule> modules = new ArrayList<>();
        mCameraModule = new CameraModule(reactContext);
        modules.add(mCameraModule);

        return modules;
    }

    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Collections.emptyList();
    }

}
