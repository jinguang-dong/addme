package com.android.settingslib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.SwitchPreferenceCompat;
import com.google.ar.core.R;
import defpackage.dbh;
import defpackage.eoq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AppSwitchPreference extends SwitchPreferenceCompat {
    public AppSwitchPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A = true != eoq.a(context) ? R.layout.preference_app : R.layout.settingslib_expressive_preference;
    }

    @Override // androidx.preference.SwitchPreferenceCompat, androidx.preference.Preference
    public final void a(dbh dbhVar) {
        super.a(dbhVar);
        View viewB = dbhVar.B(R.id.switchWidget);
        if (viewB != null) {
            viewB.getRootView().setFilterTouchesWhenObscured(true);
        }
    }
}
