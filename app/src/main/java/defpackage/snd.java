package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class snd implements uiq {
    private final uxa a = new uxa();
    private rup b;

    public snd(uiq uiqVar) {
        this.b = new sne(uiqVar);
    }

    @Override // defpackage.uiq
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        uhb uhbVar = (uhb) obj;
        rup rupVar = this.b;
        if (rupVar instanceof snb) {
            return ((snb) rupVar).b;
        }
        if (rupVar instanceof sne) {
            return b(uhbVar);
        }
        throw new uet();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.uhb r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.snc
            if (r0 == 0) goto L13
            r0 = r7
            snc r0 = (defpackage.snc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            snc r0 = new snc
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            uhi r1 = defpackage.uhi.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            uxa r0 = r0.d
            defpackage.rnt.aN(r7)     // Catch: java.lang.Throwable -> L2c
            goto L6c
        L2c:
            r6 = move-exception
            goto L81
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            uxa r2 = r0.d
            defpackage.rnt.aN(r7)
            r7 = r2
            goto L4c
        L3d:
            defpackage.rnt.aN(r7)
            uxa r7 = r6.a
            r0.d = r7
            r0.c = r4
            java.lang.Object r2 = r7.b(r0)
            if (r2 == r1) goto L85
        L4c:
            rup r2 = r6.b     // Catch: java.lang.Throwable -> L7f
            boolean r4 = r2 instanceof defpackage.snb     // Catch: java.lang.Throwable -> L7f
            if (r4 == 0) goto L57
            snb r2 = (defpackage.snb) r2     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r6 = r2.b     // Catch: java.lang.Throwable -> L7f
            goto L75
        L57:
            boolean r4 = r2 instanceof defpackage.sne     // Catch: java.lang.Throwable -> L7f
            if (r4 == 0) goto L79
            sne r2 = (defpackage.sne) r2     // Catch: java.lang.Throwable -> L7f
            uiq r2 = r2.b     // Catch: java.lang.Throwable -> L7f
            r0.d = r7     // Catch: java.lang.Throwable -> L7f
            r0.c = r3     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r0 = r2.a(r0)     // Catch: java.lang.Throwable -> L7f
            if (r0 == r1) goto L85
            r5 = r0
            r0 = r7
            r7 = r5
        L6c:
            snb r1 = new snb     // Catch: java.lang.Throwable -> L2c
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L2c
            r6.b = r1     // Catch: java.lang.Throwable -> L2c
            r6 = r7
            r7 = r0
        L75:
            r7.d()
            return r6
        L79:
            uet r6 = new uet     // Catch: java.lang.Throwable -> L7f
            r6.<init>()     // Catch: java.lang.Throwable -> L7f
            throw r6     // Catch: java.lang.Throwable -> L7f
        L7f:
            r6 = move-exception
            r0 = r7
        L81:
            r0.d()
            throw r6
        L85:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.snd.b(uhb):java.lang.Object");
    }
}
