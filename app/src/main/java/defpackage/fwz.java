package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fwz extends uht implements uiu {
    int a;
    final /* synthetic */ fxa b;
    final /* synthetic */ boolean c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fwz(fxa fxaVar, boolean z, uhb uhbVar) {
        super(2, uhbVar);
        this.b = fxaVar;
        this.c = z;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fwz) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0066, code lost:
    
        if (defpackage.ung.s(r7.d, r1, r6) == r0) goto L17;
     */
    @Override // defpackage.uhn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            uhi r0 = defpackage.uhi.a
            int r1 = r6.a
            r2 = 1
            r3 = 0
            defpackage.rnt.aN(r7)
            if (r1 == 0) goto Le
            if (r1 == r2) goto L48
            goto L69
        Le:
            java.lang.Object r7 = r6.d
            und r7 = (defpackage.und) r7
            boolean r1 = r6.c
            fxa r4 = r6.b
            if (r1 == 0) goto L21
            gdv r1 = r4.e
            oyn r1 = r1.a
            syu r1 = r1.f()
            goto L29
        L21:
            gdv r1 = r4.e
            oyn r1 = r1.a
            syu r1 = r1.h()
        L29:
            r1.getClass()
            crd r4 = new crd
            r5 = 20
            r4.<init>(r1, r3, r5, r3)
            r5 = 3
            unj r7 = defpackage.ukc.A(r7, r3, r4, r5)
            cjb r4 = new cjb
            r4.<init>(r1, r5)
            r7.o(r4)
            r6.a = r2
            java.lang.Object r7 = r7.k(r6)
            if (r7 == r0) goto L6c
        L48:
            fxa r7 = r6.b
            mfd r1 = r7.a
            mfc r2 = defpackage.mfc.VIDEO_RECORDER_STOPPED
            r1.j(r2)
            lbj r1 = r7.g
            r1.a()
            vl r1 = new vl
            r2 = 14
            r1.<init>(r7, r3, r2, r3)
            r2 = 2
            r6.a = r2
            uhf r7 = r7.d
            java.lang.Object r6 = defpackage.ung.s(r7, r1, r6)
            if (r6 != r0) goto L69
            goto L6c
        L69:
            ufg r6 = defpackage.ufg.a
            return r6
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fwz.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        fwz fwzVar = new fwz(this.b, this.c, uhbVar);
        fwzVar.d = obj;
        return fwzVar;
    }
}
