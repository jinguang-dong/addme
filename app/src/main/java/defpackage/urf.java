package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class urf extends urh {
    private final uiu d;

    public urf(uiu uiuVar, uhf uhfVar, int i, int i2) {
        super(uiuVar, uhfVar, i, i2);
        this.d = uiuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.urh, defpackage.utw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final java.lang.Object b(defpackage.uqx r5, defpackage.uhb r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ure
            if (r0 == 0) goto L13
            r0 = r6
            ure r0 = (defpackage.ure) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ure r0 = new ure
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            uhi r1 = defpackage.uhi.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r5 = r0.a
            defpackage.rnt.aN(r6)
            goto L3e
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.rnt.aN(r6)
            r0.a = r5
            r0.d = r3
            java.lang.Object r4 = defpackage.urh.g(r4, r5, r0)
            if (r4 == r1) goto L4f
        L3e:
            boolean r4 = r5.x()
            if (r4 == 0) goto L47
            ufg r4 = defpackage.ufg.a
            return r4
        L47:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r4.<init>(r5)
            throw r4
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.urf.b(uqx, uhb):java.lang.Object");
    }

    @Override // defpackage.urh, defpackage.utw
    protected final utw c(uhf uhfVar, int i, int i2) {
        return new urf(this.d, uhfVar, i, i2);
    }

    public /* synthetic */ urf(uiu uiuVar) {
        this(uiuVar, uhg.a, -2, 1);
    }
}
