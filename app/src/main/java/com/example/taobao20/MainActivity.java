package com.example.taobao20;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;

import com.example.taobao20.fragment.fragmentgouwuche.Fragmentgouwuche;
import com.example.taobao20.fragment.fragmentshouye.Fragmentshouye;
import com.example.taobao20.fragment.fragmentfenlei.Fragmentfenlei;
import com.example.taobao20.fragment.fragmentwode.Fragmentwodetaobao;
import com.example.taobao20.fragment.fragmentxinxi.Fragmentxinxi;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private RadioButton rb1;
    private RadioButton rb2;
    private RadioButton rb3;
    private RadioButton rb4;
    private RadioButton rb5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获取控件
        rb1 = (RadioButton) findViewById(R.id.main_shouye);
        rb2 = (RadioButton) findViewById(R.id.main_weitao);
        rb3 = (RadioButton) findViewById(R.id.main_xinxi);
        rb4 = (RadioButton) findViewById(R.id.main_gouwuche);
        rb5 = (RadioButton) findViewById(R.id.main_wodetaobao);
        Fragmentshouye fragment1 = new Fragmentshouye();
        getSupportFragmentManager().beginTransaction().replace(R.id.frament, fragment1).commit();
        rb1.setOnClickListener(this);
        rb2.setOnClickListener(this);
        rb3.setOnClickListener(this);
        rb4.setOnClickListener(this);
        rb5.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.main_shouye:
                Fragmentshouye fragment1 = new Fragmentshouye();
                getSupportFragmentManager().beginTransaction().replace(R.id.frament, fragment1).commit();
                break;
            case R.id.main_weitao:
                Fragmentfenlei fragment2 = new Fragmentfenlei();
                getSupportFragmentManager().beginTransaction().replace(R.id.frament, fragment2).commit();
                break;
            case R.id.main_xinxi:
                Fragmentxinxi fragment3 = new Fragmentxinxi();
                getSupportFragmentManager().beginTransaction().replace(R.id.frament, fragment3).commit();
                break;
            case R.id.main_gouwuche:
                Fragmentgouwuche fragment4 = new Fragmentgouwuche();
                getSupportFragmentManager().beginTransaction().replace(R.id.frament, fragment4).commit();
                break;
            case R.id.main_wodetaobao:
                Fragmentwodetaobao fragment5 = new Fragmentwodetaobao();
                getSupportFragmentManager().beginTransaction().replace(R.id.frament, fragment5).commit();
                break;
        }
    }
}
