package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class mt extends ViewOutlineProvider {
    final /* synthetic */ mu a;

    public mt(mu muVar) {
        this.a = muVar;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int i = this.a.d;
        outline.setOval(0, 0, i, i);
    }
}
