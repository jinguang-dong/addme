package defpackage;

import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.camera.ui.preference.ManagedSwitchPreferenceCompat;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jdi implements dal {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ jdi(jdl jdlVar, ListPreference listPreference, int i) {
        this.c = i;
        this.a = jdlVar;
        this.b = listPreference;
    }

    @Override // defpackage.dal
    public final boolean b(Preference preference, Object obj) {
        int i = this.c;
        if (i == 0) {
            obj.getClass();
            bm bmVar = (bm) this.a;
            boolean zAo = a.ao(obj, bmVar.getString(R.string.pref_codec_format_avc_entry_value));
            Object obj2 = this.b;
            if (zAo) {
                ((Preference) obj2).I(R.drawable.gs_avc_vd_theme_24);
            } else if (a.ao(obj, bmVar.getString(R.string.pref_codec_format_jellybean_entry_value))) {
                ((Preference) obj2).I(R.drawable.gs_pets_vd_theme_24);
            } else {
                ((Preference) obj2).I(R.drawable.ic_hevc_gm2_24px);
            }
            return true;
        }
        if (i != 1) {
            obj.getClass();
            String str = preference.r;
            str.getClass();
            ((jdl) this.b).G(str, Boolean.valueOf(((TwoStatePreference) this.a).a), obj);
            return true;
        }
        obj.getClass();
        String str2 = preference.r;
        str2.getClass();
        ((jdl) this.b).G(str2, Boolean.valueOf(((TwoStatePreference) this.a).a), obj);
        return true;
    }

    public /* synthetic */ jdi(jdl jdlVar, ManagedSwitchPreferenceCompat managedSwitchPreferenceCompat, int i) {
        this.c = i;
        this.b = jdlVar;
        this.a = managedSwitchPreferenceCompat;
    }
}
