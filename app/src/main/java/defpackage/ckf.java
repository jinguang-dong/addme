package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ckf extends ckh {
    public final cjz a;
    cka b;

    public ckf(cjn cjnVar) {
        super(cjnVar);
        cjz cjzVar = new cjz(this);
        this.a = cjzVar;
        this.b = null;
        this.h.l = 6;
        this.i.l = 7;
        cjzVar.l = 8;
        this.f = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.ckh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 959
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckf.b():void");
    }

    @Override // defpackage.ckh
    public final void c() {
        cjz cjzVar = this.h;
        if (cjzVar.i) {
            this.d.aa = cjzVar.f;
        }
    }

    @Override // defpackage.ckh
    public final void d() {
        this.l = null;
        this.h.b();
        this.i.b();
        this.a.b();
        this.e.b();
        this.g = false;
    }

    @Override // defpackage.ckh
    public final boolean e() {
        return this.j != 3 || this.d.t == 0;
    }

    @Override // defpackage.ckh, defpackage.cjx
    public final void f() {
        float f;
        int i = this.k;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 3) {
            cjn cjnVar = this.d;
            m(cjnVar.K, cjnVar.M, 1);
            return;
        }
        cka ckaVar = this.e;
        if (ckaVar.c && !ckaVar.i && this.j == 3) {
            cjn cjnVar2 = this.d;
            int i3 = cjnVar2.t;
            if (i3 == 2) {
                cjn cjnVar3 = cjnVar2.U;
                if (cjnVar3 != null) {
                    if (cjnVar3.i.e.i) {
                        ckaVar.c((int) ((r5.f * cjnVar2.A) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                cka ckaVar2 = cjnVar2.h.e;
                if (ckaVar2.i) {
                    int i4 = cjnVar2.Y;
                    if (i4 == -1 || i4 != 0) {
                        float f2 = ckaVar2.f;
                        float f3 = cjnVar2.X;
                        f = f2 / f3;
                        ckaVar.c((int) (f + 0.5f));
                    } else {
                        f = ckaVar2.f * cjnVar2.X;
                        ckaVar.c((int) (f + 0.5f));
                    }
                }
            }
        }
        cjz cjzVar = this.h;
        if (cjzVar.c) {
            cjz cjzVar2 = this.i;
            if (cjzVar2.c) {
                if (cjzVar.i && cjzVar2.i && ckaVar.i) {
                    return;
                }
                if (!ckaVar.i && this.j == 3) {
                    cjn cjnVar4 = this.d;
                    if (cjnVar4.s == 0 && !cjnVar4.I()) {
                        cjz cjzVar3 = (cjz) cjzVar.k.get(0);
                        cjz cjzVar4 = (cjz) cjzVar2.k.get(0);
                        int i5 = cjzVar3.f + cjzVar.e;
                        int i6 = cjzVar4.f + cjzVar2.e;
                        cjzVar.c(i5);
                        cjzVar2.c(i6);
                        ckaVar.c(i6 - i5);
                        return;
                    }
                }
                if (!ckaVar.i && this.j == 3 && this.c == 1) {
                    List list = cjzVar.k;
                    if (list.size() > 0) {
                        List list2 = cjzVar2.k;
                        if (list2.size() > 0) {
                            cjz cjzVar5 = (cjz) list.get(0);
                            cjz cjzVar6 = (cjz) list2.get(0);
                            int i7 = cjzVar5.f + cjzVar.e;
                            int i8 = cjzVar6.f + cjzVar2.e;
                            int i9 = ckaVar.m;
                            int i10 = i8 - i7;
                            if (i10 < i9) {
                                ckaVar.c(i10);
                            } else {
                                ckaVar.c(i9);
                            }
                        }
                    }
                }
                if (ckaVar.i) {
                    List list3 = cjzVar.k;
                    if (list3.size() > 0) {
                        List list4 = cjzVar2.k;
                        if (list4.size() > 0) {
                            cjz cjzVar7 = (cjz) list3.get(0);
                            cjz cjzVar8 = (cjz) list4.get(0);
                            int i11 = cjzVar7.f;
                            int i12 = cjzVar.e + i11;
                            int i13 = cjzVar8.f;
                            int i14 = cjzVar2.e + i13;
                            float f4 = this.d.af;
                            if (cjzVar7 == cjzVar8) {
                                f4 = 0.5f;
                            }
                            if (cjzVar7 != cjzVar8) {
                                i13 = i14;
                            }
                            if (cjzVar7 != cjzVar8) {
                                i11 = i12;
                            }
                            cjzVar.c((int) (i11 + 0.5f + (((i13 - i11) - ckaVar.f) * f4)));
                            cjzVar2.c(cjzVar.f + ckaVar.f);
                        }
                    }
                }
            }
        }
    }

    public final void g() {
        this.g = false;
        cjz cjzVar = this.h;
        cjzVar.b();
        cjzVar.i = false;
        cjz cjzVar2 = this.i;
        cjzVar2.b();
        cjzVar2.i = false;
        cjz cjzVar3 = this.a;
        cjzVar3.b();
        cjzVar3.i = false;
        this.e.i = false;
    }

    public final String toString() {
        return "VerticalRun ".concat(String.valueOf(this.d.ai));
    }
}
