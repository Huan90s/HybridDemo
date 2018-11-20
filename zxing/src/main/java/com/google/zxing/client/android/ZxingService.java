package com.google.zxing.client.android;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.huan.huan.commonlibrary.router.PathConst;

@Route(path = PathConst.ZXING_SERVICE)
public class ZxingService implements IProvider {
    @Override
    public void init(Context context) {

    }
}
