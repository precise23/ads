package android.wizard.precise.ads.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.wizard.precise.ads.R;

import roboguice.fragment.RoboFragment;
import roboguice.inject.InjectView;

public class NewAdFragment extends RoboFragment implements ToggleButton.OnClickListener{

    @InjectView(R.id.buttonNewAdd)
    ToggleButton button;
    public static NewAdFragment newInstance() {
        return new NewAdFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_new_ad, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(
                getActivity().getApplicationContext(),
                Boolean.toString((button).isChecked()),
                Toast.LENGTH_SHORT).show();
    }
}
