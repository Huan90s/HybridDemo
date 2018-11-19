package com.huan.huan.rnmodule.module;

import android.content.Intent;
import android.provider.MediaStore;
import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "CameraModule")
public class CameraModule extends ReactContextBaseJavaModule {

    public CameraModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "CameraModule";
    }

    @ReactMethod
    public void showToast(String msg) {
//        Toast.makeText(getReactApplicationContext(), msg, Toast.LENGTH_SHORT).show();

        Intent takePhotoIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);//用来打开相机的Intent
        if (takePhotoIntent.resolveActivity(getReactApplicationContext().getPackageManager()) != null) {//这句作用是如果没有相机则该应用不会闪退，要是不加这句则当系统没有相机应用的时候该应用会闪退
            getReactApplicationContext().startActivity(takePhotoIntent);//启动相机
        }

    }
}
