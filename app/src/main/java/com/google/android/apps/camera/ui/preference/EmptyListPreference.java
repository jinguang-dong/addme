package com.google.android.apps.camera.ui.preference;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.preference.ListPreference;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class EmptyListPreference extends ListPreference {
    public EmptyListPreference(Context context) {
        super(context);
    }

    @Override // android.preference.ListPreference, android.preference.DialogPreference
    protected final void onPrepareDialogBuilder(AlertDialog.Builder builder) {
        builder.setPositiveButton((CharSequence) null, (DialogInterface.OnClickListener) null);
    }

    public EmptyListPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public EmptyListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public EmptyListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // android.preference.ListPreference, android.preference.DialogPreference
    protected final void onDialogClosed(boolean z) {
    }
}
