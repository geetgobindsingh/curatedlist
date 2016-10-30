package com.learncircle.geet.ui.curatedlist;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.learncircle.geet.ui.BaseFragment;

/**
 * Created by Geet on 31-10-2016.
 */

public class ShoppingListFragment extends BaseFragment {

    //region public methods
    public static Fragment newInstance()
    {
        ShoppingListFragment fragment = new ShoppingListFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }
    //endregion
}
