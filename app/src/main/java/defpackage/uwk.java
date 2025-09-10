package defpackage;

import java.util.concurrent.locks.LockSupport;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uwk extends Thread {
    public final ulz a;
    public boolean b;
    final /* synthetic */ uwl c;
    public int d;
    public final hkk e;
    private final uka f;
    private long g;
    private long h;
    private int i;
    public volatile int indexInArray;
    public volatile Object nextParkedWorker;

    public uwk(uwl uwlVar, int i) {
        this.c = uwlVar;
        setDaemon(true);
        setContextClassLoader(uwlVar.getClass().getClassLoader());
        this.e = new hkk((char[]) null);
        this.f = new uka();
        this.d = 4;
        this.a = new ulz(0, umc.a);
        this.nextParkedWorker = uwl.a;
        int iNanoTime = (int) System.nanoTime();
        this.i = iNanoTime == 0 ? 42 : iNanoTime;
        c(i);
    }

    private final uwp e() {
        if (a(2) == 0) {
            uwl uwlVar = this.c;
            uwp uwpVar = (uwp) uwlVar.i.u();
            return uwpVar != null ? uwpVar : (uwp) uwlVar.j.u();
        }
        uwl uwlVar2 = this.c;
        uwp uwpVar2 = (uwp) uwlVar2.j.u();
        return uwpVar2 != null ? uwpVar2 : (uwp) uwlVar2.i.u();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
    
        r8 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.uwp f(int r26) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uwk.f(int):uwp");
    }

    private final boolean g() {
        return this.nextParkedWorker != uwl.a;
    }

    public final int a(int i) {
        int i2 = this.i;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.i = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.uwp b(boolean r10) {
        /*
            r9 = this;
            int r0 = r9.d
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L8
            goto L74
        L8:
            uwl r0 = r9.c
        La:
            uma r3 = r0.h
            long r4 = r3.b
            r6 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r6 = r6 & r4
            r8 = 42
            long r6 = r6 >> r8
            int r6 = (int) r6
            if (r6 != 0) goto L66
            hkk r10 = r9.e
        L1c:
            java.lang.Object r3 = r10.a
            umb r3 = (defpackage.umb) r3
            java.lang.Object r4 = r3.a
            uwp r4 = (defpackage.uwp) r4
            if (r4 != 0) goto L27
            goto L33
        L27:
            boolean r5 = r4.h
            if (r5 != r2) goto L33
            boolean r3 = r3.d(r4, r1)
            if (r3 == 0) goto L1c
            r1 = r4
            goto L53
        L33:
            java.lang.Object r3 = r10.b
            ulz r3 = (defpackage.ulz) r3
            int r3 = r3.b
            java.lang.Object r4 = r10.e
            ulz r4 = (defpackage.ulz) r4
            int r4 = r4.b
        L3f:
            if (r3 == r4) goto L53
            java.lang.Object r5 = r10.d
            ulz r5 = (defpackage.ulz) r5
            int r5 = r5.b
            if (r5 != 0) goto L4a
            goto L53
        L4a:
            int r4 = r4 + (-1)
            uwp r5 = r10.e(r4, r2)
            if (r5 == 0) goto L3f
            r1 = r5
        L53:
            if (r1 != 0) goto L65
            ocq r10 = r0.j
            java.lang.Object r10 = r10.u()
            uwp r10 = (defpackage.uwp) r10
            if (r10 != 0) goto L64
            uwp r9 = r9.f(r2)
            return r9
        L64:
            return r10
        L65:
            return r1
        L66:
            r6 = -4398046511104(0xfffffc0000000000, double:NaN)
            long r6 = r6 + r4
            boolean r3 = r3.d(r4, r6)
            if (r3 == 0) goto La
            r9.d = r2
        L74:
            if (r10 == 0) goto Laa
            uwl r10 = r9.c
            int r10 = r10.b
            int r10 = r10 + r10
            int r10 = r9.a(r10)
            if (r10 != 0) goto L82
            goto L83
        L82:
            r2 = 0
        L83:
            if (r2 == 0) goto L8c
            uwp r10 = r9.e()
            if (r10 == 0) goto L8c
            return r10
        L8c:
            hkk r10 = r9.e
            java.lang.Object r0 = r10.a
            umb r0 = (defpackage.umb) r0
            java.lang.Object r0 = r0.a(r1)
            uwp r0 = (defpackage.uwp) r0
            if (r0 != 0) goto L9e
            uwp r0 = r10.d()
        L9e:
            if (r0 == 0) goto La1
            return r0
        La1:
            if (r2 != 0) goto Lb1
            uwp r10 = r9.e()
            if (r10 == 0) goto Lb1
            return r10
        Laa:
            uwp r10 = r9.e()
            if (r10 == 0) goto Lb1
            return r10
        Lb1:
            r10 = 3
            uwp r9 = r9.f(r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uwk.b(boolean):uwp");
    }

    public final void c(int i) {
        String strValueOf = i == 0 ? "TERMINATED" : String.valueOf(i);
        setName(this.c.e + "-worker-" + strValueOf);
        this.indexInArray = i;
    }

    public final boolean d(int i) {
        int i2 = this.d;
        boolean z = i2 == 1;
        if (z) {
            this.c.h.a(4398046511104L);
        }
        if (i2 != i) {
            this.d = i;
        }
        return z;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        loop0: while (true) {
            boolean z = false;
            while (true) {
                uwl uwlVar = this.c;
                if (uwlVar.d() || this.d == 5) {
                    break loop0;
                }
                uwp uwpVarB = b(this.b);
                long j = -2097152;
                if (uwpVarB != null) {
                    this.h = 0L;
                    this.g = 0L;
                    if (this.d == 3) {
                        boolean z2 = unf.a;
                        this.d = 2;
                    }
                    if (uwpVarB.h) {
                        if (d(2)) {
                            uwlVar.c();
                        }
                        uwl.f(uwpVarB);
                        uwlVar.h.a(-2097152L);
                        if (this.d != 5) {
                            boolean z3 = unf.a;
                            this.d = 4;
                        }
                    } else {
                        uwl.f(uwpVarB);
                    }
                } else {
                    this.b = false;
                    if (this.h == 0) {
                        long j2 = 2097151;
                        if (g()) {
                            ulz ulzVar = this.a;
                            ulzVar.b = -1;
                            while (g() && ulzVar.b == -1 && !uwlVar.d() && this.d != 5) {
                                d(3);
                                Thread.interrupted();
                                if (this.g == 0) {
                                    this.g = System.nanoTime() + uwlVar.d;
                                }
                                LockSupport.parkNanos(uwlVar.d);
                                long j3 = j2;
                                if (System.nanoTime() - this.g >= 0) {
                                    this.g = 0L;
                                    uvy uvyVar = uwlVar.g;
                                    synchronized (uvyVar) {
                                        if (!uwlVar.d()) {
                                            uma umaVar = uwlVar.h;
                                            if (((int) (umaVar.b & j3)) > uwlVar.b) {
                                                if (ulzVar.c(-1, 1)) {
                                                    int i = this.indexInArray;
                                                    c(0);
                                                    uwlVar.b(this, i, 0);
                                                    int andDecrement = (int) (uma.a.getAndDecrement(umaVar) & j3);
                                                    if (andDecrement != i) {
                                                        Object objA = uvyVar.a(andDecrement);
                                                        objA.getClass();
                                                        uwk uwkVar = (uwk) objA;
                                                        uvyVar.b(i, uwkVar);
                                                        uwkVar.c(i);
                                                        uwlVar.b(uwkVar, andDecrement, i);
                                                    }
                                                    uvyVar.b(andDecrement, null);
                                                    this.d = 5;
                                                }
                                            }
                                        }
                                    }
                                }
                                j2 = j3;
                            }
                        } else if (this.nextParkedWorker == uwl.a) {
                            uma umaVar2 = uwlVar.f;
                            while (true) {
                                long j4 = umaVar2.b;
                                int i2 = this.indexInArray;
                                boolean z4 = unf.a;
                                long j5 = j;
                                this.nextParkedWorker = uwlVar.g.a((int) (j4 & 2097151));
                                if (umaVar2.d(j4, ((2097152 + j4) & j5) | i2)) {
                                    break;
                                } else {
                                    j = j5;
                                }
                            }
                        }
                    } else {
                        if (z) {
                            d(3);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.h);
                            this.h = 0L;
                            break;
                        }
                        z = true;
                    }
                }
            }
        }
        d(5);
    }
}
