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
        ARouter.getInstance().build(PathConst.ZXING_ACTIVITY).navigation((WeexActivity)mWXSDKInstance.getContext(), 1);
    }
}
