package com.zhangxue.application.route;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/**
 * author  : zhangxue
 * date    : 2018/3/14
 * 调用路由
 */

public class Router implements RouteInteface {

    Intent mIntent;



    @Override
    public Router build(String uri) throws Exception {
        mIntent = new Intent();
        mIntent.setData(Uri.parse(uri));
        return this;
    }

    @Override
    public Router setAction(String action) throws Exception {
        mIntent.setAction(action);
        return this;
    }

    /**
     * 跳转------------------------------
     */


    @Override
    public Router go(Context context) throws Exception {
        context.startActivity(mIntent);
        return this;
    }

    @Override
    public Router go(Activity context, int requestCode) throws Exception {
        context.startActivityForResult(mIntent, requestCode);
        return this;
    }



    /**
     * 回调---------------------------------------
     *
     * @param resultCode
     * @return
     * @throws Exception
     */

    @Override
    public Router setResults(Activity context, int resultCode) throws Exception {
        context.setResult(resultCode, mIntent);
        context.finish();

        return this;
    }


}




