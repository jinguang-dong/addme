package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class mkl implements mjn {
    public final fvu g;
    public final mts h;
    public final mzz i;
    public final ndj j;
    public final mkr k;
    public final itl l;
    public final krj m;
    public final hbj n;
    public final ree o;

    public mkl(fvu fvuVar, mts mtsVar, mzz mzzVar, krj krjVar, ndj ndjVar, mkr mkrVar, itl itlVar, hbj hbjVar, ree reeVar) {
        this.g = fvuVar;
        this.h = mtsVar;
        this.i = mzzVar;
        this.m = krjVar;
        this.j = ndjVar;
        this.k = mkrVar;
        this.l = itlVar;
        this.n = hbjVar;
        if (hbjVar.p(gzy.j)) {
            hbjVar.p(gzy.k);
        }
        this.o = reeVar;
    }

    @Override // defpackage.mcz, defpackage.mda
    public void a() {
        throw null;
    }

    @Override // defpackage.mcz, defpackage.mda
    public void b() {
        throw null;
    }

    @Override // defpackage.mcz
    public /* synthetic */ void g() {
        throw null;
    }

    public final void j() {
        this.g.z(true);
        this.j.au();
        mkr mkrVar = this.k;
        mkrVar.a();
        mkrVar.a.a(false);
        mkrVar.b.a(fyx.READY);
        mkrVar.q.a();
        mkrVar.o.d(false);
        if (!mkrVar.A.equals(mkx.AUTO)) {
            gln glnVar = mkrVar.D;
            glnVar.g(glnVar.m);
            if (mkrVar.H.p(haw.j)) {
                glnVar.i(0);
                glnVar.g(0);
            }
        } else if (!mkrVar.H.p(gzo.by)) {
            mkrVar.C.h(false);
        }
        mkrVar.t.a(true);
        out outVar = mkrVar.k;
        outVar.c(new mjh(mkrVar, 10));
        mkrVar.D.k = true;
        mkrVar.r.set(false);
        outVar.c(new mjh(mkrVar, 7));
        if (mkrVar.y.h()) {
            ((gdm) mkrVar.y.c()).i();
            mkrVar.y = rvk.a;
        }
        ((AtomicBoolean) this.o.g).set(false);
        this.h.d(true);
        nql.c();
        mzz mzzVar = this.i;
        mzzVar.w(true);
        mzzVar.m(true);
    }

    @Override // defpackage.mjn
    public /* synthetic */ void c() {
    }

    @Override // defpackage.mjn
    public /* synthetic */ void d() {
    }

    @Override // defpackage.mjn
    public /* synthetic */ void e() {
    }

    @Override // defpackage.mjn
    public /* synthetic */ void eU() {
    }

    @Override // defpackage.mjn
    public /* synthetic */ void f() {
    }

    @Override // defpackage.mjn
    public /* synthetic */ void h() {
    }
}
