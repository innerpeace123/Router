package com.zhangxue.application.route;

import android.app.Activity;
import android.content.Context;

/**
 * author  : zhangxue
 * date    : 2018/3/14
 * <p>
 * 路由接口
 */

public interface RouteInteface {


    /**
     * 跳转的路径
     *
     * @param uri 跳转到的页面url 如果需要参数可直接在后面加？拼接参数类似于网址
     * @return
     * @throws Exception
     */
    Router build(String uri) throws Exception;


    /**
     * 跳转类型
     *
     * @param action
     * @return
     * @throws Exception
     */
    Router setAction(String action) throws Exception;

    /**
     * 无回调的跳转
     *
     * @param
     * @param context
     * @throws Exception
     */
    Router go(Context context) throws Exception;

    /**
     * 无返回数据的回调跳转
     *
     * @param context
     * @param requestCode
     * @return
     * @throws Exception
     */

    Router go(Activity context, int requestCode) throws Exception;


    /**
     * 回调，不返回数据
     *
     * @param requesltode
     * @return
     * @throws Exception
     */
    Router setResults(Activity activity, int requesltode) throws Exception;

    /**
     * 回调，返回数据
     *
     * @param context
     * @param resultCode
     * @return
     * @throws Exception
     */


}
