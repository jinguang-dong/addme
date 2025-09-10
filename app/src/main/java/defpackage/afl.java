package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afl extends bij implements bww {
    public ocq a;
    private ajz b;

    public afl(ocq ocqVar) {
        this.a = ocqVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.uhb r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.afj
            if (r0 == 0) goto L13
            r0 = r5
            afj r0 = (defpackage.afj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            afj r0 = new afj
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            uhi r1 = defpackage.uhi.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ajz r0 = r0.d
            defpackage.rnt.aN(r5)
            goto L4a
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.rnt.aN(r5)
            ajz r5 = r4.b
            if (r5 != 0) goto L4e
            ajz r5 = new ajz
            r5.<init>()
            ocq r2 = r4.a
            r0.d = r5
            r0.c = r3
            java.lang.Object r0 = r2.aE(r5, r0)
            if (r0 == r1) goto L4d
            r0 = r5
        L4a:
            r4.b = r0
            goto L4e
        L4d:
            return r1
        L4e:
            ufg r4 = defpackage.ufg.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afl.a(uhb):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.uhb r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.afk
            if (r0 == 0) goto L13
            r0 = r5
            afk r0 = (defpackage.afk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            afk r0 = new afk
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            uhi r1 = defpackage.uhi.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.rnt.aN(r5)
            goto L45
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.rnt.aN(r5)
            ajz r5 = r4.b
            if (r5 == 0) goto L4a
            aka r2 = new aka
            r2.<init>(r5)
            ocq r5 = r4.a
            r0.c = r3
            java.lang.Object r5 = r5.aE(r2, r0)
            if (r5 == r1) goto L49
        L45:
            r5 = 0
            r4.b = r5
            goto L4a
        L49:
            return r1
        L4a:
            ufg r4 = defpackage.ufg.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afl.c(uhb):java.lang.Object");
    }

    @Override // defpackage.bww
    public final void cX() {
        d();
    }

    @Override // defpackage.bij
    public final /* synthetic */ void cY() {
        amo.i(this);
    }

    @Override // defpackage.bij
    public final void cZ() {
        d();
    }

    public final void d() {
        ajz ajzVar = this.b;
        if (ajzVar != null) {
            this.a.aF(new aka(ajzVar));
            this.b = null;
        }
    }

    @Override // defpackage.bww
    public final /* synthetic */ void l() {
        amo.j(this);
    }

    @Override // defpackage.bww
    public final void u(bpp bppVar, int i, long j) {
        if (i == 2) {
            int i2 = bppVar.d;
            if (a.p(i2, 4)) {
                ukc.C(C(), null, 0, new vf(this, (uhb) null, 8), 3);
            } else if (a.p(i2, 5)) {
                ukc.C(C(), null, 0, new vf(this, (uhb) null, 9, (byte[]) null), 3);
            }
        }
    }

    @Override // defpackage.bww
    public final /* synthetic */ void v() {
    }

    @Override // defpackage.bww
    public final /* synthetic */ void y() {
    }
}
