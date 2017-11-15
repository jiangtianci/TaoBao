package com.example.taobao20.dengluzhuce.persenter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import com.example.taobao20.MainActivity;
import com.example.taobao20.dengluzhuce.bean.RegBean;
import com.example.taobao20.dengluzhuce.model.ILoginModel;
import com.example.taobao20.dengluzhuce.model.LoginModel;
import com.example.taobao20.dengluzhuce.okhttp.OnUiCallback;
import com.example.taobao20.dengluzhuce.view.IRegView;
import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.Call;

/**
 * Created by 尚飞虎 on 2017/10/23.
 * Emali: 210666592@qq.com
 * 类作用:
 */

public class RegPresenter {

    Context context;
    IRegView view;
    ILoginModel model;

    public RegPresenter(Context context, IRegView view) {
        this.context = context;
        this.view = view;
        model = new LoginModel();
    }

    public void reg(){
        String name = view.getName();
        String pass = view.getPass();

        model.reg(name, pass, new OnUiCallback() {
            @Override
            public void onFailed(Call call, IOException e) {

            }

            @Override
            public void onSuccess(String result) throws IOException {

                RegBean rb = new Gson().fromJson(result,RegBean.class);

                String code = rb.getCode();
                Log.i("=========", "onSuccess: "+code);
                if(code.equals("0")){
                    Toast.makeText(context,"注册成功",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(context, MainActivity.class);
                    context.startActivity(intent);
                }else{
                    Toast.makeText(context,"注册失败",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
