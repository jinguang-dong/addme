package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ozx extends uhs implements uiu {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ ozy e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ozx(ozy ozyVar, uhb uhbVar) {
        super(uhbVar);
        this.e = ozyVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ozx) c((ulk) obj, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ca  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0083 -> B:23:0x009d). Please report as a decompilation issue!!! */
    @Override // defpackage.uhn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            uhi r0 = defpackage.uhi.a
            int r1 = r6.d
            r2 = 1
            if (r1 == 0) goto L26
            if (r1 == r2) goto L1a
            java.lang.Object r1 = r6.c
            java.lang.Object r2 = r6.b
            java.lang.Object r3 = r6.a
            java.util.Set r3 = (java.util.Set) r3
            java.lang.Object r4 = r6.f
            ulk r4 = (defpackage.ulk) r4
            defpackage.rnt.aN(r7)
            goto L9d
        L1a:
            java.lang.Object r1 = r6.a
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = r6.f
            ulk r2 = (defpackage.ulk) r2
            defpackage.rnt.aN(r7)
            goto L51
        L26:
            defpackage.rnt.aN(r7)
            java.lang.Object r7 = r6.f
            ulk r7 = (defpackage.ulk) r7
            ozy r1 = r6.e
            java.util.List r1 = r1.f()
            r6.f = r7
            r6.a = r1
            r6.d = r2
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L42
            ufg r2 = defpackage.ufg.a
            goto L4e
        L42:
            java.util.Iterator r2 = r1.iterator()
            java.lang.Object r2 = r7.b(r2, r6)
            if (r2 == r0) goto L4e
            ufg r2 = defpackage.ufg.a
        L4e:
            if (r2 == r0) goto Lcd
            r2 = r7
        L51:
            java.util.ArrayList r7 = new java.util.ArrayList
            r3 = 10
            int r3 = defpackage.ske.bq(r1, r3)
            r7.<init>(r3)
            java.util.Iterator r3 = r1.iterator()
        L60:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L72
            java.lang.Object r4 = r3.next()
            pjr r4 = (defpackage.pjr) r4
            java.lang.String r4 = r4.a
            r7.add(r4)
            goto L60
        L72:
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>(r7)
            java.util.Iterator r7 = r1.iterator()
            r4 = r2
            r2 = r7
        L7d:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto Lca
            java.lang.Object r7 = r2.next()
            pjr r7 = (defpackage.pjr) r7
            ozy r1 = r6.e
            java.lang.String r7 = defpackage.ojl.bP(r7)
            ocq r1 = r1.a
            sm r7 = r1.aL(r7)
            java.util.Set r7 = r7.j()
            java.util.Iterator r1 = r7.iterator()
        L9d:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L7d
            java.lang.Object r7 = r1.next()
            pp r7 = (defpackage.pp) r7
            java.lang.String r7 = r7.a
            boolean r5 = r3.contains(r7)
            if (r5 != 0) goto L9d
            r3.add(r7)
            pjr r7 = defpackage.pjr.b(r7)
            r6.f = r4
            r6.a = r3
            r6.b = r2
            r6.c = r1
            r5 = 2
            r6.d = r5
            java.lang.Object r7 = r4.a(r7, r6)
            if (r7 != r0) goto L9d
            goto Lcd
        Lca:
            ufg r6 = defpackage.ufg.a
            return r6
        Lcd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ozx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        ozx ozxVar = new ozx(this.e, uhbVar);
        ozxVar.f = obj;
        return ozxVar;
    }
}
