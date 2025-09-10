package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class usm extends uht implements uiu {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public usm(Object obj, abr abrVar, bbo bboVar, bbo bboVar2, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.f = i;
        this.c = obj;
        this.b = abrVar;
        this.d = bboVar;
        this.e = bboVar2;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.f != 0) {
            return ((usm) c((und) obj, (uhb) obj2)).b(ufg.a);
        }
        return ((usm) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
    
        if (r10.gc(r0, r9) == r9) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a1, code lost:
    
        if (r10.gc(r0, r9) != r9) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c2, code lost:
    
        if (defpackage.ukc.J(r10, r4, r9) == r9) goto L38;
     */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, usr] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, url] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, url] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, utd] */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object, urk] */
    /* JADX WARN: Type inference failed for: r10v15, types: [bbo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, usr] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object, urk] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, urk] */
    /* JADX WARN: Type inference failed for: r9v5, types: [bbo, java.lang.Object] */
    @Override // defpackage.uhn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.f
            r1 = 1
            if (r0 == 0) goto L53
            uhi r0 = defpackage.uhi.a
            int r2 = r9.a
            defpackage.rnt.aN(r10)
            if (r2 == 0) goto L10
            r7 = r9
            goto L39
        L10:
            java.lang.Object r4 = r9.c
            java.lang.Object r10 = r9.b
            r3 = r10
            abr r3 = (defpackage.abr) r3
            java.lang.Object r10 = r3.c()
            boolean r10 = defpackage.a.ao(r4, r10)
            if (r10 != 0) goto L50
            java.lang.Object r10 = r9.d
            acy r2 = defpackage.abu.a
            java.lang.Object r10 = r10.a()
            r5 = r10
            aby r5 = (defpackage.aby) r5
            r9.a = r1
            r6 = 0
            r8 = 12
            r7 = r9
            java.lang.Object r9 = defpackage.abr.k(r3, r4, r5, r6, r7, r8)
            if (r9 != r0) goto L39
            return r0
        L39:
            java.lang.Object r9 = r7.e
            acy r10 = defpackage.abu.a
            java.lang.Object r9 = r9.a()
            uiq r9 = (defpackage.uiq) r9
            if (r9 == 0) goto L50
            java.lang.Object r10 = r7.b
            abr r10 = (defpackage.abr) r10
            java.lang.Object r10 = r10.d()
            r9.a(r10)
        L50:
            ufg r9 = defpackage.ufg.a
            return r9
        L53:
            r7 = r9
            uhi r9 = defpackage.uhi.a
            int r0 = r7.a
            r2 = 3
            r3 = 2
            if (r0 == 0) goto L69
            if (r0 == r1) goto L65
            if (r0 == r3) goto L61
            goto L65
        L61:
            defpackage.rnt.aN(r10)
            goto L97
        L65:
            defpackage.rnt.aN(r10)
            goto Lc5
        L69:
            defpackage.rnt.aN(r10)
            java.lang.Object r10 = r7.c
            utd r0 = defpackage.utc.a
            if (r10 != r0) goto L7f
            java.lang.Object r10 = r7.d
            java.lang.Object r0 = r7.e
            r7.a = r1
            java.lang.Object r10 = r10.gc(r0, r7)
            if (r10 != r9) goto Lc5
            goto Lc4
        L7f:
            utd r0 = defpackage.utc.b
            r1 = 0
            if (r10 != r0) goto La4
            java.lang.Object r10 = r7.e
            utj r10 = r10.b()
            usk r0 = new usk
            r0.<init>(r1)
            r7.a = r3
            java.lang.Object r10 = defpackage.ung.E(r10, r0, r7)
            if (r10 == r9) goto Lc4
        L97:
            java.lang.Object r10 = r7.d
            java.lang.Object r0 = r7.e
            r7.a = r2
            java.lang.Object r10 = r10.gc(r0, r7)
            if (r10 != r9) goto Lc5
            goto Lc4
        La4:
            java.lang.Object r0 = r7.e
            utj r2 = r0.b()
            urk r10 = r10.a(r2)
            urk r10 = defpackage.urn.a(r10)
            java.lang.Object r2 = r7.d
            java.lang.Object r3 = r7.b
            usl r4 = new usl
            r4.<init>(r2, r0, r3, r1)
            r0 = 4
            r7.a = r0
            java.lang.Object r10 = defpackage.ukc.J(r10, r4, r7)
            if (r10 != r9) goto Lc5
        Lc4:
            return r9
        Lc5:
            ufg r9 = defpackage.ufg.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.usm.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, utd] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, urk] */
    /* JADX WARN: Type inference failed for: r3v1, types: [bbo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, usr] */
    /* JADX WARN: Type inference failed for: r4v1, types: [bbo, java.lang.Object] */
    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        if (this.f == 0) {
            return new usm((utd) this.c, (urk) this.d, (usr) this.e, this.b, uhbVar, 0);
        }
        return new usm(this.c, (abr) this.b, (bbo) this.d, (bbo) this.e, uhbVar, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public usm(utd utdVar, urk urkVar, usr usrVar, Object obj, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.f = i;
        this.c = utdVar;
        this.d = urkVar;
        this.e = usrVar;
        this.b = obj;
    }
}
