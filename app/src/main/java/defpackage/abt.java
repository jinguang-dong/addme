package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abt extends uht implements uiu {
    Object a;
    int b;
    final /* synthetic */ uqm c;
    final /* synthetic */ abr d;
    final /* synthetic */ bbo e;
    final /* synthetic */ bbo f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abt(uqm uqmVar, abr abrVar, bbo bboVar, bbo bboVar2, uhb uhbVar) {
        super(2, uhbVar);
        this.c = uqmVar;
        this.d = abrVar;
        this.e = bboVar;
        this.f = bboVar2;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abt) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x002c -> B:9:0x002f). Please report as a decompilation issue!!! */
    @Override // defpackage.uhn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r12) {
        /*
            r11 = this;
            uhi r0 = defpackage.uhi.a
            int r1 = r11.b
            if (r1 == 0) goto L10
            java.lang.Object r1 = r11.a
            java.lang.Object r2 = r11.g
            und r2 = (defpackage.und) r2
            defpackage.rnt.aN(r12)
            goto L2f
        L10:
            defpackage.rnt.aN(r12)
            java.lang.Object r12 = r11.g
            und r12 = (defpackage.und) r12
            uqm r1 = r11.c
            uqa r1 = r1.A()
            r2 = r12
        L1e:
            r11.g = r2
            r11.a = r1
            r12 = 1
            r11.b = r12
            r12 = r1
            uqa r12 = (defpackage.uqa) r12
            java.lang.Object r12 = r12.a(r11)
            if (r12 != r0) goto L2f
            return r0
        L2f:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L61
            r12 = r1
            uqa r12 = (defpackage.uqa) r12
            java.lang.Object r12 = r12.b()
            uqm r3 = r11.c
            java.lang.Object r3 = r3.i()
            java.lang.Object r3 = defpackage.uqq.a(r3)
            if (r3 == 0) goto L4c
            r5 = r3
            goto L4d
        L4c:
            r5 = r12
        L4d:
            abr r6 = r11.d
            bbo r7 = r11.e
            bbo r8 = r11.f
            usm r4 = new usm
            r9 = 0
            r10 = 1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r12 = 3
            r3 = 0
            r5 = 0
            defpackage.ukc.C(r2, r3, r5, r4, r12)
            goto L1e
        L61:
            ufg r11 = defpackage.ufg.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abt.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        abt abtVar = new abt(this.c, this.d, this.e, this.f, uhbVar);
        abtVar.g = obj;
        return abtVar;
    }
}
