package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class deb extends uht implements uiu {
    Object a;
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ boolean d;
    final /* synthetic */ boolean e;
    final /* synthetic */ dco f;
    final /* synthetic */ uiq g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public deb(boolean z, boolean z2, dco dcoVar, uhb uhbVar, uiq uiqVar) {
        super(2, uhbVar);
        this.d = z;
        this.e = z2;
        this.f = dcoVar;
        this.g = uiqVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((deb) c((dds) obj, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if (r8.a(r7) != r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090 A[PHI: r1 r8
      0x0090: PHI (r1v9 dds) = (r1v8 dds), (r1v15 dds) binds: [B:29:0x008e, B:8:0x0016] A[DONT_GENERATE, DONT_INLINE]
      0x0090: PHI (r8v13 java.lang.Object) = (r8v12 java.lang.Object), (r8v0 java.lang.Object) binds: [B:29:0x008e, B:8:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3 A[RETURN] */
    @Override // defpackage.uhn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            uhi r0 = defpackage.uhi.a
            int r1 = r7.b
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L35
            if (r1 == r4) goto L2b
            if (r1 == r3) goto L1f
            if (r1 == r2) goto L16
            java.lang.Object r0 = r7.c
            defpackage.rnt.aN(r8)
            goto La1
        L16:
            java.lang.Object r1 = r7.c
            dds r1 = (defpackage.dds) r1
            defpackage.rnt.aN(r8)
            goto L90
        L1f:
            java.lang.Object r1 = r7.a
            java.lang.Object r3 = r7.c
            dds r3 = (defpackage.dds) r3
            defpackage.rnt.aN(r8)
            r5 = r1
            r1 = r3
            goto L79
        L2b:
            java.lang.Object r1 = r7.a
            java.lang.Object r4 = r7.c
            dds r4 = (defpackage.dds) r4
            defpackage.rnt.aN(r8)
            goto L5b
        L35:
            defpackage.rnt.aN(r8)
            java.lang.Object r8 = r7.c
            dds r8 = (defpackage.dds) r8
            boolean r1 = r7.d
            if (r1 == 0) goto Lb5
            boolean r1 = r7.e
            if (r1 == 0) goto L47
            dcy r5 = defpackage.dcy.a
            goto L49
        L47:
            dcy r5 = defpackage.dcy.b
        L49:
            if (r1 != 0) goto L78
            r7.c = r8
            r7.a = r5
            r7.b = r4
            java.lang.Object r1 = r8.d()
            if (r1 != r0) goto L58
            goto Lb4
        L58:
            r4 = r8
            r8 = r1
            r1 = r5
        L5b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L75
            dco r8 = r7.f
            dcf r8 = r8.b()
            r7.c = r4
            r7.a = r1
            r7.b = r3
            java.lang.Object r8 = r8.a(r7)
            if (r8 == r0) goto Lb4
        L75:
            r5 = r1
            r1 = r4
            goto L79
        L78:
            r1 = r8
        L79:
            uiq r8 = r7.g
            dea r3 = new dea
            r4 = 0
            r6 = 0
            r3.<init>(r6, r8, r4)
            r7.c = r1
            r7.a = r6
            r7.b = r2
            dcy r5 = (defpackage.dcy) r5
            java.lang.Object r8 = r1.c(r5, r3, r7)
            if (r8 == r0) goto Lb4
        L90:
            boolean r2 = r7.e
            if (r2 != 0) goto Lb3
            r7.c = r8
            r2 = 4
            r7.b = r2
            java.lang.Object r1 = r1.d()
            if (r1 == r0) goto Lb4
            r0 = r8
            r8 = r1
        La1:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto Lb2
            dco r7 = r7.f
            dcf r7 = r7.b()
            r7.b()
        Lb2:
            return r0
        Lb3:
            return r8
        Lb4:
            return r0
        Lb5:
            r8.getClass()
            uiq r7 = r7.g
            ddo r8 = r8.a
            java.lang.Object r7 = r7.a(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deb.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        deb debVar = new deb(this.d, this.e, this.f, uhbVar, this.g);
        debVar.c = obj;
        return debVar;
    }
}
