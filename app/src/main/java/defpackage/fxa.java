package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class fxa implements oyk, paq {
    private static final sgv h = sgv.g("fxa");
    public final mfd a;
    public final gdm b;
    public final uhf c;
    public final uhf d;
    public final gdv e;
    public final gaw f;
    public final lbj g;
    private final our i;
    private volatile int j;
    private final cxb k;

    public fxa(mfd mfdVar, gdm gdmVar, uhf uhfVar, uhf uhfVar2, cxb cxbVar, gdv gdvVar, lbj lbjVar, gaw gawVar) {
        this.a = mfdVar;
        this.b = gdmVar;
        this.c = uhfVar;
        this.d = uhfVar2;
        this.k = cxbVar;
        this.e = gdvVar;
        this.g = lbjVar;
        this.f = gawVar;
        our ourVarW = cxbVar.w(gdo.RECORDING_SESSION);
        this.i = ourVarW;
        this.j = 1;
        ourVarW.d(new fis(this, 13));
        ourVarW.d(new fis(this, 14));
        ourVarW.d(gdvVar);
        ourVarW.d(new fis(this, 15));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object a(defpackage.fxa r6, defpackage.uhb r7) {
        /*
            java.lang.String r0 = "Trying to start with state: "
            boolean r1 = r7 instanceof defpackage.fwx
            if (r1 == 0) goto L15
            r1 = r7
            fwx r1 = (defpackage.fwx) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.d = r2
            goto L1a
        L15:
            fwx r1 = new fwx
            r1.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r1.b
            uhi r2 = defpackage.uhi.a
            int r3 = r1.d
            r4 = 1
            if (r3 == 0) goto L33
            if (r3 != r4) goto L2b
            java.lang.Object r6 = r1.a
            defpackage.rnt.aN(r7)     // Catch: java.lang.Exception -> L72
            goto L4f
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.rnt.aN(r7)
            int r7 = r6.j     // Catch: java.lang.Exception -> L72
            if (r7 != r4) goto L5a
            uhf r7 = r6.c     // Catch: java.lang.Exception -> L72
            crd r0 = new crd     // Catch: java.lang.Exception -> L72
            r3 = 0
            r5 = 19
            r0.<init>(r6, r3, r5)     // Catch: java.lang.Exception -> L72
            r1.a = r6     // Catch: java.lang.Exception -> L72
            r1.d = r4     // Catch: java.lang.Exception -> L72
            java.lang.Object r7 = defpackage.ung.s(r7, r0, r1)     // Catch: java.lang.Exception -> L72
            if (r7 != r2) goto L4f
            return r2
        L4f:
            fxa r6 = (defpackage.fxa) r6     // Catch: java.lang.Exception -> L72
            r7 = 2
            r6.j(r7)     // Catch: java.lang.Exception -> L72
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Exception -> L72
            return r6
        L5a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L72
            int r6 = r6.j     // Catch: java.lang.Exception -> L72
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L72
            r1.<init>(r0)     // Catch: java.lang.Exception -> L72
            java.lang.String r6 = defpackage.ezh.g(r6)     // Catch: java.lang.Exception -> L72
            r1.append(r6)     // Catch: java.lang.Exception -> L72
            java.lang.String r6 = r1.toString()     // Catch: java.lang.Exception -> L72
            r7.<init>(r6)     // Catch: java.lang.Exception -> L72
            throw r7     // Catch: java.lang.Exception -> L72
        L72:
            r6 = move-exception
            sgv r7 = defpackage.fxa.h
            shi r7 = r7.b()
            shi r6 = r7.i(r6)
            r7 = 467(0x1d3, float:6.54E-43)
            shi r6 = r6.M(r7)
            sgt r6 = (defpackage.sgt) r6
            java.lang.String r7 = "Failed to start recording."
            r6.s(r7)
            r6 = 0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fxa.a(fxa, uhb):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object i(defpackage.fxa r6, boolean r7, int r8, defpackage.uhb r9) {
        /*
            java.lang.String r0 = "Trying to stop with state: "
            boolean r1 = r9 instanceof defpackage.fwy
            if (r1 == 0) goto L15
            r1 = r9
            fwy r1 = (defpackage.fwy) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.d = r2
            goto L1a
        L15:
            fwy r1 = new fwy
            r1.<init>(r6, r9)
        L1a:
            java.lang.Object r9 = r1.b
            uhi r2 = defpackage.uhi.a
            int r3 = r1.d
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L36
            if (r3 != r5) goto L2e
            int r8 = r1.e
            java.lang.Object r6 = r1.a
            defpackage.rnt.aN(r9)     // Catch: java.lang.Exception -> L83
            goto L70
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            defpackage.rnt.aN(r9)
            int r9 = r6.j     // Catch: java.lang.Exception -> L83
            r3 = 2
            if (r9 == r3) goto L5c
            int r9 = r6.j     // Catch: java.lang.Exception -> L83
            r3 = 3
            if (r9 != r3) goto L44
            goto L5c
        L44:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L83
            int r6 = r6.j     // Catch: java.lang.Exception -> L83
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L83
            r8.<init>(r0)     // Catch: java.lang.Exception -> L83
            java.lang.String r6 = defpackage.ezh.g(r6)     // Catch: java.lang.Exception -> L83
            r8.append(r6)     // Catch: java.lang.Exception -> L83
            java.lang.String r6 = r8.toString()     // Catch: java.lang.Exception -> L83
            r7.<init>(r6)     // Catch: java.lang.Exception -> L83
            throw r7     // Catch: java.lang.Exception -> L83
        L5c:
            uhf r9 = r6.c     // Catch: java.lang.Exception -> L83
            fwz r0 = new fwz     // Catch: java.lang.Exception -> L83
            r0.<init>(r6, r7, r4)     // Catch: java.lang.Exception -> L83
            r1.a = r6     // Catch: java.lang.Exception -> L83
            r1.e = r8     // Catch: java.lang.Exception -> L83
            r1.d = r5     // Catch: java.lang.Exception -> L83
            java.lang.Object r7 = defpackage.ung.s(r9, r0, r1)     // Catch: java.lang.Exception -> L83
            if (r7 != r2) goto L70
            return r2
        L70:
            fxa r6 = (defpackage.fxa) r6     // Catch: java.lang.Exception -> L83
            r7 = 4
            r6.j(r7)     // Catch: java.lang.Exception -> L83
            gcd r6 = new gcd     // Catch: java.lang.Exception -> L83
            kbk r7 = new kbk     // Catch: java.lang.Exception -> L83
            ufw r9 = defpackage.ufw.a     // Catch: java.lang.Exception -> L83
            r7.<init>(r9, r9, r4, r8)     // Catch: java.lang.Exception -> L83
            r6.<init>(r5, r7)     // Catch: java.lang.Exception -> L83
            return r6
        L83:
            r6 = move-exception
            sgv r7 = defpackage.fxa.h
            shi r7 = r7.b()
            shi r6 = r7.i(r6)
            r7 = 468(0x1d4, float:6.56E-43)
            shi r6 = r6.M(r7)
            sgt r6 = (defpackage.sgt) r6
            java.lang.String r7 = "Failed to stop recording."
            r6.s(r7)
            gcd r6 = new gcd
            r7 = 0
            r6.<init>(r7, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fxa.i(fxa, boolean, int, uhb):java.lang.Object");
    }

    private final void j(int i) {
        this.j = i;
    }

    public final void b() {
        if (this.j == 5) {
            throw new IllegalStateException("Recording session is closed.");
        }
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        if (this.j == 5) {
            return;
        }
        j(5);
        this.i.close();
    }

    @Override // defpackage.oyk
    public final void d() {
    }

    @Override // defpackage.oyk
    public final void e() {
    }

    @Override // defpackage.oyk
    public final void f() {
    }

    @Override // defpackage.oyk
    public final void g() {
    }

    @Override // defpackage.oyv
    public final void c(oyu oyuVar) {
    }

    @Override // defpackage.oyk
    public final void h(long j, long j2) {
    }
}
