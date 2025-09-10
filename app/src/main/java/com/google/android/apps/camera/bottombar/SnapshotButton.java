package com.google.android.apps.camera.bottombar;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;
import com.google.ar.core.R;
import defpackage.ncn;
import defpackage.ncq;
import defpackage.nlj;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SnapshotButton extends ShutterButton {
    public SnapshotButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.apps.camera.ui.shutterbutton.ShutterButton
    public final float a() throws Resources.NotFoundException {
        if (this.n) {
            return getResources().getDimension(R.dimen.bottom_bar_side_button_container_radius) / getResources().getDimension(R.dimen.freeway_shutter_button_radius);
        }
        TypedValue typedValue = new TypedValue();
        getResources().getValue(R.dimen.snapshot_button_scale, typedValue, true);
        return typedValue.getFloat();
    }

    @Override // com.google.android.apps.camera.ui.shutterbutton.ShutterButton
    protected final float b() {
        return nlj.b(2.0f);
    }

    @Override // com.google.android.apps.camera.ui.shutterbutton.ShutterButton
    public final void c(ncn ncnVar, ncq ncqVar) throws Resources.NotFoundException {
        ncn ncnVar2 = ncn.PHOTO_PRESSED;
        if (ncnVar.equals(ncnVar2)) {
            super.c(ncnVar2, ncqVar);
        } else {
            super.c(ncn.PHOTO_IDLE, ncqVar);
        }
    }
}
