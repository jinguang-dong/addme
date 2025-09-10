package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class pwc implements Runnable {
    public final /* synthetic */ pwr a;
    public final /* synthetic */ suv b;
    public final /* synthetic */ syu c;
    public final /* synthetic */ pwp d;
    public final /* synthetic */ pwq e;
    public final /* synthetic */ long f;
    public final /* synthetic */ int g;
    private final /* synthetic */ int h;

    public /* synthetic */ pwc(pwr pwrVar, long j, suv suvVar, syu syuVar, pwp pwpVar, pwq pwqVar, int i, int i2) {
        this.h = i2;
        this.a = pwrVar;
        this.f = j;
        this.b = suvVar;
        this.c = syuVar;
        this.d = pwpVar;
        this.e = pwqVar;
        this.g = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r14 = this;
            int r0 = r14.h
            if (r0 == 0) goto L24
            long r0 = r14.f
            long r2 = defpackage.qpt.aw()
            long r11 = r2 - r0
            pwr r5 = r14.a
            suv r6 = r14.b
            syu r7 = r14.c
            pwp r8 = r14.d
            pwq r9 = r14.e
            int r10 = r14.g
            pwc r4 = new pwc
            r13 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r13)
            java.util.concurrent.Executor r14 = r5.f
            defpackage.qsz.p(r4, r14)
            return
        L24:
            pwp r0 = r14.d
            syu r1 = r14.c
            r2 = 0
            java.lang.Object r1 = defpackage.ske.U(r1)     // Catch: java.lang.Throwable -> L34
            int r0 = r0.a(r1)     // Catch: java.lang.Throwable -> L32
            goto L3a
        L32:
            r0 = move-exception
            goto L36
        L34:
            r0 = move-exception
            r1 = r2
        L36:
            int r0 = defpackage.prh.n(r0)
        L3a:
            suv r3 = r14.b
            if (r1 == 0) goto L58
            pwq r4 = r14.e
            r5 = 5
            java.lang.Object r2 = r3.a(r5, r2)
            tpc r2 = (defpackage.tpc) r2
            r2.r(r3)
            suv r1 = r4.a(r1)
            r2.r(r1)
            tph r1 = r2.l()
            r3 = r1
            suv r3 = (defpackage.suv) r3
        L58:
            sve r1 = defpackage.sve.a
            tpc r1 = r1.m()
            tph r2 = r1.b
            boolean r2 = r2.C()
            if (r2 != 0) goto L69
            r1.o()
        L69:
            int r2 = r14.g
            tph r4 = r1.b
            r5 = r4
            sve r5 = (defpackage.sve) r5
            int r2 = defpackage.rkf.s(r2)
            r5.c = r2
            int r2 = r5.b
            r2 = r2 | 1
            r5.b = r2
            boolean r2 = r4.C()
            if (r2 != 0) goto L85
            r1.o()
        L85:
            tph r2 = r1.b
            r4 = r2
            sve r4 = (defpackage.sve) r4
            int r0 = defpackage.rkf.r(r0)
            r4.d = r0
            int r0 = r4.b
            r0 = r0 | 2
            r4.b = r0
            boolean r0 = r2.C()
            if (r0 != 0) goto L9f
            r1.o()
        L9f:
            long r4 = r14.f
            pwr r14 = r14.a
            tph r0 = r1.b
            sve r0 = (defpackage.sve) r0
            int r2 = r0.b
            r2 = r2 | 4
            r0.b = r2
            r0.f = r4
            r1.V(r3)
            tph r0 = r1.l()
            sve r0 = (defpackage.sve) r0
            qbq r14 = r14.b
            r14.g(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pwc.run():void");
    }

    public /* synthetic */ pwc(pwr pwrVar, suv suvVar, syu syuVar, pwp pwpVar, pwq pwqVar, int i, long j, int i2) {
        this.h = i2;
        this.a = pwrVar;
        this.b = suvVar;
        this.c = syuVar;
        this.d = pwpVar;
        this.e = pwqVar;
        this.g = i;
        this.f = j;
    }
}
