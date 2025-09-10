package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class deh extends uht implements uiu {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ boolean c;
    final /* synthetic */ dco d;
    final /* synthetic */ uiq e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public deh(boolean z, dco dcoVar, uhb uhbVar, uiq uiqVar) {
        super(2, uhbVar);
        this.c = z;
        this.d = dcoVar;
        this.e = uiqVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((deh) c((dds) obj, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007a A[RETURN] */
    @Override // defpackage.uhn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            uhi r0 = defpackage.uhi.a
            int r1 = r5.a
            if (r1 == 0) goto L7b
            r2 = 1
            r3 = 3
            r4 = 2
            if (r1 == r2) goto L25
            if (r1 == r4) goto L1d
            if (r1 == r3) goto L15
            java.lang.Object r0 = r5.b
            defpackage.rnt.aN(r6)
            goto L68
        L15:
            java.lang.Object r1 = r5.b
            dds r1 = (defpackage.dds) r1
            defpackage.rnt.aN(r6)
            goto L57
        L1d:
            java.lang.Object r1 = r5.b
            dds r1 = (defpackage.dds) r1
            defpackage.rnt.aN(r6)
            goto L44
        L25:
            java.lang.Object r1 = r5.b
            dds r1 = (defpackage.dds) r1
            defpackage.rnt.aN(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L44
            dco r6 = r5.d
            dcf r6 = r6.b()
            r5.b = r1
            r5.a = r4
            java.lang.Object r6 = r6.a(r5)
            if (r6 == r0) goto L79
        L44:
            uiq r6 = r5.e
            deg r2 = new deg
            r4 = 0
            r2.<init>(r4, r6)
            r5.b = r1
            r5.a = r3
            java.lang.Object r6 = r1.c(r4, r2, r5)
            if (r6 != r0) goto L57
            goto L79
        L57:
            boolean r2 = r5.c
            if (r2 != 0) goto L7a
            r5.b = r6
            r2 = 4
            r5.a = r2
            java.lang.Object r1 = r1.d()
            if (r1 == r0) goto L79
            r0 = r6
            r6 = r1
        L68:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L79
            dco r5 = r5.d
            dcf r5 = r5.b()
            r5.b()
        L79:
            return r0
        L7a:
            return r6
        L7b:
            defpackage.rnt.aN(r6)
            java.lang.Object r6 = r5.b
            dds r6 = (defpackage.dds) r6
            r6.getClass()
            uiq r5 = r5.e
            ddo r6 = r6.a
            java.lang.Object r5 = r5.a(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.deh.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        deh dehVar = new deh(this.c, this.d, uhbVar, this.e);
        dehVar.b = obj;
        return dehVar;
    }
}
