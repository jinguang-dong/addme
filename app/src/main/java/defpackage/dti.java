package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dti extends ViewOutlineProvider {
    final /* synthetic */ boolean a;

    public dti(boolean z) {
        this.a = z;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        if (this.a) {
            outline.setOval(0, 0, view.getWidth(), view.getHeight());
        } else {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
        }
        outline.setAlpha(0.0f);
    }
}
