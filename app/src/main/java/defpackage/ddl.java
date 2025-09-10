package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ddl implements url {
    final /* synthetic */ url a;
    final /* synthetic */ dco b;
    final /* synthetic */ uiq c;

    public ddl(url urlVar, dco dcoVar, uiq uiqVar) {
        this.a = urlVar;
        this.b = dcoVar;
        this.c = uiqVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r6.a(r8, r0) == r1) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.url
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r7, defpackage.uhb r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.ddk
            if (r0 == 0) goto L13
            r0 = r8
            ddk r0 = (defpackage.ddk) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ddk r0 = new ddk
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            uhi r1 = defpackage.uhi.a
            int r2 = r0.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.rnt.aN(r8)
            goto L5c
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.c
            defpackage.rnt.aN(r8)
            goto L50
        L38:
            defpackage.rnt.aN(r8)
            url r8 = r6.a
            java.util.Set r7 = (java.util.Set) r7
            dco r7 = r6.b
            uiq r6 = r6.c
            r0.c = r8
            r0.b = r4
            java.lang.Object r6 = defpackage.cwy.e(r7, r4, r6, r0)
            if (r6 == r1) goto L5f
            r5 = r8
            r8 = r6
            r6 = r5
        L50:
            r7 = 0
            r0.c = r7
            r0.b = r3
            java.lang.Object r6 = r6.a(r8, r0)
            if (r6 != r1) goto L5c
            goto L5f
        L5c:
            ufg r6 = defpackage.ufg.a
            return r6
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddl.a(java.lang.Object, uhb):java.lang.Object");
    }
}
