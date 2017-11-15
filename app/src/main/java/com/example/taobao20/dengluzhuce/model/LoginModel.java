package com.example.taobao20.dengluzhuce.model;


import com.example.taobao20.dengluzhuce.okhttp.OkHttpUtils;

import okhttp3.Callback;

/**
 * Created by 尚飞虎 on 2017/10/23.
 * Emali: 210666592@qq.com
 * 类作用:
 */

public class LoginModel implements ILoginModel {
    @Override
    public void login(String name, String pass, Callback callback) {
        OkHttpUtils.getInstance().doGet("http://120.27.23.105/user/login?mobile="+name+"&password="+pass,callback);
    }

    @Override
    public void reg(String name, String pass, Callback callback) {
        OkHttpUtils.getInstance().doGet("http://120.27.23.105/user/reg?mobile="+name+"&password="+pass,callback);
    }
}
