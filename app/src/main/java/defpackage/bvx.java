package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bvx extends bte implements bsq, bug, bwb {
    public final bvq f;
    public boolean g;
    public boolean j;
    public boolean k;
    public cho l;
    public uiq n;
    public bmz o;
    public boolean s;
    public boolean v;
    private boolean y;
    public int h = Integer.MAX_VALUE;
    public int i = Integer.MAX_VALUE;
    public int w = 3;
    public long m = 0;
    public int x = 3;
    public final buf p = new bvr(this);
    public final bdp q = new bdp(new bvx[16]);
    public boolean r = true;
    public boolean t = true;
    public Object u = q().q;

    public bvx(bvq bvqVar) {
        this.f = bvqVar;
    }

    private final void I() {
        int i = this.x;
        if (D()) {
            this.x = 2;
        } else {
            this.x = 1;
        }
        if (i != 1 && this.f.d) {
            bvm.ap(p(), true, 6);
        }
        bdp bdpVarI = p().i();
        Object[] objArr = bdpVarI.a;
        int i2 = bdpVarI.b;
        for (int i3 = 0; i3 < i2; i3++) {
            bvm bvmVar = (bvm) objArr[i3];
            bvx bvxVarL = bvmVar.l();
            if (bvxVarL == null) {
                throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
            }
            if (bvxVarL.i != Integer.MAX_VALUE) {
                bvxVarL.I();
                bvmVar.T(bvmVar);
            }
        }
    }

    private final void J() {
        int i;
        bvm.ap(p(), false, 7);
        bvm bvmVarJ = p().j();
        if (bvmVarJ == null || p().x != 3) {
            return;
        }
        bvm bvmVarP = p();
        int iAw = bvmVarJ.aw();
        int i2 = iAw - 1;
        if (iAw == 0) {
            throw null;
        }
        if (i2 != 0) {
            i = 2;
            if (i2 != 2) {
                i = bvmVarJ.x;
            }
        } else {
            i = 1;
        }
        bvmVarP.x = i;
    }

    private final boolean K() {
        return this.f.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A() {
        /*
            r4 = this;
            r0 = 1
            r4.v = r0
            bvm r1 = r4.p()
            bvm r1 = r1.j()
            int r2 = r4.x
            if (r2 == r0) goto L18
            boolean r3 = r4.D()
            if (r3 == 0) goto L1e
            r3 = 2
            if (r2 == r3) goto L2a
        L18:
            boolean r2 = r4.D()
            if (r2 == 0) goto L2a
        L1e:
            r4.I()
            boolean r2 = r4.g
            if (r2 == 0) goto L2a
            if (r1 == 0) goto L2a
            defpackage.bvm.ao(r1)
        L2a:
            if (r1 == 0) goto L54
            boolean r2 = r4.g
            if (r2 != 0) goto L57
            int r2 = r1.aw()
            r3 = 3
            if (r2 == r3) goto L3e
            int r2 = r1.aw()
            r3 = 4
            if (r2 != r3) goto L57
        L3e:
            int r2 = r4.i
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == r3) goto L4a
            java.lang.String r2 = "Place was called on a node which was placed already"
            defpackage.bqs.c(r2)
        L4a:
            bvq r1 = r1.t
            int r2 = r1.g
            r4.i = r2
            int r2 = r2 + r0
            r1.g = r2
            goto L57
        L54:
            r0 = 0
            r4.i = r0
        L57:
            r4.l()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvx.A():void");
    }

    public final void B(boolean z) {
        this.f.e = z;
    }

    public final void C(boolean z) {
        this.f.f = z;
    }

    public final boolean D() {
        return this.f.c;
    }

    public final boolean E(long j) throws Throwable {
        cho choVar;
        bvm bvmVarP = p();
        try {
            if (p().w) {
                bqs.b("measure is called on a deactivated node");
            }
            bvm bvmVarJ = p().j();
            p().r = p().r || (bvmVarJ != null && bvmVarJ.r);
            if (!p().ae() && (choVar = this.l) != null && a.q(choVar.a, j)) {
                bws bwsVar = p().i;
                if (bwsVar != null) {
                    bwsVar.e(p(), true);
                }
                p().V();
                return false;
            }
            this.l = new cho(j);
            v(j);
            this.p.f = false;
            k(aap.h);
            long j2 = this.y ? this.c : -9223372034707292160L;
            this.y = true;
            bvu bvuVarY = x().y();
            if (bvuVarY == null) {
                bqs.c("Lookahead result from lookaheadRemeasure cannot be null");
            }
            bvx bvxVar = this.f.p;
            if (bvxVar != null) {
                bvxVar.H(2);
                bvxVar.f.d = false;
                ((bxv) bvp.a(bvxVar.p())).t.c(bvxVar.p(), true, new bvv(bvxVar, j));
                bvxVar.B(true);
                bvxVar.C(true);
                if (byi.q(bvxVar.p())) {
                    bvxVar.q().y();
                } else {
                    bvxVar.q().z();
                }
                bvxVar.H(5);
            }
            u((bvuVarY.b & 4294967295L) | (bvuVarY.a << 32));
            if (((int) (j2 >> 32)) == bvuVarY.a) {
                if (((int) (j2 & 4294967295L)) == bvuVarY.b) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            bvmVarP.as(th);
            throw new uer();
        }
    }

    public final void F(long j, uiq uiqVar, bmz bmzVar) throws Throwable {
        bvm bvmVarP = p();
        try {
            bvm bvmVarJ = p().j();
            if (bvmVarJ != null && bvmVarJ.aw() == 4) {
                this.f.c = false;
            }
            if (p().w) {
                bqs.b("place is called on a deactivated node");
            }
            H(4);
            this.k = true;
            this.v = false;
            if (!a.q(j, this.m)) {
                bvq bvqVar = this.f;
                if (bvqVar.m || bvqVar.l) {
                    B(true);
                }
                z();
            }
            bws bwsVarA = bvp.a(p());
            if (K() || !o()) {
                this.f.k(false);
                this.p.g = false;
                ((bxv) bwsVarA).t.a(p(), true, new bvw(this, bwsVarA, j));
            } else {
                bvu bvuVarY = x().y();
                bvuVarY.getClass();
                bvuVarY.z(chy.d(j, bvuVarY.e));
                A();
            }
            this.m = j;
            this.n = uiqVar;
            this.o = bmzVar;
            H(5);
        } catch (Throwable th) {
            bvmVarP.as(th);
            throw new uer();
        }
    }

    public final int G() {
        return this.f.q;
    }

    public final void H(int i) {
        this.f.q = i;
    }

    @Override // defpackage.bwb
    public final void N(boolean z) {
        bvu bvuVarY;
        bvu bvuVarY2 = x().y();
        if (a.ao(Boolean.valueOf(z), bvuVarY2 != null ? Boolean.valueOf(bvuVarY2.i) : null) || (bvuVarY = x().y()) == null) {
            return;
        }
        bvuVarY.i = z;
    }

    @Override // defpackage.bru
    public final int c(int i) {
        J();
        bvu bvuVarY = x().y();
        bvuVarY.getClass();
        return bvuVarY.c(i);
    }

    @Override // defpackage.bru
    public final int d(int i) {
        J();
        bvu bvuVarY = x().y();
        bvuVarY.getClass();
        return bvuVarY.d(i);
    }

    @Override // defpackage.bte
    public final void df(long j, uiq uiqVar) throws Throwable {
        F(j, uiqVar, null);
    }

    @Override // defpackage.bsu
    public final int dl(bqv bqvVar) {
        bvm bvmVarJ = p().j();
        if (bvmVarJ == null || bvmVarJ.aw() != 2) {
            bvm bvmVarJ2 = p().j();
            if (bvmVarJ2 != null && bvmVarJ2.aw() == 4) {
                this.p.d = true;
            }
        } else {
            this.p.c = true;
        }
        this.j = true;
        bvu bvuVarY = x().y();
        bvuVarY.getClass();
        int iDl = bvuVarY.dl(bqvVar);
        this.j = false;
        return iDl;
    }

    @Override // defpackage.bru
    public final int e(int i) {
        J();
        bvu bvuVarY = x().y();
        bvuVarY.getClass();
        return bvuVarY.e(i);
    }

    @Override // defpackage.bru
    public final int f(int i) {
        J();
        bvu bvuVarY = x().y();
        bvuVarY.getClass();
        return bvuVarY.f(i);
    }

    @Override // defpackage.bte, defpackage.bru
    public final Object g() {
        return this.u;
    }

    @Override // defpackage.bug
    public final buf h() {
        return this.p;
    }

    @Override // defpackage.bug
    public final bug i() {
        bvq bvqVar;
        bvm bvmVarJ = p().j();
        if (bvmVarJ == null || (bvqVar = bvmVarJ.t) == null) {
            return null;
        }
        return bvqVar.p;
    }

    @Override // defpackage.bug
    public final bwi j() {
        return p().n();
    }

    @Override // defpackage.bug
    public final void k(uiq uiqVar) {
        bdp bdpVarI = p().i();
        Object[] objArr = bdpVarI.a;
        int i = bdpVarI.b;
        for (int i2 = 0; i2 < i; i2++) {
            bvx bvxVar = ((bvm) objArr[i2]).t.p;
            bvxVar.getClass();
            uiqVar.a(bvxVar);
        }
    }

    @Override // defpackage.bug
    public final void l() {
        this.s = true;
        buf bufVar = this.p;
        bufVar.g();
        if (K()) {
            bdp bdpVarI = p().i();
            Object[] objArr = bdpVarI.a;
            int i = bdpVarI.b;
            for (int i2 = 0; i2 < i; i2++) {
                bvm bvmVar = (bvm) objArr[i2];
                if (bvmVar.ae() && bvmVar.ay() == 1) {
                    bvq bvqVar = bvmVar.t;
                    bvx bvxVar = bvqVar.p;
                    bvxVar.getClass();
                    cho choVarC = bvqVar.c();
                    choVarC.getClass();
                    if (bvxVar.E(choVarC.a)) {
                        bvm.ap(p(), false, 7);
                    }
                }
            }
        }
        bvu bvuVar = ((bva) j()).g;
        bvuVar.getClass();
        bvq bvqVar2 = this.f;
        if (bvqVar2.f || (!this.j && !bvuVar.k && K())) {
            B(false);
            int iG = G();
            H(4);
            bws bwsVarA = bvp.a(p());
            bvqVar2.l(false);
            ((bxv) bwsVarA).t.b(p(), true, new bpj(this, bvuVar, 2));
            H(iG);
            if (bvqVar2.l && bvuVar.k) {
                m();
            }
            C(false);
        }
        if (bufVar.d) {
            bufVar.e = true;
        }
        if (bufVar.b && bufVar.j()) {
            bufVar.f();
        }
        this.s = false;
    }

    @Override // defpackage.bug
    public final void m() {
        p().R(false);
    }

    @Override // defpackage.bug
    public final void n() {
        bvm.ap(p(), false, 7);
    }

    @Override // defpackage.bug
    public final boolean o() {
        return this.x != 3;
    }

    public final bvm p() {
        return this.f.a;
    }

    public final bvz q() {
        return this.f.o;
    }

    @Override // defpackage.bsq
    public final bte r(long j) {
        bvm bvmVarJ;
        bvm bvmVarJ2 = p().j();
        int i = 2;
        if ((bvmVarJ2 != null && bvmVarJ2.aw() == 2) || ((bvmVarJ = p().j()) != null && bvmVarJ.aw() == 4)) {
            this.f.b = false;
        }
        bvm bvmVarP = p();
        bvm bvmVarJ3 = bvmVarP.j();
        if (bvmVarJ3 != null) {
            if (this.w != 3 && !bvmVarP.r) {
                bqs.c("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iAw = bvmVarJ3.aw();
            int i2 = iAw - 1;
            if (iAw == 0) {
                throw null;
            }
            if (i2 == 0 || i2 == 1) {
                i = 1;
            } else if (i2 != 2 && i2 != 3) {
                int iAw2 = bvmVarJ3.aw();
                Objects.toString(bko.s(iAw2));
                throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(bko.s(iAw2)));
            }
            this.w = i;
        } else {
            this.w = 3;
        }
        if (p().x == 3) {
            p().x();
        }
        E(j);
        return this;
    }

    @Override // defpackage.bte
    public final int t() {
        bvu bvuVarY = x().y();
        bvuVarY.getClass();
        return bvuVarY.t();
    }

    @Override // defpackage.bte
    public final void w(long j, bmz bmzVar) throws Throwable {
        F(j, null, bmzVar);
    }

    public final bwi x() {
        return this.f.a();
    }

    public final void y(boolean z) {
        if (z) {
            if (D()) {
                return;
            }
        } else if (!D()) {
            return;
        }
        this.x = 3;
        bdp bdpVarI = p().i();
        Object[] objArr = bdpVarI.a;
        int i = bdpVarI.b;
        for (int i2 = 0; i2 < i; i2++) {
            bvx bvxVar = ((bvm) objArr[i2]).t.p;
            bvxVar.getClass();
            bvxVar.y(true);
        }
    }

    public final void z() {
        if (this.f.n > 0) {
            bdp bdpVarI = p().i();
            Object[] objArr = bdpVarI.a;
            int i = bdpVarI.b;
            for (int i2 = 0; i2 < i; i2++) {
                bvm bvmVar = (bvm) objArr[i2];
                bvq bvqVar = bvmVar.t;
                if ((bvqVar.l || bvqVar.m) && !bvqVar.e) {
                    bvmVar.R(false);
                }
                bvx bvxVar = bvqVar.p;
                if (bvxVar != null) {
                    bvxVar.z();
                }
            }
        }
    }
}
