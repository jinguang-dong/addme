package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class urd implements urk {
    private final uiu a;

    public urd() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.urk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object gc(defpackage.url r5, defpackage.uhb r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.urc
            if (r0 == 0) goto L13
            r0 = r6
            urc r0 = (defpackage.urc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            urc r0 = new urc
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            uhi r1 = defpackage.uhi.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            uun r4 = r0.d
            defpackage.rnt.aN(r6)     // Catch: java.lang.Throwable -> L29
            goto L50
        L29:
            r5 = move-exception
            goto L5a
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.rnt.aN(r6)
            uun r6 = new uun
            uhf r2 = r0.q()
            r6.<init>(r5, r2)
            r0.d = r6     // Catch: java.lang.Throwable -> L57
            r0.c = r3     // Catch: java.lang.Throwable -> L57
            uiu r4 = r4.a     // Catch: java.lang.Throwable -> L57
            java.lang.Object r4 = r4.a(r6, r0)     // Catch: java.lang.Throwable -> L57
            if (r4 == r1) goto L4d
            ufg r4 = defpackage.ufg.a     // Catch: java.lang.Throwable -> L57
        L4d:
            if (r4 == r1) goto L56
            r4 = r6
        L50:
            r4.f()
            ufg r4 = defpackage.ufg.a
            return r4
        L56:
            return r1
        L57:
            r4 = move-exception
            r5 = r4
            r4 = r6
        L5a:
            r4.f()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.urd.gc(url, uhb):java.lang.Object");
    }

    public urd(uiu uiuVar) {
        this.a = uiuVar;
    }
}
