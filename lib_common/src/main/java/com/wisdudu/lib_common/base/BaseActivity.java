package com.wisdudu.lib_common.base;

import android.os.Bundle;
import android.view.View;

import com.jaeger.library.StatusBarUtil;

import me.yokeyword.fragmentation.SupportActivity;


/**
 * 文件描述：
 * <p>
 * 作者：   Created by Sven on 2017/7/21 0021.
 */
public abstract class BaseActivity extends SupportActivity {

    protected View mRootView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mRootView = initBinding();
        setStatusBarColor();
    }

    protected abstract View initBinding();

    protected void setStatusBarColor() {
        StatusBarUtil.setTranslucentForImageViewInFragment(this, 0, null);
    }
}
