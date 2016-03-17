package com.zgj.dragger2.inject.module;

import com.zgj.dragger2.base.ActivityScope;
import com.zgj.dragger2.model.User;
import com.zgj.dragger2.presenter.MainActivityPresenter;
import com.zgj.dragger2.view.activity.MainActivity;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


/**
 * 作者：zgj on 2016/3/17 15:03
 */
@Module
public class MainActivityModule {

    private MainActivity mainActivity;

    private User user;

    public MainActivityModule(MainActivity mainActivity,User user) {
        this.mainActivity = mainActivity;
        this.user = user;
    }

    @Provides
    MainActivity provideMainActivity(){
        return mainActivity;
    }

    @Provides
    User provideUser(){
        return user;
    }

    @Provides
    @Singleton
    MainActivityPresenter provideMainActivityPresenter(MainActivity mainActivity,User user){
        return new MainActivityPresenter(mainActivity,user);
    }
}
