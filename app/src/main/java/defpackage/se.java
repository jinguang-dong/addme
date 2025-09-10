package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class se extends uht implements uiu {
    Object a;
    Object b;
    int c;
    final /* synthetic */ qrh d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se(qrh qrhVar, uhb uhbVar) {
        super(2, uhbVar);
        this.d = qrhVar;
    }

    @Override // defpackage.uiu
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((se) c((und) obj, (uhb) obj2)).b(ufg.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        if (r6 != r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007a, code lost:
    
        if (((defpackage.uov) r6).z(r5) == r0) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x003f -> B:16:0x0041). Please report as a decompilation issue!!! */
    @Override // defpackage.uhn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            uhi r0 = defpackage.uhi.a
            int r1 = r5.c
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            defpackage.rnt.aN(r6)
            goto L7d
        Ld:
            java.lang.Object r1 = r5.b
            java.lang.Object r3 = r5.a
            defpackage.rnt.aN(r6)
            goto L41
        L15:
            defpackage.rnt.aN(r6)
            qrh r6 = r5.d
            java.lang.Object r1 = r6.c
            monitor-enter(r1)
            java.lang.Object r6 = r6.e     // Catch: java.lang.Throwable -> L80
            monitor-exit(r1)
            java.util.Iterator r6 = r6.iterator()
            r3 = r6
        L25:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L62
            java.lang.Object r6 = r3.next()
            r1 = r6
            sl r1 = (defpackage.sl) r1
            java.util.Objects.toString(r1)
            r5.a = r3
            r5.b = r1
            r5.c = r2
            java.lang.Object r6 = r1.a(r5)
            if (r6 == r0) goto L7c
        L41:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L25
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r4 = "Failed to await closure from "
            r6.<init>(r4)
            r6.append(r1)
            r1 = 33
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            java.lang.String r1 = "CXCP"
            android.util.Log.w(r1, r6)
            goto L25
        L62:
            qrh r6 = r5.d
            java.lang.Object r6 = r6.a
            uh r6 = (defpackage.uh) r6
            unj r6 = r6.g()
            r1 = 0
            r5.a = r1
            r5.b = r1
            r1 = 2
            r5.c = r1
            uov r6 = (defpackage.uov) r6
            java.lang.Object r5 = r6.z(r5)
            if (r5 != r0) goto L7d
        L7c:
            return r0
        L7d:
            ufg r5 = defpackage.ufg.a
            return r5
        L80:
            r5 = move-exception
            monitor-exit(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.se.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.uhn
    public final uhb c(Object obj, uhb uhbVar) {
        return new se(this.d, uhbVar);
    }
}
