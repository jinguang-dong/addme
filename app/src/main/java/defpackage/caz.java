package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class caz {
    public final int a;
    public float b;
    private final uiu c;

    public caz(int i, uiu uiuVar) {
        this.a = i;
        this.c = uiuVar;
    }

    public final int a(int i) {
        return ukc.p(i - ukj.x(this.b), 0, this.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(float r5, defpackage.uhb r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cay
            if (r0 == 0) goto L13
            r0 = r6
            cay r0 = (defpackage.cay) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cay r0 = new cay
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            uhi r1 = defpackage.uhi.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.rnt.aN(r6)
            goto L42
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.rnt.aN(r6)
            uiu r6 = r4.c
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r5)
            r0.c = r3
            java.lang.Object r6 = r6.a(r2, r0)
            if (r6 != r1) goto L42
            return r1
        L42:
            java.lang.Number r6 = (java.lang.Number) r6
            float r5 = r6.floatValue()
            float r6 = r4.b
            float r6 = r6 + r5
            r4.b = r6
            ufg r4 = defpackage.ufg.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.caz.b(float, uhb):java.lang.Object");
    }

    public final Object c(float f, uhb uhbVar) {
        Object objB = b(f - this.b, uhbVar);
        return objB == uhi.a ? objB : ufg.a;
    }
}
