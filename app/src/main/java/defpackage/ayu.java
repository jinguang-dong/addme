package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayu extends bhn {
    public static final Object a = new Object();
    public long b;
    public int c;
    public zm d;
    public Object e;
    public int f;

    public ayu(long j) {
        super(j);
        this.d = zn.a();
        this.e = a;
    }

    @Override // defpackage.bhn
    public final bhn a(long j) {
        return new ayu(j);
    }

    @Override // defpackage.bhn
    public final void b(bhn bhnVar) {
        bhnVar.getClass();
        ayu ayuVar = (ayu) bhnVar;
        this.d = ayuVar.d;
        this.e = ayuVar.e;
        this.f = ayuVar.f;
    }

    public final int c(bgj bgjVar) {
        zm zmVar;
        int i;
        int i2;
        int i3;
        char c;
        bhn bhnVarF;
        synchronized (bgr.b) {
            zmVar = this.d;
        }
        int i4 = 7;
        if (!zmVar.d()) {
            return 7;
        }
        bdp bdpVarA = bbj.a();
        Object[] objArr = bdpVarA.a;
        int i5 = bdpVarA.b;
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            ((ayw) objArr[i7]).b();
        }
        try {
            Object[] objArr2 = zmVar.b;
            int[] iArr = zmVar.c;
            long[] jArr = zmVar.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int iIdentityHashCode = 7;
                int i8 = 0;
                while (true) {
                    long j = jArr[i8];
                    if ((((~j) << i4) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i9 = i8 - length;
                        int i10 = 0;
                        while (true) {
                            i2 = 8 - ((~i9) >>> 31);
                            if (i10 >= i2) {
                                break;
                            }
                            if ((j & 255) < 128) {
                                int i11 = (i8 << 3) + i10;
                                i3 = i4;
                                bhl bhlVar = (bhl) objArr2[i11];
                                c = '\b';
                                if (iArr[i11] == 1) {
                                    if (bhlVar instanceof ayv) {
                                        ayv ayvVar = (ayv) bhlVar;
                                        bhnVarF = ayvVar.b((ayu) bgr.f(ayvVar.c, bgjVar), bgjVar, false, ayvVar.a);
                                    } else {
                                        bhnVarF = bgr.f(bhlVar.c(), bgjVar);
                                    }
                                    iIdentityHashCode = (((iIdentityHashCode * 31) + System.identityHashCode(bhnVarF)) * 31) + a.r(bhnVarF.g);
                                }
                            } else {
                                i3 = i4;
                                c = '\b';
                            }
                            j >>= c;
                            i10++;
                            i4 = i3;
                        }
                        i = i4;
                        if (i2 == 8) {
                            break;
                            break;
                        }
                        break;
                    }
                    i = i4;
                    if (i8 == length) {
                        break;
                    }
                    i8++;
                    i4 = i;
                }
                i4 = iIdentityHashCode;
            }
            return i4;
        } finally {
            Object[] objArr3 = bdpVarA.a;
            int i12 = bdpVarA.b;
            while (i6 < i12) {
                ((ayw) objArr3[i6]).a();
                i6++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(defpackage.bgj r6) {
        /*
            r5 = this;
            java.lang.Object r0 = defpackage.bgr.b
            monitor-enter(r0)
            long r1 = r5.b     // Catch: java.lang.Throwable -> L46
            long r3 = r6.v()     // Catch: java.lang.Throwable -> L46
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L1a
            int r1 = r5.c     // Catch: java.lang.Throwable -> L46
            int r4 = r6.h()     // Catch: java.lang.Throwable -> L46
            if (r1 == r4) goto L18
            goto L1a
        L18:
            r1 = r2
            goto L1b
        L1a:
            r1 = r3
        L1b:
            monitor-exit(r0)
            java.lang.Object r0 = r5.e
            java.lang.Object r4 = defpackage.ayu.a
            if (r0 == r4) goto L2d
            if (r1 == 0) goto L2c
            int r0 = r5.f
            int r4 = r5.c(r6)
            if (r0 != r4) goto L2d
        L2c:
            r2 = r3
        L2d:
            if (r2 == 0) goto L45
            if (r1 == 0) goto L45
            java.lang.Object r0 = defpackage.bgr.b
            monitor-enter(r0)
            long r3 = r6.v()     // Catch: java.lang.Throwable -> L42
            r5.b = r3     // Catch: java.lang.Throwable -> L42
            int r6 = r6.h()     // Catch: java.lang.Throwable -> L42
            r5.c = r6     // Catch: java.lang.Throwable -> L42
            monitor-exit(r0)
            return r2
        L42:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        L45:
            return r2
        L46:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayu.d(bgj):boolean");
    }
}
