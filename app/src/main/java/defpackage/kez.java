package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class kez extends kfa {
    private final mzz a;
    private final fvu b;
    private final rwc c;
    private final owq d;
    private final boolean e;
    private boolean f;
    private final krj g;
    public final ndj h;
    public final hyh i;
    public final owf j;
    public final kdh k;
    public final nqp l;
    public final owq m;
    public final nca n;
    public final ktx o;
    public final iyu p;

    public kez(ndj ndjVar, nca ncaVar, krj krjVar, mzz mzzVar, fvu fvuVar, ktx ktxVar, hyh hyhVar, owf owfVar, kdh kdhVar, rwc rwcVar, nqp nqpVar, owq owqVar, owq owqVar2, hbj hbjVar, iyu iyuVar) {
        this.h = ndjVar;
        this.n = ncaVar;
        this.g = krjVar;
        this.a = mzzVar;
        this.b = fvuVar;
        this.o = ktxVar;
        this.i = hyhVar;
        this.j = owfVar;
        this.k = kdhVar;
        this.c = rwcVar;
        this.l = nqpVar;
        this.m = owqVar;
        this.d = owqVar2;
        this.e = hbjVar.p(hac.L);
        this.p = iyuVar;
    }

    public final void k(boolean z) throws Resources.NotFoundException {
        if (!z) {
            this.d.a(true);
        }
        rwc rwcVar = this.c;
        if (rwcVar.h()) {
            ((mhe) rwcVar.c()).l();
            ((mhe) rwcVar.c()).f();
        }
        if (z && this.e) {
            this.m.a(true);
            this.b.h();
            this.a.w(false);
        }
        this.g.k();
        this.a.m(false);
        this.b.m(false);
        if (this.f) {
            return;
        }
        kdh kdhVar = this.k;
        kdhVar.d(z);
        hyh hyhVar = this.i;
        if (((Boolean) hyhVar.b.dL()).booleanValue() || (((nkw) this.j.dL()).equals(nkw.NIGHT_SIGHT) && !hyhVar.l())) {
            kdhVar.e(178);
        }
        this.f = true;
    }

    public final void l() {
        owq owqVar = this.m;
        if (((Boolean) owqVar.dL()).booleanValue() && this.e) {
            this.a.w(true);
            this.b.r();
        }
        owqVar.a(false);
        this.d.a(false);
        this.g.j();
        this.a.m(true);
        this.b.m(true);
        this.f = false;
    }

    public final void m() {
        rwc rwcVar = this.c;
        if (rwcVar.h()) {
            ((mhe) rwcVar.c()).s();
            ((mhe) rwcVar.c()).m(rvk.a);
        }
    }

    public final void n() {
        nkw nkwVar = nkw.UNINITIALIZED;
        int iOrdinal = ((nkw) this.j.dL()).ordinal();
        if (iOrdinal == 1) {
            this.h.v();
        } else if (iOrdinal == 6) {
            this.h.w();
        } else {
            if (iOrdinal != 10) {
                return;
            }
            this.h.t();
        }
    }
}
