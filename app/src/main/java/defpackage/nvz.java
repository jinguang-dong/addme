package defpackage;

import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class nvz extends ViewOutlineProvider {
    final /* synthetic */ nwb a;

    public nvz(nwb nwbVar) {
        this.a = nwbVar;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Drawable drawable = this.a.n;
        if (drawable != null) {
            drawable.getOutline(outline);
        } else {
            ViewOutlineProvider.BACKGROUND.getOutline(view, outline);
        }
    }
}
