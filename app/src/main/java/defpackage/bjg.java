package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjg extends bij implements bxd, buo, bvd {
    public final uiq a;
    public bjg b;
    public long c;
    public bjg d;
    private final Object e;

    public bjg() {
        this(null);
    }

    @Override // defpackage.bij
    public final void cZ() {
        this.d = null;
        this.b = null;
    }

    public final void d(ejs ejsVar) {
        bjg bjgVar = this.b;
        if (bjgVar != null) {
            bjgVar.d(ejsVar);
        }
        this.b = null;
    }

    @Override // defpackage.bxd
    public final Object dc() {
        return this.e;
    }

    public final void e(ejs ejsVar) {
        bxd bxdVar;
        bjg bjgVar;
        bjg bjgVar2 = this.b;
        bjg bjgVar3 = null;
        if (bjgVar2 == null || !kk.l(bjgVar2, kk.o(ejsVar))) {
            if (this.m.w) {
                uka ukaVar = new uka();
                bad.B(this, new bjt(ukaVar, this, ejsVar, 1));
                bxdVar = (bxd) ukaVar.a;
            } else {
                bxdVar = null;
            }
            bjgVar = (bjg) bxdVar;
        } else {
            bjgVar = bjgVar2;
        }
        if (bjgVar != null && bjgVar2 == null) {
            bjgVar.e(ejsVar);
        } else if (bjgVar == null && bjgVar2 != null) {
            bjgVar2.d(ejsVar);
        } else if (!a.ao(bjgVar, bjgVar2)) {
            if (bjgVar != null) {
                bjgVar.e(ejsVar);
                bjgVar3 = bjgVar;
            }
            if (bjgVar2 != null) {
                bjgVar2.d(ejsVar);
            }
            bjgVar = bjgVar3;
        } else if (bjgVar != null) {
            bjgVar.e(ejsVar);
        }
        this.b = bjgVar;
    }

    @Override // defpackage.bvd
    public final void k(long j) {
        this.c = j;
    }

    public /* synthetic */ bjg(byte[] bArr) {
        this.a = null;
        this.e = bjf.a;
        this.c = 0L;
    }

    @Override // defpackage.bvd
    public final /* synthetic */ void dd(bry bryVar) {
    }
}
