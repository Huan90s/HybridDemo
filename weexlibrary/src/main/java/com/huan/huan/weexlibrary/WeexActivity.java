package com.huan.huan.weexlibrary;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.huan.huan.commonlibrary.router.Constant;
import com.huan.huan.commonlibrary.router.PathConst;
import com.taobao.weex.IWXRenderListener;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.common.WXRenderStrategy;
import com.taobao.weex.utils.WXFileUtils;

@Route(path = PathConst.WEEX_ACTIVITY)
public class WeexActivity extends AppCompatActivity implements IWXRenderListener {

    WXSDKInstance mWXSDKInstance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weex);
        mWXSDKInstance = new WXSDKInstance(this);
        mWXSDKInstance.registerRenderListener(this);

        mWXSDKInstance.render("WXSample", WXFileUtils.loadFileOrAsset("index.js", this), null, null, -1, -1, WXRenderStrategy.APPEND_ASYNC);

    }

    @Override
    public void onViewCreated(WXSDKInstance instance, View view) {
        setContentView(view);
    }

    @Override
    public void onRenderSuccess(WXSDKInstance instance, int width, int height) {

    }

    @Override
    public void onRefreshSuccess(WXSDKInstance instance, int width, int height) {

    }

    @Override
    public void onException(WXSDKInstance instance, String errCode, String msg) {

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

//        Log.d("onActivityResult", data.getStringExtra("result"));
        if (resultCode == Constant.SCAN_QRCODE_SUCCESS) {
            Toast.makeText(this, data != null ? "扫描结果： " + data.getStringExtra("qrcode_result") : "没有扫描到信息", Toast.LENGTH_SHORT).show();
//            ((TextView)findViewById(R.id.result_text)).setText(data.getStringExtra("qrcode_result"));
        }
    }
}
