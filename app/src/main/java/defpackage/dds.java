package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dds implements ddn, dcj {
    public final ddo a;

    public dds(ddo ddoVar) {
        this.a = ddoVar;
    }

    @Override // defpackage.dcj
    public final Object a(String str, uiq uiqVar, uhb uhbVar) throws Exception {
        ddw ddwVarA = this.a.a(str);
        try {
            Object objA = uiqVar.a(ddwVarA);
            ske.ay(ddwVarA, null);
            return objA;
        } finally {
        }
    }

    @Override // defpackage.ddn
    public final ddo b() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.dcy r8, defpackage.uiu r9, defpackage.uhb r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.ddr
            if (r0 == 0) goto L13
            r0 = r10
            ddr r0 = (defpackage.ddr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ddr r0 = new ddr
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.a
            uhi r1 = defpackage.uhi.a
            int r2 = r0.c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            dfj r7 = r0.d
            defpackage.rnt.aN(r10)     // Catch: java.lang.Throwable -> L2b defpackage.ddj -> Lbe
            goto Lae
        L2b:
            r8 = move-exception
            goto Lbf
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            defpackage.rnt.aN(r10)
            ddo r10 = r7.a
            dfa r10 = r10.a
            r10.i()
            int r8 = r8.ordinal()
            if (r8 == 0) goto L59
            if (r8 == r3) goto L55
            r2 = 2
            if (r8 != r2) goto L4f
            r10.d()
            goto L99
        L4f:
            uet r7 = new uet
            r7.<init>()
            throw r7
        L55:
            r10.e()
            goto L99
        L59:
            java.lang.reflect.Method r8 = defpackage.cog.m()
            if (r8 == 0) goto L93
            java.lang.reflect.Method r8 = defpackage.cog.n()
            if (r8 == 0) goto L93
            java.lang.reflect.Method r8 = defpackage.cog.m()
            r8.getClass()
            java.lang.reflect.Method r2 = defpackage.cog.n()
            r2.getClass()
            r5 = r10
            dfj r5 = (defpackage.dfj) r5
            android.database.sqlite.SQLiteDatabase r5 = r5.d
            java.lang.Object r2 = r2.invoke(r5, r4)
            if (r2 == 0) goto L8b
            r5 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r4, r5, r4}
            r8.invoke(r2, r5)
            goto L99
        L8b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Required value was null."
            r7.<init>(r8)
            throw r7
        L93:
            r8 = r10
            dfj r8 = (defpackage.dfj) r8
            r8.d()
        L99:
            ddq r8 = new ddq     // Catch: java.lang.Throwable -> Lb9 defpackage.ddj -> Lbd
            r8.<init>(r7)     // Catch: java.lang.Throwable -> Lb9 defpackage.ddj -> Lbd
            r7 = r10
            dfj r7 = (defpackage.dfj) r7     // Catch: java.lang.Throwable -> Lb9 defpackage.ddj -> Lbd
            r0.d = r7     // Catch: java.lang.Throwable -> Lb9 defpackage.ddj -> Lbd
            r0.c = r3     // Catch: java.lang.Throwable -> Lb9 defpackage.ddj -> Lbd
            java.lang.Object r7 = r9.a(r8, r0)     // Catch: java.lang.Throwable -> Lb9 defpackage.ddj -> Lbd
            if (r7 == r1) goto Lb8
            r6 = r10
            r10 = r7
            r7 = r6
        Lae:
            r7.h()     // Catch: java.lang.Throwable -> L2b defpackage.ddj -> Lbe
            r7.f()
            r7.i()
            return r10
        Lb8:
            return r1
        Lb9:
            r7 = move-exception
            r8 = r7
            r7 = r10
            goto Lbf
        Lbd:
            r7 = r10
        Lbe:
            throw r4     // Catch: java.lang.Throwable -> L2b
        Lbf:
            r7.f()
            r7.i()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dds.c(dcy, uiu, uhb):java.lang.Object");
    }

    public final Object d() {
        return Boolean.valueOf(this.a.a.i());
    }
}
