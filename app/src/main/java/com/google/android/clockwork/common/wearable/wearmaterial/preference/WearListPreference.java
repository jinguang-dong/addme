package com.google.android.clockwork.common.wearable.wearmaterial.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.preference.ListPreference;
import defpackage.dbh;
import defpackage.nwj;
import defpackage.nya;
import defpackage.qaq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class WearListPreference extends ListPreference {
    private final qaq F;

    /* JADX WARN: Illegal instructions before constructor call */
    public WearListPreference(Context context, AttributeSet attributeSet) {
        int iJ = nwj.j(context);
        super(context, attributeSet, iJ, 0);
        this.F = new qaq(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nya.a, iJ, 0);
        nwj.k(typedArrayObtainStyledAttributes);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, nya.d, iJ, 0);
        typedArrayObtainStyledAttributes2.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    public final void a(dbh dbhVar) {
        super.a(dbhVar);
        this.F.x(dbhVar);
    }
}
