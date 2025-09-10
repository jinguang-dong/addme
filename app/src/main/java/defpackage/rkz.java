package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rkz implements rnh {
    final /* synthetic */ rla a;
    private final /* synthetic */ int b;

    public rkz(rla rlaVar, int i) {
        this.b = i;
        this.a = rlaVar;
    }

    @Override // defpackage.rnh
    public final void a(Typeface typeface) {
        if (this.b != 0) {
            rla rlaVar = this.a;
            eze ezeVar = rlaVar.v;
            if (ezeVar != null) {
                ezeVar.d();
            }
            if (rlaVar.k != typeface) {
                rlaVar.k = typeface;
                rlaVar.j = qsy.m(rlaVar.a.getContext().getResources().getConfiguration(), typeface);
                Typeface typeface2 = rlaVar.j;
                if (typeface2 == null) {
                    typeface2 = rlaVar.k;
                }
                rlaVar.i = typeface2;
                rlaVar.f();
                return;
            }
            return;
        }
        rla rlaVar2 = this.a;
        eze ezeVar2 = rlaVar2.u;
        if (ezeVar2 != null) {
            ezeVar2.d();
        }
        if (rlaVar2.n != typeface) {
            rlaVar2.n = typeface;
            rlaVar2.m = qsy.m(rlaVar2.a.getContext().getResources().getConfiguration(), typeface);
            Typeface typeface3 = rlaVar2.m;
            if (typeface3 == null) {
                typeface3 = rlaVar2.n;
            }
            rlaVar2.l = typeface3;
            rlaVar2.f();
        }
    }
}
