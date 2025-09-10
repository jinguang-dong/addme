package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avk extends uht implements uiu {
    int a;
    final /* synthetic */ abr b;
    final /* synthetic */ float c;
    final /* synthetic */ boolean d;
    final /* synthetic */ avl e;
    final /* synthetic */ akb f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avk(abr abrVar, float f, boolean z, avl avlVar, akb akbVar, uhb uhbVar) {
        super(2, uhbVar);
        this.b = abrVar;
        this.c = f;
        this.d = z;
        this.e = avlVar;
        this.f = akbVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avk) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r3.e(r10, r9) == r0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00bf, code lost:
    
        if (r9 == r0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c1, code lost:
    
        return r0;
     */
    @Override // defpackage.uhn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            uhi r0 = defpackage.uhi.a
            int r1 = r9.a
            r2 = 1
            defpackage.rnt.aN(r10)
            if (r1 == 0) goto Lc
            goto Lc2
        Lc:
            abr r3 = r9.b
            java.lang.Object r10 = r3.c()
            cht r10 = (defpackage.cht) r10
            float r10 = r10.a
            float r1 = r9.c
            boolean r10 = defpackage.cht.b(r10, r1)
            if (r10 != 0) goto Lc2
            boolean r10 = r9.d
            if (r10 != 0) goto L31
            cht r10 = new cht
            r10.<init>(r1)
            r9.a = r2
            java.lang.Object r9 = r3.e(r10, r9)
            if (r9 != r0) goto Lc2
            goto Lc1
        L31:
            java.lang.Object r10 = r3.c()
            cht r10 = (defpackage.cht) r10
            float r10 = r10.a
            r2 = 0
            boolean r4 = defpackage.cht.b(r10, r2)
            r5 = 0
            if (r4 == 0) goto L49
            akd r10 = new akd
            r6 = 0
            r10.<init>(r6)
            goto L64
        L49:
            r4 = 1065353216(0x3f800000, float:1.0)
            boolean r4 = defpackage.cht.b(r10, r4)
            if (r4 == 0) goto L57
            ajz r10 = new ajz
            r10.<init>()
            goto L64
        L57:
            boolean r10 = defpackage.cht.b(r10, r2)
            if (r10 == 0) goto L63
            ajx r10 = new ajx
            r10.<init>()
            goto L64
        L63:
            r10 = r5
        L64:
            akb r2 = r9.f
            r4 = 2
            r9.a = r4
            adt r4 = defpackage.axd.a
            if (r2 == 0) goto L85
            boolean r10 = r2 instanceof defpackage.akd
            if (r10 == 0) goto L74
            adt r5 = defpackage.axd.a
            goto L9f
        L74:
            boolean r10 = r2 instanceof defpackage.aju
            if (r10 == 0) goto L7b
        L78:
            adt r5 = defpackage.axd.a
            goto L9f
        L7b:
            boolean r10 = r2 instanceof defpackage.ajz
            if (r10 == 0) goto L80
            goto L78
        L80:
            boolean r10 = r2 instanceof defpackage.ajx
            if (r10 == 0) goto L9f
            goto L78
        L85:
            if (r10 == 0) goto L9f
            boolean r2 = r10 instanceof defpackage.akd
            if (r2 == 0) goto L8e
        L8b:
            adt r5 = defpackage.axd.b
            goto L9f
        L8e:
            boolean r2 = r10 instanceof defpackage.aju
            if (r2 == 0) goto L93
            goto L8b
        L93:
            boolean r2 = r10 instanceof defpackage.ajz
            if (r2 == 0) goto L9a
            adt r5 = defpackage.axd.c
            goto L9f
        L9a:
            boolean r10 = r10 instanceof defpackage.ajx
            if (r10 == 0) goto L9f
            goto L8b
        L9f:
            if (r5 == 0) goto Lb1
            cht r4 = new cht
            r4.<init>(r1)
            r6 = 0
            r8 = 12
            r7 = r9
            java.lang.Object r9 = defpackage.abr.k(r3, r4, r5, r6, r7, r8)
            if (r9 == r0) goto Lbf
            goto Lbd
        Lb1:
            r7 = r9
            cht r9 = new cht
            r9.<init>(r1)
            java.lang.Object r9 = r3.e(r9, r7)
            if (r9 == r0) goto Lbf
        Lbd:
            ufg r9 = defpackage.ufg.a
        Lbf:
            if (r9 != r0) goto Lc2
        Lc1:
            return r0
        Lc2:
            ufg r9 = defpackage.ufg.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avk.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        return new avk(this.b, this.c, this.d, this.e, this.f, uhbVar);
    }
}
