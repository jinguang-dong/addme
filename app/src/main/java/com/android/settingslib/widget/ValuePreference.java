package com.android.settingslib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.ar.core.R;
import defpackage.dbh;
import defpackage.eoj;
import defpackage.eor;
import defpackage.ujk;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ValuePreference extends Preference implements eoj {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ValuePreference(Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }

    @Override // androidx.preference.Preference
    public final void a(dbh dbhVar) {
        dbhVar.getClass();
        super.a(dbhVar);
        dbhVar.u = false;
        dbhVar.v = false;
        View viewB = dbhVar.B(R.id.value_container_1);
        if (viewB != null) {
            viewB.setOnClickListener(new eor(0));
        }
        View viewB2 = dbhVar.B(R.id.title2);
        TextView textView = viewB2 instanceof TextView ? (TextView) viewB2 : null;
        if (textView != null) {
            textView.setText((CharSequence) null);
        }
        View viewB3 = dbhVar.B(R.id.summary2);
        TextView textView2 = viewB3 instanceof TextView ? (TextView) viewB3 : null;
        if (textView2 != null) {
            textView2.setText((CharSequence) null);
        }
        View viewB4 = dbhVar.B(R.id.value_container_2);
        if (viewB4 != null) {
            viewB4.setOnClickListener(new eor(2));
            viewB4.setVisibility(8);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ValuePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ValuePreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValuePreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        this.A = R.layout.settingslib_expressive_value_preference;
    }

    public /* synthetic */ ValuePreference(Context context, AttributeSet attributeSet, int i, int i2, int i3, ujk ujkVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
