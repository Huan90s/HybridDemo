package com.huan.huan.weexlibrary;

import android.app.Application;
import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.huan.huan.commonlibrary.router.IWeexProvider;
import com.huan.huan.commonlibrary.router.PathConst;
import com.huan.huan.weexlibrary.module.CameraModule;
import com.taobao.weex.InitConfig;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;

@Route(path = PathConst.WEEX_SERVICE)
public class WeexService implements IWeexProvider {

    @Override
    public void init(Context context) {
        InitConfig config = new InitConfig.Builder().setImgAdapter(new ImageAdapter()).build();
        WXSDKEngine.initialize((Application) context, config);

        try {
            WXSDKEngine.registerModule("CameraModule", CameraModule.class);
        } catch (WXException e) {
            e.printStackTrace();
        }

    }
}
