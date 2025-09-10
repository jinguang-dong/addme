package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class crt extends uht implements uiu {
    Object a;
    int b;
    final /* synthetic */ ujy c;
    final /* synthetic */ cru d;
    final /* synthetic */ Object e;
    final /* synthetic */ boolean f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crt(ujy ujyVar, cru cruVar, Object obj, boolean z, uhb uhbVar) {
        super(2, uhbVar);
        this.c = ujyVar;
        this.d = cruVar;
        this.e = obj;
        this.f = z;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crt) c((crx) obj, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0067, code lost:
    
        if (r5 == r0) goto L24;
     */
    @Override // defpackage.uhn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r5) throws java.io.IOException {
        /*
            r4 = this;
            uhi r0 = defpackage.uhi.a
            int r1 = r4.b
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 == r2) goto Ld
            defpackage.rnt.aN(r5)
            goto L6a
        Ld:
            java.lang.Object r1 = r4.a
            java.lang.Object r2 = r4.g
            crx r2 = (defpackage.crx) r2
            defpackage.rnt.aN(r5)
            goto L41
        L17:
            defpackage.rnt.aN(r5)
            java.lang.Object r5 = r4.g
            crx r5 = (defpackage.crx) r5
            ujy r1 = r4.c
            cru r3 = r4.d
            tdy r3 = r3.k()
            r4.g = r5
            r4.a = r1
            r4.b = r2
            java.lang.Object r2 = r3.a
            pfl r2 = (defpackage.pfl) r2
            java.lang.Object r2 = r2.a
            java.util.concurrent.atomic.AtomicInteger r2 = (java.util.concurrent.atomic.AtomicInteger) r2
            int r2 = r2.incrementAndGet()
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r2)
            if (r3 == r0) goto L8b
            r2 = r5
            r5 = r3
        L41:
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            ujy r1 = (defpackage.ujy) r1
            r1.a = r5
            java.lang.Object r5 = r4.e
            r1 = 0
            r4.g = r1
            r4.a = r1
            r3 = 2
            r4.b = r3
            r2.b()
            csd r3 = new csd
            r3.<init>(r2, r5, r1)
            java.io.File r5 = r2.a
            java.lang.Object r5 = defpackage.coi.r(r5, r3, r4)
            if (r5 == r0) goto L67
            ufg r5 = defpackage.ufg.a
        L67:
            if (r5 != r0) goto L6a
            goto L8b
        L6a:
            boolean r5 = r4.f
            if (r5 == 0) goto L88
            cru r5 = r4.d
            java.lang.Object r0 = r4.e
            cqu r1 = new cqu
            if (r0 == 0) goto L7b
            int r2 = r0.hashCode()
            goto L7c
        L7b:
            r2 = 0
        L7c:
            pfl r5 = r5.g
            ujy r4 = r4.c
            int r4 = r4.a
            r1.<init>(r0, r2, r4)
            r5.r(r1)
        L88:
            ufg r4 = defpackage.ufg.a
            return r4
        L8b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crt.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        crt crtVar = new crt(this.c, this.d, this.e, this.f, uhbVar);
        crtVar.g = obj;
        return crtVar;
    }
}
