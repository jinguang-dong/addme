package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awx extends uht implements uiu {
    Object a;
    int b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awx(uka ukaVar, ahn ahnVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.f = i;
        this.c = ukaVar;
        this.d = ahnVar;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.f != 0) {
            return ((awx) c((uiq) obj, (uhb) obj2)).b(ufg.a);
        }
        return ((awx) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ba  */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, uqm] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, uqm] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x004c -> B:22:0x004e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0052 -> B:25:0x0053). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0086 -> B:35:0x0089). Please report as a decompilation issue!!! */
    @Override // defpackage.uhn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.f
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L5b
            uhi r0 = defpackage.uhi.a
            int r3 = r8.b
            if (r3 == 0) goto L16
            java.lang.Object r3 = r8.a
            java.lang.Object r4 = r8.e
            uiq r4 = (defpackage.uiq) r4
            defpackage.rnt.aN(r9)
            goto L4e
        L16:
            defpackage.rnt.aN(r9)
            java.lang.Object r9 = r8.e
            uiq r9 = (defpackage.uiq) r9
            r4 = r9
        L1e:
            java.lang.Object r3 = r8.c
            r9 = r3
            uka r9 = (defpackage.uka) r9
            java.lang.Object r9 = r9.a
            boolean r5 = r9 instanceof defpackage.agw
            if (r5 != 0) goto L58
            boolean r5 = r9 instanceof defpackage.agt
            if (r5 != 0) goto L58
            boolean r5 = r9 instanceof defpackage.agu
            if (r5 == 0) goto L34
            agu r9 = (defpackage.agu) r9
            goto L35
        L34:
            r9 = r2
        L35:
            if (r9 == 0) goto L3a
            r4.a(r9)
        L3a:
            java.lang.Object r9 = r8.d
            ahn r9 = (defpackage.ahn) r9
            uqm r9 = r9.d
            if (r9 == 0) goto L52
            r8.e = r4
            r8.a = r3
            r8.b = r1
            java.lang.Object r9 = r9.d(r8)
            if (r9 == r0) goto L51
        L4e:
            a r9 = (defpackage.a) r9
            goto L53
        L51:
            return r0
        L52:
            r9 = r2
        L53:
            uka r3 = (defpackage.uka) r3
            r3.a = r9
            goto L1e
        L58:
            ufg r8 = defpackage.ufg.a
            return r8
        L5b:
            uhi r0 = defpackage.uhi.a
            int r3 = r8.b
            if (r3 == 0) goto L6b
            java.lang.Object r3 = r8.a
            java.lang.Object r4 = r8.e
            und r4 = (defpackage.und) r4
            defpackage.rnt.aN(r9)
            goto L89
        L6b:
            defpackage.rnt.aN(r9)
            java.lang.Object r9 = r8.e
            und r9 = (defpackage.und) r9
            java.lang.Object r3 = r8.c
            uqa r3 = r3.A()
            r4 = r9
        L79:
            r8.e = r4
            r8.a = r3
            r8.b = r1
            r9 = r3
            uqa r9 = (defpackage.uqa) r9
            java.lang.Object r9 = r9.a(r8)
            if (r9 != r0) goto L89
            return r0
        L89:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lba
            r9 = r3
            uqa r9 = (defpackage.uqa) r9
            java.lang.Object r9 = r9.b()
            apz r9 = (defpackage.apz) r9
            java.lang.Object r5 = r8.c
            java.lang.Object r5 = r5.i()
            java.lang.Object r5 = defpackage.uqq.a(r5)
            apz r5 = (defpackage.apz) r5
            if (r5 == 0) goto La9
            r9 = r5
        La9:
            java.lang.Object r5 = r8.d
            aej r6 = new aej
            awz r5 = (defpackage.awz) r5
            r7 = 15
            r6.<init>(r5, r9, r2, r7)
            r9 = 3
            r5 = 0
            defpackage.ukc.C(r4, r2, r5, r6, r9)
            goto L79
        Lba:
            ufg r8 = defpackage.ufg.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awx.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, uqm] */
    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        if (this.f == 0) {
            awx awxVar = new awx((uqm) this.c, (awz) this.d, uhbVar, 0);
            awxVar.e = obj;
            return awxVar;
        }
        awx awxVar2 = new awx((uka) this.c, (ahn) this.d, uhbVar, 1);
        awxVar2.e = obj;
        return awxVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awx(uqm uqmVar, awz awzVar, uhb uhbVar, int i) {
        super(2, uhbVar);
        this.f = i;
        this.c = uqmVar;
        this.d = awzVar;
    }
}
