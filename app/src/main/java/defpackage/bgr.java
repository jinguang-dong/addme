package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgr {
    public static bgq c;
    public static long d;
    public static List f;
    public static List g;
    public static final bge h;
    private static final bff j;
    public static final uiq a = new aks(10);
    public static final pmg i = new pmg((byte[]) null);
    public static final Object b = new Object();
    public static final bgo e = new bgo();
    private static final ccd k = new ccd(null);

    static {
        c = bgq.a;
        d = 2L;
        ufw ufwVar = ufw.a;
        f = ufwVar;
        g = ufwVar;
        long j2 = d;
        d = 1 + j2;
        bge bgeVar = new bge(j2, bgq.a);
        c = c.d(bgeVar.i);
        h = bgeVar;
        j = new bff();
    }

    public static final void A() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    private static final boolean B(bhl bhlVar) {
        long jA = e.a(d);
        bhn bhnVar = null;
        int i2 = 0;
        bhn bhnVarC = null;
        for (bhn bhnVarC2 = bhlVar.c(); bhnVarC2 != null; bhnVarC2 = bhnVarC2.h) {
            long j2 = bhnVarC2.g;
            if (j2 != 0) {
                if (ujp.b(j2, jA) >= 0) {
                    i2++;
                } else if (bhnVar == null) {
                    i2++;
                    bhnVar = bhnVarC2;
                } else {
                    int iB = ujp.b(j2, bhnVar.g);
                    bhn bhnVar2 = iB < 0 ? bhnVarC2 : bhnVar;
                    if (iB >= 0) {
                        bhnVar = bhnVarC2;
                    }
                    if (bhnVarC == null) {
                        bhnVarC = bhlVar.c();
                        bhn bhnVar3 = bhnVarC;
                        while (true) {
                            if (bhnVarC == null) {
                                bhnVarC = bhnVar3;
                                break;
                            }
                            long j3 = bhnVarC.g;
                            if (ujp.b(j3, jA) >= 0) {
                                break;
                            }
                            if (ujp.b(bhnVar3.g, j3) < 0) {
                                bhnVar3 = bhnVarC;
                            }
                            bhnVarC = bhnVarC.h;
                        }
                    }
                    bhnVar2.g = 0L;
                    bhnVar2.b(bhnVarC);
                }
            }
        }
        return i2 > 1;
    }

    private static final boolean C(bhn bhnVar, long j2, bgq bgqVar) {
        long j3 = bhnVar.g;
        return (j3 == 0 || ujp.b(j3, j2) > 0 || bgqVar.e(j3)) ? false : true;
    }

    public static final bgj a(bgj bgjVar, uiq uiqVar, boolean z) {
        boolean z2 = bgjVar instanceof bgf;
        if (z2 || bgjVar == null) {
            return new bhq(z2 ? (bgf) bgjVar : null, uiqVar, null, false, z);
        }
        return new bhr(bgjVar, uiqVar, false, z);
    }

    public static final bgj b() {
        bgj bgjVar = (bgj) i.q();
        return bgjVar == null ? h : bgjVar;
    }

    public static final bgj c(uiq uiqVar) {
        return (bgj) m(new arc(uiqVar, 8));
    }

    public static final bgq d(bgq bgqVar, long j2, long j3) {
        while (ujp.b(j2, j3) < 0) {
            bgqVar = bgqVar.d(j2);
            j2++;
        }
        return bgqVar;
    }

    public static final bhn e(bhn bhnVar) {
        bhn bhnVarK;
        bgj bgjVarB = b();
        bhn bhnVarK2 = k(bhnVar, bgjVarB.v(), bgjVarB.x());
        if (bhnVarK2 != null) {
            return bhnVarK2;
        }
        synchronized (b) {
            bgj bgjVarB2 = b();
            bhnVarK = k(bhnVar, bgjVarB2.v(), bgjVarB2.x());
        }
        if (bhnVarK != null) {
            return bhnVarK;
        }
        z();
        throw new uer();
    }

    public static final bhn f(bhn bhnVar, bgj bgjVar) {
        bhn bhnVarK;
        bhn bhnVarK2 = k(bhnVar, bgjVar.v(), bgjVar.x());
        if (bhnVarK2 != null) {
            return bhnVarK2;
        }
        synchronized (b) {
            bhnVarK = k(bhnVar, bgjVar.v(), bgjVar.x());
        }
        if (bhnVarK != null) {
            return bhnVarK;
        }
        z();
        throw new uer();
    }

    public static final bhn g(bhn bhnVar, bhl bhlVar) {
        bhn bhnVarC = bhlVar.c();
        long jA = e.a(d) - 1;
        bgq bgqVar = bgq.a;
        bhn bhnVar2 = null;
        bhn bhnVar3 = null;
        while (true) {
            if (bhnVarC == null) {
                break;
            }
            if (bhnVarC.g == 0) {
                break;
            }
            if (C(bhnVarC, jA, bgqVar)) {
                if (bhnVar3 == null) {
                    bhnVar3 = bhnVarC;
                } else if (ujp.b(bhnVarC.g, bhnVar3.g) >= 0) {
                    bhnVar2 = bhnVar3;
                }
            }
            bhnVarC = bhnVarC.h;
        }
        bhnVar2 = bhnVarC;
        if (bhnVar2 != null) {
            bhnVar2.g = Long.MAX_VALUE;
            return bhnVar2;
        }
        bhn bhnVarA = bhnVar.a(Long.MAX_VALUE);
        bhnVarA.h = bhlVar.c();
        bhlVar.d(bhnVarA);
        return bhnVarA;
    }

    public static final bhn h(bhn bhnVar, bhl bhlVar, bgj bgjVar) {
        bhn bhnVarG = g(bhnVar, bhlVar);
        bhnVarG.b(bhnVar);
        bhnVarG.g = bgjVar.v();
        return bhnVarG;
    }

    public static final bhn i(bhn bhnVar, bhl bhlVar, bgj bgjVar, bhn bhnVar2) {
        bhn bhnVarG;
        if (bgjVar.r()) {
            bgjVar.n(bhlVar);
        }
        long jV = bgjVar.v();
        if (bhnVar2.g == jV) {
            return bhnVar2;
        }
        synchronized (b) {
            bhnVarG = g(bhnVar, bhlVar);
        }
        bhnVarG.g = jV;
        if (bhnVar2.g != 1) {
            bgjVar.n(bhlVar);
        }
        return bhnVarG;
    }

    public static final bhn j(bhn bhnVar, bhl bhlVar) {
        bhn bhnVarK;
        bgj bgjVarB = b();
        uiq uiqVarI = bgjVarB.i();
        if (uiqVarI != null) {
            uiqVarI.a(bhlVar);
        }
        bhn bhnVarK2 = k(bhnVar, bgjVarB.v(), bgjVarB.x());
        if (bhnVarK2 != null) {
            return bhnVarK2;
        }
        synchronized (b) {
            bgj bgjVarB2 = b();
            bhn bhnVarC = bhlVar.c();
            bhnVarC.getClass();
            bhnVarK = k(bhnVarC, bgjVarB2.v(), bgjVarB2.x());
            if (bhnVarK == null) {
                z();
                throw new uer();
            }
        }
        return bhnVarK;
    }

    public static final bhn k(bhn bhnVar, long j2, bgq bgqVar) {
        bhn bhnVar2 = null;
        while (bhnVar != null) {
            if (C(bhnVar, j2, bgqVar) && (bhnVar2 == null || ujp.b(bhnVar2.g, bhnVar.g) < 0)) {
                bhnVar2 = bhnVar;
            }
            bhnVar = bhnVar.h;
        }
        if (bhnVar2 != null) {
            return bhnVar2;
        }
        return null;
    }

    public static final bhn l(bhn bhnVar, bhl bhlVar, bgj bgjVar) {
        bhn bhnVarK;
        if (bgjVar.r()) {
            bgjVar.n(bhlVar);
        }
        long jV = bgjVar.v();
        bhn bhnVarK2 = k(bhnVar, jV, bgjVar.x());
        if (bhnVarK2 == null) {
            z();
            throw new uer();
        }
        if (bhnVarK2.g == bgjVar.v()) {
            return bhnVarK2;
        }
        synchronized (b) {
            bhnVarK = k(bhlVar.c(), jV, bgjVar.x());
            if (bhnVarK == null) {
                z();
                throw new uer();
            }
            if (bhnVarK.g != jV) {
                bhnVarK = h(bhnVarK, bhlVar, bgjVar);
            }
        }
        if (bhnVarK2.g != 1) {
            bgjVar.n(bhlVar);
        }
        return bhnVarK;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object m(defpackage.uiq r17) {
        /*
            bge r0 = defpackage.bgr.h
            java.lang.Object r1 = defpackage.bgr.b
            monitor-enter(r1)
            zw r2 = r0.g     // Catch: java.lang.Throwable -> L92
            if (r2 == 0) goto Lf
            bff r3 = defpackage.bgr.j     // Catch: java.lang.Throwable -> L92
            r4 = 1
            r3.addAndGet(r4)     // Catch: java.lang.Throwable -> L92
        Lf:
            r3 = r17
            java.lang.Object r3 = n(r0, r3)     // Catch: java.lang.Throwable -> L92
            monitor-exit(r1)
            r1 = 0
            if (r2 == 0) goto L41
            r4 = -1
            java.util.List r5 = defpackage.bgr.f     // Catch: java.lang.Throwable -> L3a
            int r6 = r5.size()     // Catch: java.lang.Throwable -> L3a
            r7 = r1
        L21:
            if (r7 >= r6) goto L34
            java.lang.Object r8 = r5.get(r7)     // Catch: java.lang.Throwable -> L3a
            uiu r8 = (defpackage.uiu) r8     // Catch: java.lang.Throwable -> L3a
            bdr r9 = new bdr     // Catch: java.lang.Throwable -> L3a
            r9.<init>(r2)     // Catch: java.lang.Throwable -> L3a
            r8.a(r9, r0)     // Catch: java.lang.Throwable -> L3a
            int r7 = r7 + 1
            goto L21
        L34:
            bff r0 = defpackage.bgr.j
            r0.addAndGet(r4)
            goto L41
        L3a:
            r0 = move-exception
            bff r1 = defpackage.bgr.j
            r1.addAndGet(r4)
            throw r0
        L41:
            java.lang.Object r4 = defpackage.bgr.b
            monitor-enter(r4)
            s()     // Catch: java.lang.Throwable -> L8f
            if (r2 == 0) goto L8d
            java.lang.Object[] r0 = r2.b     // Catch: java.lang.Throwable -> L8f
            long[] r2 = r2.a     // Catch: java.lang.Throwable -> L8f
            int r5 = r2.length     // Catch: java.lang.Throwable -> L8f
            int r5 = r5 + (-2)
            if (r5 < 0) goto L8d
            r6 = r1
        L53:
            r7 = r2[r6]     // Catch: java.lang.Throwable -> L8f
            long r9 = ~r7     // Catch: java.lang.Throwable -> L8f
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L88
            int r9 = r6 - r5
            int r9 = ~r9     // Catch: java.lang.Throwable -> L8f
            r10 = r1
        L67:
            int r11 = r9 >>> 31
            r12 = 8
            int r11 = 8 - r11
            if (r10 >= r11) goto L86
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.3E-322)
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 >= 0) goto L82
            int r11 = r6 << 3
            int r11 = r11 + r10
            r11 = r0[r11]     // Catch: java.lang.Throwable -> L8f
            bhl r11 = (defpackage.bhl) r11     // Catch: java.lang.Throwable -> L8f
            u(r11)     // Catch: java.lang.Throwable -> L8f
        L82:
            long r7 = r7 >> r12
            int r10 = r10 + 1
            goto L67
        L86:
            if (r11 != r12) goto L8d
        L88:
            if (r6 == r5) goto L8d
            int r6 = r6 + 1
            goto L53
        L8d:
            monitor-exit(r4)
            return r3
        L8f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L92:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bgr.m(uiq):java.lang.Object");
    }

    public static final Object n(bge bgeVar, uiq uiqVar) {
        long j2 = bgeVar.i;
        Object objA = uiqVar.a(c.b(j2));
        long j3 = d;
        d = 1 + j3;
        c = c.b(j2);
        bgeVar.i = j3;
        bgeVar.h = c;
        bgeVar.c = 0;
        bgeVar.g = null;
        bgeVar.z();
        c = c.d(j3);
        return objA;
    }

    public static final Map o(long j2, bgf bgfVar, bgq bgqVar) {
        long[] jArr;
        Map map;
        bgq bgqVar2;
        long[] jArr2;
        char c2;
        bgq bgqVar3;
        bhn bhnVarK;
        long j3 = j2;
        zw zwVarS = bgfVar.s();
        Map map2 = null;
        if (zwVarS == null) {
            return null;
        }
        bgq bgqVarC = bgfVar.x().d(bgfVar.v()).c(bgfVar.d);
        Object[] objArr = zwVarS.b;
        long[] jArr3 = zwVarS.a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return null;
        }
        HashMap map3 = null;
        int i2 = 0;
        while (true) {
            long j4 = jArr3[i2];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = i2 - length;
                int i4 = 0;
                while (true) {
                    map = map2;
                    int i5 = 8 - ((~i3) >>> 31);
                    if (i4 < i5) {
                        if ((j4 & 255) < 128) {
                            bhl bhlVar = (bhl) objArr[(i2 << 3) + i4];
                            bhn bhnVarC = bhlVar.c();
                            jArr2 = jArr3;
                            c2 = '\b';
                            bhn bhnVarK2 = k(bhnVarC, j3, bgqVar);
                            if (bhnVarK2 != null && (bhnVarK = k(bhnVarC, j3, bgqVarC)) != null && !a.ao(bhnVarK2, bhnVarK)) {
                                bgqVar3 = bgqVarC;
                                bhn bhnVarK3 = k(bhnVarC, bgfVar.v(), bgfVar.x());
                                if (bhnVarK3 == null) {
                                    z();
                                    throw new uer();
                                }
                                bhn bhnVarG = bhlVar.g(bhnVarK, bhnVarK2, bhnVarK3);
                                if (bhnVarG == null) {
                                    return map;
                                }
                                if (map3 == null) {
                                    map3 = new HashMap();
                                }
                                map3.put(bhnVarK2, bhnVarG);
                            }
                            j4 >>= c2;
                            i4++;
                            j3 = j2;
                            map2 = map;
                            jArr3 = jArr2;
                            bgqVarC = bgqVar3;
                        } else {
                            jArr2 = jArr3;
                            c2 = '\b';
                        }
                        bgqVar3 = bgqVarC;
                        j4 >>= c2;
                        i4++;
                        j3 = j2;
                        map2 = map;
                        jArr3 = jArr2;
                        bgqVarC = bgqVar3;
                    } else {
                        jArr = jArr3;
                        bgqVar2 = bgqVarC;
                        if (i5 != 8) {
                            return map3;
                        }
                    }
                }
            } else {
                jArr = jArr3;
                map = map2;
                bgqVar2 = bgqVarC;
            }
            if (i2 == length) {
                return map3;
            }
            i2++;
            j3 = j2;
            map2 = map;
            jArr3 = jArr;
            bgqVarC = bgqVar2;
        }
    }

    public static final uiq p(uiq uiqVar, uiq uiqVar2, boolean z) {
        if (true != z) {
            uiqVar2 = null;
        }
        return (uiqVar == null || uiqVar2 == null || uiqVar == uiqVar2) ? uiqVar == null ? uiqVar2 : uiqVar : new adp(uiqVar, uiqVar2, 10);
    }

    public static final uiq q(uiq uiqVar, uiq uiqVar2) {
        return (uiqVar == null || uiqVar2 == null || uiqVar == uiqVar2) ? uiqVar == null ? uiqVar2 : uiqVar : new adp(uiqVar, uiqVar2, 11);
    }

    public static final void r() {
        m(a);
    }

    public static final void s() {
        ccd ccdVar = k;
        int i2 = ccdVar.a;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            bfq bfqVar = ((bfq[]) ccdVar.c)[i3];
            Object obj = bfqVar != null ? bfqVar.get() : null;
            if (obj != null && B((bhl) obj)) {
                if (i4 != i3) {
                    ((bfq[]) ccdVar.c)[i4] = bfqVar;
                    int[] iArr = (int[]) ccdVar.b;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            ((bfq[]) ccdVar.c)[i5] = null;
            ((int[]) ccdVar.b)[i5] = 0;
        }
        if (i4 != i2) {
            ccdVar.a = i4;
        }
    }

    public static final void t(bgj bgjVar, bhl bhlVar) {
        bgjVar.q(bgjVar.h() + 1);
        uiq uiqVarK = bgjVar.k();
        if (uiqVarK != null) {
            uiqVarK.a(bhlVar);
        }
    }

    public static final void u(bhl bhlVar) {
        if (B(bhlVar)) {
            ccd ccdVar = k;
            int i2 = ccdVar.a;
            int iIdentityHashCode = System.identityHashCode(bhlVar);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = ccdVar.a - 1;
                int i5 = 0;
                while (true) {
                    if (i5 > i4) {
                        break;
                    }
                    int i6 = (i5 + i4) >>> 1;
                    int i7 = ((int[]) ccdVar.b)[i6];
                    if (i7 < iIdentityHashCode) {
                        i5 = i6 + 1;
                    } else if (i7 > iIdentityHashCode) {
                        i4 = i6 - 1;
                    } else {
                        bfq bfqVar = ((bfq[]) ccdVar.c)[i6];
                        if (bhlVar == (bfqVar != null ? bfqVar.get() : null)) {
                            i3 = i6;
                            break;
                        }
                        i3 = i6 - 1;
                        while (i3 >= 0 && ((int[]) ccdVar.b)[i3] == iIdentityHashCode) {
                            bfq bfqVar2 = ((bfq[]) ccdVar.c)[i3];
                            if ((bfqVar2 != null ? bfqVar2.get() : null) == bhlVar) {
                                break;
                            } else {
                                i3--;
                            }
                        }
                        i6++;
                        int i8 = ccdVar.a;
                        while (i6 < i8) {
                            if (((int[]) ccdVar.b)[i6] == iIdentityHashCode) {
                                bfq bfqVar3 = ((bfq[]) ccdVar.c)[i6];
                                if ((bfqVar3 != null ? bfqVar3.get() : null) == bhlVar) {
                                    i3 = i6;
                                    break;
                                }
                                i6++;
                            } else {
                                i3 = -(i6 + 1);
                                break;
                            }
                        }
                        i5 = ccdVar.a;
                    }
                }
                i3 = -(i5 + 1);
                if (i3 >= 0) {
                    return;
                }
            }
            int i9 = -(i3 + 1);
            int i10 = i9 + 1;
            Object obj = ccdVar.c;
            int length = ((bfq[]) obj).length;
            if (i2 == length) {
                int i11 = length + length;
                bfq[] bfqVarArr = new bfq[i11];
                int[] iArr = new int[i11];
                System.arraycopy(obj, i9, bfqVarArr, i10, i2 - i9);
                System.arraycopy(ccdVar.c, 0, bfqVarArr, 0, i9);
                rnt.aw((int[]) ccdVar.b, iArr, i10, i9, i2);
                rnt.aB((int[]) ccdVar.b, iArr, 0, i9, 6);
                ccdVar.c = bfqVarArr;
                ccdVar.b = iArr;
            } else {
                System.arraycopy(obj, i9, obj, i10, i2 - i9);
                int[] iArr2 = (int[]) ccdVar.b;
                rnt.aw(iArr2, iArr2, i10, i9, i2);
            }
            ((bfq[]) ccdVar.c)[i9] = new bfq(bhlVar);
            ((int[]) ccdVar.b)[i9] = iIdentityHashCode;
            ccdVar.a++;
        }
    }

    public static final void v(int i2) {
        bgo bgoVar = e;
        int i3 = bgoVar.d[i2];
        bgoVar.c(i3, bgoVar.a - 1);
        bgoVar.a--;
        bgoVar.b(i3);
        long[] jArr = bgoVar.b;
        int i4 = bgoVar.a >> 1;
        while (i3 < i4) {
            int i5 = i3 + 1;
            int i6 = i5 + i5;
            int i7 = i6 - 1;
            if (i6 < bgoVar.a) {
                long j2 = jArr[i6];
                if (ujp.b(j2, jArr[i7]) < 0) {
                    if (ujp.b(j2, jArr[i3]) >= 0) {
                        break;
                    }
                    bgoVar.c(i6, i3);
                    i3 = i6;
                }
            }
            if (ujp.b(jArr[i7], jArr[i3]) >= 0) {
                break;
            }
            bgoVar.c(i7, i3);
            i3 = i7;
        }
        bgoVar.d[i2] = bgoVar.e;
        bgoVar.e = i2;
    }

    public static final void w(bgj bgjVar) {
        long jA;
        if (c.e(bgjVar.v())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(bgjVar.v());
        sb.append(", disposed=");
        sb.append(bgjVar.j);
        sb.append(", applied=");
        bgf bgfVar = bgjVar instanceof bgf ? (bgf) bgjVar : null;
        sb.append(bgfVar != null ? Boolean.valueOf(bgfVar.f) : "read-only");
        sb.append(", lowestPin=");
        synchronized (b) {
            jA = e.a(-1L);
        }
        sb.append(jA);
        throw new IllegalStateException(sb.toString());
    }

    public static final void z() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }
}
