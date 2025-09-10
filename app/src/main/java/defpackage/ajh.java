package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajh extends uht implements uiu {
    long a;
    int b;
    /* synthetic */ long c;
    final /* synthetic */ aji d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajh(aji ajiVar, uhb uhbVar) {
        super(2, uhbVar);
        this.d = ajiVar;
    }

    @Override // defpackage.uiu
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajh) c(new cif(((cif) obj).a), (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.uhn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            uhi r0 = defpackage.uhi.a
            int r1 = r11.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1c
            if (r1 == r2) goto L14
            long r0 = r11.a
            long r2 = r11.c
            defpackage.rnt.aN(r12)
            goto L67
        L14:
            long r1 = r11.a
            long r3 = r11.c
            defpackage.rnt.aN(r12)
            goto L4b
        L1c:
            long r3 = r11.c
            defpackage.rnt.aN(r12)
            goto L34
        L22:
            defpackage.rnt.aN(r12)
            long r4 = r11.c
            aji r12 = r11.d
            bpb r12 = r12.e
            r11.b = r3
            java.lang.Object r12 = r12.e(r4, r11)
            if (r12 == r0) goto L78
            r3 = r4
        L34:
            cif r12 = (defpackage.cif) r12
            long r5 = r12.a
            long r5 = defpackage.a.ac(r3, r5)
            aji r12 = r11.d
            r11.c = r3
            r11.a = r5
            r11.b = r2
            java.lang.Object r12 = r12.g(r5, r11)
            if (r12 == r0) goto L78
            r1 = r5
        L4b:
            cif r12 = (defpackage.cif) r12
            long r8 = r12.a
            aji r12 = r11.d
            bpb r5 = r12.e
            long r6 = defpackage.a.ac(r1, r8)
            r11.c = r3
            r11.a = r8
            r12 = 3
            r11.b = r12
            r10 = r11
            java.lang.Object r12 = r5.d(r6, r8, r10)
            if (r12 == r0) goto L78
            r2 = r3
            r0 = r8
        L67:
            cif r12 = (defpackage.cif) r12
            long r11 = r12.a
            long r11 = defpackage.a.ac(r0, r11)
            long r11 = defpackage.a.ac(r2, r11)
            cif r0 = new cif
            r0.<init>(r11)
        L78:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajh.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        ajh ajhVar = new ajh(this.d, uhbVar);
        ajhVar.c = ((cif) obj).a;
        return ajhVar;
    }
}
