package android.example.com.visualizerpreferences;

import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;

/**
 * Created by vmois on 12/25/17.
 */

public class SettingsFragment extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        addPreferencesFromResource(R.xml.pref_visualizer);
    }
}
