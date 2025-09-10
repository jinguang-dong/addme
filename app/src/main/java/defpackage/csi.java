package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class csi extends uht implements uiu {
    Object a;
    int b;
    final /* synthetic */ gno c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csi(gno gnoVar, uhb uhbVar) {
        super(2, uhbVar);
        this.c = gnoVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csi) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0045, code lost:
    
        if (r1.a(r5, r4) == r0) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003b A[PHI: r1 r5
      0x003b: PHI (r1v1 uiu) = (r1v6 uiu), (r1v7 uiu) binds: [B:10:0x0039, B:6:0x000d] A[DONT_GENERATE, DONT_INLINE]
      0x003b: PHI (r5v6 java.lang.Object) = (r5v10 java.lang.Object), (r5v0 java.lang.Object) binds: [B:10:0x0039, B:6:0x000d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, und] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, uqm] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0045 -> B:13:0x0047). Please report as a decompilation issue!!! */
    @Override // defpackage.uhn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            uhi r0 = defpackage.uhi.a
            int r1 = r4.b
            r2 = 1
            if (r1 == 0) goto L13
            if (r1 == r2) goto Ld
            defpackage.rnt.aN(r5)
            goto L47
        Ld:
            java.lang.Object r1 = r4.a
            defpackage.rnt.aN(r5)
            goto L3b
        L13:
            defpackage.rnt.aN(r5)
            gno r5 = r4.c
            java.lang.Object r5 = r5.d
            pfl r5 = (defpackage.pfl) r5
            int r5 = r5.s()
            if (r5 <= 0) goto L5c
        L22:
            gno r5 = r4.c
            java.lang.Object r1 = r5.a
            uhf r1 = r1.c()
            defpackage.ujp.T(r1)
            java.lang.Object r1 = r5.c
            r4.a = r1
            r4.b = r2
            java.lang.Object r5 = r5.b
            java.lang.Object r5 = r5.d(r4)
            if (r5 == r0) goto L5b
        L3b:
            r3 = 0
            r4.a = r3
            r3 = 2
            r4.b = r3
            java.lang.Object r5 = r1.a(r5, r4)
            if (r5 == r0) goto L5b
        L47:
            gno r5 = r4.c
            java.lang.Object r5 = r5.d
            pfl r5 = (defpackage.pfl) r5
            java.lang.Object r5 = r5.a
            java.util.concurrent.atomic.AtomicInteger r5 = (java.util.concurrent.atomic.AtomicInteger) r5
            int r5 = r5.decrementAndGet()
            if (r5 == 0) goto L58
            goto L22
        L58:
            ufg r4 = defpackage.ufg.a
            return r4
        L5b:
            return r0
        L5c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Check failed."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csi.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        return new csi(this.c, uhbVar);
    }
}
