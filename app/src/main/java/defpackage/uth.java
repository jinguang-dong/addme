package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class uth extends uht implements uiv {
    int a;
    /* synthetic */ int b;
    final /* synthetic */ uti c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uth(uti utiVar, uhb uhbVar) {
        super(3, uhbVar);
        this.c = utiVar;
    }

    @Override // defpackage.uiv
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        uth uthVar = new uth(this.c, (uhb) obj3);
        uthVar.d = (url) obj;
        uthVar.b = iIntValue;
        return uthVar.b(ufg.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (r1.a(r7, r6) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (r1.a(r7, r6) != r0) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053 A[PHI: r1
      0x0053: PHI (r1v3 url) = (r1v10 url), (r1v11 url) binds: [B:21:0x0051, B:10:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062 A[PHI: r1
      0x0062: PHI (r1v4 url) = (r1v8 url), (r1v9 url) binds: [B:23:0x0060, B:9:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, url] */
    @Override // defpackage.uhn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            uhi r0 = defpackage.uhi.a
            int r1 = r6.a
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L29
            if (r1 == r5) goto L25
            if (r1 == r4) goto L1f
            if (r1 == r3) goto L19
            if (r1 == r2) goto L13
            goto L25
        L13:
            java.lang.Object r1 = r6.d
            defpackage.rnt.aN(r7)
            goto L62
        L19:
            java.lang.Object r1 = r6.d
            defpackage.rnt.aN(r7)
            goto L53
        L1f:
            java.lang.Object r1 = r6.d
            defpackage.rnt.aN(r7)
            goto L47
        L25:
            defpackage.rnt.aN(r7)
            goto L71
        L29:
            defpackage.rnt.aN(r7)
            java.lang.Object r1 = r6.d
            int r7 = r6.b
            if (r7 <= 0) goto L3d
            uta r7 = defpackage.uta.a
            r6.a = r5
            java.lang.Object r6 = r1.a(r7, r6)
            if (r6 != r0) goto L71
            goto L74
        L3d:
            r6.a = r4
            r4 = 0
            java.lang.Object r7 = defpackage.ung.e(r4, r6)
            if (r7 == r0) goto L74
        L47:
            uta r7 = defpackage.uta.b
            r6.d = r1
            r6.a = r3
            java.lang.Object r7 = r1.a(r7, r6)
            if (r7 == r0) goto L74
        L53:
            r6.d = r1
            r6.a = r2
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r7 = defpackage.ung.e(r2, r6)
            if (r7 == r0) goto L74
        L62:
            uta r7 = defpackage.uta.c
            r2 = 0
            r6.d = r2
            r2 = 5
            r6.a = r2
            java.lang.Object r6 = r1.a(r7, r6)
            if (r6 != r0) goto L71
            goto L74
        L71:
            ufg r6 = defpackage.ufg.a
            return r6
        L74:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uth.b(java.lang.Object):java.lang.Object");
    }
}
