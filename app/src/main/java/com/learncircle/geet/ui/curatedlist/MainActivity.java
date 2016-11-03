package com.learncircle.geet.ui.curatedlist;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.learncircle.geet.ui.base.BaseActivity;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseActivity implements IMainView{

    //region constant variables
    private static final String TAG = MainActivity.class.getSimpleName();
    //endregion

    //region view variables
    @BindView(R.id.toolbar)
    Toolbar mToolbar;

    @BindView(R.id.tabLayout)
    TabLayout mTabLayout;

    @BindView(R.id.viewPager)
    ViewPager mViewPager;
    //endregion

    //region dependency variables
    MainPresenter mainPresenter;
    //endregion

    //region activity lifecycle methods
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initPresenter();
        setSupportActionBar(mToolbar);
        setupShoppingViewPager();
        mTabLayout.setupWithViewPager(mViewPager,true); //true to make autoRefresh TabLayout
    }
    //endregion

    //region private helper methods
    private void setupShoppingViewPager()
    {
        ShoppingPagerAdapter adapter = new ShoppingPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(ShoppingListFragment.newInstance(), "SHOPPING LIST");
        adapter.addFragment(MealsFragment.newInstance(), "MEALS");
        mViewPager.setAdapter(adapter);
        mViewPager.setOffscreenPageLimit(2);
    }
    private void initPresenter() {
        mainPresenter = new MainPresenter(this);
    }
    //endregion

    //region methods overridden
    //endregion

    //region private Adapter
    private class ShoppingPagerAdapter extends FragmentStatePagerAdapter{

        private List<Fragment> fragments = new ArrayList<>();
        private List<String> fragmentNames = new ArrayList<>();

        public ShoppingPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return fragmentNames.get(position);
        }

        private void addFragment(Fragment fragment, String fragmentName){
            fragments.add(fragment);
            fragmentNames.add(fragmentName);
        }
    }
    //endregion
}
