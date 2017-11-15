package com.example.taobao20.fragment.fragmentshouye.model;

import com.example.taobao20.fragment.fragmentshouye.bean.SYBean;

import java.util.List;

/**
 * Created by 姜天赐 on 2017/11/5.
 */

public interface Onclick {
    void  datasuccess(List<SYBean.GoodsListBean> list);
    void  error(String rr);


}
