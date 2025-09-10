package com.android.settingslib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.ar.core.R;
import defpackage.dbh;
import defpackage.eoj;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class NumberButtonPreference extends Preference implements eoj {
    public View.OnClickListener a;
    public int b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NumberButtonPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
        context.getClass();
    }

    @Override // androidx.preference.Preference
    public final void a(dbh dbhVar) {
        dbhVar.getClass();
        super.a(dbhVar);
        dbhVar.u = false;
        dbhVar.v = false;
        View viewB = dbhVar.B(R.id.settingslib_number_button);
        if (viewB != null) {
            viewB.setOnClickListener(this.a);
        }
        View viewB2 = dbhVar.B(R.id.settingslib_number_title);
        TextView textView = viewB2 instanceof TextView ? (TextView) viewB2 : null;
        if (textView != null) {
            textView.setText(this.q);
        }
        View viewB3 = dbhVar.B(R.id.settingslib_number_count);
        TextView textView2 = viewB3 instanceof TextView ? (TextView) viewB3 : null;
        if (textView2 != null) {
            textView2.setText(String.valueOf(this.b));
        }
    }

    public /* synthetic */ NumberButtonPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0, 0);
        Z();
        L(Integer.MAX_VALUE);
        this.A = R.layout.settingslib_number_button;
    }
}
