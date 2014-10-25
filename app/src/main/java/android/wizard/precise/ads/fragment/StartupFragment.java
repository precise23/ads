package android.wizard.precise.ads.fragment;

import android.app.ActionBar;
import android.app.FragmentTransaction;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.wizard.precise.ads.R;
import android.wizard.precise.ads.adapters.TabsPagerAdapter;

import roboguice.fragment.RoboFragment;
import roboguice.inject.InjectView;

public class StartupFragment extends RoboFragment implements ActionBar.TabListener, ViewPager.OnPageChangeListener {

    @InjectView(R.id.pager)
    private ViewPager viewPager;
    private ActionBar actionBar;

    public static StartupFragment newInstance() {
        return new StartupFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_startup, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        FragmentActivity activity = getActivity();
        actionBar = activity.getActionBar();
        TabsPagerAdapter adapter = new TabsPagerAdapter(getFragmentManager());

        viewPager.setAdapter(adapter);
        actionBar.setHomeButtonEnabled(true);
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        if (activity.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE)
            actionBar.setDisplayOptions(0, ActionBar.DISPLAY_SHOW_TITLE);

        actionBar.addTab(actionBar.newTab().setText(activity.getText(R.string.list_of_ads))
                .setTabListener(this));
        actionBar.addTab(actionBar.newTab().setText(activity.getText(R.string.new_ad))
                .setTabListener(this));
        viewPager.setOnPageChangeListener(this);
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        viewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onPageScrolled(int i, float v, int i2) {

    }

    @Override
    public void onPageSelected(int i) {
        actionBar.setSelectedNavigationItem(i);
    }

    @Override
    public void onPageScrollStateChanged(int i) {

    }
}
