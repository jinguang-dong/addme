package com.google.android.clockwork.common.wearable.wearmaterial.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.clockwork.common.wearable.wearmaterial.button.WearChipButton;
import defpackage.dbh;
import defpackage.nwe;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class WearRadioButtonPreference extends WearCheckBoxPreference {
    public WearRadioButtonPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.clockwork.common.wearable.wearmaterial.preference.WearCheckBoxPreference, androidx.preference.CheckBoxPreference, androidx.preference.Preference
    public final void a(dbh dbhVar) {
        super.a(dbhVar);
        View view = dbhVar.a;
        if (view instanceof WearChipButton) {
            ((WearChipButton) view).o(nwe.RADIO);
        }
    }
}
