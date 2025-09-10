package com.android.settingslib.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.ar.core.R;
import defpackage.dbh;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AppHeaderPreference extends Preference {
    public AppHeaderPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A = R.layout.app_header_preference;
        aa();
    }

    @Override // androidx.preference.Preference
    public final void a(dbh dbhVar) {
        super.a(dbhVar);
        TextView textView = (TextView) dbhVar.B(R.id.install_type);
        if (textView != null) {
            textView.setVisibility(8);
        }
        TextView textView2 = (TextView) dbhVar.B(R.id.second_summary);
        if (textView2 != null) {
            if (TextUtils.isEmpty(null)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText((CharSequence) null);
                textView2.setVisibility(0);
            }
        }
    }
}
