package com.google.android.apps.camera.ui.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.preference.Preference;
import com.google.ar.core.R;
import defpackage.dbh;
import defpackage.eor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DownloadPreferenceCompat extends Preference {
    private ImageButton a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadPreferenceCompat(Context context) {
        super(context);
        context.getClass();
    }

    @Override // androidx.preference.Preference
    public final void a(dbh dbhVar) {
        dbhVar.getClass();
        super.a(dbhVar);
        this.a = (ImageButton) dbhVar.B(R.id.button_widget);
        ImageButton imageButton = this.a;
        if (imageButton != null) {
            imageButton.setImageResource(0);
        }
        ImageButton imageButton2 = this.a;
        if (imageButton2 != null) {
            imageButton2.setTag(0);
        }
        ImageButton imageButton3 = this.a;
        if (imageButton3 != null) {
            imageButton3.setOnClickListener(new eor(5));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadPreferenceCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }
}
