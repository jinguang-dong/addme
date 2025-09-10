package defpackage;

import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dax implements dam {
    final /* synthetic */ PreferenceGroup a;
    final /* synthetic */ daz b;

    public dax(daz dazVar, PreferenceGroup preferenceGroup) {
        this.b = dazVar;
        this.a = preferenceGroup;
    }

    @Override // defpackage.dam
    public final void a(Preference preference) {
        this.a.ab(Integer.MAX_VALUE);
        this.b.q(preference);
    }
}
