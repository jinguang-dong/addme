package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class kex extends kfa {
    public final /* synthetic */ kez b;

    public kex(kez kezVar) {
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
            kezVar.l.D(150);
        }
        kezVar.k(zL);
        ndjVar.ab();
    }

    @Override // defpackage.kfa
    public void c() {
        jsv.n(this);
    }

    @Override // defpackage.kfa
    public void eF() {
        jsv.n(this);
    }

    @Override // defpackage.kfa
    public void f() {
    }
}
