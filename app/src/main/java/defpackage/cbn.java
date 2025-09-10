package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbn implements Iterable, ukd {
    public boolean a;
    public boolean b;
    public final zu c;
    private Map d;

    public cbn() {
        long[] jArr = zv.a;
        this.c = new zu((byte[]) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.cbn a() {
        /*
            r18 = this;
            r0 = r18
            cbn r1 = new cbn
            r1.<init>()
            boolean r2 = r0.a
            r1.a = r2
            boolean r2 = r0.b
            r1.b = r2
            zu r2 = r1.c
            zu r0 = r0.c
            java.lang.Object[] r3 = r0.b
            java.lang.Object[] r4 = r0.c
            long[] r0 = r0.a
            int r5 = r0.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L5a
            r6 = 0
            r7 = r6
        L20:
            r8 = r0[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L55
            int r10 = r7 - r5
            r11 = r6
        L33:
            int r12 = ~r10
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            if (r11 >= r12) goto L53
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r8
            r16 = 128(0x80, double:6.3E-322)
            int r12 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r12 >= 0) goto L4f
            int r12 = r7 << 3
            int r12 = r12 + r11
            r14 = r3[r12]
            r12 = r4[r12]
            r2.j(r14, r12)
        L4f:
            long r8 = r8 >> r13
            int r11 = r11 + 1
            goto L33
        L53:
            if (r12 != r13) goto L5a
        L55:
            if (r7 == r5) goto L5a
            int r7 = r7 + 1
            goto L20
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbn.a():cbn");
    }

    public final Object b(cbz cbzVar) {
        Object objA = this.c.a(cbzVar);
        if (objA != null) {
            return objA;
        }
        throw new IllegalStateException(a.bz(cbzVar, "Key not present: ", " - consider getOrElse or getOrNull"));
    }

    public final Object c(cbz cbzVar, uif uifVar) {
        Object objA = this.c.a(cbzVar);
        return objA == null ? uifVar.a() : objA;
    }

    public final void d(cbn cbnVar) {
        int i;
        zu zuVar = cbnVar.c;
        Object[] objArr = zuVar.b;
        Object[] objArr2 = zuVar.c;
        long[] jArr = zuVar.a;
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
                        int i5 = (i2 << 3) + i4;
                        Object obj = objArr[i5];
                        Object obj2 = objArr2[i5];
                        cbz cbzVar = (cbz) obj;
                        zu zuVar2 = this.c;
                        Object objA = zuVar2.a(cbzVar);
                        cbzVar.getClass();
                        Object objA2 = cbzVar.b.a(objA, obj2);
                        if (objA2 != null) {
                            zuVar2.j(cbzVar, objA2);
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

    public final void e(cbz cbzVar, Object obj) {
        if (!(obj instanceof cbc) || !f(cbzVar)) {
            this.c.j(cbzVar, obj);
            return;
        }
        zu zuVar = this.c;
        Object objA = zuVar.a(cbzVar);
        objA.getClass();
        cbc cbcVar = (cbc) objA;
        cbc cbcVar2 = (cbc) obj;
        String str = cbcVar2.a;
        if (str == null) {
            str = cbcVar.a;
        }
        uep uepVar = cbcVar2.b;
        if (uepVar == null) {
            uepVar = cbcVar.b;
        }
        zuVar.j(cbzVar, new cbc(str, uepVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cbn)) {
            return false;
        }
        cbn cbnVar = (cbn) obj;
        return a.ao(this.c, cbnVar.c) && this.a == cbnVar.a && this.b == cbnVar.b;
    }

    public final boolean f(cbz cbzVar) {
        return zu.e(this.c, cbzVar);
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 31) + a.o(this.a)) * 31) + a.o(this.b);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Map map = this.d;
        if (map == null) {
            zf zfVar = new zf(this.c);
            this.d = zfVar;
            map = zfVar;
        }
        return map.entrySet().iterator();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007a A[PHI: r2
      0x007a: PHI (r2v7 java.lang.String) = (r2v6 java.lang.String), (r2v8 java.lang.String) binds: [B:13:0x0040, B:21:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r20 = this;
            r0 = r20
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            boolean r2 = r0.a
            java.lang.String r3 = ", "
            if (r2 == 0) goto L14
            java.lang.String r2 = "mergeDescendants=true"
            r1.append(r2)
            r2 = r3
            goto L17
        L14:
            r2 = 0
            java.lang.String r2 = com.google.android.libraries.oliveoil.natives.TtaZ.VnmwoBe.cRiAXPmwJ
        L17:
            boolean r4 = r0.b
            if (r4 == 0) goto L24
            r1.append(r2)
            java.lang.String r2 = "isClearingSemantics=true"
            r1.append(r2)
            r2 = r3
        L24:
            zu r4 = r0.c
            java.lang.Object[] r5 = r4.b
            java.lang.Object[] r6 = r4.c
            long[] r4 = r4.a
            int r7 = r4.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L7f
            r9 = 0
        L32:
            r10 = r4[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L7a
            int r12 = r9 - r7
            r13 = 0
        L45:
            int r14 = ~r12
            int r14 = r14 >>> 31
            r15 = 8
            int r14 = 8 - r14
            if (r13 >= r14) goto L78
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r10 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r14 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r14 >= 0) goto L74
            int r14 = r9 << 3
            int r14 = r14 + r13
            r16 = r5[r14]
            r14 = r6[r14]
            r8 = r16
            cbz r8 = (defpackage.cbz) r8
            r1.append(r2)
            java.lang.String r2 = r8.a
            r1.append(r2)
            java.lang.String r2 = " : "
            r1.append(r2)
            r1.append(r14)
            r2 = r3
        L74:
            long r10 = r10 >> r15
            int r13 = r13 + 1
            goto L45
        L78:
            if (r14 != r15) goto L7f
        L7a:
            if (r9 == r7) goto L7f
            int r9 = r9 + 1
            goto L32
        L7f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = defpackage.blb.B(r0)
            r2.append(r0)
            java.lang.String r0 = "{ "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = " }"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbn.toString():java.lang.String");
    }
}
