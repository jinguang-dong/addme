package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ail implements chq {
    private final /* synthetic */ chq a;
    private boolean b;
    private boolean c;
    private final uxa d = new uxa();

    public ail(chq chqVar) {
        this.a = chqVar;
    }

    @Override // defpackage.chq
    public final float a() {
        return this.a.a();
    }

    @Override // defpackage.chw
    public final float b() {
        return this.a.b();
    }

    @Override // defpackage.chw
    public final float dg(long j) {
        return chp.J(this.a, j);
    }

    @Override // defpackage.chq
    public final float dh(float f) {
        return chp.L(this.a, f);
    }

    @Override // defpackage.chq
    public final float di(int i) {
        return chp.M(this.a, i);
    }

    @Override // defpackage.chq
    public final float dj(long j) {
        return chp.N(this.a, j);
    }

    @Override // defpackage.chq
    public final float dk(float f) {
        return chp.O(this.a, f);
    }

    @Override // defpackage.chq
    /* renamed from: do, reason: not valid java name */
    public final int mo0do(float f) {
        return chp.P(this.a, f);
    }

    @Override // defpackage.chq
    public final long dp(long j) {
        return chp.Q(this.a, j);
    }

    @Override // defpackage.chw
    public final long dq(float f) {
        return chp.K(this.a, f);
    }

    @Override // defpackage.chq
    public final long dr(float f) {
        return chp.R(this.a, f);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(defpackage.uhb r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.aij
            if (r0 == 0) goto L13
            r0 = r5
            aij r0 = (defpackage.aij) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aij r0 = new aij
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            uhi r1 = defpackage.uhi.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.rnt.aN(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.rnt.aN(r5)
            uxa r5 = r4.d
            r0.c = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            r5 = 0
            r4.b = r5
            r4.c = r5
            ufg r4 = defpackage.ufg.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ail.l(uhb):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(defpackage.uhb r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.aik
            if (r0 == 0) goto L13
            r0 = r5
            aik r0 = (defpackage.aik) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aik r0 = new aik
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            uhi r1 = defpackage.uhi.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.rnt.aN(r5)
            goto L44
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.rnt.aN(r5)
            boolean r5 = r4.b
            if (r5 != 0) goto L4b
            boolean r5 = r4.c
            if (r5 != 0) goto L4b
            uxa r5 = r4.d
            r0.c = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 == r1) goto L4a
        L44:
            uxa r5 = r4.d
            r5.d()
            goto L4b
        L4a:
            return r1
        L4b:
            boolean r4 = r4.b
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ail.m(uhb):java.lang.Object");
    }

    public final void n() {
        this.c = true;
        uxa uxaVar = this.d;
        if (uxaVar.a()) {
            uxaVar.d();
        }
    }

    public final void o() {
        this.b = true;
        uxa uxaVar = this.d;
        if (uxaVar.a()) {
            uxaVar.d();
        }
    }
}
