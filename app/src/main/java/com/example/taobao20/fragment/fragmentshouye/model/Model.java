package com.example.taobao20.fragment.fragmentshouye.model;


import com.example.taobao20.fragment.fragmentshouye.api.APi;
import com.example.taobao20.fragment.fragmentshouye.api.APiservice;
import com.example.taobao20.fragment.fragmentshouye.bean.SYBean;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by 姜天赐 on 2017/11/5.
 */

public class Model implements Imodel {

    private Retrofit retrofit;
    private APiservice apiservice;
    private Observable<SYBean> noParams;
    private List<SYBean.GoodsListBean> data=new ArrayList<>();

    @Override
    public void Request(String url, final Onclick onclick) {
        retrofit = new Retrofit.Builder()
                .baseUrl(APi.SY)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        //通过动态代理得到网络接口对象
        apiservice = retrofit.create(APiservice.class);
        noParams = apiservice.getDat();

        Subscription subscribe = noParams.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<SYBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        onclick.error(e.getMessage().toString());
                    }

                    @Override
                    public void onNext(SYBean bean) {
                     data = bean.goods_list;
                      onclick.datasuccess(data);
                    }
                });

    }
}
