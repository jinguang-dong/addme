package com.google.android.clockwork.common.wearable.wearmaterial.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.preference.DialogPreference;
import defpackage.dbh;
import defpackage.nwj;
import defpackage.nya;
import defpackage.qaq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class WearDialogPreference extends DialogPreference {
    private final qaq g;

    /* JADX WARN: Illegal instructions before constructor call */
    public WearDialogPreference(Context context, AttributeSet attributeSet) {
        int iJ = nwj.j(context);
        super(context, attributeSet, iJ, 0);
        this.g = new qaq(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nya.a, iJ, 0);
        nwj.k(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, nya.b, iJ, 0);
        typedArrayObtainStyledAttributes2.getResourceId(1, 0);
        typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // androidx.preference.Preference
    public final void a(dbh dbhVar) {
        super.a(dbhVar);
        this.g.x(dbhVar);
    }
}
