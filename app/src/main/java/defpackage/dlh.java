package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dlh implements ajd {
    public static final bgb h = bdq.q(new aud(2), new axa(10));
    public int a;
    public ank b;
    public final azr c;
    public final azr d;
    public final azr e;
    public final bbo f;
    public final bbo g;
    private int i;
    private final azr j;
    private final azr k;
    private final bbo l;
    private final bbo m;

    public dlh() {
        this(1, 0);
    }

    public static final boolean k(ana anaVar, anb anbVar) {
        int i = anbVar.a;
        return i == 0 || i == anaVar.l + (-1);
    }

    public static final int l(dkl dklVar) {
        if (a.p(0, 1)) {
            return 0;
        }
        return dklVar.g / 2;
    }

    public static final int m(dle dleVar) {
        return dleVar.f >> 1;
    }

    @Override // defpackage.ajd
    public final float a(float f) {
        return this.b.a(f);
    }

    @Override // defpackage.ajd
    public final Object b(afs afsVar, uiu uiuVar, uhb uhbVar) {
        Object objB = this.b.b(afsVar, uiuVar, uhbVar);
        return objB == uhi.a ? objB : ufg.a;
    }

    @Override // defpackage.ajd
    public final boolean c() {
        return this.b.c();
    }

    @Override // defpackage.ajd
    public final boolean d() {
        return this.b.d();
    }

    @Override // defpackage.ajd
    public final boolean e() {
        return this.b.e();
    }

    public final int f() {
        return ((Number) this.l.a()).intValue();
    }

    public final int g() {
        dkz dkzVarH = h();
        dkm dkmVar = dkzVarH instanceof dkm ? (dkm) dkzVarH : null;
        if (dkmVar != null) {
            Integer numValueOf = dkmVar.e ? Integer.valueOf(dkmVar.c) : null;
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
        }
        return this.i;
    }

    public final dkz h() {
        return (dkz) this.m.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0099, code lost:
    
        if (j(r2, r4, r5, r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(defpackage.uhb r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.dlf
            if (r0 == 0) goto L13
            r0 = r8
            dlf r0 = (defpackage.dlf) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dlf r0 = new dlf
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            uhi r1 = defpackage.uhi.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.rnt.aN(r8)
            goto L9c
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            defpackage.rnt.aN(r8)
            goto L5f
        L36:
            defpackage.rnt.aN(r8)
            azr r8 = r7.c
            java.lang.Object r2 = r8.a()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L5f
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r4)
            r8.b(r2)
            int r8 = r7.a
            int r2 = r7.i
            r0.c = r4
            r4 = 0
            java.lang.Object r8 = r7.j(r4, r8, r2, r0)
            if (r8 == r1) goto L5d
            ufg r8 = defpackage.ufg.a
        L5d:
            if (r8 == r1) goto L9b
        L5f:
            azr r8 = r7.e
            java.lang.Object r2 = r8.a()
            if (r2 == 0) goto L9c
            azr r2 = r7.k
            java.lang.Object r2 = r2.a()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            java.lang.Object r4 = r8.a()
            r4.getClass()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            azr r5 = r7.j
            java.lang.Object r5 = r5.a()
            r5.getClass()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r6 = 0
            r8.b(r6)
            r0.c = r3
            java.lang.Object r7 = r7.j(r2, r4, r5, r0)
            if (r7 != r1) goto L9c
        L9b:
            return r1
        L9c:
            ufg r7 = defpackage.ufg.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlh.i(uhb):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x009f, code lost:
    
        if (androidx.wear.ambient.AmbientMode.AmbientCallback.f(r0, r18, r12, r7 + r3, r5) == r6) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x012a, code lost:
    
        if (androidx.wear.ambient.AmbientMode.AmbientCallback.f(r0, r11, r12, r7 + r3, r5) == r6) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(boolean r18, int r19, int r20, defpackage.uhb r21) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlh.j(boolean, int, int, uhb):java.lang.Object");
    }

    public dlh(int i, int i2) {
        this.a = i;
        this.i = i2;
        this.b = new ank(0, 0);
        bap bapVar = bap.c;
        this.c = new azz(false, bapVar);
        this.d = new azz(null, bapVar);
        this.e = new azz(null, bapVar);
        this.j = new azz(null, bapVar);
        this.k = new azz(false, bapVar);
        ats atsVar = new ats(this, 20);
        pmg pmgVar = bbj.a;
        this.l = new ayv(atsVar, null);
        this.f = new ayv(new dlc(this, 1), null);
        this.g = new ayv(new dlc(this, 0), null);
        this.m = new ayv(new uif() { // from class: dld
            /* JADX WARN: Removed duplicated region for block: B:123:0x0311  */
            /* JADX WARN: Removed duplicated region for block: B:126:0x0334  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x011a  */
            @Override // defpackage.uif
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object a() {
                /*
                    Method dump skipped, instructions count: 846
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dld.a():java.lang.Object");
            }
        }, bap.a);
    }
}
