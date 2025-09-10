package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afg extends bup implements bwx, buv, bun, bwm, bxd {
    private static final byi g = new byi();
    public final uiq a;
    public ajx b;
    public aoq c;
    public final bkb d;
    public ocq e;
    private bry f;

    public afg(ocq ocqVar, uiq uiqVar) {
        this.e = ocqVar;
        this.a = uiqVar;
        bkb bkbVar = new bkb(0, new bxr(this, 1, (byte[]) null), 4);
        M(bkbVar);
        this.d = bkbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [bij] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [bij] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [bdp] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [bdp] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final afh a() {
        bxd bxdVar;
        bwe bweVar;
        if (this.w) {
            byi byiVar = afh.a;
            if (!this.m.w) {
                bqs.c("visitAncestors called on an unattached node");
            }
            bij bijVar = this.m.p;
            bvm bvmVarB = bko.B(this);
            loop0: while (true) {
                if (bvmVarB == null) {
                    bxdVar = null;
                    break;
                }
                if ((bvmVarB.s.f.o & 262144) != 0) {
                    while (bijVar != null) {
                        if ((bijVar.n & 262144) != 0) {
                            ?? bdpVar = 0;
                            bup bupVarY = bijVar;
                            while (bupVarY != 0) {
                                if (bupVarY instanceof bxd) {
                                    bxdVar = (bxd) bupVarY;
                                    if (a.ao(byiVar, bxdVar.dc())) {
                                        break loop0;
                                    }
                                } else if ((bupVarY.n & 262144) != 0 && (bupVarY instanceof bup)) {
                                    bij bijVar2 = bupVarY.y;
                                    int i = 0;
                                    bupVarY = bupVarY;
                                    bdpVar = bdpVar;
                                    while (bijVar2 != null) {
                                        if ((bijVar2.n & 262144) != 0) {
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
            if (bxdVar instanceof afh) {
                return (afh) bxdVar;
            }
        }
        return null;
    }

    @Override // defpackage.buv
    public final void cQ(bry bryVar) {
        this.f = bryVar;
        if (this.d.c().a()) {
            if (bryVar.dm()) {
                d();
                return;
            }
            afh afhVarA = a();
            if (afhVarA != null) {
                afhVarA.a(null);
            }
        }
    }

    public final void d() {
        afh afhVarA;
        bry bryVar = this.f;
        if (bryVar == null || !bryVar.dm() || (afhVarA = a()) == null) {
            return;
        }
        afhVarA.a(this.f);
    }

    @Override // defpackage.bij
    public final void da() {
        aoq aoqVar = this.c;
        if (aoqVar != null) {
            aoqVar.a();
        }
        this.c = null;
    }

    @Override // defpackage.bij
    public final boolean db() {
        return false;
    }

    @Override // defpackage.bxd
    public final Object dc() {
        return g;
    }

    public final aoq f() {
        uka ukaVar = new uka();
        amo.k(this, new aet(ukaVar, this, 2, null));
        return (aoq) ukaVar.a;
    }

    public final void h(ocq ocqVar, akb akbVar) {
        if (!this.w) {
            ocqVar.aF(akbVar);
        } else {
            uol uolVar = (uol) ((uvc) C()).a.get(uol.c);
            ukc.C(C(), null, 0, new agq(ocqVar, akbVar, uolVar != null ? uolVar.o(new aff(ocqVar, akbVar, 0, null)) : null, (uhb) null, 1), 3);
        }
    }

    @Override // defpackage.bwm
    public final void k() {
        aoq aoqVarF = f();
        if (this.d.c().a()) {
            aoq aoqVar = this.c;
            if (aoqVar != null) {
                aoqVar.a();
            }
            if (aoqVarF != null) {
                aoqVarF.c();
            } else {
                aoqVarF = null;
            }
            this.c = aoqVarF;
        }
    }

    public final void l(ocq ocqVar) {
        ajx ajxVar;
        if (a.ao(this.e, ocqVar)) {
            return;
        }
        ocq ocqVar2 = this.e;
        if (ocqVar2 != null && (ajxVar = this.b) != null) {
            ocqVar2.aF(new ajy(ajxVar));
        }
        this.b = null;
        this.e = ocqVar;
    }

    @Override // defpackage.bwx
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // defpackage.bwx
    public final /* synthetic */ boolean p() {
        return false;
    }

    @Override // defpackage.bwx
    public final void s(cbn cbnVar) {
        cbw.e(cbnVar, this.d.c().a());
        cbnVar.e(cbm.u, new cbc(null, new nt((Object) this, 2, (char[]) null)));
    }
}
