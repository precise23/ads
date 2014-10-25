package android.wizard.precise.ads.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.wizard.precise.ads.fragment.ListAdsFragment;
import android.wizard.precise.ads.fragment.NewAdFragment;

public class TabsPagerAdapter extends FragmentPagerAdapter {

    public static final int COUNT_ITEM = 2;

    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                return ListAdsFragment.newInstance();
            case 1:
                return NewAdFragment.newInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return COUNT_ITEM;
    }
}
