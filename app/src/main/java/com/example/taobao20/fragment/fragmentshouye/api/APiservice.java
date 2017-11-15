package com.example.taobao20.fragment.fragmentshouye.api;


import com.example.taobao20.fragment.fragmentshouye.bean.SYBean;

import retrofit2.http.GET;

/**
 * Created by 姜天赐 on 2017/11/9.
 */

public interface APiservice {
    @GET("newlist?page=3&size=20")
    rx.Observable<SYBean> getDat();
}
