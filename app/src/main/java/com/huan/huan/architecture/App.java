package com.huan.huan.architecture;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.huan.huan.commonlibrary.router.PathConst;
import com.huan.huan.rnmodule.ReactService;
import com.huan.huan.weexlibrary.WeexService;

import java.util.Arrays;
import java.util.List;

public class App extends Application implements ReactApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        //初始化ARouter
        if (BuildConfig.DEBUG) {           // 这两行必须写在init之前，否则这些配置在init过程中将无效
            ARouter.openLog();     // 打印日志
            ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        }
        ARouter.init(this);

        //初始化WeexService
        WeexService mWeexService = (WeexService) ARouter.getInstance().build(PathConst.WEEX_SERVICE).navigation();
        mWeexService.init(this);


    }

    @Override
    public ReactNativeHost getReactNativeHost() {
        ReactService reactService = (ReactService) ARouter.getInstance().build(PathConst.REACT_SERVICE).navigation();
        return reactService.getReactNativeHost();
    }




}
