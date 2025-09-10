package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hc extends gk {
    final /* synthetic */ hg d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc(hg hgVar, Context context, gt gtVar, View view) {
        super(context, gtVar, view, false);
        this.d = hgVar;
        if (!gtVar.l.o()) {
            View view2 = hgVar.g;
            this.a = view2 == null ? (View) hgVar.f : view2;
        }
        e(hgVar.l);
    }

    @Override // defpackage.gk
    public final void c() {
        this.d.j = null;
        super.c();
    }
}
