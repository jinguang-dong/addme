package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vaj implements vap {
    private final vae a;
    private final vad b;
    private vam c;
    private int d;
    private boolean e;
    private long f;

    public vaj(vae vaeVar) {
        this.a = vaeVar;
        vad vadVar = ((val) vaeVar).b;
        this.b = vadVar;
        vam vamVar = vadVar.a;
        this.c = vamVar;
        this.d = vamVar != null ? vamVar.b : -1;
    }

    @Override // defpackage.vap, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
    
        if (r12 == r13.b) goto L13;
     */
    @Override // defpackage.vap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long e(defpackage.vad r11, long r12) {
        /*
            r10 = this;
            boolean r12 = r10.e
            if (r12 != 0) goto Lb7
            vam r12 = r10.c
            if (r12 == 0) goto L20
            vad r13 = r10.b
            vam r13 = r13.a
            if (r12 != r13) goto L18
            int r12 = r10.d
            r13.getClass()
            int r13 = r13.b
            if (r12 != r13) goto L18
            goto L20
        L18:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Peek source is invalid because upstream source was used"
            r10.<init>(r11)
            throw r10
        L20:
            vae r12 = r10.a
            long r0 = r10.f
            r2 = 1
            long r0 = r0 + r2
            boolean r12 = r12.l(r0)
            if (r12 != 0) goto L30
            r10 = -1
            return r10
        L30:
            vam r12 = r10.c
            if (r12 != 0) goto L40
            vad r12 = r10.b
            vam r12 = r12.a
            if (r12 == 0) goto L40
            r10.c = r12
            int r12 = r12.b
            r10.d = r12
        L40:
            vad r12 = r10.b
            long r0 = r12.b
            long r2 = r10.f
            long r0 = r0 - r2
            r2 = 8192(0x2000, double:4.0474E-320)
            long r8 = java.lang.Math.min(r2, r0)
            long r6 = r10.f
            long r4 = r12.b
            defpackage.ukc.T(r4, r6, r8)
            r0 = 0
            int r13 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r13 != 0) goto L5b
            goto Lb1
        L5b:
            long r2 = r11.b
            long r2 = r2 + r8
            r11.b = r2
            vam r12 = r12.a
        L62:
            r12.getClass()
            int r13 = r12.c
            int r2 = r12.b
            int r13 = r13 - r2
            long r2 = (long) r13
            int r13 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r13 < 0) goto L73
            vam r12 = r12.f
            long r6 = r6 - r2
            goto L62
        L73:
            r2 = r8
        L74:
            int r13 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r13 <= 0) goto Lb1
            r12.getClass()
            vam r13 = r12.b()
            int r4 = r13.b
            int r5 = (int) r6
            int r4 = r4 + r5
            r13.b = r4
            int r5 = r13.c
            int r6 = (int) r2
            int r4 = r4 + r6
            int r4 = java.lang.Math.min(r4, r5)
            r13.c = r4
            vam r4 = r11.a
            if (r4 != 0) goto L9e
            r13.g = r13
            vam r4 = r13.g
            r13.f = r4
            vam r4 = r13.f
            r11.a = r4
            goto La6
        L9e:
            vam r4 = r4.g
            r4.getClass()
            r4.d(r13)
        La6:
            int r4 = r13.c
            int r13 = r13.b
            int r4 = r4 - r13
            long r4 = (long) r4
            long r2 = r2 - r4
            vam r12 = r12.f
            r6 = r0
            goto L74
        Lb1:
            long r11 = r10.f
            long r11 = r11 + r8
            r10.f = r11
            return r8
        Lb7:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "closed"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vaj.e(vad, long):long");
    }
}
