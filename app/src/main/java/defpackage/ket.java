package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ket extends kfa {
    final /* synthetic */ kez b;

    public ket(kez kezVar) {
        this.b = kezVar;
    }

    @Override // defpackage.kfa, defpackage.mcz, defpackage.mda
    public final void a() throws Resources.NotFoundException {
        kez kezVar = this.b;
        ((nkw) kezVar.j.dL()).name();
        ndj ndjVar = kezVar.h;
        ndjVar.O(true);
        boolean zL = kezVar.i.l();
        if (zL) {
            kezVar.m.a(true);
            nca ncaVar = kezVar.n;
            ncaVar.g();
            ncaVar.a();
            kezVar.o.g(kez.class);
        }
        kezVar.k(zL);
        ndjVar.aa();
        nqp nqpVar = kezVar.l;
        nqpVar.D(151);
        nqpVar.D(0);
    }

    @Override // defpackage.kfa, defpackage.mcz, defpackage.mda
    public final void b() {
        kez kezVar = this.b;
        kezVar.k.c();
        kezVar.n();
        kezVar.m();
        kezVar.l();
        kezVar.o.k(kez.class);
    }

    @Override // defpackage.kfa
    public void c() {
    }
}
