package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bgf extends bgj {
    private static final int[] l = new int[0];
    public final uiq a;
    public final uiq b;
    public int c;
    public bgq d;
    public int[] e;
    public boolean f;
    public zw g;
    private List m;
    private int n;

    public bgf(long j, bgq bgqVar, uiq uiqVar, uiq uiqVar2) {
        super(j, bgqVar);
        this.a = uiqVar;
        this.b = uiqVar2;
        this.d = bgq.a;
        this.e = l;
        this.n = 1;
    }

    private final void F() {
        if (!this.f || this.k >= 0) {
            return;
        }
        bad.b("Unsupported operation on a disposed or applied snapshot");
    }

    public bgf a(uiq uiqVar, uiq uiqVar2) {
        bgg bggVar;
        C();
        F();
        o(v());
        synchronized (bgr.b) {
            long j = bgr.d;
            bgr.d = j + 1;
            bgr.c = bgr.c.d(j);
            bgq bgqVarX = x();
            A(bgqVarX.d(j));
            bggVar = new bgg(j, bgr.d(bgqVarX, v() + 1, j), bgr.p(uiqVar, i(), true), bgr.q(uiqVar2, k()), this);
        }
        if (this.f || this.j) {
            return bggVar;
        }
        long jV = v();
        synchronized (bgr.b) {
            long j2 = bgr.d;
            bgr.d = j2 + 1;
            B(j2);
            bgr.c = bgr.c.d(v());
        }
        A(bgr.d(x(), jV + 1, v()));
        return bggVar;
    }

    @Override // defpackage.bgj
    public bgj b(uiq uiqVar) {
        bgh bghVar;
        C();
        F();
        long jV = v();
        o(v());
        synchronized (bgr.b) {
            long j = bgr.d;
            bgr.d = j + 1;
            bgr.c = bgr.c.d(j);
            bghVar = new bgh(j, bgr.d(x(), jV + 1, j), bgr.p(uiqVar, i(), true), this);
        }
        if (this.f || this.j) {
            return bghVar;
        }
        long jV2 = v();
        synchronized (bgr.b) {
            long j2 = bgr.d;
            bgr.d = j2 + 1;
            B(j2);
            bgr.c = bgr.c.d(v());
        }
        A(bgr.d(x(), jV2 + 1, v()));
        return bghVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public defpackage.bgn c() {
        /*
            Method dump skipped, instructions count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bgf.c():bgn");
    }

    @Override // defpackage.bgj
    public void d() {
        if (this.j) {
            return;
        }
        super.d();
        g();
    }

    @Override // defpackage.bgj
    public void e() {
        if (this.f || this.j) {
            return;
        }
        l();
    }

    @Override // defpackage.bgj
    public void f() {
        this.n++;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    @Override // defpackage.bgj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g() {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.n
            if (r1 > 0) goto Lb
            java.lang.String r1 = "no pending nested snapshots"
            defpackage.bad.a(r1)
        Lb:
            int r1 = r0.n
            int r1 = r1 + (-1)
            r0.n = r1
            if (r1 != 0) goto L93
            boolean r1 = r0.f
            if (r1 != 0) goto L93
            zw r1 = r0.s()
            if (r1 == 0) goto L90
            boolean r2 = r0.f
            if (r2 == 0) goto L26
            java.lang.String r2 = "Unsupported operation on a snapshot that has been applied"
            defpackage.bad.b(r2)
        L26:
            r2 = 0
            r0.u(r2)
            long r2 = r0.v()
            java.lang.Object[] r4 = r1.b
            long[] r1 = r1.a
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L90
            r7 = 0
        L38:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L8b
            int r10 = r7 - r5
            int r10 = ~r10
            r11 = 0
        L4c:
            int r12 = r10 >>> 31
            r13 = 8
            int r12 = 8 - r12
            if (r11 >= r12) goto L89
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r8
            r16 = 128(0x80, double:6.3E-322)
            int r12 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r12 >= 0) goto L85
            int r12 = r7 << 3
            int r12 = r12 + r11
            r12 = r4[r12]
            bhl r12 = (defpackage.bhl) r12
            bhn r12 = r12.c()
        L68:
            if (r12 == 0) goto L85
            long r14 = r12.g
            int r16 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r16 == 0) goto L7c
            bgq r6 = r0.d
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            boolean r6 = defpackage.ske.bR(r6, r14)
            if (r6 == 0) goto L82
        L7c:
            uiq r6 = defpackage.bgr.a
            r14 = 0
            r12.g = r14
        L82:
            bhn r12 = r12.h
            goto L68
        L85:
            long r8 = r8 >> r13
            int r11 = r11 + 1
            goto L4c
        L89:
            if (r12 != r13) goto L90
        L8b:
            if (r7 == r5) goto L90
            int r7 = r7 + 1
            goto L38
        L90:
            r0.y()
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bgf.g():void");
    }

    @Override // defpackage.bgj
    public int h() {
        return this.c;
    }

    @Override // defpackage.bgj
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public uiq i() {
        return this.a;
    }

    @Override // defpackage.bgj
    public uiq k() {
        return this.b;
    }

    public final void l() {
        o(v());
        if (this.f || this.j) {
            return;
        }
        long jV = v();
        synchronized (bgr.b) {
            long j = bgr.d;
            bgr.d = j + 1;
            B(j);
            bgr.c = bgr.c.d(v());
        }
        A(bgr.d(x(), jV + 1, v()));
    }

    @Override // defpackage.bgj
    public final void m() {
        bgr.c = bgr.c.b(v()).a(this.d);
    }

    @Override // defpackage.bgj
    public void n(bhl bhlVar) {
        zw zwVarS = s();
        if (zwVarS == null) {
            int i = zx.a;
            zwVarS = new zw((byte[]) null);
            u(zwVarS);
        }
        zwVarS.j(bhlVar);
    }

    public final void o(long j) {
        synchronized (bgr.b) {
            this.d = this.d.d(j);
        }
    }

    @Override // defpackage.bgj
    public final void p() {
        int length = this.e.length;
        for (int i = 0; i < length; i++) {
            bgr.v(this.e[i]);
        }
        z();
    }

    @Override // defpackage.bgj
    public void q(int i) {
        this.c = i;
    }

    @Override // defpackage.bgj
    public boolean r() {
        return false;
    }

    public zw s() {
        return this.g;
    }

    public final bgn t(long j, zw zwVar, Map map, bgq bgqVar) {
        List listBJ;
        bgq bgqVar2;
        Object[] objArr;
        long[] jArr;
        bgq bgqVar3;
        long[] jArr2;
        int i;
        ArrayList arrayList;
        long j2;
        int i2;
        bhn bhnVarG;
        bgq bgqVarC = x().d(v()).c(this.d);
        Object[] objArr2 = zwVar.b;
        long[] jArr3 = zwVar.a;
        int length = jArr3.length - 2;
        ArrayList arrayList2 = null;
        if (length >= 0) {
            listBJ = null;
            int i3 = 0;
            while (true) {
                long j3 = jArr3[i3];
                ArrayList arrayList3 = arrayList2;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = i3 - length;
                    objArr = objArr2;
                    arrayList2 = arrayList3;
                    int i5 = 0;
                    while (true) {
                        int i6 = 8 - ((~i4) >>> 31);
                        if (i5 >= i6) {
                            bgqVar2 = bgqVarC;
                            jArr = jArr3;
                            if (i6 != 8) {
                                break;
                            }
                        } else {
                            if ((j3 & 255) < 128) {
                                bhl bhlVar = (bhl) objArr[(i3 << 3) + i5];
                                jArr2 = jArr3;
                                bhn bhnVarC = bhlVar.c();
                                i = i4;
                                arrayList = arrayList2;
                                bhn bhnVarK = bgr.k(bhnVarC, j, bgqVar);
                                if (bhnVarK != null) {
                                    j2 = j3;
                                    bhn bhnVarK2 = bgr.k(bhnVarC, v(), bgqVarC);
                                    if (bhnVarK2 == null) {
                                        bgqVar3 = bgqVarC;
                                    } else {
                                        i2 = i5;
                                        if (bhnVarK2.g == 1 || a.ao(bhnVarK, bhnVarK2)) {
                                            bgqVar3 = bgqVarC;
                                        } else {
                                            bgqVar3 = bgqVarC;
                                            bhn bhnVarK3 = bgr.k(bhnVarC, v(), x());
                                            if (bhnVarK3 == null) {
                                                bgr.z();
                                                throw new uer();
                                            }
                                            if (map == null || (bhnVarG = (bhn) map.get(bhnVarK)) == null) {
                                                bhnVarG = bhlVar.g(bhnVarK2, bhnVarK, bhnVarK3);
                                            }
                                            if (bhnVarG == null) {
                                                return new bgl(this);
                                            }
                                            if (!a.ao(bhnVarG, bhnVarK3)) {
                                                if (a.ao(bhnVarG, bhnVarK)) {
                                                    ArrayList arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                                                    arrayList4.add(new uev(bhlVar, bhnVarK.a(v())));
                                                    if (listBJ == null) {
                                                        listBJ = new ArrayList();
                                                    }
                                                    listBJ.add(bhlVar);
                                                    arrayList2 = arrayList4;
                                                } else {
                                                    arrayList2 = arrayList == null ? new ArrayList() : arrayList;
                                                    arrayList2.add(!a.ao(bhnVarG, bhnVarK2) ? new uev(bhlVar, bhnVarG) : new uev(bhlVar, bhnVarK2.a(v())));
                                                }
                                            }
                                            j3 = j2 >> 8;
                                            i5 = i2 + 1;
                                            jArr3 = jArr2;
                                            i4 = i;
                                            bgqVarC = bgqVar3;
                                        }
                                    }
                                } else {
                                    bgqVar3 = bgqVarC;
                                    j2 = j3;
                                }
                                i2 = i5;
                            } else {
                                bgqVar3 = bgqVarC;
                                jArr2 = jArr3;
                                i = i4;
                                arrayList = arrayList2;
                                j2 = j3;
                                i2 = i5;
                            }
                            arrayList2 = arrayList;
                            j3 = j2 >> 8;
                            i5 = i2 + 1;
                            jArr3 = jArr2;
                            i4 = i;
                            bgqVarC = bgqVar3;
                        }
                    }
                } else {
                    bgqVar2 = bgqVarC;
                    objArr = objArr2;
                    jArr = jArr3;
                    arrayList2 = arrayList3;
                }
                if (i3 == length) {
                    break;
                }
                i3++;
                objArr2 = objArr;
                jArr3 = jArr;
                bgqVarC = bgqVar2;
            }
        } else {
            listBJ = null;
        }
        if (arrayList2 != null) {
            l();
            int size = arrayList2.size();
            for (int i7 = 0; i7 < size; i7++) {
                uev uevVar = (uev) arrayList2.get(i7);
                bhl bhlVar2 = (bhl) uevVar.a;
                bhn bhnVar = (bhn) uevVar.b;
                bhnVar.g = j;
                synchronized (bgr.b) {
                    bhnVar.h = bhlVar2.c();
                    bhlVar2.d(bhnVar);
                }
            }
        }
        if (listBJ != null) {
            int size2 = listBJ.size();
            for (int i8 = 0; i8 < size2; i8++) {
                zwVar.l((bhl) listBJ.get(i8));
            }
            List list = this.m;
            if (list != null) {
                listBJ = ske.bJ(list, listBJ);
            }
            this.m = listBJ;
        }
        return bgm.a;
    }

    public void u(zw zwVar) {
        this.g = zwVar;
    }
}
