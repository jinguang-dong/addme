package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cww extends uht implements uiu {
    Object a;
    Object b;
    int c;
    final /* synthetic */ cwc d;
    final /* synthetic */ cwb e;
    final /* synthetic */ und f;
    final /* synthetic */ uiu g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cww(cwc cwcVar, cwb cwbVar, und undVar, uiu uiuVar, uhb uhbVar) {
        super(2, uhbVar);
        this.d = cwcVar;
        this.e = cwbVar;
        this.f = undVar;
        this.g = uiuVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cww) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[SYNTHETIC] */
    @Override // defpackage.uhn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            uhi r0 = defpackage.uhi.a
            int r1 = r11.c
            if (r1 == 0) goto L13
            java.lang.Object r1 = r11.b
            java.lang.Object r2 = r11.a
            defpackage.rnt.aN(r12)     // Catch: java.lang.Throwable -> Lf
            goto L7d
        Lf:
            r0 = move-exception
            r12 = r0
            goto L9a
        L13:
            defpackage.rnt.aN(r12)
            cwc r12 = r11.d
            cwb r1 = r12.a
            cwb r2 = defpackage.cwb.a
            if (r1 == r2) goto Lb3
            uka r5 = new uka
            r5.<init>()
            uka r1 = new uka
            r1.<init>()
            cwb r2 = r11.e     // Catch: java.lang.Throwable -> L97
            und r6 = r11.f     // Catch: java.lang.Throwable -> L97
            uiu r10 = r11.g     // Catch: java.lang.Throwable -> L97
            r11.a = r5     // Catch: java.lang.Throwable -> L97
            r11.b = r1     // Catch: java.lang.Throwable -> L97
            r3 = 1
            r11.c = r3     // Catch: java.lang.Throwable -> L97
            uml r8 = new uml     // Catch: java.lang.Throwable -> L97
            uhb r4 = defpackage.ske.aE(r11)     // Catch: java.lang.Throwable -> L97
            r8.<init>(r4, r3)     // Catch: java.lang.Throwable -> L97
            r8.x()     // Catch: java.lang.Throwable -> L97
            cvz r3 = defpackage.cwa.Companion     // Catch: java.lang.Throwable -> L97
            int r3 = r2.ordinal()     // Catch: java.lang.Throwable -> L97
            r4 = 2
            if (r3 == r4) goto L59
            r4 = 3
            if (r3 == r4) goto L56
            r4 = 4
            if (r3 == r4) goto L53
            r3 = 0
        L51:
            r4 = r3
            goto L5c
        L53:
            cwa r3 = defpackage.cwa.ON_RESUME     // Catch: java.lang.Throwable -> L97
            goto L51
        L56:
            cwa r3 = defpackage.cwa.ON_START     // Catch: java.lang.Throwable -> L97
            goto L51
        L59:
            cwa r3 = defpackage.cwa.ON_CREATE     // Catch: java.lang.Throwable -> L97
            goto L51
        L5c:
            cwa r7 = defpackage.cvz.a(r2)     // Catch: java.lang.Throwable -> L97
            uxa r9 = new uxa     // Catch: java.lang.Throwable -> L97
            r9.<init>()     // Catch: java.lang.Throwable -> L97
            cwv r3 = new cwv     // Catch: java.lang.Throwable -> L97
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L97
            r1.a = r3     // Catch: java.lang.Throwable -> L97
            java.lang.Object r2 = r1.a     // Catch: java.lang.Throwable -> L97
            r2.getClass()     // Catch: java.lang.Throwable -> L97
            cwf r2 = (defpackage.cwf) r2     // Catch: java.lang.Throwable -> L97
            r12.a(r2)     // Catch: java.lang.Throwable -> L97
            java.lang.Object r12 = r8.i()     // Catch: java.lang.Throwable -> L97
            if (r12 == r0) goto L96
            r2 = r5
        L7d:
            uka r2 = (defpackage.uka) r2
            java.lang.Object r12 = r2.a
            uol r12 = (defpackage.uol) r12
            if (r12 == 0) goto L88
            defpackage.ujp.Z(r12)
        L88:
            uka r1 = (defpackage.uka) r1
            java.lang.Object r12 = r1.a
            cwf r12 = (defpackage.cwf) r12
            if (r12 == 0) goto Lb3
            cwc r11 = r11.d
            r11.c(r12)
            goto Lb3
        L96:
            return r0
        L97:
            r0 = move-exception
            r12 = r0
            r2 = r5
        L9a:
            uka r2 = (defpackage.uka) r2
            java.lang.Object r0 = r2.a
            uol r0 = (defpackage.uol) r0
            if (r0 == 0) goto La5
            defpackage.ujp.Z(r0)
        La5:
            uka r1 = (defpackage.uka) r1
            java.lang.Object r0 = r1.a
            cwf r0 = (defpackage.cwf) r0
            if (r0 == 0) goto Lb2
            cwc r11 = r11.d
            r11.c(r0)
        Lb2:
            throw r12
        Lb3:
            ufg r11 = defpackage.ufg.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cww.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        return new cww(this.d, this.e, this.f, this.g, uhbVar);
    }
}
