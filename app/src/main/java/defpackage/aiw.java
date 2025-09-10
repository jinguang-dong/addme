package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiw implements boy {
    public boolean a;
    private final aji b;

    public aiw(aji ajiVar, boolean z) {
        this.b = ajiVar;
        this.a = z;
    }

    @Override // defpackage.boy
    public final long a(long j, long j2, int i) {
        if (!this.a) {
            return 0L;
        }
        aji ajiVar = this.b;
        if (ajiVar.a.e()) {
            return 0L;
        }
        return ajiVar.f(ajiVar.a(ajiVar.a.a(ajiVar.a(ajiVar.b(j2)))));
    }

    @Override // defpackage.boy
    public final /* synthetic */ long b(long j, int i) {
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.boy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object cV(long r5, long r7, defpackage.uhb r9) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r5 = r9 instanceof defpackage.aiv
            if (r5 == 0) goto L13
            r5 = r9
            aiv r5 = (defpackage.aiv) r5
            int r6 = r5.d
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r6 & r0
            if (r1 == 0) goto L13
            int r6 = r6 - r0
            r5.d = r6
            goto L18
        L13:
            aiv r5 = new aiv
            r5.<init>(r4, r9)
        L18:
            java.lang.Object r6 = r5.b
            uhi r9 = defpackage.uhi.a
            int r0 = r5.d
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2a
            long r4 = r5.a
            defpackage.rnt.aN(r6)
            r7 = r4
            goto L4c
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            defpackage.rnt.aN(r6)
            boolean r6 = r4.a
            r2 = 0
            if (r6 == 0) goto L56
            aji r4 = r4.b
            boolean r6 = r4.g
            if (r6 == 0) goto L42
            goto L50
        L42:
            r5.a = r7
            r5.d = r1
            java.lang.Object r6 = r4.g(r7, r5)
            if (r6 == r9) goto L55
        L4c:
            cif r6 = (defpackage.cif) r6
            long r2 = r6.a
        L50:
            long r2 = defpackage.a.ac(r7, r2)
            goto L56
        L55:
            return r9
        L56:
            cif r4 = new cif
            r4.<init>(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiw.cV(long, long, uhb):java.lang.Object");
    }

    @Override // defpackage.boy
    public final /* synthetic */ Object d(long j, uhb uhbVar) {
        return new cif(0L);
    }
}
