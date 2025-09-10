package com.android.settingslib.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import androidx.preference.Preference;
import com.google.ar.core.R;
import defpackage.dbh;
import defpackage.eoj;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SimpleProgressBarPreference extends Preference implements eoj {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleProgressBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        context.getClass();
        this.A = R.layout.settingslib_expressive_simple_progress_bar;
    }

    @Override // androidx.preference.Preference
    public final void a(dbh dbhVar) {
        dbhVar.getClass();
        super.a(dbhVar);
        dbhVar.v = false;
        dbhVar.u = false;
        View viewB = dbhVar.B(R.id.settingslib_progress);
        ProgressBar progressBar = viewB instanceof ProgressBar ? (ProgressBar) viewB : null;
        if (progressBar != null) {
            progressBar.setProgress(0);
        }
    }
}
