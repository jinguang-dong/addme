package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajl extends uhs implements uiu {
    Object a;
    int b;
    final /* synthetic */ und c;
    final /* synthetic */ uiv d;
    final /* synthetic */ uiq e;
    final /* synthetic */ ail f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajl(und undVar, uiv uivVar, uiq uiqVar, ail ailVar, uhb uhbVar) {
        super(uhbVar);
        this.c = undVar;
        this.d = uivVar;
        this.e = uiqVar;
        this.f = ailVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajl) c((bqk) obj, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007e  */
    @Override // defpackage.uhn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r13) {
        /*
            r12 = this;
            uhi r0 = defpackage.uhi.a
            int r1 = r12.b
            r2 = 4
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1d
            if (r1 == r3) goto L13
            java.lang.Object r0 = r12.g
            uol r0 = (defpackage.uol) r0
            defpackage.rnt.aN(r13)
            goto L6d
        L13:
            java.lang.Object r1 = r12.a
            java.lang.Object r3 = r12.g
            bqk r3 = (defpackage.bqk) r3
            defpackage.rnt.aN(r13)
            goto L45
        L1d:
            defpackage.rnt.aN(r13)
            java.lang.Object r13 = r12.g
            bqk r13 = (defpackage.bqk) r13
            und r1 = r12.c
            uiv r5 = defpackage.ajq.a
            ail r5 = r12.f
            vf r6 = new vf
            r7 = 11
            r6.<init>(r5, r4, r7)
            uol r1 = defpackage.ukc.C(r1, r4, r2, r6, r3)
            r12.g = r13
            r12.a = r1
            r12.b = r3
            r3 = 3
            java.lang.Object r3 = defpackage.ajq.a(r13, r12, r3)
            if (r3 == r0) goto L9d
            r11 = r3
            r3 = r13
            r13 = r11
        L45:
            r8 = r13
            bpv r8 = (defpackage.bpv) r8
            r8.b()
            uiv r6 = r12.d
            uiv r13 = defpackage.ajq.a
            if (r6 == r13) goto L5f
            und r13 = r12.c
            ail r7 = r12.f
            agq r5 = new agq
            r9 = 0
            r10 = 2
            r5.<init>(r6, r7, r8, r9, r10)
            defpackage.ajq.f(r13, r1, r5)
        L5f:
            r12.g = r1
            r12.a = r4
            r13 = 2
            r12.b = r13
            java.lang.Object r13 = defpackage.ajq.b(r3, r12)
            if (r13 == r0) goto L9d
            r0 = r1
        L6d:
            bpv r13 = (defpackage.bpv) r13
            if (r13 != 0) goto L7e
            und r13 = r12.c
            ail r12 = r12.f
            vl r1 = new vl
            r1.<init>(r12, r4, r2)
            defpackage.ajq.f(r13, r0, r1)
            goto L9a
        L7e:
            r13.b()
            und r1 = r12.c
            ail r2 = r12.f
            vl r3 = new vl
            r5 = 5
            r3.<init>(r2, r4, r5, r4)
            defpackage.ajq.f(r1, r0, r3)
            uiq r12 = r12.e
            bkf r0 = new bkf
            long r1 = r13.c
            r0.<init>(r1)
            r12.a(r0)
        L9a:
            ufg r12 = defpackage.ufg.a
            return r12
        L9d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajl.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        ajl ajlVar = new ajl(this.c, this.d, this.e, this.f, uhbVar);
        ajlVar.g = obj;
        return ajlVar;
    }
}
