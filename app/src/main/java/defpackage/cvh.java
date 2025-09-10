package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cvh {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final float f;
    public final float g;
    public long h;
    private final cuw i;
    private final float j;

    public cvh(long j, long j2, long j3, cuw cuwVar) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.i = cuwVar;
        long jM = cij.m(j, j2);
        long jM2 = cij.m(j3, j2);
        float fJ = cij.j(jM);
        float fJ2 = cij.j(jM2);
        if (fJ <= 0.0f || fJ2 <= 0.0f) {
            this.d = a.t(0.0f, 0.0f);
            this.e = a.t(0.0f, 0.0f);
            this.f = 0.0f;
            this.j = 0.0f;
            this.g = 0.0f;
        } else {
            long jK = cij.k(jM, fJ);
            this.d = jK;
            long jK2 = cij.k(jM2, fJ2);
            this.e = jK2;
            float f = cuwVar != null ? cuwVar.b : 0.0f;
            this.f = f;
            float fI = cij.i(jK, jK2);
            this.j = fI;
            int i = cvk.a;
            float fSqrt = (float) Math.sqrt(1.0f - (fI * fI));
            this.g = ((double) fSqrt) > 0.001d ? (f * (fI + 1.0f)) / fSqrt : 0.0f;
        }
        this.h = a.t(0.0f, 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.cux b(float r15, float r16, long r17, long r19, long r21, long r23, long r25, float r27) {
        /*
            r0 = r16
            r1 = r17
            r3 = r19
            r5 = r25
            long r7 = defpackage.cij.m(r3, r1)
            long r7 = defpackage.cij.l(r7)
            long r9 = defpackage.cij.o(r7, r15)
            r11 = 1065353216(0x3f800000, float:1.0)
            float r11 = r11 + r0
            long r9 = defpackage.cij.o(r9, r11)
            long r1 = defpackage.cij.n(r1, r9)
            long r9 = defpackage.cij.n(r21, r23)
            r11 = 1073741824(0x40000000, float:2.0)
            long r9 = defpackage.cij.k(r9, r11)
            float r12 = defpackage.a.z(r21)
            float r13 = defpackage.a.z(r9)
            float r12 = defpackage.cvk.b(r12, r13, r0)
            float r13 = defpackage.a.A(r21)
            float r9 = defpackage.a.A(r9)
            float r0 = defpackage.cvk.b(r13, r9, r0)
            long r9 = defpackage.a.t(r12, r0)
            float r0 = defpackage.a.z(r9)
            float r12 = defpackage.a.z(r5)
            float r0 = r0 - r12
            float r9 = defpackage.a.A(r9)
            float r10 = defpackage.a.A(r5)
            float r9 = r9 - r10
            long r9 = defpackage.cvk.c(r0, r9)
            r0 = r27
            long r9 = defpackage.cij.o(r9, r0)
            long r9 = defpackage.cij.n(r5, r9)
            long r5 = defpackage.cij.m(r9, r5)
            long r5 = defpackage.cvk.d(r5)
            long r5 = defpackage.cvk.d(r5)
            float r0 = defpackage.cij.i(r7, r5)
            float r12 = java.lang.Math.abs(r0)
            r13 = 953267991(0x38d1b717, float:1.0E-4)
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 >= 0) goto L82
        L80:
            r14 = 0
            goto La7
        L82:
            r15 = r13
            long r13 = defpackage.cij.m(r9, r3)
            float r5 = defpackage.cij.i(r13, r5)
            float r6 = java.lang.Math.abs(r0)
            float r12 = java.lang.Math.abs(r5)
            float r12 = r12 * r15
            int r6 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r6 >= 0) goto L99
            goto L80
        L99:
            float r5 = r5 / r0
            long r5 = defpackage.cij.o(r7, r5)
            long r3 = defpackage.cij.n(r3, r5)
            yh r14 = new yh
            r14.<init>(r3)
        La7:
            if (r14 == 0) goto Lac
            long r3 = r14.a
            goto Lae
        Lac:
            r3 = r21
        Lae:
            long r5 = defpackage.cij.o(r3, r11)
            long r5 = defpackage.cij.n(r1, r5)
            r0 = 1077936128(0x40400000, float:3.0)
            long r5 = defpackage.cij.k(r5, r0)
            cux r0 = new cux
            float r7 = defpackage.a.z(r1)
            float r1 = defpackage.a.A(r1)
            float r2 = defpackage.a.z(r5)
            float r5 = defpackage.a.A(r5)
            float r6 = defpackage.a.z(r3)
            float r3 = defpackage.a.A(r3)
            float r4 = defpackage.a.z(r9)
            float r8 = defpackage.a.A(r9)
            r9 = 8
            float[] r9 = new float[r9]
            r10 = 0
            r9[r10] = r7
            r7 = 1
            r9[r7] = r1
            r1 = 2
            r9[r1] = r2
            r1 = 3
            r9[r1] = r5
            r1 = 4
            r9[r1] = r6
            r1 = 5
            r9[r1] = r3
            r1 = 6
            r9[r1] = r4
            r1 = 7
            r9[r1] = r8
            r0.<init>(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvh.b(float, float, long, long, long, long, long, float):cux");
    }

    public final float a(float f) {
        float f2 = this.g;
        if (f <= f2 && f > f2) {
            return ((f - f2) * 0.0f) / 0.0f;
        }
        return 0.0f;
    }
}
