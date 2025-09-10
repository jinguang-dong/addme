package com.google.android.apps.camera.wear.wearappv2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButtonProgressOverlay;
import com.google.ar.core.R;
import defpackage.fdi;
import defpackage.gzi;
import defpackage.hay;
import defpackage.nlj;
import defpackage.ojl;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class RemoteShutterButtonProgressOverlay extends ShutterButtonProgressOverlay {
    public RemoteShutterButtonProgressOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.apps.camera.ui.shutterbutton.ShutterButtonProgressOverlay
    protected final float a() throws Resources.NotFoundException {
        i();
        return getResources().getInteger(R.integer.wear_shutter_btn_size) / (getResources().getDimension(R.dimen.photo_button_outer_ring_radius) + nlj.b(3.0f));
    }

    @Override // com.google.android.apps.camera.ui.shutterbutton.ShutterButtonProgressOverlay
    protected final int b() {
        return ojl.aO(this);
    }

    @Override // com.google.android.apps.camera.ui.shutterbutton.ShutterButtonProgressOverlay
    protected final boolean i() {
        Object context = getContext();
        if (!(context instanceof fdi)) {
            return false;
        }
        ((fdi) context).b();
        gzi gziVar = hay.a;
        return false;
    }
}
