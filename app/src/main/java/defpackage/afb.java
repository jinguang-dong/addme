package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afb extends bij implements buu {
    public boolean a;
    public boolean b;
    public boolean c;
    public final ocq d;

    public afb(ocq ocqVar) {
        this.d = ocqVar;
    }

    @Override // defpackage.buu
    public final void cS(bvo bvoVar) {
        bvoVar.p();
        if (this.a) {
            long j = bkv.a;
            bvoVar.r(bko.k(bkv.d(j), bkv.c(j), bkv.b(j), 0.3f, bkv.f(j)), 0L, (62 & 4) != 0 ? a.ac(bvoVar.m(), 0L) : bvoVar.m(), (62 & 8) != 0 ? 1.0f : 0.0f, (62 & 16) != 0 ? bmx.a : null, (62 & 32) != 0 ? null : null, (62 & 64) != 0 ? 3 : 0);
        } else if (this.b || this.c) {
            long j2 = bkv.a;
            bvoVar.r(bko.k(bkv.d(j2), bkv.c(j2), bkv.b(j2), 0.1f, bkv.f(j2)), 0L, (62 & 4) != 0 ? a.ac(bvoVar.m(), 0L) : bvoVar.m(), (62 & 8) != 0 ? 1.0f : 0.0f, (62 & 16) != 0 ? bmx.a : null, (62 & 32) != 0 ? null : null, (62 & 64) != 0 ? 3 : 0);
        }
    }

    @Override // defpackage.bij
    public final void cW() {
        ukc.C(C(), null, 0, new vf(this, (uhb) null, 6), 3);
    }

    @Override // defpackage.buu
    public final /* synthetic */ void cR() {
    }
}
