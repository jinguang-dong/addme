package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajo extends uht implements uiu {
    int a;
    final /* synthetic */ uol b;
    final /* synthetic */ uiu c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajo(uol uolVar, uiu uiuVar, uhb uhbVar) {
        super(2, uhbVar);
        this.b = uolVar;
        this.c = uiuVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajo) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if (r4.a(r1, r3) == r0) goto L14;
     */
    @Override // defpackage.uhn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r4) {
        /*
            r3 = this;
            uhi r0 = defpackage.uhi.a
            int r1 = r3.a
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            defpackage.rnt.aN(r4)
            goto L38
        Ld:
            java.lang.Object r1 = r3.d
            und r1 = (defpackage.und) r1
            defpackage.rnt.aN(r4)
            goto L29
        L15:
            defpackage.rnt.aN(r4)
            java.lang.Object r4 = r3.d
            r1 = r4
            und r1 = (defpackage.und) r1
            uol r4 = r3.b
            r3.d = r1
            r3.a = r2
            java.lang.Object r4 = r4.m(r3)
            if (r4 == r0) goto L3b
        L29:
            uiu r4 = r3.c
            r2 = 0
            r3.d = r2
            r2 = 2
            r3.a = r2
            java.lang.Object r3 = r4.a(r1, r3)
            if (r3 != r0) goto L38
            goto L3b
        L38:
            ufg r3 = defpackage.ufg.a
            return r3
        L3b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajo.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        ajo ajoVar = new ajo(this.b, this.c, uhbVar);
        ajoVar.d = obj;
        return ajoVar;
    }
}
