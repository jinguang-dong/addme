package com.android.settingslib.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.Preference;
import com.google.ar.core.R;
import defpackage.eoq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AppPreference extends Preference {
    public AppPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A = true != eoq.a(context) ? R.layout.preference_app : R.layout.settingslib_expressive_preference;
    }
}
