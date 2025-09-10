package com.google.android.clockwork.common.wearable.wearmaterial.preference;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.preference.PreferenceCategory;
import com.google.ar.core.R;
import defpackage.cme;
import defpackage.dbh;
import defpackage.kr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class WearPreferenceCategory extends PreferenceCategory {
    private final int d;

    public WearPreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        int i = resources.getDisplayMetrics().widthPixels;
        ThreadLocal threadLocal = cme.a;
        this.d = Math.round(resources.getFloat(R.dimen.wear_preference_category_horizontal_padding_percent) * i);
    }

    @Override // androidx.preference.PreferenceCategory, androidx.preference.Preference
    public final void a(dbh dbhVar) {
        super.a(dbhVar);
        CharSequence charSequenceU = u();
        TextView textView = (TextView) dbhVar.a;
        if (TextUtils.isEmpty(charSequenceU)) {
            textView.setVisibility(8);
            textView.setLayoutParams(new kr(0, 0));
        } else {
            textView.setText(charSequenceU);
            textView.setMaxLines(true != this.y ? Integer.MAX_VALUE : 1);
            int i = this.d;
            textView.setPadding(i, textView.getPaddingTop(), i, textView.getPaddingBottom());
        }
    }
}
