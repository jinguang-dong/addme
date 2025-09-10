package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dqz extends uht implements uiu {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ujw c;
    final /* synthetic */ ujw d;
    final /* synthetic */ abr e;
    final /* synthetic */ abr f;
    final /* synthetic */ und g;
    final /* synthetic */ bbo h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqz(ujw ujwVar, ujw ujwVar2, abr abrVar, abr abrVar2, und undVar, bbo bboVar, uhb uhbVar) {
        super(2, uhbVar);
        this.c = ujwVar;
        this.d = ujwVar2;
        this.e = abrVar;
        this.f = abrVar2;
        this.g = undVar;
        this.h = bboVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqz) c((dox) obj, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
    
        if (r13.e(r2, r12) == r0) goto L31;
     */
    @Override // defpackage.uhn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r13) {
        /*
            r12 = this;
            uhi r0 = defpackage.uhi.a
            int r1 = r12.a
            r2 = 1
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L18
            if (r1 == r2) goto L10
            defpackage.rnt.aN(r13)
            goto L90
        L10:
            java.lang.Object r1 = r12.b
            dox r1 = (defpackage.dox) r1
            defpackage.rnt.aN(r13)
            goto L7b
        L18:
            defpackage.rnt.aN(r13)
            java.lang.Object r13 = r12.b
            r7 = r13
            dox r7 = (defpackage.dox) r7
            ujw r13 = r12.c
            boolean r1 = r13.a
            if (r1 == 0) goto L39
            float r1 = r7.b
            r5 = 0
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 != 0) goto L39
            float r1 = r7.a
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 == 0) goto L34
            goto L39
        L34:
            r13.a = r4
            ufg r12 = defpackage.ufg.a
            return r12
        L39:
            ujw r13 = r12.d
            boolean r13 = r13.a
            if (r13 != 0) goto L67
            bbo r8 = r12.h
            aby r13 = defpackage.drc.b(r8)
            boolean r13 = r13 instanceof defpackage.acw
            if (r13 == 0) goto L4a
            goto L67
        L4a:
            und r13 = r12.g
            abr r6 = r12.e
            agq r5 = new agq
            r9 = 0
            r10 = 7
            r5.<init>(r6, r7, r8, r9, r10)
            r0 = 3
            defpackage.ukc.C(r13, r3, r4, r5, r0)
            abr r6 = r12.f
            agq r5 = new agq
            r10 = 8
            r11 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            defpackage.ukc.C(r13, r3, r4, r5, r0)
            goto L94
        L67:
            abr r13 = r12.e
            float r1 = r7.b
            java.lang.Float r5 = new java.lang.Float
            r5.<init>(r1)
            r12.b = r7
            r12.a = r2
            java.lang.Object r13 = r13.e(r5, r12)
            if (r13 == r0) goto L97
            r1 = r7
        L7b:
            abr r13 = r12.f
            java.lang.Float r2 = new java.lang.Float
            float r1 = r1.a
            r2.<init>(r1)
            r12.b = r3
            r1 = 2
            r12.a = r1
            java.lang.Object r13 = r13.e(r2, r12)
            if (r13 != r0) goto L90
            goto L97
        L90:
            ujw r12 = r12.d
            r12.a = r4
        L94:
            ufg r12 = defpackage.ufg.a
            return r12
        L97:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqz.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        dqz dqzVar = new dqz(this.c, this.d, this.e, this.f, this.g, this.h, uhbVar);
        dqzVar.b = obj;
        return dqzVar;
    }
}
