package com.huan.huan.rnmodule;

import android.app.Application;
import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.modules.toast.ToastModule;
import com.facebook.react.shell.MainReactPackage;
import com.huan.huan.commonlibrary.router.IReactProvider;
import com.huan.huan.commonlibrary.router.PathConst;
import com.huan.huan.rnmodule.module.CameraModule;

import java.util.Arrays;
import java.util.List;

@Route(path = PathConst.REACT_SERVICE)
public class ReactService implements IReactProvider {
    private Context mContext = null;

    @Override
    public void init(Context context) {
        this.mContext = context;
    }

    public ReactNativeHost getReactNativeHost() {
        return new ReactNativeHost((Application) mContext) {
            @Override
            public boolean getUseDeveloperSupport() {
                return BuildConfig.DEBUG;
            }

            @Override
            protected List<ReactPackage> getPackages() {
                return Arrays.<ReactPackage>asList(
                        new MainReactPackage(),
                        new CameraPackage()//新添加需要注册的模块
                );
            }
        };
    }
}
