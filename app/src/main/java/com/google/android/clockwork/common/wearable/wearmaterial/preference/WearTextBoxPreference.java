package com.google.android.clockwork.common.wearable.wearmaterial.preference;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.ar.core.R;
import defpackage.cme;
import defpackage.dbh;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class WearTextBoxPreference extends Preference {
    private final int a;

    public WearTextBoxPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A = R.layout.wear_text_block_preference;
        aa();
        Resources resources = context.getResources();
        int i = resources.getDisplayMetrics().widthPixels;
        ThreadLocal threadLocal = cme.a;
        this.a = Math.round(resources.getFloat(R.dimen.wear_preference_text_box_horizontal_padding_percent) * i);
    }

    @Override // androidx.preference.Preference
    public final void a(dbh dbhVar) {
        super.a(dbhVar);
        TextView textView = (TextView) dbhVar.a;
        textView.setText(u());
        int paddingTop = textView.getPaddingTop();
        int paddingBottom = textView.getPaddingBottom();
        int i = this.a;
        textView.setPadding(i, paddingTop, i, paddingBottom);
    }
}
