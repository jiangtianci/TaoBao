package com.example.taobao20.dengluzhuce;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.taobao20.R;
import com.example.taobao20.dengluzhuce.persenter.LoginPresenter;
import com.example.taobao20.dengluzhuce.view.ILoginView;

public class LogoActivity extends AppCompatActivity implements ILoginView {


    private EditText et_name;
    private EditText et_pass;
    private Button btn;
    LoginPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        presenter = new LoginPresenter(this, this);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.login();
            }
        });

    }

    private void initView() {
        et_name = (EditText) findViewById(R.id.et_name);
        et_pass = (EditText) findViewById(R.id.et_pass);
        btn = (Button) findViewById(R.id.btn_login);
    }

    @Override
    public void setName(String name) {
        et_name.setText(name);
    }

    @Override
    public String getName() {
        return et_name.getText().toString();
    }

    @Override
    public void setPass(String pass) {
        et_pass.setText(pass);
    }

    @Override
    public String getPass() {
        return et_pass.getText().toString();
    }
}
