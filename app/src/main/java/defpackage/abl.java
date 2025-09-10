package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abl extends abf {
    public aby a;
    public bie b;
    private boolean e;
    private long c = -9223372034707292160L;
    private long d = chp.k(0, 0, 15);
    private final azr f = new azz(null, bap.c);

    public abl(aby abyVar, bie bieVar) {
        this.a = abyVar;
        this.b = bieVar;
    }

    @Override // defpackage.bve
    public final bss a(bst bstVar, bsq bsqVar, long j) {
        bte bteVarR;
        char c;
        long j2;
        abl ablVar;
        abi abiVar;
        long jE;
        abi abiVar2;
        if (bstVar.dt()) {
            this.d = j;
            this.e = true;
            bteVarR = bsqVar.r(j);
        } else {
            bteVarR = bsqVar.r(this.e ? this.d : j);
        }
        bte bteVar = bteVarR;
        long j3 = (bteVar.b & 4294967295L) | (bteVar.a << 32);
        if (bstVar.dt()) {
            this.c = j3;
            ablVar = this;
            jE = j3;
            c = ' ';
            j2 = 4294967295L;
        } else {
            long j4 = this.c;
            if (true != byi.bi(j4)) {
                j4 = j3;
            }
            abi abiVar3 = (abi) this.f.a();
            if (abiVar3 != null) {
                abr abrVar = abiVar3.a;
                boolean z = (a.q(j4, ((cia) abrVar.d()).a) || abrVar.j()) ? false : true;
                c = ' ';
                j2 = 4294967295L;
                if (!a.q(j4, ((cia) abrVar.c()).a) || z) {
                    abiVar3.b = ((cia) abrVar.d()).a;
                    abiVar2 = abiVar3;
                    ablVar = this;
                    ukc.C(C(), null, 0, new abj(abiVar2, j4, ablVar, null), 3);
                } else {
                    ablVar = this;
                    abiVar2 = abiVar3;
                }
                abiVar = abiVar2;
            } else {
                long j5 = j4;
                c = ' ';
                j2 = 4294967295L;
                ablVar = this;
                abiVar = new abi(new abr(new cia(j5), adu.h, new cia(4294967297L), 8), j5);
            }
            ablVar.h(abiVar);
            jE = chp.e(j, ((cia) abiVar.a.d()).a);
        }
        int i = (int) (jE >> c);
        int i2 = (int) (jE & j2);
        return bstVar.ds(i, i2, ufx.a, new abk(ablVar, j3, i, i2, bstVar, bteVar));
    }

    @Override // defpackage.bij
    public final void cW() {
        this.c = -9223372034707292160L;
        this.e = false;
    }

    @Override // defpackage.bij
    public final void da() {
        h(null);
    }

    public final void h(abi abiVar) {
        this.f.b(abiVar);
    }
}
