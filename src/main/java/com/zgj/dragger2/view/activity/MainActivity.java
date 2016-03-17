package com.zgj.dragger2.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.zgj.dagger2example.R;
import com.zgj.dragger2.base.BaseActivity;
import com.zgj.dragger2.inject.component.DaggerMainActivityComponent;
import com.zgj.dragger2.inject.module.MainActivityModule;
import com.zgj.dragger2.model.User;
import com.zgj.dragger2.presenter.MainActivityPresenter;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * 作者：zgj on 2016/3/17 15:00
 * View层负责View的绘制以及用户交互
 */
public class MainActivity extends BaseActivity {

    @InjectView(R.id.user_name)
    TextView userName;

    @InjectView(R.id.user_age)
    TextView userAge;

    @Inject
    MainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);
        presenter.setUserInfo();
    }

    @Override
    protected void injectComponent() {
        DaggerMainActivityComponent.builder()
                .mainActivityModule(new MainActivityModule(this,new User()))
                .build()
                .inject(this);
    }

    public void setUserName(String name){
        userName.setText(name);
    }

    public void setUserAge(String age){
        userAge.setText(age);
    }
}
