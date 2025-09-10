package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bvq {
    public final bvm a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public int k;
    public boolean l;
    public boolean m;
    public int n;
    public bvx p;
    public int q = 5;
    public final bvz o = new bvz(this);

    public bvq(bvm bvmVar) {
        this.a = bvmVar;
    }

    public final bwi a() {
        return this.a.s.d;
    }

    public final cho b() {
        bvz bvzVar = this.o;
        if (bvzVar.j) {
            return new cho(bvzVar.d);
        }
        return null;
    }

    public final cho c() {
        bvx bvxVar = this.p;
        if (bvxVar != null) {
            return bvxVar.l;
        }
        return null;
    }

    public final void d() {
        this.o.w = true;
        bvx bvxVar = this.p;
        if (bvxVar != null) {
            bvxVar.r = true;
        }
    }

    public final void e() {
        this.e = true;
        this.f = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            r4 = this;
            bvm r0 = r4.a
            int r0 = r0.aw()
            r1 = 3
            r2 = 4
            r3 = 1
            if (r0 == r1) goto Le
            if (r0 != r2) goto L1b
            r0 = r2
        Le:
            bvz r1 = r4.o
            boolean r1 = r1.x
            if (r1 == 0) goto L18
            r4.j(r3)
            goto L1b
        L18:
            r4.i(r3)
        L1b:
            if (r0 != r2) goto L2c
            bvx r0 = r4.p
            if (r0 == 0) goto L29
            boolean r0 = r0.s
            if (r0 != r3) goto L29
            r4.l(r3)
            return
        L29:
            r4.k(r3)
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvq.f():void");
    }

    public final void g(int i) {
        int i2 = this.k;
        this.k = i;
        if ((i2 == 0) != (i == 0)) {
            bvm bvmVarJ = this.a.j();
            bvq bvqVar = bvmVarJ != null ? bvmVarJ.t : null;
            if (bvqVar != null) {
                if (i == 0) {
                    bvqVar.g(bvqVar.k - 1);
                } else {
                    bvqVar.g(bvqVar.k + 1);
                }
            }
        }
    }

    public final void h(int i) {
        int i2 = this.n;
        this.n = i;
        if ((i2 == 0) != (i == 0)) {
            bvm bvmVarJ = this.a.j();
            bvq bvqVar = bvmVarJ != null ? bvmVarJ.t : null;
            if (bvqVar != null) {
                if (i == 0) {
                    bvqVar.h(bvqVar.n - 1);
                } else {
                    bvqVar.h(bvqVar.n + 1);
                }
            }
        }
    }

    public final void i(boolean z) {
        if (this.j != z) {
            this.j = z;
            if (z) {
                if (this.i) {
                    return;
                }
                g(this.k + 1);
            } else {
                if (this.i) {
                    return;
                }
                g(this.k - 1);
            }
        }
    }

    public final void j(boolean z) {
        if (this.i != z) {
            this.i = z;
            if (z) {
                if (this.j) {
                    return;
                }
                g(this.k + 1);
            } else {
                if (this.j) {
                    return;
                }
                g(this.k - 1);
            }
        }
    }

    public final void k(boolean z) {
        if (this.m != z) {
            this.m = z;
            if (z) {
                if (this.l) {
                    return;
                }
                h(this.n + 1);
            } else {
                if (this.l) {
                    return;
                }
                h(this.n - 1);
            }
        }
    }

    public final void l(boolean z) {
        if (this.l != z) {
            this.l = z;
            if (z) {
                if (this.m) {
                    return;
                }
                h(this.n + 1);
            } else {
                if (this.m) {
                    return;
                }
                h(this.n - 1);
            }
        }
    }

    public final void m() {
        bvz bvzVar = this.o;
        if ((bvzVar.q != null || bvzVar.q().g() != null) && bvzVar.p) {
            bvzVar.p = false;
            bvzVar.q = bvzVar.q().g();
            bvm bvmVarJ = this.a.j();
            if (bvmVarJ != null) {
                bvm.ar(bvmVarJ, false, 7);
            }
        }
        bvx bvxVar = this.p;
        if (bvxVar != null) {
            if (bvxVar.u == null) {
                bvu bvuVarY = bvxVar.x().y();
                bvuVarY.getClass();
                if (bvuVarY.g() == null) {
                    return;
                }
            }
            if (bvxVar.t) {
                bvxVar.t = false;
                bvu bvuVarY2 = bvxVar.x().y();
                bvuVarY2.getClass();
                bvxVar.u = bvuVarY2.g();
                bvm bvmVar = this.a;
                if (byi.q(bvmVar)) {
                    bvm bvmVarJ2 = bvmVar.j();
                    if (bvmVarJ2 != null) {
                        bvm.ar(bvmVarJ2, false, 7);
                        return;
                    }
                    return;
                }
                bvm bvmVarJ3 = bvmVar.j();
                if (bvmVarJ3 != null) {
                    bvm.ap(bvmVarJ3, false, 7);
                }
            }
        }
    }

    public final boolean n() {
        return this.o.u;
    }
}
