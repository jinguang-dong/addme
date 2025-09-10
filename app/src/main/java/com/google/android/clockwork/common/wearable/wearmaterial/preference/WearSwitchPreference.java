package com.google.android.clockwork.common.wearable.wearmaterial.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.SwitchPreference;
import defpackage.dbh;
import defpackage.qaq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class WearSwitchPreference extends SwitchPreference {
    private final qaq c;

    public WearSwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new qaq(this);
    }

    @Override // androidx.preference.SwitchPreference, androidx.preference.Preference
    public final void a(dbh dbhVar) {
        super.a(dbhVar);
        this.c.x(dbhVar);
    }
}
