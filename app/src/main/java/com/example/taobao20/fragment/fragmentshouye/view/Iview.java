package com.example.taobao20.fragment.fragmentshouye.view;


import com.example.taobao20.fragment.fragmentshouye.bean.SYBean;

import java.util.List;

/**
 * Created by 姜天赐 on 2017/11/5.
 */

public interface Iview {
    void  error(String rr);


    void showsuccess(List<SYBean.GoodsListBean> list);
}
