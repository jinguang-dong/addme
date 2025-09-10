package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.google.ar.core.R;
import defpackage.clc;
import defpackage.dbc;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public final boolean d;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, clc.H(context, R.attr.preferenceScreenStyle, android.R.attr.preferenceScreenStyle));
        this.d = true;
    }

    @Override // androidx.preference.PreferenceGroup
    public final boolean ac() {
        return false;
    }

    @Override // androidx.preference.Preference
    protected final void c() {
        dbc dbcVar;
        if (this.s != null || this.t != null || k() == 0 || (dbcVar = this.k.e) == null) {
            return;
        }
        dbcVar.E();
    }
}
