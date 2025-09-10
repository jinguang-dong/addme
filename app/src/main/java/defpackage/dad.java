package defpackage;

import android.content.Context;
import android.text.TextUtils;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import com.google.ar.core.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dad extends Preference {
    private long a;

    public dad(Context context, List list, long j) {
        super(context);
        this.A = R.layout.expand_button;
        I(R.drawable.ic_arrow_down_24dp);
        N(this.j.getString(R.string.expand_button_title));
        L(999);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        CharSequence string = null;
        while (it.hasNext()) {
            Preference preference = (Preference) it.next();
            CharSequence charSequenceU = preference.u();
            boolean z = preference instanceof PreferenceGroup;
            if (z && !TextUtils.isEmpty(charSequenceU)) {
                arrayList.add((PreferenceGroup) preference);
            }
            if (arrayList.contains(preference.C)) {
                if (z) {
                    arrayList.add((PreferenceGroup) preference);
                }
            } else if (!TextUtils.isEmpty(charSequenceU)) {
                string = string == null ? charSequenceU : this.j.getString(R.string.summary_collapsed_preference_list, string, charSequenceU);
            }
        }
        n(string);
        this.a = j + 1000000;
    }

    @Override // androidx.preference.Preference
    public final void a(dbh dbhVar) {
        super.a(dbhVar);
        dbhVar.u = false;
    }

    @Override // androidx.preference.Preference
    public final long dz() {
        return this.a;
    }
}
