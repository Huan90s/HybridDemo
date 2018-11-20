package com.huan.huan.weexlibrary.module;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.alibaba.android.arouter.launcher.ARouter;
import com.huan.huan.commonlibrary.router.PathConst;
import com.huan.huan.weexlibrary.WeexActivity;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.common.WXModule;

public class CameraModule extends WXModule {
    //run ui thread
    @JSMethod(uiThread = true)
    public void printLog(String msg) {
        Toast.makeText(mWXSDKInstance.getContext(), msg, Toast.LENGTH_SHORT).show();
    }

    @JSMethod(uiThread = true)
    public void takePhoto() {
//        Intent scanCode = new Intent(mWXSDKInstance.getContext(), CaptureActivity.class);
//        ((WeexActivity)mWXSDKInstance.getContext()).startActivityForResult(scanCode, 1);
        ARouter.getInstance().build(PathConst.ZXING_ACTIVITY).navigation((WeexActivity)mWXSDKInstance.getContext(), 1);

//        Intent takePhotoIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);//用来打开相机的Intent
//        if (takePhotoIntent.resolveActivity(mWXSDKInstance.getContext().getPackageManager()) != null) {//这句作用是如果没有相机则该应用不会闪退，要是不加这句则当系统没有相机应用的时候该应用会闪退
//            mWXSDKInstance.getContext().startActivity(takePhotoIntent);//启动相机
//        }
    }
}
