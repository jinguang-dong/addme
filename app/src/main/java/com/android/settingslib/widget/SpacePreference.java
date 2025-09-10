package com.android.settingslib.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.preference.Preference;
import com.google.ar.core.R;
import defpackage.clc;
import defpackage.dbh;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SpacePreference extends Preference {
    private final int a;

    /* JADX WARN: Illegal instructions before constructor call */
    public SpacePreference(Context context, AttributeSet attributeSet) {
        context.getClass();
        int iH = clc.H(context, R.attr.preferenceStyle, android.R.attr.preferenceStyle);
        super(context, attributeSet, iH, 0);
        this.A = R.layout.space_preference;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{android.R.attr.layout_height}, iH, 0);
        this.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public final void a(dbh dbhVar) {
        dbhVar.getClass();
        super.a(dbhVar);
        dbhVar.v = false;
        dbhVar.u = false;
        dbhVar.a.setLayoutParams(new ViewGroup.LayoutParams(-1, this.a));
    }
}
