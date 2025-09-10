package defpackage;

import android.text.TextUtils;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class daf implements dao {
    public static daf a;
    public static daf b;
    private final /* synthetic */ int c;

    public daf(int i) {
        this.c = i;
    }

    @Override // defpackage.dao
    public final /* synthetic */ CharSequence a(Preference preference) {
        if (this.c != 0) {
            EditTextPreference editTextPreference = (EditTextPreference) preference;
            return TextUtils.isEmpty(editTextPreference.g) ? editTextPreference.j.getString(R.string.not_set) : editTextPreference.g;
        }
        ListPreference listPreference = (ListPreference) preference;
        return TextUtils.isEmpty(listPreference.l()) ? listPreference.j.getString(R.string.not_set) : listPreference.l();
    }
}
