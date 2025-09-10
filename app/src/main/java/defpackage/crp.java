package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class crp extends uht implements uiu {
    Object a;
    int b;
    /* synthetic */ boolean c;
    final /* synthetic */ cru d;
    final /* synthetic */ int e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crp(cru cruVar, int i, uhb uhbVar, int i2) {
        super(2, uhbVar);
        this.f = i2;
        this.d = cruVar;
        this.e = i;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.f != 0) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            return ((crp) c(bool, (uhb) obj2)).b(ufg.a);
        }
        Boolean bool2 = (Boolean) obj;
        bool2.booleanValue();
        return ((crp) c(bool2, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bb  */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v20, types: [cru] */
    @Override // defpackage.uhn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.f
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L69
            uhi r0 = defpackage.uhi.a
            int r3 = r6.b
            if (r3 == 0) goto L1e
            if (r3 == r2) goto L16
            boolean r0 = r6.c
            java.lang.Object r6 = r6.a
            defpackage.rnt.aN(r7)
            goto L4a
        L16:
            boolean r3 = r6.c
            defpackage.rnt.aN(r7)     // Catch: java.lang.Throwable -> L1c
            goto L2e
        L1c:
            r7 = move-exception
            goto L31
        L1e:
            defpackage.rnt.aN(r7)
            boolean r3 = r6.c
            cru r7 = r6.d     // Catch: java.lang.Throwable -> L1c
            r6.b = r2     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r7 = r7.f(r3, r6)     // Catch: java.lang.Throwable -> L1c
            if (r7 != r0) goto L2e
            goto L68
        L2e:
            csl r7 = (defpackage.csl) r7     // Catch: java.lang.Throwable -> L1c
            goto L5f
        L31:
            if (r3 == 0) goto L55
            cru r4 = r6.d
            tdy r4 = r4.k()
            r6.a = r7
            r6.c = r2
            r6.b = r1
            java.lang.Object r6 = r4.m()
            if (r6 != r0) goto L46
            goto L68
        L46:
            r0 = r7
            r7 = r6
            r6 = r0
            r0 = r3
        L4a:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r3 = r7
            r7 = r6
            r6 = r3
            r3 = r0
            goto L57
        L55:
            int r6 = r6.e
        L57:
            csf r0 = new csf
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            r0.<init>(r7, r6)
            r7 = r0
        L5f:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            uev r0 = new uev
            r0.<init>(r7, r6)
        L68:
            return r0
        L69:
            uhi r0 = defpackage.uhi.a
            int r3 = r6.b
            if (r3 == 0) goto L7d
            if (r3 == r2) goto L77
            java.lang.Object r6 = r6.a
            defpackage.rnt.aN(r7)
            goto La6
        L77:
            boolean r2 = r6.c
            defpackage.rnt.aN(r7)
            goto L90
        L7d:
            defpackage.rnt.aN(r7)
            boolean r7 = r6.c
            cru r3 = r6.d
            r6.b = r2
            java.lang.Object r2 = r3.e(r6)
            if (r2 != r0) goto L8d
            goto La2
        L8d:
            r5 = r2
            r2 = r7
            r7 = r5
        L90:
            if (r2 == 0) goto Lb0
            cru r2 = r6.d
            tdy r2 = r2.k()
            r6.a = r7
            r6.b = r1
            java.lang.Object r6 = r2.m()
            if (r6 != r0) goto La3
        La2:
            return r0
        La3:
            r5 = r7
            r7 = r6
            r6 = r5
        La6:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r5 = r7
            r7 = r6
            r6 = r5
            goto Lb2
        Lb0:
            int r6 = r6.e
        Lb2:
            cqu r0 = new cqu
            if (r7 == 0) goto Lbb
            int r1 = r7.hashCode()
            goto Lbc
        Lbb:
            r1 = 0
        Lbc:
            r0.<init>(r7, r1, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crp.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        if (this.f != 0) {
            crp crpVar = new crp(this.d, this.e, uhbVar, 1, null);
            crpVar.c = ((Boolean) obj).booleanValue();
            return crpVar;
        }
        crp crpVar2 = new crp(this.d, this.e, uhbVar, 0);
        crpVar2.c = ((Boolean) obj).booleanValue();
        return crpVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crp(cru cruVar, int i, uhb uhbVar, int i2, byte[] bArr) {
        super(2, uhbVar);
        this.f = i2;
        this.d = cruVar;
        this.e = i;
    }
}
