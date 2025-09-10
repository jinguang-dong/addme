package defpackage;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nco extends ViewOutlineProvider {
    final /* synthetic */ ShutterButton a;

    public nco(ShutterButton shutterButton) {
        this.a = shutterButton;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Rect rect = new Rect();
        this.a.m.round(rect);
        outline.setRoundRect(rect, r1.e().z);
    }
}
