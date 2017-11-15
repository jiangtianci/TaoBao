package com.example.taobao20.fragment.fragmentshouye.persenter;

import com.example.taobao20.fragment.fragmentshouye.bean.SYBean;
import com.example.taobao20.fragment.fragmentshouye.model.Imodel;
import com.example.taobao20.fragment.fragmentshouye.model.Model;
import com.example.taobao20.fragment.fragmentshouye.model.Onclick;
import com.example.taobao20.fragment.fragmentshouye.view.Iview;

import java.util.List;

/**
 * Created by 姜天赐 on 2017/11/9.
 */

public class Persenter  {
    Imodel imodel;
    Iview iview;

    public Persenter( Iview iview) {

        this.iview = iview;
        imodel=new Model();
    }
    public  void getok(String url){
        imodel.Request(url, new Onclick() {
            @Override
            public void datasuccess(List<SYBean.GoodsListBean> list) {
                iview.showsuccess(list);
            }

            @Override
            public void error(String rr) {

            }
        });

    }
}
