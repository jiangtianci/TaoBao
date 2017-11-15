package com.example.taobao20.dengluzhuce.persenter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import com.example.taobao20.dengluzhuce.bean.LoginBean;
import com.example.taobao20.dengluzhuce.model.ILoginModel;
import com.example.taobao20.dengluzhuce.model.LoginModel;
import com.example.taobao20.dengluzhuce.okhttp.OnUiCallback;
import com.example.taobao20.dengluzhuce.view.ILoginView;
import com.example.taobao20.fragment.fragmentwode.Fragmentwodetaobao;
import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.Call;

/**
 * Created by 尚飞虎 on 2017/10/23.
 * Emali: 210666592@qq.com
 * 类作用:
 */

public class LoginPresenter {

    Context context;
    ILoginModel model;
    ILoginView view;
    public LoginPresenter(Context context, ILoginView view) {
        this.context = context;
        this.view = view;
        model = new LoginModel();
    }

    // 登录的方法
    public void login(){
        String name = view.getName();
        String pass = view.getPass();
        model.login(name, pass, new OnUiCallback() {
            @Override
            public void onFailed(Call call, IOException e) {

            }

            @Override
            public void onSuccess(String result) throws IOException {

                LoginBean lb = new Gson().fromJson(result,LoginBean.class);
                String code = lb.getCode();
                Log.i("=========", "onSuccess: "+code);
                if(code.equals("0")){

                    Toast.makeText(context,"登录成功",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(context, Fragmentwodetaobao.class);
                    context.startActivity(intent);
                }else{
                    Toast.makeText(context,"登录失败",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
