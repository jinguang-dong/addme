package com.android.settingslib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.preference.Preference;
import com.google.android.material.button.MaterialButton;
import com.google.ar.core.R;
import defpackage.dbh;
import defpackage.eoj;
import defpackage.gx;
import defpackage.uiq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SectionButtonPreference extends Preference implements eoj {
    public uiq a;
    private MaterialButton b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SectionButtonPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 12);
        context.getClass();
    }

    @Override // androidx.preference.Preference
    public final void a(dbh dbhVar) {
        dbhVar.getClass();
        super.a(dbhVar);
        dbhVar.u = false;
        dbhVar.v = false;
        View viewB = dbhVar.B(R.id.settingslib_section_button);
        MaterialButton materialButton = viewB instanceof MaterialButton ? (MaterialButton) viewB : null;
        this.b = materialButton;
        if (materialButton != null) {
            materialButton.setText(this.q);
            materialButton.setFocusable(this.u);
            materialButton.setClickable(this.u);
            materialButton.setOnClickListener(new gx(this, 6, null));
        }
        MaterialButton materialButton2 = this.b;
        if (materialButton2 != null) {
            materialButton2.setEnabled(U());
        }
        MaterialButton materialButton3 = this.b;
        if (materialButton3 != null) {
            materialButton3.l(r());
        }
    }

    public /* synthetic */ SectionButtonPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0, 0);
        Z();
        L(Integer.MAX_VALUE);
        this.A = R.layout.settingslib_section_button;
    }
}
