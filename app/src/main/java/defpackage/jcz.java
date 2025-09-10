package defpackage;

import android.content.SharedPreferences;
import android.preference.ListPreference;
import android.preference.Preference;
import com.google.android.apps.camera.ui.preference.ManagedSwitchPreference;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jcz implements Preference.OnPreferenceChangeListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ jcz(hfi hfiVar, int i) {
        this.c = i;
        this.b = hfiVar;
        this.a = "camera.onscreen_logcat_filter";
    }

    @Override // android.preference.Preference.OnPreferenceChangeListener
    public final boolean onPreferenceChange(Preference preference, Object obj) {
        int i = this.c;
        if (i == 0) {
            ((mdy) this.b).i(preference.getKey(), this.a, obj);
            return true;
        }
        if (i == 1) {
            String str = (String) obj;
            preference.setSummary(str);
            SharedPreferences sharedPreferences = ((hfi) this.b).b;
            Object obj2 = this.a;
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString((String) obj2, str);
            editorEdit.apply();
            return true;
        }
        if (i != 2) {
            if (i != 3) {
                ((jde) this.b).a.n.i(preference.getKey(), Boolean.valueOf(((ManagedSwitchPreference) this.a).isChecked()), obj);
                return true;
            }
            ((jde) this.b).a.n.i(preference.getKey(), Boolean.valueOf(((ManagedSwitchPreference) this.a).isChecked()), obj);
            return true;
        }
        jde jdeVar = (jde) this.a;
        boolean zEquals = obj.equals(jdeVar.getString(R.string.pref_codec_format_avc_entry_value));
        Object obj3 = this.b;
        if (zEquals) {
            ((ListPreference) obj3).setIcon(R.drawable.gs_avc_vd_theme_24);
        } else if (obj.equals(jdeVar.getString(R.string.pref_codec_format_jellybean_entry_value))) {
            ((ListPreference) obj3).setIcon(R.drawable.gs_pets_vd_theme_24);
        } else {
            ((ListPreference) obj3).setIcon(R.drawable.ic_hevc_gm2_24px);
        }
        return true;
    }

    public /* synthetic */ jcz(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public /* synthetic */ jcz(jde jdeVar, ListPreference listPreference, int i) {
        this.c = i;
        this.a = jdeVar;
        this.b = listPreference;
    }
}
