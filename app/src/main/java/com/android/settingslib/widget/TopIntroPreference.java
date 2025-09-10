package com.android.settingslib.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.Preference;
import com.google.ar.core.R;
import defpackage.dbh;
import defpackage.eoj;
import defpackage.eou;
import defpackage.ujk;
import defpackage.ukc;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class TopIntroPreference extends Preference implements eoj {
    private static final int[] a = eou.a;
    private boolean b;
    private int c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TopIntroPreference(Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }

    @Override // androidx.preference.Preference
    public final void a(dbh dbhVar) {
        dbhVar.getClass();
        super.a(dbhVar);
        dbhVar.u = false;
        dbhVar.v = false;
        View viewB = dbhVar.B(R.id.collapsable_text_view);
        CollapsableTextView collapsableTextView = viewB instanceof CollapsableTextView ? (CollapsableTextView) viewB : null;
        if (collapsableTextView != null) {
            boolean z = this.b;
            collapsableTextView.i = z;
            if (z) {
                collapsableTextView.j = true;
            }
            collapsableTextView.g();
            collapsableTextView.k = ukc.p(this.c, 1, 50);
            collapsableTextView.g();
            CharSequence charSequenceU = u();
            collapsableTextView.setVisibility((charSequenceU == null || charSequenceU.length() == 0) ? 8 : 0);
            CharSequence charSequenceU2 = u();
            if (charSequenceU2 != null) {
                collapsableTextView.l.setText(charSequenceU2.toString());
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TopIntroPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TopIntroPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopIntroPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        this.c = 2;
        this.A = R.layout.settingslib_expressive_top_intro;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a, i, 0);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(2, false);
        this.b = z;
        this.c = ukc.p(typedArrayObtainStyledAttributes.getInt(1, true != z ? 50 : 2), 1, 50);
        typedArrayObtainStyledAttributes.recycle();
        aa();
    }

    public /* synthetic */ TopIntroPreference(Context context, AttributeSet attributeSet, int i, int i2, int i3, ujk ujkVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
