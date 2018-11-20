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
//        Toast.makeText(getReactApplicationContext(), msg, Toast.LENGTH_SHORT).show();

//        Intent takePhotoIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);//用来打开相机的Intent
//        if (takePhotoIntent.resolveActivity(getReactApplicationContext().getPackageManager()) != null) {//这句作用是如果没有相机则该应用不会闪退，要是不加这句则当系统没有相机应用的时候该应用会闪退
//            getReactApplicationContext().startActivity(takePhotoIntent);//启动相机
//        }

        ARouter.getInstance().build(PathConst.ZXING_ACTIVITY).navigation(getCurrentActivity(), 5);

//        Intent scanCode = new Intent(getReactApplicationContext(), CaptureActivity.class);
//        getCurrentActivity().startActivityForResult(scanCode, 1);

    }


//    public boolean handleActivityResult(final int requestCode, final int resultCode, final Intent data) {
//        // Your custom handling logic
//        return mCallbackManager.onActivityResult(requestCode, resultCode, data);
//    }


    private final ActivityEventListener mActivityEventListener = new BaseActivityEventListener() {

        @Override
        public void onActivityResult(Activity activity, int requestCode, int resultCode, Intent data) {

//            if (resultCode == CaptureActivity.SCAN_QRCODE_SUCCESS) {
//                Toast.makeText(activity, data != null ? "扫描结果： " + data.getStringExtra("qrcode_result") : "没有扫描到信息", Toast.LENGTH_SHORT).show();
//            ((TextView)findViewById(R.id.result_text)).setText(data.getStringExtra("qrcode_result"));
//            }
//            if (requestCode == IMAGE_PICKER_REQUEST) {
//                if (mPickerPromise != null) {
//                    if (resultCode == Activity.RESULT_CANCELED) {
//                        mPickerPromise.reject(E_PICKER_CANCELLED, "Image picker was cancelled");
//                    } else if (resultCode == Activity.RESULT_OK) {
//                        Uri uri = intent.getData();
//
//                        if (uri == null) {
//                            mPickerPromise.reject(E_NO_IMAGE_DATA_FOUND, "No image data found");
//                        } else {
//                            mPickerPromise.resolve(uri.toString());
//                        }
//                    }
//
//                    mPickerPromise = null;
//                }
//            }
        }
    };
}
