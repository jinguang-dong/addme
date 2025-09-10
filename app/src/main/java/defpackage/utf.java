package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class utf implements url {
    final /* synthetic */ ujw a;
    final /* synthetic */ url b;

    public utf(ujw ujwVar, url urlVar) {
        this.a = ujwVar;
        this.b = urlVar;
    }

    @Override // defpackage.url
    public final /* bridge */ /* synthetic */ Object a(Object obj, uhb uhbVar) {
        return b(((Number) obj).intValue(), uhbVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(int r5, defpackage.uhb r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ute
            if (r0 == 0) goto L13
            r0 = r6
            ute r0 = (defpackage.ute) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ute r0 = new ute
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            uhi r1 = defpackage.uhi.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.rnt.aN(r6)
            goto L49
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.rnt.aN(r6)
            if (r5 <= 0) goto L49
            ujw r5 = r4.a
            boolean r6 = r5.a
            if (r6 != 0) goto L49
            r5.a = r3
            url r4 = r4.b
            uta r5 = defpackage.uta.a
            r0.c = r3
            java.lang.Object r4 = r4.a(r5, r0)
            if (r4 != r1) goto L49
            return r1
        L49:
            ufg r4 = defpackage.ufg.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.utf.b(int, uhb):java.lang.Object");
    }
}
