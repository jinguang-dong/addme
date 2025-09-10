package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ahn extends bup implements bww, buv {
    public aii a;
    public uiq b;
    public boolean c;
    public uqm d;
    public boolean e;
    public long f = 0;
    public bry g;
    private aju h;
    private bql i;
    private ocq j;

    public ahn(uiq uiqVar, boolean z, ocq ocqVar, aii aiiVar) {
        this.a = aiiVar;
        this.b = uiqVar;
        this.c = z;
        this.j = ocqVar;
    }

    public abstract Object c(uiu uiuVar, uhb uhbVar);

    @Override // defpackage.buv
    public final void cQ(bry bryVar) {
        this.g = bryVar;
    }

    @Override // defpackage.bww
    public final void cX() {
        bql bqlVar = this.i;
        if (bqlVar != null) {
            bqlVar.cX();
        }
    }

    @Override // defpackage.bij
    public /* synthetic */ void cY() {
        amo.i(this);
    }

    @Override // defpackage.bij
    public final void cZ() {
        this.e = false;
        m();
        this.g = null;
        this.f = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(defpackage.uhb r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ahj
            if (r0 == 0) goto L13
            r0 = r6
            ahj r0 = (defpackage.ahj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ahj r0 = new ahj
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            uhi r1 = defpackage.uhi.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.rnt.aN(r6)
            goto L49
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.rnt.aN(r6)
            aju r6 = r5.h
            if (r6 == 0) goto L4c
            ocq r2 = r5.j
            if (r2 == 0) goto L49
            ajt r4 = new ajt
            r4.<init>(r6)
            r0.c = r3
            java.lang.Object r6 = r2.aE(r4, r0)
            if (r6 == r1) goto L48
            goto L49
        L48:
            return r1
        L49:
            r6 = 0
            r5.h = r6
        L4c:
            r0 = 0
            r5.t(r0)
            ufg r5 = defpackage.ufg.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahn.d(uhb):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0069, code lost:
    
        if (r2.aE(r8, r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.agv r7, defpackage.uhb r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.ahk
            if (r0 == 0) goto L13
            r0 = r8
            ahk r0 = (defpackage.ahk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ahk r0 = new ahk
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            uhi r1 = defpackage.uhi.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            aju r7 = r0.e
            agv r0 = r0.d
            defpackage.rnt.aN(r8)
            goto L6f
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            agv r7 = r0.d
            defpackage.rnt.aN(r8)
            goto L56
        L3c:
            defpackage.rnt.aN(r8)
            aju r8 = r6.h
            if (r8 == 0) goto L56
            ocq r2 = r6.j
            if (r2 == 0) goto L56
            ajt r5 = new ajt
            r5.<init>(r8)
            r0.d = r7
            r0.c = r4
            java.lang.Object r8 = r2.aE(r5, r0)
            if (r8 == r1) goto L6c
        L56:
            aju r8 = new aju
            r8.<init>()
            ocq r2 = r6.j
            if (r2 == 0) goto L6d
            r0.d = r7
            r0.e = r8
            r0.c = r3
            java.lang.Object r0 = r2.aE(r8, r0)
            if (r0 == r1) goto L6c
            goto L6d
        L6c:
            return r1
        L6d:
            r0 = r7
            r7 = r8
        L6f:
            r6.h = r7
            long r7 = r0.a
            r6.r(r7)
            ufg r6 = defpackage.ufg.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahn.f(agv, uhb):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(defpackage.agw r6, defpackage.uhb r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ahl
            if (r0 == 0) goto L13
            r0 = r7
            ahl r0 = (defpackage.ahl) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ahl r0 = new ahl
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            uhi r1 = defpackage.uhi.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            agw r6 = r0.d
            defpackage.rnt.aN(r7)
            goto L4d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.rnt.aN(r7)
            aju r7 = r5.h
            if (r7 == 0) goto L50
            ocq r2 = r5.j
            if (r2 == 0) goto L4d
            ajv r4 = new ajv
            r4.<init>(r7)
            r0.d = r6
            r0.c = r3
            java.lang.Object r7 = r2.aE(r4, r0)
            if (r7 == r1) goto L4c
            goto L4d
        L4c:
            return r1
        L4d:
            r7 = 0
            r5.h = r7
        L50:
            long r6 = r6.a
            r5.t(r6)
            ufg r5 = defpackage.ufg.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahn.k(agw, uhb):java.lang.Object");
    }

    @Override // defpackage.bww
    public final /* synthetic */ void l() {
        amo.j(this);
    }

    public final void m() {
        aju ajuVar = this.h;
        if (ajuVar != null) {
            ocq ocqVar = this.j;
            if (ocqVar != null) {
                ocqVar.aF(new ajt(ajuVar));
            }
            this.h = null;
        }
    }

    public abstract void r(long j);

    public abstract void t(long j);

    @Override // defpackage.bww
    public void u(bpp bppVar, int i, long j) {
        if (this.c && this.i == null) {
            ahi ahiVar = new ahi(this, 0);
            bpp bppVar2 = bqh.a;
            bql bqlVar = new bql(null, null, ahiVar);
            M(bqlVar);
            this.i = bqlVar;
        }
        bql bqlVar2 = this.i;
        if (bqlVar2 != null) {
            bqlVar2.u(bppVar, i, j);
        }
    }

    public abstract boolean w();

    public final void z(uiq uiqVar, boolean z, ocq ocqVar, aii aiiVar, boolean z2) {
        this.b = uiqVar;
        if (this.c != z) {
            this.c = z;
            z2 = true;
            if (!z) {
                m();
                bql bqlVar = this.i;
                if (bqlVar != null) {
                    L(bqlVar);
                }
                this.i = null;
            }
        }
        if (!a.ao(this.j, ocqVar)) {
            m();
            this.j = ocqVar;
        }
        if (this.a != aiiVar) {
            this.a = aiiVar;
        } else if (!z2) {
            return;
        }
        bql bqlVar2 = this.i;
        if (bqlVar2 != null) {
            bqlVar2.o();
        }
    }

    @Override // defpackage.bww
    public final /* synthetic */ void v() {
    }

    @Override // defpackage.bww
    public final /* synthetic */ void y() {
    }
}
