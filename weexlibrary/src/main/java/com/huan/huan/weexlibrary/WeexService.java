package com.huan.huan.weexlibrary;

import android.app.Application;
import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.huan.huan.commonlibrary.router.IWeexProvider;
import com.huan.huan.commonlibrary.router.PathConst;
import com.taobao.weex.InitConfig;
import com.taobao.weex.WXSDKEngine;

@Route(path = PathConst.WEEX_SERVICE)
public class WeexService implements IWeexProvider {

    @Override
    public void init(Context context) {
        InitConfig config = new InitConfig.Builder().setImgAdapter(new ImageAdapter()).build();
        WXSDKEngine.initialize((Application) context, config);
    }
}
