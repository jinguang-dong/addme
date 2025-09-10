package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ed extends cow {
    final /* synthetic */ eo a;

    public ed(eo eoVar) {
        this.a = eoVar;
    }

    @Override // defpackage.cow, defpackage.cov
    public final void a() {
        eo eoVar = this.a;
        eoVar.o.setAlpha(1.0f);
        eoVar.I.l(null);
        eoVar.I = null;
    }

    @Override // defpackage.cow, defpackage.cov
    public final void b() {
        eo eoVar = this.a;
        eoVar.o.setVisibility(0);
        if (eoVar.o.getParent() instanceof View) {
            View view = (View) eoVar.o.getParent();
            int[] iArr = con.a;
            coe.b(view);
        }
    }
}
