package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqk implements chq, uhb {
    public umk a;
    final /* synthetic */ bql b;
    private final /* synthetic */ bql c;
    private final uhb d;
    private int f = 2;
    private final uhf e = uhg.a;

    public bqk(bql bqlVar, uhb uhbVar) {
        this.b = bqlVar;
        this.c = bqlVar;
        this.d = uhbVar;
    }

    @Override // defpackage.chq
    public final float a() {
        return this.c.a();
    }

    @Override // defpackage.chw
    public final float b() {
        return this.c.b();
    }

    @Override // defpackage.chw
    public final float dg(long j) {
        return chp.J(this.c, j);
    }

    @Override // defpackage.chq
    public final float dh(float f) {
        return chp.L(this.c, f);
    }

    @Override // defpackage.chq
    public final float di(int i) {
        return chp.M(this.c, i);
    }

    @Override // defpackage.chq
    public final float dj(long j) {
        return chp.N(this.c, j);
    }

    @Override // defpackage.chq
    public final float dk(float f) {
        return chp.O(this.c, f);
    }

    @Override // defpackage.chq
    /* renamed from: do */
    public final int mo0do(float f) {
        return chp.P(this.c, f);
    }

    @Override // defpackage.chq
    public final long dp(long j) {
        return chp.Q(this.c, j);
    }

    @Override // defpackage.chw
    public final long dq(float f) {
        return chp.K(this.c, f);
    }

    @Override // defpackage.chq
    public final long dr(float f) {
        return chp.R(this.c, f);
    }

    @Override // defpackage.uhb
    public final void fW(Object obj) {
        bql bqlVar = this.b;
        synchronized (bqlVar.f) {
            bqlVar.e.m(this);
        }
        this.d.fW(obj);
    }

    public final long l() {
        bql bqlVar = this.b;
        long jQ = chp.Q(bqlVar, bqlVar.m().e());
        long j = bqlVar.g;
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (jQ >> 32)) - ((int) (j >> 32))) / 2.0f;
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (jQ & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        return (Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax2) & 4294967295L);
    }

    public final long m() {
        return this.b.g;
    }

    public final bpp n() {
        return this.b.d;
    }

    public final caa o() {
        return this.b.m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v0, types: [bqk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1, types: [uol] */
    /* JADX WARN: Type inference failed for: r10v4, types: [uol] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r13v0, types: [uiu] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(long r11, defpackage.uiu r13, defpackage.uhb r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof defpackage.bqj
            if (r0 == 0) goto L13
            r0 = r14
            bqj r0 = (defpackage.bqj) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            bqj r0 = new bqj
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.b
            uhi r1 = defpackage.uhi.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r10 = r0.a
            defpackage.rnt.aN(r14)     // Catch: java.lang.Throwable -> L29
            goto L6d
        L29:
            r0 = move-exception
            r11 = r0
            goto L74
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            defpackage.rnt.aN(r14)
            r4 = 0
            int r14 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r14 > 0) goto L4d
            umk r14 = r10.a
            if (r14 == 0) goto L4d
            bpq r2 = new bpq
            r2.<init>(r11)
            java.lang.Object r2 = defpackage.rnt.aM(r2)
            r14.fW(r2)
        L4d:
            bql r14 = r10.b
            und r14 = r14.C()
            aiz r4 = new aiz
            r8 = 0
            r9 = 3
            r7 = r10
            r5 = r11
            r4.<init>(r5, r7, r8, r9)
            r10 = 3
            r11 = 0
            r12 = 0
            uol r10 = defpackage.ukc.C(r14, r11, r12, r4, r10)
            r0.a = r10     // Catch: java.lang.Throwable -> L29
            r0.d = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r14 = r13.a(r7, r0)     // Catch: java.lang.Throwable -> L29
            if (r14 == r1) goto L73
        L6d:
            bph r11 = defpackage.bph.a
            r10.s(r11)
            return r14
        L73:
            return r1
        L74:
            bph r12 = defpackage.bph.a
            r10.s(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bqk.p(long, uiu, uhb):java.lang.Object");
    }

    @Override // defpackage.uhb
    public final uhf q() {
        return this.e;
    }

    public final Object s(int i, uhb uhbVar) {
        uml umlVar = new uml(ske.aE(uhbVar), 1);
        umlVar.x();
        this.f = i;
        this.a = umlVar;
        return umlVar.i();
    }

    public final void t(bpp bppVar, int i) {
        umk umkVar;
        if (i != this.f || (umkVar = this.a) == null) {
            return;
        }
        this.a = null;
        umkVar.fW(bppVar);
    }
}
