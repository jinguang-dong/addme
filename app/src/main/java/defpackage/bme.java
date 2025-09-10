package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bme {
    private final blz a;
    private final blz b;
    private final blz c;
    private final float[] d;

    public bme(blz blzVar, blz blzVar2, blz blzVar3, float[] fArr) {
        this.a = blzVar;
        this.b = blzVar2;
        this.c = blzVar3;
        this.d = fArr;
    }

    public long a(long j) {
        blz blzVar = this.b;
        float fD = bkv.d(j);
        float fC = bkv.c(j);
        float fB = bkv.b(j);
        long jD = blzVar.d(fD, fC, fB);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jD >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jD & 4294967295L));
        float fC2 = blzVar.c(fD, fC, fB);
        float[] fArr = this.d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fC2 *= fArr[2];
        }
        float f = fIntBitsToFloat2;
        float f2 = fIntBitsToFloat;
        float fA = bkv.a(j);
        return this.c.e(f2, f, fC2, fA, this.a);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b A[PHI: r2
      0x004b: PHI (r2v3 boolean) = (r2v2 boolean), (r2v9 boolean) binds: [B:19:0x0046, B:21:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public bme(defpackage.blz r9, defpackage.blz r10, int r11) {
        /*
            r8 = this;
            long r0 = r9.b
            r2 = 12884901888(0x300000000, double:6.365987373E-314)
            boolean r0 = defpackage.a.q(r0, r2)
            if (r0 == 0) goto L16
            bmp r0 = defpackage.bmh.a
            bmp r0 = defpackage.bmh.b
            blz r0 = defpackage.byi.V(r9, r0)
            goto L17
        L16:
            r0 = r9
        L17:
            long r4 = r10.b
            boolean r1 = defpackage.a.q(r4, r2)
            if (r1 == 0) goto L28
            bmp r1 = defpackage.bmh.a
            bmp r1 = defpackage.bmh.b
            blz r1 = defpackage.byi.V(r10, r1)
            goto L29
        L28:
            r1 = r10
        L29:
            r4 = 3
            boolean r11 = defpackage.a.p(r11, r4)
            r5 = 0
            if (r11 != 0) goto L32
            goto L85
        L32:
            long r6 = r9.b
            boolean r11 = defpackage.a.q(r6, r2)
            long r6 = r10.b
            boolean r2 = defpackage.a.q(r6, r2)
            r3 = 0
            if (r11 == 0) goto L45
            if (r2 == 0) goto L44
            goto L85
        L44:
            r2 = r3
        L45:
            r6 = 1
            if (r11 != 0) goto L4b
            if (r2 == 0) goto L85
            r2 = r6
        L4b:
            if (r6 == r11) goto L4e
            r9 = r10
        L4e:
            r9.getClass()
            bmn r9 = (defpackage.bmn) r9
            if (r11 == 0) goto L5c
            bmp r11 = r9.d
            float[] r11 = r11.a()
            goto L60
        L5c:
            bmp r11 = defpackage.bmh.a
            float[] r11 = defpackage.bmh.e
        L60:
            if (r2 == 0) goto L69
            bmp r9 = r9.d
            float[] r9 = r9.a()
            goto L6d
        L69:
            bmp r9 = defpackage.bmh.a
            float[] r9 = defpackage.bmh.e
        L6d:
            float[] r5 = new float[r4]
            r2 = r11[r3]
            r4 = r9[r3]
            float r2 = r2 / r4
            r5[r3] = r2
            r2 = r11[r6]
            r3 = r9[r6]
            float r2 = r2 / r3
            r5[r6] = r2
            r2 = 2
            r11 = r11[r2]
            r9 = r9[r2]
            float r11 = r11 / r9
            r5[r2] = r11
        L85:
            r8.<init>(r10, r0, r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bme.<init>(blz, blz, int):void");
    }
}
