package defpackage;

import android.os.Trace;
import com.google.android.gms.wearable.aXYS.zflNUOOzDfM;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayn implements baj, ayj {
    public final AtomicReference a = new AtomicReference(null);
    public final Object b = new Object();
    public final Set c;
    public final baw d;
    public ayn e;
    public int f;
    public final bfn g;
    public final ayg h;
    public boolean i;
    public final zu j;
    public final zu k;
    public zu l;
    public bqs m;
    public amo n;
    private final ayk o;
    private final axr p;
    private final bbt q;
    private final bbt r;
    private boolean s;
    private uiu t;
    private final zw u;
    private final zw v;
    private final zu w;

    public /* synthetic */ ayn(ayk aykVar, axr axrVar) {
        this.o = aykVar;
        this.p = axrVar;
        zl zlVar = new zl(new zw((byte[]) null));
        this.c = zlVar;
        baw bawVar = new baw();
        if (aykVar.k()) {
            bawVar.d();
        }
        if (aykVar.m()) {
            bawVar.e();
        }
        this.d = bawVar;
        long[] jArr = zv.a;
        this.j = new zu((byte[]) null);
        this.u = new zw((byte[]) null);
        this.v = new zw((byte[]) null);
        this.k = new zu((byte[]) null);
        bbt bbtVar = new bbt();
        this.q = bbtVar;
        bbt bbtVar2 = new bbt();
        this.r = bbtVar2;
        this.w = new zu((byte[]) null);
        this.l = new zu((byte[]) null);
        this.g = new bfn();
        ayg aygVar = new ayg(axrVar, aykVar, bawVar, zlVar, bbtVar, bbtVar2, this);
        aykVar.h(aygVar);
        this.h = aygVar;
        this.t = axx.a;
    }

    public static final void q() {
        a.ao(null, null);
    }

    private final void r(Object obj, boolean z) {
        int i;
        Object objA = this.j.a(obj);
        if (objA == null) {
            return;
        }
        if (!(objA instanceof zw)) {
            bai baiVar = (bai) objA;
            if (bds.c(this.w, obj, baiVar) || baiVar.o(obj) == 1) {
                return;
            }
            if (!baiVar.m() || z) {
                this.u.j(baiVar);
                return;
            } else {
                this.v.j(baiVar);
                return;
            }
        }
        zw zwVar = (zw) objA;
        Object[] objArr = zwVar.b;
        long[] jArr = zwVar.a;
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
                        bai baiVar2 = (bai) objArr[(i2 << 3) + i4];
                        if (!bds.c(this.w, obj, baiVar2) && baiVar2.o(obj) != 1) {
                            if (!baiVar2.m() || z) {
                                this.u.j(baiVar2);
                            } else {
                                this.v.j(baiVar2);
                            }
                        }
                    }
                    j >>= 8;
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

    /* JADX WARN: Finally extract failed */
    private final void s(bbt bbtVar) throws Throwable {
        long[] jArr;
        int i;
        long[] jArr2;
        long j;
        char c;
        long j2;
        char c2;
        long[] jArr3;
        ayg aygVar = this.h;
        bfn bfnVar = this.g;
        bfnVar.g(this.c, aygVar.P());
        try {
            try {
                if (!bbtVar.i()) {
                    Trace.beginSection("Compose:applyChanges");
                    try {
                        axr axrVar = this.p;
                        bfn bfnVar2 = this.g;
                        baz bazVarC = this.d.c();
                        int i2 = 0;
                        try {
                            bbtVar.k(axrVar, bazVarC, bfnVar2, this.h.P());
                            bazVarC.z(true);
                            axrVar.f();
                            Trace.endSection();
                            bfn bfnVar3 = this.g;
                            bfnVar3.c();
                            bdp bdpVar = bfnVar3.c;
                            if (bdpVar.b != 0) {
                                Trace.beginSection("Compose:sideeffects");
                                try {
                                    Object[] objArr = bdpVar.a;
                                    int i3 = bdpVar.b;
                                    for (int i4 = 0; i4 < i3; i4++) {
                                        ((uif) objArr[i4]).a();
                                    }
                                    bdpVar.g();
                                    Trace.endSection();
                                } finally {
                                }
                            }
                            if (this.s) {
                                Trace.beginSection("Compose:unobserve");
                                try {
                                    this.s = false;
                                    zu zuVar = this.j;
                                    long[] jArr4 = zuVar.a;
                                    int length = jArr4.length - 2;
                                    if (length >= 0) {
                                        int i5 = 0;
                                        while (true) {
                                            long j3 = jArr4[i5];
                                            char c3 = 7;
                                            long j4 = -9187201950435737472L;
                                            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i6 = i5 - length;
                                                int i7 = i2;
                                                while (true) {
                                                    i = 8 - ((~i6) >>> 31);
                                                    if (i7 >= i) {
                                                        break;
                                                    }
                                                    if ((j3 & 255) < 128) {
                                                        int i8 = (i5 << 3) + i7;
                                                        c = c3;
                                                        Object obj = zuVar.b[i8];
                                                        Object obj2 = zuVar.c[i8];
                                                        j2 = j4;
                                                        if (obj2 instanceof zw) {
                                                            obj2.getClass();
                                                            zw zwVar = (zw) obj2;
                                                            Object[] objArr2 = zwVar.b;
                                                            long[] jArr5 = zwVar.a;
                                                            int length2 = jArr5.length - 2;
                                                            if (length2 >= 0) {
                                                                int i9 = 8;
                                                                while (true) {
                                                                    int i10 = length2;
                                                                    long j5 = jArr5[i2];
                                                                    j = j3;
                                                                    if ((((~j5) << c) & j5 & j2) != j2) {
                                                                        int i11 = 8 - ((~(i2 - i10)) >>> 31);
                                                                        int i12 = 0;
                                                                        while (i12 < i11) {
                                                                            if ((j5 & 255) < 128) {
                                                                                jArr3 = jArr4;
                                                                                int i13 = (i2 << 3) + i12;
                                                                                if (!((bai) objArr2[i13]).l()) {
                                                                                    zwVar.i(i13);
                                                                                }
                                                                            } else {
                                                                                jArr3 = jArr4;
                                                                            }
                                                                            j5 >>= i9;
                                                                            i12++;
                                                                            jArr4 = jArr3;
                                                                        }
                                                                        jArr2 = jArr4;
                                                                        if (i11 != i9) {
                                                                            break;
                                                                        }
                                                                    } else {
                                                                        jArr2 = jArr4;
                                                                    }
                                                                    length2 = i10;
                                                                    if (i2 == length2) {
                                                                        break;
                                                                    }
                                                                    i2++;
                                                                    j3 = j;
                                                                    jArr4 = jArr2;
                                                                    i9 = 8;
                                                                }
                                                            } else {
                                                                jArr2 = jArr4;
                                                                j = j3;
                                                            }
                                                            if (zwVar.b()) {
                                                                zuVar.h(i8);
                                                            }
                                                            c2 = '\b';
                                                        } else {
                                                            jArr2 = jArr4;
                                                            j = j3;
                                                            obj2.getClass();
                                                            if (!((bai) obj2).l()) {
                                                                zuVar.h(i8);
                                                            }
                                                            c2 = '\b';
                                                        }
                                                    } else {
                                                        jArr2 = jArr4;
                                                        j = j3;
                                                        c = c3;
                                                        j2 = j4;
                                                        c2 = '\b';
                                                    }
                                                    j3 = j >> c2;
                                                    i7++;
                                                    c3 = c;
                                                    j4 = j2;
                                                    jArr4 = jArr2;
                                                    i2 = 0;
                                                }
                                                jArr = jArr4;
                                                if (i != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr = jArr4;
                                            }
                                            if (i5 == length) {
                                                break;
                                            }
                                            i5++;
                                            jArr4 = jArr;
                                            i2 = 0;
                                        }
                                    }
                                    t();
                                    Trace.endSection();
                                } finally {
                                }
                            }
                            if (this.r.i()) {
                                this.g.b();
                            }
                        } catch (Throwable th) {
                            bazVarC.z(false);
                            throw th;
                        }
                    } finally {
                    }
                } else if (this.r.i()) {
                    bfnVar.b();
                }
                this.g.a();
            } catch (Throwable th2) {
                th = th2;
                if (this.r.i()) {
                    this.g.b();
                }
                this.g.a();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            this.g.a();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e4 A[PHI: r21 r24 r28 r29
      0x00e4: PHI (r21v8 long) = (r21v7 long), (r21v10 long) binds: [B:38:0x00e2, B:35:0x00cc] A[DONT_GENERATE, DONT_INLINE]
      0x00e4: PHI (r24v4 int) = (r24v3 int), (r24v7 int) binds: [B:38:0x00e2, B:35:0x00cc] A[DONT_GENERATE, DONT_INLINE]
      0x00e4: PHI (r28v6 long[]) = (r28v5 long[]), (r28v9 long[]) binds: [B:38:0x00e2, B:35:0x00cc] A[DONT_GENERATE, DONT_INLINE]
      0x00e4: PHI (r29v3 int) = (r29v2 int), (r29v6 int) binds: [B:38:0x00e2, B:35:0x00cc] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void t() {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayn.t():void");
    }

    private final void u(Object obj) {
        int i;
        Object objA = this.j.a(obj);
        if (objA == null) {
            return;
        }
        if (!(objA instanceof zw)) {
            bai baiVar = (bai) objA;
            if (baiVar.o(obj) == 4) {
                bds.a(this.w, obj, baiVar);
                return;
            }
            return;
        }
        zw zwVar = (zw) objA;
        Object[] objArr = zwVar.b;
        long[] jArr = zwVar.a;
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
                        bai baiVar2 = (bai) objArr[(i2 << 3) + i4];
                        if (baiVar2.o(obj) == 4) {
                            bds.a(this.w, obj, baiVar2);
                        }
                    }
                    j >>= 8;
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

    private final boolean v(bai baiVar, Object obj) {
        return o() && this.h.af(baiVar, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bb A[Catch: all -> 0x00d7, EDGE_INSN: B:70:0x00bb->B:54:0x00bb BREAK  A[LOOP:0: B:37:0x0077->B:51:0x00b4], EDGE_INSN: B:71:0x00bb->B:54:0x00bb BREAK  A[LOOP:0: B:37:0x0077->B:51:0x00b4], TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x000b, B:6:0x0010, B:8:0x0018, B:9:0x001d, B:11:0x0021, B:12:0x0026, B:14:0x002c, B:19:0x003c, B:24:0x0045, B:26:0x004a, B:27:0x0053, B:29:0x0057, B:30:0x005f, B:32:0x0067, B:34:0x006b, B:37:0x0077, B:39:0x0087, B:40:0x008a, B:42:0x0093, B:44:0x009d, B:48:0x00ab, B:51:0x00b4, B:52:0x00b7, B:54:0x00bb), top: B:68:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int w(defpackage.bai r22, defpackage.axq r23, java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayn.w(bai, axq, java.lang.Object):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    @Override // defpackage.baj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            ayg r2 = r0.h
            int r3 = r2.l
            if (r3 <= 0) goto Lc
            goto Lc1
        Lc:
            bai r2 = r2.O()
            if (r2 == 0) goto Lc1
            r2.n()
            int r3 = r2.a
            r3 = r3 & 32
            r4 = 0
            if (r3 == 0) goto L1d
            goto L34
        L1d:
            zm r3 = r2.f
            if (r3 != 0) goto L28
            zm r3 = new zm
            r3.<init>(r4)
            r2.f = r3
        L28:
            int r5 = r2.e
            int r3 = r3.h(r1, r5)
            int r5 = r2.e
            if (r3 != r5) goto L34
            goto Lc1
        L34:
            boolean r3 = r1 instanceof defpackage.bhm
            r5 = 1
            if (r3 == 0) goto L3f
            r3 = r1
            bhm r3 = (defpackage.bhm) r3
            r3.j(r5)
        L3f:
            zu r3 = r0.j
            defpackage.bds.a(r3, r1, r2)
            boolean r3 = r1 instanceof defpackage.ayv
            if (r3 == 0) goto Lc1
            r3 = r1
            ayv r3 = (defpackage.ayv) r3
            ayu r6 = r3.e()
            zu r0 = r0.k
            defpackage.bds.b(r0, r1)
            zm r7 = r6.d
            java.lang.Object[] r8 = r7.b
            long[] r7 = r7.a
            int r9 = r7.length
            int r9 = r9 + (-2)
            if (r9 < 0) goto Lb0
            r11 = 0
        L60:
            r12 = r7[r11]
            long r14 = ~r12
            r16 = 7
            long r14 = r14 << r16
            long r14 = r14 & r12
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r14 & r16
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 == 0) goto Laa
            int r14 = r11 - r9
            r15 = 0
        L76:
            int r10 = ~r14
            int r10 = r10 >>> 31
            r4 = 8
            int r10 = 8 - r10
            if (r15 >= r10) goto La8
            r17 = 255(0xff, double:1.26E-321)
            long r17 = r12 & r17
            r19 = 128(0x80, double:6.3E-322)
            int r10 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r10 >= 0) goto La0
            int r10 = r11 << 3
            int r10 = r10 + r15
            r10 = r8[r10]
            bhl r10 = (defpackage.bhl) r10
            r17 = r4
            boolean r4 = r10 instanceof defpackage.bhm
            if (r4 == 0) goto L9c
            r4 = r10
            bhm r4 = (defpackage.bhm) r4
            r4.j(r5)
        L9c:
            defpackage.bds.a(r0, r10, r1)
            goto La2
        La0:
            r17 = r4
        La2:
            long r12 = r12 >> r17
            int r15 = r15 + 1
            r4 = 0
            goto L76
        La8:
            if (r10 != r4) goto Lb0
        Laa:
            if (r11 == r9) goto Lb0
            int r11 = r11 + 1
            r4 = 0
            goto L60
        Lb0:
            java.lang.Object r0 = r6.e
            zu r1 = r2.g
            if (r1 != 0) goto Lbe
            zu r1 = new zu
            r4 = 0
            r1.<init>(r4)
            r2.g = r1
        Lbe:
            r1.j(r3, r0)
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayn.a(java.lang.Object):void");
    }

    @Override // defpackage.baj
    public final void b() {
        this.s = true;
    }

    @Override // defpackage.baj
    public final int c(bai baiVar, Object obj) {
        ayn aynVar;
        if ((baiVar.a & 2) != 0) {
            baiVar.c(true);
        }
        axq axqVar = baiVar.c;
        if (axqVar != null && axqVar.a()) {
            if (!this.d.f(axqVar)) {
                synchronized (this.b) {
                    aynVar = this.e;
                }
                return (aynVar == null || !aynVar.v(baiVar, obj)) ? 1 : 4;
            }
            if (baiVar.d != null) {
                return w(baiVar, axqVar, obj);
            }
        }
        return 1;
    }

    @Override // defpackage.ayj
    public final void d() {
        synchronized (this.b) {
            ayg aygVar = this.h;
            if (aygVar.n) {
                bad.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
            }
            if (!this.i) {
                this.i = true;
                this.t = axx.b;
                bbt bbtVar = aygVar.s;
                if (bbtVar != null) {
                    s(bbtVar);
                }
                baw bawVar = this.d;
                boolean z = bawVar.b > 0;
                if (z || !this.c.isEmpty()) {
                    bfn bfnVar = this.g;
                    try {
                        bfnVar.g(this.c, aygVar.P());
                        if (z) {
                            baz bazVarC = bawVar.c();
                            try {
                                ayi.m(bazVarC, bfnVar);
                                bazVarC.z(true);
                                axr axrVar = this.p;
                                axrVar.c();
                                axrVar.f();
                                bfnVar.c();
                            } catch (Throwable th) {
                                bazVarC.z(false);
                                throw th;
                            }
                        }
                        bfnVar.b();
                    } finally {
                        bfnVar.a();
                    }
                }
                ayg aygVar2 = this.h;
                Trace.beginSection("Compose:Composer.dispose");
                try {
                    aygVar2.b.j(aygVar2);
                    aygVar2.X();
                    aygVar2.a.c();
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
        }
        this.o.r(this);
    }

    public final void e() {
        this.a.set(null);
        this.q.g();
        this.r.g();
        Set set = this.c;
        if (set.isEmpty()) {
            return;
        }
        bfn bfnVar = this.g;
        try {
            bfnVar.g(set, this.h.P());
            bfnVar.b();
        } finally {
            bfnVar.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0251 A[PHI: r24 r33
      0x0251: PHI (r24v14 long[]) = (r24v13 long[]), (r24v13 long[]), (r24v15 long[]) binds: [B:115:0x0249, B:117:0x024f, B:112:0x0239] A[DONT_GENERATE, DONT_INLINE]
      0x0251: PHI (r33v11 long) = (r33v10 long), (r33v10 long), (r33v12 long) binds: [B:115:0x0249, B:117:0x024f, B:112:0x0239] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0176 A[EDGE_INSN: B:71:0x0176->B:225:0x0113 BREAK  A[LOOP:13: B:61:0x0144->B:72:0x0178]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(java.util.Set r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 900
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayn.f(java.util.Set, boolean):void");
    }

    public final void g() {
        synchronized (this.b) {
            try {
                s(this.q);
                m();
            } catch (Throwable th) {
                try {
                    Set set = this.c;
                    if (!set.isEmpty()) {
                        bfn bfnVar = this.g;
                        try {
                            bfnVar.g(set, this.h.P());
                            bfnVar.b();
                            bfnVar.a();
                        } catch (Throwable th2) {
                            bfnVar.a();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    e();
                    throw th3;
                }
            }
        }
    }

    public final void h() {
        synchronized (this.b) {
            try {
                bbt bbtVar = this.r;
                if (bbtVar.j()) {
                    s(bbtVar);
                }
            } catch (Throwable th) {
                try {
                    Set set = this.c;
                    if (!set.isEmpty()) {
                        bfn bfnVar = this.g;
                        try {
                            bfnVar.g(set, this.h.P());
                            bfnVar.b();
                            bfnVar.a();
                        } catch (Throwable th2) {
                            bfnVar.a();
                            throw th2;
                        }
                    }
                    throw th;
                } catch (Throwable th3) {
                    e();
                    throw th3;
                }
            }
        }
    }

    public final void i() {
        bfn bfnVar;
        synchronized (this.b) {
            try {
                ayg aygVar = this.h;
                aygVar.z = null;
                Set set = this.c;
                if (!set.isEmpty()) {
                    bfnVar = this.g;
                    try {
                        bfnVar.g(set, aygVar.P());
                        bfnVar.b();
                        bfnVar.a();
                    } finally {
                    }
                }
            } catch (Throwable th) {
                try {
                    Set set2 = this.c;
                    if (!set2.isEmpty()) {
                        bfnVar = this.g;
                        try {
                            bfnVar.g(set2, this.h.P());
                            bfnVar.b();
                            bfnVar.a();
                        } finally {
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    e();
                    throw th2;
                }
            }
        }
    }

    public final void j(uiu uiuVar) {
        if (this.i) {
            bad.b("The composition is disposed");
        }
        this.t = uiuVar;
        this.o.o(this, uiuVar);
    }

    public final void k() {
        synchronized (this.b) {
            baw bawVar = this.d;
            boolean z = bawVar.b > 0;
            if (z || !this.c.isEmpty()) {
                Trace.beginSection("Compose:deactivate");
                try {
                    bfn bfnVar = this.g;
                    try {
                        bfnVar.g(this.c, this.h.P());
                        if (z) {
                            baz bazVarC = bawVar.c();
                            try {
                                ayi.l(bazVarC, bfnVar);
                                bazVarC.z(true);
                                this.p.f();
                                bfnVar.c();
                            } catch (Throwable th) {
                                bazVarC.z(false);
                                throw th;
                            }
                        }
                        bfnVar.b();
                    } finally {
                        bfnVar.a();
                    }
                } finally {
                    Trace.endSection();
                }
            }
            this.j.i();
            this.k.i();
            this.l.i();
            this.q.g();
            this.r.g();
            this.h.X();
        }
    }

    public final void m() {
        AtomicReference atomicReference = this.a;
        Object andSet = atomicReference.getAndSet(null);
        if (a.ao(andSet, ayo.a)) {
            return;
        }
        if (andSet instanceof Set) {
            f((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            if (andSet == null) {
                ayi.g("calling recordModificationsOf and applyChanges concurrently is not supported");
                throw new uer();
            }
            Objects.toString(atomicReference);
            ayi.g("corrupt pendingModifications drain: ".concat(atomicReference.toString()));
            throw new uer();
        }
        for (Set set : (Set[]) andSet) {
            f(set, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.Object r1 = r0.b
            monitor-enter(r1)
            r17.u(r18)     // Catch: java.lang.Throwable -> L64
            zu r2 = r0.k     // Catch: java.lang.Throwable -> L64
            r3 = r18
            java.lang.Object r2 = r2.a(r3)     // Catch: java.lang.Throwable -> L64
            if (r2 == 0) goto L62
            boolean r3 = r2 instanceof defpackage.zw     // Catch: java.lang.Throwable -> L64
            if (r3 == 0) goto L5d
            zw r2 = (defpackage.zw) r2     // Catch: java.lang.Throwable -> L64
            java.lang.Object[] r3 = r2.b     // Catch: java.lang.Throwable -> L64
            long[] r2 = r2.a     // Catch: java.lang.Throwable -> L64
            int r4 = r2.length     // Catch: java.lang.Throwable -> L64
            int r4 = r4 + (-2)
            if (r4 < 0) goto L62
            r5 = 0
            r6 = r5
        L23:
            r7 = r2[r6]     // Catch: java.lang.Throwable -> L64
            long r9 = ~r7     // Catch: java.lang.Throwable -> L64
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L58
            int r9 = r6 - r4
            r10 = r5
        L36:
            int r11 = ~r9     // Catch: java.lang.Throwable -> L64
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            if (r10 >= r11) goto L56
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.3E-322)
            int r11 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r11 >= 0) goto L52
            int r11 = r6 << 3
            int r11 = r11 + r10
            r11 = r3[r11]     // Catch: java.lang.Throwable -> L64
            ayv r11 = (defpackage.ayv) r11     // Catch: java.lang.Throwable -> L64
            r0.u(r11)     // Catch: java.lang.Throwable -> L64
        L52:
            long r7 = r7 >> r12
            int r10 = r10 + 1
            goto L36
        L56:
            if (r11 != r12) goto L62
        L58:
            if (r6 == r4) goto L62
            int r6 = r6 + 1
            goto L23
        L5d:
            ayv r2 = (defpackage.ayv) r2     // Catch: java.lang.Throwable -> L64
            r0.u(r2)     // Catch: java.lang.Throwable -> L64
        L62:
            monitor-exit(r1)
            return
        L64:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayn.n(java.lang.Object):void");
    }

    public final boolean o() {
        return this.h.n;
    }

    public final zu p() {
        zu zuVar = this.l;
        long[] jArr = zv.a;
        this.l = new zu((byte[]) null);
        return zuVar;
    }

    public final void l() {
        AtomicReference atomicReference = this.a;
        Object obj = ayo.a;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (a.ao(andSet, obj)) {
                ayi.g(zflNUOOzDfM.GyAGQNRlC);
                throw new uer();
            }
            if (andSet instanceof Set) {
                f((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                Objects.toString(atomicReference);
                ayi.g("corrupt pendingModifications drain: ".concat(atomicReference.toString()));
                throw new uer();
            }
            for (Set set : (Set[]) andSet) {
                f(set, true);
            }
        }
    }
}
