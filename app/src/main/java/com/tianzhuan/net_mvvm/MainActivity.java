package com.tianzhuan.net_mvvm;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tianzhuan.net_mvvm.databinding.ActivityMvvmLoginBinding;
import com.tianzhuan.net_mvvm.vm.LoginViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_mvvm_login);
        //1.必须先 rebuild 2.书写代码绑定
        ActivityMvvmLoginBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_mvvm_login);
        new LoginViewModel(binding);
    }
}
