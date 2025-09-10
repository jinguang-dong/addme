package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bvy {
    public final bvm a;
    public boolean b;
    public boolean c;
    public cho f;
    public final byz g = new byz((char[]) null);
    public final det h = new det((byte[]) null);
    public final bdp d = new bdp(new bwr[16]);
    public final bdp e = new bdp(new hwv[16]);
    public final amo i = null;

    public bvy(bvm bvmVar) {
        this.a = bvmVar;
    }

    public static final boolean l(bvm bvmVar, cho choVar) {
        if (bvmVar.h == null) {
            return false;
        }
        boolean zAj = choVar != null ? bvmVar.aj(choVar) : bvmVar.aj(bvmVar.t.c());
        bvm bvmVarJ = bvmVar.j();
        if (zAj && bvmVarJ != null) {
            if (bvmVarJ.h == null) {
                bvm.ar(bvmVarJ, false, 3);
                return zAj;
            }
            if (bvmVar.ay() == 1) {
                bvm.ap(bvmVarJ, false, 3);
                return zAj;
            }
            if (bvmVar.ay() == 2) {
                bvmVarJ.R(false);
                return true;
            }
        }
        return zAj;
    }

    public static final boolean m(bvm bvmVar, cho choVar) {
        boolean zAk = choVar != null ? bvmVar.ak(choVar) : bvmVar.ak(bvmVar.t.b());
        bvm bvmVarJ = bvmVar.j();
        if (zAk && bvmVarJ != null) {
            if (bvmVar.ax() == 1) {
                bvm.ar(bvmVarJ, false, 3);
                return zAk;
            }
            if (bvmVar.ax() == 2) {
                bvmVarJ.S(false);
                return true;
            }
        }
        return zAk;
    }

    public static final boolean n(bvm bvmVar) {
        return bvmVar.ae() && t(bvmVar);
    }

    public static final boolean o(bvm bvmVar) {
        bvm bvmVarJ;
        if (!bvmVar.af()) {
            return false;
        }
        do {
            if ((!s(bvmVar) && ((bvmVarJ = bvmVar.j()) == null || bvmVarJ.aw() != 1)) || (bvmVar = bvmVar.j()) == null) {
                return false;
            }
        } while (!bvmVar.ah());
        return true;
    }

    private final void p(bvm bvmVar, boolean z) {
        bdp bdpVarI = bvmVar.i();
        Object[] objArr = bdpVarI.a;
        int i = bdpVarI.b;
        for (int i2 = 0; i2 < i; i2++) {
            bvm bvmVar2 = (bvm) objArr[i2];
            if ((!z && s(bvmVar2)) || (z && t(bvmVar2))) {
                if (byi.q(bvmVar2) && !z) {
                    if (bvmVar2.ae() && this.g.h(bvmVar2)) {
                        r(bvmVar2, true, false);
                    } else {
                        e(bvmVar2, true);
                    }
                }
                q(bvmVar2, z);
                if (!u(bvmVar2, z)) {
                    p(bvmVar2, z);
                }
            }
        }
        q(bvmVar, z);
    }

    private final void q(bvm bvmVar, boolean z) {
        if (u(bvmVar, z)) {
            r(bvmVar, z, false);
        }
    }

    private final boolean r(bvm bvmVar, boolean z, boolean z2) {
        cho choVar;
        boolean zL;
        btd btaVar;
        bvm bvmVarJ;
        bvx bvxVar;
        buf bufVar;
        if (bvmVar.w) {
            return false;
        }
        if (!bvmVar.ah() && !bvmVar.ai() && !o(bvmVar) && !a.ao(bvmVar.q(), true) && !n(bvmVar)) {
            bvq bvqVar = bvmVar.t;
            if (!bvqVar.o.v.j() && ((bvxVar = bvqVar.p) == null || (bufVar = bvxVar.p) == null || !bufVar.j())) {
                return false;
            }
        }
        bvm bvmVar2 = this.a;
        if (bvmVar == bvmVar2) {
            choVar = this.f;
            choVar.getClass();
        } else {
            choVar = null;
        }
        if (z) {
            zL = bvmVar.ae() ? l(bvmVar, choVar) : false;
            if (z2 && ((zL || bvmVar.ad()) && a.ao(bvmVar.q(), true))) {
                bvmVar.I();
            }
        } else {
            boolean zM = bvmVar.af() ? m(bvmVar, choVar) : false;
            if (z2 && bvmVar.ac() && (bvmVar == bvmVar2 || ((bvmVarJ = bvmVar.j()) != null && bvmVarJ.ah() && bvmVar.ai()))) {
                if (bvmVar == bvmVar2) {
                    if (bvmVar.x == 3) {
                        bvmVar.y();
                    }
                    bvm bvmVarJ2 = bvmVar.j();
                    if (bvmVarJ2 == null || (btaVar = bvmVarJ2.n().l) == null) {
                        bws bwsVarA = bvp.a(bvmVar);
                        uiq uiqVar = btf.a;
                        btaVar = new bta(bwsVarA);
                    }
                    btd.s(btaVar, bvmVar.m(), 0, 0);
                } else {
                    bvmVar.Q();
                }
                this.h.h(bvmVar);
                ((bxv) bvp.a(bvmVar)).k.c(bvmVar);
            }
            zL = zM;
        }
        c();
        return zL;
    }

    private static final boolean s(bvm bvmVar) {
        return bvmVar.ax() == 1 || bvmVar.t.o.v.j();
    }

    private static final boolean t(bvm bvmVar) {
        buf bufVar;
        if (bvmVar.ay() == 1) {
            return true;
        }
        bvx bvxVar = bvmVar.t.p;
        return (bvxVar == null || (bufVar = bvxVar.p) == null || !bufVar.j()) ? false : true;
    }

    private static final boolean u(bvm bvmVar, boolean z) {
        return z ? bvmVar.ae() : bvmVar.af();
    }

    public final void a() {
        bdp bdpVar = this.d;
        Object[] objArr = bdpVar.a;
        int i = bdpVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((bwr) objArr[i2]).a();
        }
        bdpVar.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(boolean r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L13
            det r6 = r5.h
            bvm r0 = r5.a
            java.lang.Object r6 = r6.a
            bdp r6 = (defpackage.bdp) r6
            r6.g()
            r6.n(r0)
            r6 = 1
            r0.v = r6
        L13:
            det r5 = r5.h
            java.lang.Object r6 = r5.a
            bur r0 = defpackage.bur.a
            bdp r6 = (defpackage.bdp) r6
            r6.j(r0)
            int r0 = r6.b
            java.lang.Object r1 = r5.b
            if (r1 == 0) goto L2a
            r2 = r1
            bvm[] r2 = (defpackage.bvm[]) r2
            int r2 = r2.length
            if (r2 >= r0) goto L32
        L2a:
            r1 = 16
            int r1 = java.lang.Math.max(r1, r0)
            bvm[] r1 = new defpackage.bvm[r1]
        L32:
            r2 = 0
            r5.b = r2
            r2 = 0
        L36:
            if (r2 >= r0) goto L46
            java.lang.Object[] r3 = r6.a
            r3 = r3[r2]
            bvm r3 = (defpackage.bvm) r3
            r4 = r1
            bvm[] r4 = (defpackage.bvm[]) r4
            r4[r2] = r3
            int r2 = r2 + 1
            goto L36
        L46:
            r6.g()
        L49:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L5d
            r6 = r1
            bvm[] r6 = (defpackage.bvm[]) r6
            r6 = r6[r0]
            r6.getClass()
            boolean r2 = r6.v
            if (r2 == 0) goto L49
            r5.g(r6)
            goto L49
        L5d:
            r5.b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvy.b(boolean):void");
    }

    public final void c() {
        bdp bdpVar = this.e;
        int i = bdpVar.b;
        if (i != 0) {
            Object[] objArr = bdpVar.a;
            for (int i2 = 0; i2 < i; i2++) {
                hwv hwvVar = (hwv) objArr[i2];
                bvm bvmVar = (bvm) hwvVar.c;
                if (bvmVar.ag()) {
                    if (hwvVar.b) {
                        bvm.ap(bvmVar, hwvVar.a, 2);
                    } else {
                        bvm.ar(bvmVar, hwvVar.a, 2);
                    }
                }
            }
            bdpVar.g();
        }
    }

    public final void d(bvm bvmVar) {
        bdp bdpVarI = bvmVar.i();
        Object[] objArr = bdpVarI.a;
        int i = bdpVarI.b;
        for (int i2 = 0; i2 < i; i2++) {
            bvm bvmVar2 = (bvm) objArr[i2];
            if (a.ao(bvmVar2.q(), true) && !bvmVar2.w) {
                if (this.g.h(bvmVar2)) {
                    bvmVar2.I();
                }
                d(bvmVar2);
            }
        }
    }

    public final void e(bvm bvmVar, boolean z) {
        if (!this.b) {
            bqs.c("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (u(bvmVar, z)) {
            bqs.b("node not yet measured");
        }
        p(bvmVar, z);
    }

    public final void f(bvm bvmVar) {
        bdp bdpVarI = bvmVar.i();
        Object[] objArr = bdpVarI.a;
        int i = bdpVarI.b;
        for (int i2 = 0; i2 < i; i2++) {
            bvm bvmVar2 = (bvm) objArr[i2];
            if (s(bvmVar2)) {
                if (byi.q(bvmVar2)) {
                    g(bvmVar2, true);
                } else {
                    f(bvmVar2);
                }
            }
        }
    }

    public final void g(bvm bvmVar, boolean z) {
        cho choVar;
        if (bvmVar.w) {
            return;
        }
        if (bvmVar == this.a) {
            choVar = this.f;
            choVar.getClass();
        } else {
            choVar = null;
        }
        if (z) {
            l(bvmVar, choVar);
        } else {
            m(bvmVar, choVar);
        }
    }

    public final boolean h() {
        return this.g.g();
    }

    public final boolean i(uif uifVar) {
        boolean z;
        bvm bvmVar = this.a;
        if (!bvmVar.ag()) {
            bqs.b("performMeasureAndLayout called with unattached root");
        }
        if (!bvmVar.ah()) {
            bqs.b("performMeasureAndLayout called with unplaced root");
        }
        if (this.b) {
            bqs.b("performMeasureAndLayout called during measure layout");
        }
        boolean z2 = false;
        if (this.f != null) {
            this.b = true;
            this.c = true;
            try {
                byz byzVar = this.g;
                if (byzVar.g()) {
                    z = false;
                    while (byzVar.g()) {
                        Object obj = byzVar.b;
                        boolean zD = ((buq) obj).d();
                        boolean z3 = !zD;
                        bvm bvmVarA = (!zD ? (buq) obj : (buq) byzVar.a).a();
                        boolean zR = r(bvmVarA, z3, true);
                        if (bvmVarA == bvmVar && zR) {
                            z = true;
                        }
                    }
                    if (uifVar != null) {
                        uifVar.a();
                    }
                } else {
                    z = false;
                }
                this.b = false;
                this.c = false;
                z2 = z;
            } finally {
            }
        }
        a();
        return z2;
    }

    public final boolean j(bvm bvmVar, boolean z) {
        int iAw = bvmVar.aw();
        int i = iAw - 1;
        if (iAw == 0) {
            throw null;
        }
        if (i != 0 && i != 1) {
            if (i == 2 || i == 3) {
                this.e.n(new hwv(bvmVar, false, z));
            } else {
                if (i != 4) {
                    throw new uet();
                }
                if (!bvmVar.af() || z) {
                    bvmVar.L();
                    if (!bvmVar.w && (bvmVar.ah() || o(bvmVar))) {
                        bvm bvmVarJ = bvmVar.j();
                        if (bvmVarJ == null || !bvmVarJ.af()) {
                            this.g.f(bvmVar, false);
                        }
                        if (!this.c) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
