package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jci implements itk {
    final /* synthetic */ fqf a;
    private final /* synthetic */ int b;

    public jci(fqf fqfVar, int i) {
        this.b = i;
        this.a = fqfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    @Override // defpackage.itk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(boolean r3) {
        /*
            r2 = this;
            int r0 = r2.b
            if (r0 == 0) goto L91
            r1 = 1
            if (r0 == r1) goto L68
            fqf r2 = r2.a
            jcv r2 = (defpackage.jcv) r2
            jth r0 = r2.U
            if (r0 == 0) goto L20
            owf r0 = r0.b()
            java.lang.Object r0 = r0.dL()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L20
            goto L53
        L20:
            jth r0 = r2.U
            if (r0 == 0) goto L62
            rwc r0 = r2.y
            boolean r0 = r0.h()
            if (r0 == 0) goto L62
            hyh r0 = r2.v
            owf r0 = r0.b
            java.lang.Object r0 = r0.dL()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L62
            jth r0 = r2.U
            r0.getClass()
            uh r0 = r0.i()
            java.lang.Object r0 = r0.a
            ovx r0 = (defpackage.ovx) r0
            java.lang.Object r0 = r0.d
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L62
        L53:
            if (r3 == 0) goto L5b
            ndo r0 = r2.g
            r0.d()
            goto L62
        L5b:
            r2.D = r1
            ndo r0 = r2.g
            r0.a()
        L62:
            ndj r2 = r2.p
            r2.G(r3)
            return
        L68:
            fqf r2 = r2.a
            jbm r2 = (defpackage.jbm) r2
            boolean r0 = r2.G
            if (r0 != 0) goto L93
            boolean r0 = r2.d()
            if (r0 != 0) goto L77
            goto L93
        L77:
            if (r3 == 0) goto L7f
            meu r0 = r2.F
            r0.e()
            goto L8b
        L7f:
            r2.D = r1
            meu r0 = r2.F
            r0.g()
            msi r0 = r2.m
            r0.g()
        L8b:
            ndj r2 = r2.g
            r2.G(r3)
            return
        L91:
            if (r3 == 0) goto L94
        L93:
            return
        L94:
            fqf r2 = r2.a
            jcm r2 = (defpackage.jcm) r2
            jcc r3 = r2.k
            boolean r3 = r3.c()
            if (r3 == 0) goto La4
            r2.e()
            return
        La4:
            ndo r2 = r2.b
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jci.f(boolean):void");
    }

    @Override // defpackage.itk
    public final void g(boolean z) {
        int i = this.b;
        if (i == 0) {
            if (z) {
                jcm jcmVar = (jcm) this.a;
                if (jcmVar.k.c()) {
                    return;
                }
                jcmVar.r.b(true);
                return;
            }
            return;
        }
        if (i != 1) {
            if (z) {
                ((jcv) this.a).Z.b(true);
            }
        } else if (z) {
            jbm jbmVar = (jbm) this.a;
            if (jbmVar.d()) {
                jbmVar.P.b(true);
            }
        }
    }

    @Override // defpackage.itk
    public final void h(boolean z) {
        int i = this.b;
        if (i == 0) {
            if (z) {
                jcm jcmVar = (jcm) this.a;
                if (jcmVar.k.c()) {
                    return;
                }
                jcmVar.r.b(false);
                return;
            }
            return;
        }
        if (i != 1) {
            if (z) {
                ((jcv) this.a).Z.b(false);
            }
        } else if (z) {
            jbm jbmVar = (jbm) this.a;
            if (jbmVar.d()) {
                jbmVar.P.b(false);
            }
        }
    }

    @Override // defpackage.itk
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.itk
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.itk
    public final /* synthetic */ void a(boolean z) {
    }

    @Override // defpackage.itk
    public final /* synthetic */ void b(boolean z) {
    }

    @Override // defpackage.itk
    public final /* synthetic */ void c(boolean z) {
    }
}
