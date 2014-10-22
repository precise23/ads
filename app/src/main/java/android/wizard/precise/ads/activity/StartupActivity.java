package android.wizard.precise.ads.activity;

import android.os.Bundle;
import android.wizard.precise.ads.R;
import android.wizard.precise.ads.fragment.StartupFragment;

import roboguice.activity.RoboFragmentActivity;

public class StartupActivity extends RoboFragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, StartupFragment.newInstance())
                    .commit();
        }
    }
}
