package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ame extends bij implements bve {
    public float a;
    public float b;
    public float c;
    public float d;
    public boolean e;

    public ame(float f, float f2, float f3, float f4, boolean z) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long h(defpackage.chq r7) {
        /*
            r6 = this;
            float r0 = r6.c
            boolean r0 = java.lang.Float.isNaN(r0)
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 0
            if (r0 != 0) goto L16
            float r0 = r6.c
            int r0 = r7.mo0do(r0)
            if (r0 >= 0) goto L17
            r0 = r2
            goto L17
        L16:
            r0 = r1
        L17:
            float r3 = r6.d
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 != 0) goto L29
            float r3 = r6.d
            int r3 = r7.mo0do(r3)
            if (r3 >= 0) goto L2a
            r3 = r2
            goto L2a
        L29:
            r3 = r1
        L2a:
            float r4 = r6.a
            boolean r4 = java.lang.Float.isNaN(r4)
            if (r4 != 0) goto L40
            float r4 = r6.a
            int r4 = r7.mo0do(r4)
            if (r4 >= 0) goto L3b
            r4 = r2
        L3b:
            if (r4 <= r0) goto L3e
            r4 = r0
        L3e:
            if (r4 != r1) goto L41
        L40:
            r4 = r2
        L41:
            float r5 = r6.b
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L59
            float r6 = r6.b
            int r6 = r7.mo0do(r6)
            if (r6 >= 0) goto L52
            r6 = r2
        L52:
            if (r6 <= r3) goto L55
            r6 = r3
        L55:
            if (r6 != r1) goto L58
            goto L59
        L58:
            r2 = r6
        L59:
            long r6 = defpackage.chp.d(r4, r0, r2, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ame.h(chq):long");
    }

    @Override // defpackage.bve
    public final bss a(bst bstVar, bsq bsqVar, long j) {
        int iD;
        int iB;
        int iC;
        int iA;
        long jD;
        long jH = h(bstVar);
        if (this.e) {
            jD = chp.f(j, jH);
        } else {
            if (Float.isNaN(this.a)) {
                iD = cho.d(j);
                int iB2 = cho.b(jH);
                if (iD > iB2) {
                    iD = iB2;
                }
            } else {
                iD = cho.d(jH);
            }
            if (Float.isNaN(this.c)) {
                iB = cho.b(j);
                int iD2 = cho.d(jH);
                if (iB < iD2) {
                    iB = iD2;
                }
            } else {
                iB = cho.b(jH);
            }
            if (Float.isNaN(this.b)) {
                iC = cho.c(j);
                int iA2 = cho.a(jH);
                if (iC > iA2) {
                    iC = iA2;
                }
            } else {
                iC = cho.c(jH);
            }
            if (Float.isNaN(this.d)) {
                iA = cho.a(j);
                int iC2 = cho.c(jH);
                if (iA < iC2) {
                    iA = iC2;
                }
            } else {
                iA = cho.a(jH);
            }
            jD = chp.d(iD, iB, iC, iA);
        }
        bte bteVarR = bsqVar.r(jD);
        return bstVar.ds(bteVarR.a, bteVarR.b, ufx.a, new np(bteVarR, 10));
    }

    @Override // defpackage.bve
    public final int c(brv brvVar, bru bruVar, int i) {
        long jH = h(brvVar);
        if (cho.i(jH)) {
            return cho.a(jH);
        }
        if (!this.e) {
            i = chp.c(jH, i);
        }
        return chp.b(jH, bruVar.c(i));
    }

    @Override // defpackage.bve
    public final int d(brv brvVar, bru bruVar, int i) {
        long jH = h(brvVar);
        if (cho.j(jH)) {
            return cho.b(jH);
        }
        if (!this.e) {
            i = chp.b(jH, i);
        }
        return chp.c(jH, bruVar.d(i));
    }

    @Override // defpackage.bve
    public final int e(brv brvVar, bru bruVar, int i) {
        long jH = h(brvVar);
        if (cho.i(jH)) {
            return cho.a(jH);
        }
        if (!this.e) {
            i = chp.c(jH, i);
        }
        return chp.b(jH, bruVar.e(i));
    }

    @Override // defpackage.bve
    public final int f(brv brvVar, bru bruVar, int i) {
        long jH = h(brvVar);
        if (cho.j(jH)) {
            return cho.b(jH);
        }
        if (!this.e) {
            i = chp.b(jH, i);
        }
        return chp.c(jH, bruVar.f(i));
    }
}
