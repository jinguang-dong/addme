package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uvv {
    public static final uwc a = new uwc("REMOVE_FROZEN");
    public final uma b;
    private final int c;
    private final boolean d;
    private final int e;
    private final umb f;
    private final ocq g;

    public uvv(int i, boolean z) {
        this.c = i;
        this.d = z;
        int i2 = i - 1;
        this.e = i2;
        umc umcVar = umc.a;
        this.f = new umb(null, umcVar);
        this.b = new uma(0L, umcVar);
        this.g = new ocq(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
        L4:
            uma r2 = r0.b
            long r3 = r2.b
            r5 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r5 = r5 & r3
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r6 = 1
            if (r5 == 0) goto L1c
            r0 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r0 = r0 & r3
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 == 0) goto L1b
            r0 = 2
            return r0
        L1b:
            return r6
        L1c:
            r9 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r9 = r9 & r3
            r11 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r13 = r3 & r11
            int r5 = r0.e
            r15 = 30
            long r13 = r13 >> r15
            int r13 = (int) r13
            int r14 = r13 + 2
            r14 = r14 & r5
            int r9 = (int) r9
            r10 = r9 & r5
            if (r14 != r10) goto L36
            return r6
        L36:
            boolean r10 = r0.d
            r14 = 1073741823(0x3fffffff, float:1.9999999)
            if (r10 != 0) goto L59
            r10 = r13 & r5
            r16 = r6
            ocq r6 = r0.g
            umb r6 = r6.x(r10)
            java.lang.Object r6 = r6.a
            if (r6 == 0) goto L59
            int r2 = r0.c
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L58
            int r13 = r13 - r9
            r3 = r13 & r14
            int r2 = r2 >> 1
            if (r3 <= r2) goto L4
        L58:
            return r16
        L59:
            int r6 = r13 + 1
            r6 = r6 & r14
            long r9 = defpackage.ukc.ae(r3, r11)
            long r11 = (long) r6
            long r11 = r11 << r15
            long r9 = r9 | r11
            boolean r2 = r2.d(r3, r9)
            if (r2 == 0) goto L4
            r2 = r13 & r5
            ocq r3 = r0.g
            umb r2 = r3.x(r2)
            r2.c(r1)
        L74:
            uma r2 = r0.b
            long r2 = r2.b
            r4 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r2 = r2 & r4
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 == 0) goto La4
            uvv r0 = r0.c()
            ocq r2 = r0.g
            int r3 = r0.e
            r3 = r3 & r13
            umb r4 = r2.x(r3)
            java.lang.Object r4 = r4.a
            boolean r5 = r4 instanceof defpackage.uvu
            r6 = 0
            if (r5 == 0) goto La1
            uvu r4 = (defpackage.uvu) r4
            int r4 = r4.a
            if (r4 != r13) goto La1
            umb r2 = r2.x(r3)
            r2.c(r1)
            goto La2
        La1:
            r0 = r6
        La2:
            if (r0 != 0) goto L74
        La4:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uvv.a(java.lang.Object):int");
    }

    public final Object b() {
        while (true) {
            uma umaVar = this.b;
            long j = umaVar.b;
            if ((j & 1152921504606846976L) != 0) {
                return a;
            }
            long j2 = 1073741823;
            int i = this.e;
            int i2 = (int) (j & 1073741823);
            int i3 = i2 & i;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i) == i3) {
                return null;
            }
            ocq ocqVar = this.g;
            Object obj = ocqVar.x(i3).a;
            if (obj == null) {
                if (this.d) {
                    return null;
                }
            } else {
                if (obj instanceof uvu) {
                    return null;
                }
                int i4 = (i2 + 1) & 1073741823;
                if (umaVar.d(j, ukc.af(j, i4))) {
                    ocqVar.x(i3).c(null);
                    return obj;
                }
                if (this.d) {
                    uvv uvvVarC = this;
                    while (true) {
                        uma umaVar2 = uvvVarC.b;
                        while (true) {
                            long j3 = umaVar2.b;
                            long j4 = j3 & j2;
                            boolean z = unf.a;
                            if ((j3 & 1152921504606846976L) != 0) {
                                uvvVarC = uvvVarC.c();
                                break;
                            }
                            if (umaVar2.d(j3, ukc.af(j3, i4))) {
                                uvvVarC.g.x(((int) j4) & uvvVarC.e).c(null);
                                uvvVarC = null;
                                break;
                            }
                            j2 = 1073741823;
                        }
                        if (uvvVarC == null) {
                            return obj;
                        }
                        j2 = 1073741823;
                    }
                }
            }
        }
    }

    public final uvv c() {
        long j;
        while (true) {
            uma umaVar = this.b;
            j = umaVar.b;
            if ((j & 1152921504606846976L) != 0) {
                break;
            }
            long j2 = j | 1152921504606846976L;
            if (umaVar.d(j, j2)) {
                j = j2;
                break;
            }
        }
        umb umbVar = this.f;
        while (true) {
            uvv uvvVar = (uvv) umbVar.a;
            if (uvvVar != null) {
                return uvvVar;
            }
            int i = this.c;
            uvv uvvVar2 = new uvv(i + i, this.d);
            long j3 = 1152921503533105152L & j;
            int i2 = (int) (1073741823 & j);
            while (true) {
                int i3 = this.e;
                int i4 = i2 & i3;
                if (i4 != (i3 & ((int) (j3 >> 30)))) {
                    Object uvuVar = this.g.x(i4).a;
                    if (uvuVar == null) {
                        uvuVar = new uvu(i2);
                    }
                    uvvVar2.g.x(uvvVar2.e & i2).c(uvuVar);
                    i2++;
                }
            }
            uvvVar2.b.b = ukc.ae(j, 1152921504606846976L);
            umbVar.d(null, uvvVar2);
        }
    }

    public final boolean d() {
        uma umaVar;
        long j;
        do {
            umaVar = this.b;
            j = umaVar.b;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!umaVar.d(j, 2305843009213693952L | j));
        return true;
    }

    public final boolean e() {
        long j = this.b.b;
        return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
    }
}
