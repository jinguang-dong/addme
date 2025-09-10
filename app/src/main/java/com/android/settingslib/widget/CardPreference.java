package com.android.settingslib.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.preference.Preference;
import defpackage.dbh;
import defpackage.eoj;
import defpackage.eor;
import defpackage.ujk;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CardPreference extends Preference implements eoj {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardPreference(Context context) {
        this(context, null, 0, 0, 14, null);
        context.getClass();
    }

    @Override // androidx.preference.Preference
    public final void a(dbh dbhVar) {
        dbhVar.getClass();
        super.a(dbhVar);
        dbhVar.v = false;
        dbhVar.u = false;
        View viewB = dbhVar.B(R.id.icon1);
        viewB.getClass();
        ImageView imageView = (ImageView) viewB;
        imageView.setVisibility(8);
        imageView.setImageDrawable(null);
        imageView.setContentDescription(null);
        imageView.setOnClickListener(new eor(1));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardPreference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        this.A = com.google.ar.core.R.layout.settingslib_expressive_preference_card;
    }

    public /* synthetic */ CardPreference(Context context, AttributeSet attributeSet, int i, int i2, int i3, ujk ujkVar) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
