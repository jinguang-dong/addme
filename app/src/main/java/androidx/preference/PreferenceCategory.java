package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.google.ar.core.R;
import defpackage.clc;
import defpackage.dbh;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context) {
        this(context, null);
    }

    @Override // androidx.preference.Preference
    public final boolean U() {
        return false;
    }

    @Override // androidx.preference.Preference
    public void a(dbh dbhVar) {
        super.a(dbhVar);
        dbhVar.a.setAccessibilityHeading(true);
    }

    @Override // androidx.preference.Preference
    public final boolean j() {
        return !super.U();
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, clc.H(context, R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle));
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
