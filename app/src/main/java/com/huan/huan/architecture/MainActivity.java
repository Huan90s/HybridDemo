package com.huan.huan.architecture;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.huan.huan.commonlibrary.router.PathConst;

public class MainActivity extends AppCompatActivity {

    private final int OVERLAY_PERMISSION_REQ_CODE = 1;  // 任写一个值


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//            if (!Settings.canDrawOverlays(this)) {
//                Intent intent = new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION,
//                        Uri.parse("package:" + getPackageName()));
//                startActivityForResult(intent, OVERLAY_PERMISSION_REQ_CODE);
//            }
//        }

    }

    public void gotorn(View view) {
        ARouter.getInstance().build(PathConst.REACTNATIVE_ACTIVITY).navigation();

    }

    public void gotoweex(View view) {
        ARouter.getInstance().build(PathConst.WEEX_ACTIVITY).navigation();

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == OVERLAY_PERMISSION_REQ_CODE) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                if (!Settings.canDrawOverlays(this)) {
                    // SYSTEM_ALERT_WINDOW permission not granted
                }
            }
        }
    }

    public void gotonative(View view) {
        ARouter.getInstance().build(PathConst.NATIVE_ACTIVITY).navigation();
    }
}
