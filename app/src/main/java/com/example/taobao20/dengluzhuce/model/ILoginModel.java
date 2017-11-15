package com.example.taobao20.dengluzhuce.model;


import okhttp3.Callback;

/**
 * Created by 尚飞虎 on 2017/10/23.
 * Emali: 210666592@qq.com
 * 类作用:
 */

public interface ILoginModel {
    void login(String name, String pass, Callback callback);
    void reg(String name, String pass, Callback callback);
}
