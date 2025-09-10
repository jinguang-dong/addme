package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class utx extends utw {
    protected final urk d;

    public utx(urk urkVar, uhf uhfVar, int i, int i2) {
        super(uhfVar, i, i2);
        this.d = urkVar;
    }

    @Override // defpackage.utw
    protected final Object b(uqx uqxVar, uhb uhbVar) {
        Object objG = g(new uuq(uqxVar), uhbVar);
        return objG == uhi.a ? objG : ufg.a;
    }

    public abstract Object g(url urlVar, uhb uhbVar);

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    @Override // defpackage.utw, defpackage.urk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object gc(defpackage.url r5, defpackage.uhb r6) throws java.lang.Throwable {
        /*
            r4 = this;
            int r0 = r4.b
            r1 = -3
            if (r0 != r1) goto L54
            uhf r0 = r6.q()
            uhf r1 = r4.a
            uhf r1 = defpackage.umy.a(r0, r1)
            boolean r2 = defpackage.a.ao(r1, r0)
            if (r2 == 0) goto L1e
            java.lang.Object r4 = r4.g(r5, r6)
            uhi r5 = defpackage.uhi.a
            if (r4 != r5) goto L5d
            return r4
        L1e:
            azn r2 = defpackage.uhc.k
            uhd r3 = r1.get(r2)
            uhd r0 = r0.get(r2)
            boolean r0 = defpackage.a.ao(r3, r0)
            if (r0 == 0) goto L54
            uhf r0 = r6.q()
            boolean r2 = r5 instanceof defpackage.uuq
            if (r2 != 0) goto L40
            boolean r2 = r5 instanceof defpackage.uul
            if (r2 != 0) goto L40
            uut r2 = new uut
            r2.<init>(r5, r0)
            r5 = r2
        L40:
            cwt r0 = new cwt
            r2 = 0
            r3 = 3
            r0.<init>(r4, r2, r3)
            java.lang.Object r4 = defpackage.uwe.a(r1)
            java.lang.Object r4 = defpackage.ujk.p(r1, r5, r4, r0, r6)
            uhi r5 = defpackage.uhi.a
            if (r4 != r5) goto L5d
            return r4
        L54:
            java.lang.Object r4 = defpackage.utw.h(r4, r5, r6)
            uhi r5 = defpackage.uhi.a
            if (r4 != r5) goto L5d
            return r4
        L5d:
            ufg r4 = defpackage.ufg.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.utx.gc(url, uhb):java.lang.Object");
    }

    @Override // defpackage.utw
    public final String toString() {
        return this.d + " -> " + super.toString();
    }
}
