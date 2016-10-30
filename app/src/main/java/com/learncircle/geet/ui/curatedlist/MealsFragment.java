package com.learncircle.geet.ui.curatedlist;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.learncircle.geet.ui.BaseFragment;

/**
 * Created by Geet on 31-10-2016.
 */

public class MealsFragment extends BaseFragment {

    //region constant variables
    private static final String TAG = MealsFragment.class.getSimpleName();
    //endregion

    //region public methods
    public static Fragment newInstance()
    {
        MealsFragment fragment = new MealsFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }
    //endregion
}
