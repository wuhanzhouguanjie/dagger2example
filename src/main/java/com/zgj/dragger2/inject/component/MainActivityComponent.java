package com.zgj.dragger2.inject.component;

import com.zgj.dragger2.inject.module.MainActivityModule;
import com.zgj.dragger2.model.User;
import com.zgj.dragger2.view.activity.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * 作者：zgj on 2016/3/17 15:11
 */
@Singleton
@Component(modules = MainActivityModule.class)
public interface MainActivityComponent {

    void inject(MainActivity mainActivity);

}
