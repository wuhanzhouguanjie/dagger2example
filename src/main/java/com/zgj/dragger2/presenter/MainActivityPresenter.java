package com.zgj.dragger2.presenter;

import com.zgj.dragger2.model.User;
import com.zgj.dragger2.view.activity.MainActivity;

/**
 * 作者：zgj on 2016/3/17 15:06
 * Presenter层完成交互，ui显示以及数据处理
 */
public class MainActivityPresenter {

    private MainActivity mainActivity;

    private User user;

    public MainActivityPresenter(MainActivity mainActivity,User user){
        this.mainActivity = mainActivity;
        this.user = user;
        setUser();
    }

    public void setUser(){
        this.user.setAge(25);
        this.user.setName("zgj");
    }

    public void setUserInfo(){
        mainActivity.setUserName(user.getName());
        mainActivity.setUserAge(user.getAge()+"");
    }

}
