package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aem extends uht implements uiu {
    boolean a;
    int b;
    final /* synthetic */ long c;
    final /* synthetic */ aen d;
    final /* synthetic */ ail e;
    final /* synthetic */ ocq f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aem(ail ailVar, long j, ocq ocqVar, aen aenVar, uhb uhbVar) {
        super(2, uhbVar);
        this.e = ailVar;
        this.c = j;
        this.f = ocqVar;
        this.d = aenVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aem) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0094, code lost:
    
        if (r14.aE(r1, r13) != r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b5, code lost:
    
        if (r2.aE(r14, r13) == r0) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    @Override // defpackage.uhn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r14) {
        /*
            r13 = this;
            uhi r0 = defpackage.uhi.a
            int r1 = r13.b
            r2 = 4
            r3 = 2
            r4 = 1
            r5 = 3
            r6 = 0
            if (r1 == 0) goto L2c
            if (r1 == r4) goto L24
            if (r1 == r3) goto L1e
            if (r1 == r5) goto L16
            defpackage.rnt.aN(r14)
            goto Lb8
        L16:
            java.lang.Object r1 = r13.g
            ake r1 = (defpackage.ake) r1
            defpackage.rnt.aN(r14)
            goto L8a
        L1e:
            boolean r1 = r13.a
            defpackage.rnt.aN(r14)
            goto L70
        L24:
            java.lang.Object r1 = r13.g
            uol r1 = (defpackage.uol) r1
            defpackage.rnt.aN(r14)
            goto L50
        L2c:
            defpackage.rnt.aN(r14)
            java.lang.Object r14 = r13.g
            und r14 = (defpackage.und) r14
            aen r8 = r13.d
            long r9 = r13.c
            ocq r11 = r13.f
            ael r7 = new ael
            r12 = 0
            r7.<init>(r8, r9, r11, r12)
            r1 = 0
            uol r1 = defpackage.ukc.C(r14, r6, r1, r7, r5)
            ail r14 = r13.e
            r13.g = r1
            r13.b = r4
            java.lang.Object r14 = r14.m(r13)
            if (r14 == r0) goto Lbf
        L50:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            boolean r4 = r1.t()
            if (r4 == 0) goto L97
            r13.g = r6
            r13.a = r14
            r13.b = r3
            defpackage.ujp.Z(r1)
            java.lang.Object r1 = r1.m(r13)
            if (r1 == r0) goto L6d
            ufg r1 = defpackage.ufg.a
        L6d:
            if (r1 == r0) goto Lbf
            r1 = r14
        L70:
            if (r1 == 0) goto Lb8
            long r3 = r13.c
            akd r14 = new akd
            r14.<init>(r3)
            ake r1 = new ake
            r1.<init>(r14)
            ocq r3 = r13.f
            r13.g = r1
            r13.b = r5
            java.lang.Object r14 = r3.aE(r14, r13)
            if (r14 == r0) goto Lbf
        L8a:
            ocq r14 = r13.f
            r13.g = r6
            r13.b = r2
            java.lang.Object r14 = r14.aE(r1, r13)
            if (r14 != r0) goto Lb8
            goto Lbf
        L97:
            aen r1 = r13.d
            akd r1 = r1.d
            if (r1 == 0) goto Lb8
            ocq r2 = r13.f
            if (r14 == 0) goto La7
            ake r14 = new ake
            r14.<init>(r1)
            goto Lac
        La7:
            akc r14 = new akc
            r14.<init>(r1)
        Lac:
            r13.g = r6
            r1 = 5
            r13.b = r1
            java.lang.Object r14 = r2.aE(r14, r13)
            if (r14 != r0) goto Lb8
            goto Lbf
        Lb8:
            aen r13 = r13.d
            r13.d = r6
            ufg r13 = defpackage.ufg.a
            return r13
        Lbf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aem.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        aem aemVar = new aem(this.e, this.c, this.f, this.d, uhbVar);
        aemVar.g = obj;
        return aemVar;
    }
}
