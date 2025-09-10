package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.EditTextPreference;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;
import android.widget.SearchView;
import com.google.android.apps.camera.backup.cNHl.ibINv;
import com.google.ar.core.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hfi {
    public final Context a;
    public final SharedPreferences b;
    public PreferenceScreen c;
    public final List d = new ArrayList();

    public hfi(Context context) {
        on onVar = new on(context, R.style.Theme_CameraSettings);
        this.a = onVar;
        this.b = PreferenceManager.getDefaultSharedPreferences(onVar);
    }

    public final void b(String str) {
        this.b.edit().putString("dev_setting_filter_key", str).apply();
        this.c.removeAll();
        a(this.c);
    }

    public final void a(PreferenceScreen preferenceScreen) {
        this.c = preferenceScreen;
        Context context = this.a;
        Preference preference = new Preference(context);
        preference.setTitle("Reset to default values");
        int i = 1;
        preference.setOnPreferenceClickListener(new hfh(this, i));
        this.c.addPreference(preference);
        Preference preference2 = new Preference(context);
        preference2.setTitle(ibINv.rUYTpr);
        preference2.setOnPreferenceClickListener(new hfh(this, 0));
        this.c.addPreference(preference2);
        SharedPreferences sharedPreferences = this.b;
        String string = sharedPreferences.getString("dev_setting_filter_key", "");
        hfk hfkVar = new hfk(this.c.getContext());
        hfkVar.c = string;
        SearchView searchView = hfkVar.a;
        if (searchView != null) {
            searchView.setQuery(string, true);
        }
        hfkVar.b = new hfj(this, 1);
        this.c.addPreference(hfkVar);
        List<jod> list = this.d;
        list.clear();
        EditTextPreference editTextPreference = new EditTextPreference(this.c.getContext());
        editTextPreference.setTitle("camera.onscreen_logcat_filter");
        editTextPreference.setLayoutResource(R.layout.preference_with_margin);
        list.add(new jod(editTextPreference));
        String string2 = sharedPreferences.contains("camera.onscreen_logcat_filter") ? sharedPreferences.getString("camera.onscreen_logcat_filter", "Gca") : "Gca";
        editTextPreference.setText(string2);
        editTextPreference.setSummary(string2);
        editTextPreference.setOnPreferenceChangeListener(new jcz(this, i));
        PreferenceCategory preferenceCategory = new PreferenceCategory(context);
        preferenceCategory.setLayoutResource(R.layout.preference_category_layout);
        preferenceScreen.addPreference(preferenceCategory);
        Collections.sort(list, new ccn(12));
        String[] strArrSplit = sharedPreferences.getString("dev_setting_filter_key", "").split("(,|\\s)+", -1);
        for (jod jodVar : list) {
            int length = strArrSplit.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    if (((String) jodVar.b).contains(strArrSplit[i2])) {
                        preferenceCategory.addPreference((Preference) jodVar.a);
                        break;
                    }
                    i2++;
                }
            }
        }
        PreferenceScreen preferenceScreen2 = this.c;
        String str = gzo.aA.a;
        Preference preferenceFindPreference = preferenceScreen2.findPreference(str);
        PreferenceScreen preferenceScreen3 = this.c;
        String str2 = gzo.az.a;
        Preference preferenceFindPreference2 = preferenceScreen3.findPreference(str2);
        if (preferenceFindPreference2 != null && preferenceFindPreference != null) {
            preferenceFindPreference2.setDependency(str);
        }
        Preference preferenceFindPreference3 = this.c.findPreference("camera.onscreen_logcat_filter");
        if (preferenceFindPreference3 == null || preferenceFindPreference2 == null) {
            return;
        }
        preferenceFindPreference3.setDependency(str2);
    }
}
