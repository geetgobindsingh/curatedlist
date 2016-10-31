package com.learncircle.geet.ui.base;

/**
 * Created by Geet on 31-10-2016.
 */

public interface IPresenter {
    void onCreate();

    void onDestroy();

    void onStart();

    void onStop();

    void onPause();

    void onResume();

    IView getView();
}
