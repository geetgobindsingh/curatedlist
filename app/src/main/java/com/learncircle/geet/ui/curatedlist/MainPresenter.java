package com.learncircle.geet.ui.curatedlist;

import com.learncircle.geet.ui.base.BasePresenter;

/**
 * Created by Geet on 31-10-2016.
 */
class MainPresenter extends BasePresenter {
    private IMainView mainView;

    MainPresenter(IMainView mainView)
    {
        this.mainView = mainView;
    }
}
