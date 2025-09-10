package defpackage;

import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bui extends bij implements bve, buu, bwx, bww, bub, bud, bwv, bvd, buv, bjy, bwt, buo {
    public bii a;
    public boolean b;
    public final HashSet c;
    public bry d;
    private bty e;

    public bui(bii biiVar) {
        this.n = bwj.a(biiVar);
        this.a = biiVar;
        this.b = true;
        this.c = new HashSet();
    }

    @Override // defpackage.bve
    public final bss a(bst bstVar, bsq bsqVar, long j) {
        bii biiVar = this.a;
        biiVar.getClass();
        return ((bsa) biiVar).f();
    }

    @Override // defpackage.bve
    public final int c(brv brvVar, bru bruVar, int i) {
        bii biiVar = this.a;
        biiVar.getClass();
        return ((bsa) biiVar).d();
    }

    @Override // defpackage.buv
    public final void cQ(bry bryVar) {
        bii biiVar = this.a;
        biiVar.getClass();
        ((bsw) biiVar).e();
    }

    @Override // defpackage.buu
    public final void cR() {
        this.b = true;
        bko.x(this);
    }

    @Override // defpackage.buu
    public final void cS(bvo bvoVar) {
        bii biiVar = this.a;
        biiVar.getClass();
        bjj bjjVar = (bjj) biiVar;
        if (this.b && (biiVar instanceof bji)) {
            ((bxv) bko.D(this)).t.d(this, buk.b, new bsl(biiVar, 4));
            this.b = false;
        }
        bjjVar.d(bvoVar);
    }

    @Override // defpackage.bij
    public final void cW() {
        q(true);
    }

    @Override // defpackage.bww
    public final void cX() {
        bii biiVar = this.a;
        biiVar.getClass();
        ((bqa) biiVar).d().a();
    }

    @Override // defpackage.bij
    public final void cY() {
        if (this.a instanceof bqa) {
            cX();
        }
    }

    @Override // defpackage.bij
    public final void cZ() {
        r();
    }

    @Override // defpackage.bve
    public final int d(brv brvVar, bru bruVar, int i) {
        bii biiVar = this.a;
        biiVar.getClass();
        return ((bsa) biiVar).e();
    }

    @Override // defpackage.bvd
    public final void dd(bry bryVar) {
        this.d = bryVar;
        bii biiVar = this.a;
        if (biiVar instanceof bsy) {
            ((bsy) biiVar).d();
        }
    }

    @Override // defpackage.bwv
    public final Object de(Object obj) {
        bii biiVar = this.a;
        biiVar.getClass();
        return ((btb) biiVar).d(obj);
    }

    @Override // defpackage.bwt
    public final boolean dn() {
        return this.w;
    }

    @Override // defpackage.bve
    public final int e(brv brvVar, bru bruVar, int i) {
        bii biiVar = this.a;
        biiVar.getClass();
        return ((bsa) biiVar).g();
    }

    @Override // defpackage.bve
    public final int f(brv brvVar, bru bruVar, int i) {
        bii biiVar = this.a;
        biiVar.getClass();
        return ((bsa) biiVar).h();
    }

    @Override // defpackage.bub
    public final bua h() {
        bty btyVar = this.e;
        return btyVar != null ? btyVar : btz.a;
    }

    @Override // defpackage.bvd
    public final void k(long j) {
        bii biiVar = this.a;
        if (biiVar instanceof bsz) {
            ((bsz) biiVar).d();
        }
    }

    @Override // defpackage.bww
    public final /* synthetic */ void l() {
        amo.j(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [bij] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [bij] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [bdp] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [bdp] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, uif] */
    @Override // defpackage.bud
    public final Object m(ocq ocqVar) {
        bwe bweVar;
        this.c.add(ocqVar);
        if (!this.m.w) {
            bqs.c("visitAncestors called on an unattached node");
        }
        bij bijVar = this.m.p;
        bvm bvmVarB = bko.B(this);
        while (bvmVarB != null) {
            if ((bvmVarB.s.f.o & 32) != 0) {
                while (bijVar != null) {
                    if ((bijVar.n & 32) != 0) {
                        bup bupVarY = bijVar;
                        ?? bdpVar = 0;
                        while (bupVarY != 0) {
                            if (bupVarY instanceof bub) {
                                bub bubVar = (bub) bupVarY;
                                if (bubVar.h().b(ocqVar)) {
                                    return bubVar.h().a(ocqVar);
                                }
                            } else if ((bupVarY.n & 32) != 0 && (bupVarY instanceof bup)) {
                                bij bijVar2 = bupVarY.y;
                                int i = 0;
                                bupVarY = bupVarY;
                                bdpVar = bdpVar;
                                while (bijVar2 != null) {
                                    if ((bijVar2.n & 32) != 0) {
                                        i++;
                                        bdpVar = bdpVar;
                                        if (i == 1) {
                                            bupVarY = bijVar2;
                                        } else {
                                            if (bdpVar == 0) {
                                                bdpVar = new bdp(new bij[16]);
                                            }
                                            if (bupVarY != 0) {
                                                bdpVar.n(bupVarY);
                                            }
                                            bdpVar.n(bijVar2);
                                            bupVarY = 0;
                                        }
                                    }
                                    bijVar2 = bijVar2.q;
                                    bupVarY = bupVarY;
                                    bdpVar = bdpVar;
                                }
                                if (i != 1) {
                                }
                            }
                            bupVarY = bko.y(bdpVar);
                        }
                    }
                    bijVar = bijVar.p;
                }
            }
            bvmVarB = bvmVarB.j();
            bijVar = (bvmVarB == null || (bweVar = bvmVarB.s) == null) ? null : bweVar.e;
        }
        return ocqVar.a.a();
    }

    @Override // defpackage.bwx
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // defpackage.bwx
    public final /* synthetic */ boolean p() {
        return false;
    }

    public final void q(boolean z) {
        if (!this.w) {
            bqs.c("initializeModifier called on unattached node");
        }
        bii biiVar = this.a;
        if ((this.n & 32) != 0) {
            if (biiVar instanceof ald) {
                J(new bsl(this, 3));
            }
            if (biiVar instanceof buc) {
                buc bucVar = (buc) biiVar;
                bty btyVar = this.e;
                if (btyVar == null || !btyVar.b(bucVar.e())) {
                    this.e = new bty(bucVar);
                    if (buk.a(this)) {
                        bjq bjqVar = ((bxv) bko.D(this)).L;
                        ocq ocqVarE = bucVar.e();
                        ((bdp) bjqVar.e).n(this);
                        ((bdp) bjqVar.d).n(ocqVarE);
                        bjqVar.b();
                    }
                } else {
                    btyVar.a = bucVar;
                    bjq bjqVar2 = ((bxv) bko.D(this)).L;
                    ocq ocqVarE2 = bucVar.e();
                    ((bdp) bjqVar2.e).n(this);
                    ((bdp) bjqVar2.d).n(ocqVarE2);
                    bjqVar2.b();
                }
            }
        }
        if ((this.n & 4) != 0) {
            if (biiVar instanceof bji) {
                this.b = true;
            }
            if (!z) {
                bko.t(this);
            }
        }
        if ((this.n & 2) != 0) {
            if (buk.a(this)) {
                bwi bwiVar = this.s;
                bwiVar.getClass();
                ((bvh) bwiVar).D(this);
                bwiVar.ag();
            }
            if (!z) {
                bko.t(this);
                bko.B(this).G();
            }
        }
        if (biiVar instanceof bti) {
            ((bti) biiVar).d(bko.B(this));
        }
        if ((this.n & 128) != 0) {
            if ((biiVar instanceof bsz) && buk.a(this)) {
                bko.B(this).G();
            }
            if (biiVar instanceof bsy) {
                this.d = null;
                if (buk.a(this)) {
                    bws bwsVarD = bko.D(this);
                    bxv bxvVar = (bxv) bwsVarD;
                    bxvVar.u.d.n(new buh(this));
                    bxvVar.J(null);
                }
            }
        }
        if ((this.n & 256) != 0 && (biiVar instanceof bsw) && buk.a(this)) {
            bko.B(this).G();
        }
        if (biiVar instanceof bjx) {
            ((bjx) biiVar).d().d.n(this);
        }
        int i = this.n;
        if ((i & 16) != 0 && (biiVar instanceof bqa)) {
            ((bqa) biiVar).d();
            throw null;
        }
        if ((i & 8) != 0) {
            bko.D(this).l();
        }
    }

    public final void r() {
        if (!this.w) {
            bqs.c("unInitializeModifier called on unattached node");
        }
        bii biiVar = this.a;
        if ((this.n & 32) != 0) {
            if (biiVar instanceof buc) {
                bjq bjqVar = ((bxv) bko.D(this)).L;
                ocq ocqVarE = ((buc) biiVar).e();
                ((bdp) bjqVar.c).n(bko.B(this));
                ((bdp) bjqVar.b).n(ocqVarE);
                bjqVar.b();
            }
            if (biiVar instanceof ald) {
                ((ald) biiVar).d(buk.a);
            }
        }
        if ((this.n & 8) != 0) {
            bko.D(this).l();
        }
        if (biiVar instanceof bjx) {
            ((bjx) biiVar).d().d.m(this);
        }
    }

    @Override // defpackage.bwx
    public final void s(cbn cbnVar) {
        int i;
        char c;
        bii biiVar = this.a;
        biiVar.getClass();
        cbn cbnVarD = ((cbo) biiVar).d();
        cbnVar.getClass();
        if (cbnVarD.a) {
            cbnVar.a = true;
        }
        if (cbnVarD.b) {
            cbnVar.b = true;
        }
        zu zuVar = cbnVarD.c;
        Object[] objArr = zuVar.b;
        Object[] objArr2 = zuVar.c;
        long[] jArr = zuVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = i2 - length;
                int i4 = 0;
                while (true) {
                    i = 8 - ((~i3) >>> 31);
                    if (i4 >= i) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        int i5 = (i2 << 3) + i4;
                        Object obj = objArr[i5];
                        Object obj2 = objArr2[i5];
                        cbz cbzVar = (cbz) obj;
                        zu zuVar2 = cbnVar.c;
                        if (!zu.e(zuVar2, cbzVar)) {
                            zuVar2.j(cbzVar, obj2);
                        } else if (obj2 instanceof cbc) {
                            Object objA = zuVar2.a(cbzVar);
                            objA.getClass();
                            cbc cbcVar = (cbc) objA;
                            String str = cbcVar.a;
                            c = '\b';
                            if (str == null) {
                                str = ((cbc) obj2).a;
                            }
                            uep uepVar = cbcVar.b;
                            if (uepVar == null) {
                                uepVar = ((cbc) obj2).b;
                            }
                            zuVar2.j(cbzVar, new cbc(str, uepVar));
                        }
                        c = '\b';
                    } else {
                        c = '\b';
                    }
                    j >>= c;
                    i4++;
                }
                if (i != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void t() {
        if (this.w) {
            this.c.clear();
            ((bxv) bko.D(this)).t.d(this, buk.c, new bsl(this, 5));
        }
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // defpackage.bww
    public final void u(bpp bppVar, int i, long j) {
        bii biiVar = this.a;
        biiVar.getClass();
        ((bqa) biiVar).d().b();
    }

    @Override // defpackage.bww
    public final void v() {
        bii biiVar = this.a;
        biiVar.getClass();
        ((bqa) biiVar).d();
        throw null;
    }

    public final void x() {
        bii biiVar = this.a;
        if (!(biiVar instanceof bjr)) {
            bqs.c("applyFocusProperties called on wrong node");
        }
        ((bjr) biiVar).d();
    }

    @Override // defpackage.bww
    public final void y() {
        bii biiVar = this.a;
        biiVar.getClass();
        ((bqa) biiVar).d();
        throw null;
    }

    public final void z() {
        bii biiVar = this.a;
        if (!(biiVar instanceof bjn)) {
            bqs.c("onFocusEvent called on wrong node");
        }
        ((bjn) biiVar).d();
    }
}
