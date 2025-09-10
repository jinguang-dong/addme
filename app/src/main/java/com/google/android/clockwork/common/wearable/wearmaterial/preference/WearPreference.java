package com.google.android.clockwork.common.wearable.wearmaterial.preference;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.Preference;
import defpackage.dbh;
import defpackage.qaq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class WearPreference extends Preference {
    private final qaq a;

    public WearPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new qaq(this);
    }

    @Override // androidx.preference.Preference
    public final void a(dbh dbhVar) {
        super.a(dbhVar);
        this.a.x(dbhVar);
    }
}
