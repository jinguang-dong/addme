package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class jcu extends kfn {
    final /* synthetic */ jcv a;
    private final boolean b;

    public jcu(jcv jcvVar, boolean z) {
        this.a = jcvVar;
        this.b = z;
    }

    @Override // defpackage.kfn, defpackage.kfm
    public final void b() {
        jcv jcvVar = this.a;
        jcvVar.n.a();
        jcvVar.Q.K.q();
        rwc rwcVar = jcvVar.y;
        if (rwcVar.h()) {
            ((fty) rwcVar.c()).a(false);
        }
        jth jthVar = jcvVar.U;
        if (jthVar == null || !jcvVar.V.a((kow) jthVar.i().f)) {
            return;
        }
        jcvVar.W.b(false);
    }

    @Override // defpackage.kfn, defpackage.kfm
    public final void c(long j) {
        rwc rwcVar = this.a.y;
        if (rwcVar.h()) {
            ((fty) rwcVar.c()).b(this.b);
        }
    }

    @Override // defpackage.kfn, defpackage.kfm
    public final void d() {
        this.a.d.execute(new jcq(this, 8));
    }

    @Override // defpackage.kfn, defpackage.kfm
    public final void e(float f) {
        g(f, -1L);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    @Override // defpackage.kfn, defpackage.kfm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(float r4, long r5) {
        /*
            r3 = this;
            jcv r3 = r3.a
            hyh r0 = r3.v
            owf r0 = r0.b
            java.lang.Object r0 = r0.dL()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L26
            rwc r0 = r3.y
            boolean r2 = r0.h()
            if (r2 == 0) goto L26
            java.lang.Object r0 = r0.c()
            fty r0 = (defpackage.fty) r0
            r0.i(r4, r5)
            goto L6e
        L26:
            jth r0 = r3.U
            if (r0 == 0) goto L4d
            mns r2 = r3.V
            uh r0 = r0.i()
            java.lang.Object r0 = r0.f
            kow r0 = (defpackage.kow) r0
            boolean r0 = r2.a(r0)
            if (r0 == 0) goto L4d
            mnt r0 = r3.W
            jth r2 = r3.U
            r2.getClass()
            uh r2 = r2.i()
            java.lang.Object r2 = r2.f
            kow r2 = (defpackage.kow) r2
            r0.d(r4, r5, r2)
            goto L56
        L4d:
            jtl r5 = r3.n
            r6 = 1120403456(0x42c80000, float:100.0)
            float r6 = r6 * r4
            int r6 = (int) r6
            r5.f(r6)
        L56:
            r5 = 0
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 != 0) goto L63
            iyu r5 = r3.Q
            fqy r5 = r5.K
            r5.p()
            goto L6e
        L63:
            int r5 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r5 != 0) goto L6e
            iyu r5 = r3.Q
            fqy r5 = r5.K
            r5.q()
        L6e:
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L7a
            mbj r3 = r3.R
            r4 = 2131951682(0x7f130042, float:1.9539785E38)
            r3.c(r4)
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jcu.g(float, long):void");
    }
}
