package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anz extends bij implements bub, bve {
    public static final anx a = new anx();
    public aii b;
    public ocq c;
    public ocq d;

    public anz(ocq ocqVar, ocq ocqVar2, aii aiiVar) {
        this.d = ocqVar;
        this.c = ocqVar2;
        this.b = aiiVar;
    }

    @Override // defpackage.bve
    public final bss a(bst bstVar, bsq bsqVar, long j) {
        bte bteVarR = bsqVar.r(j);
        return bstVar.ds(bteVarR.a, bteVarR.b, ufx.a, new np(bteVarR, 13));
    }

    @Override // defpackage.bve
    public final /* synthetic */ int c(brv brvVar, bru bruVar, int i) {
        return amo.o(this, brvVar, bruVar, i);
    }

    @Override // defpackage.bve
    public final /* synthetic */ int d(brv brvVar, bru bruVar, int i) {
        return amo.p(this, brvVar, bruVar, i);
    }

    @Override // defpackage.bve
    public final /* synthetic */ int e(brv brvVar, bru bruVar, int i) {
        return amo.q(this, brvVar, bruVar, i);
    }

    @Override // defpackage.bve
    public final /* synthetic */ int f(brv brvVar, bru bruVar, int i) {
        return amo.r(this, brvVar, bruVar, i);
    }

    @Override // defpackage.bub
    public final bua h() {
        uev uevVar = new uev(brf.a, this);
        ocq ocqVar = (ocq) uevVar.a;
        bue bueVar = new bue(ocqVar);
        Object obj = uevVar.b;
        if (ocqVar != bueVar.b) {
            bqs.c("Check failed.");
        }
        bueVar.a.b(obj);
        return bueVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean k(defpackage.anw r5, int r6) {
        /*
            r4 = this;
            r0 = 5
            boolean r0 = defpackage.a.p(r6, r0)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L3e
            r0 = 6
            boolean r0 = defpackage.a.p(r6, r0)
            if (r0 == 0) goto L11
            goto L3e
        L11:
            r0 = 3
            boolean r0 = defpackage.a.p(r6, r0)
            if (r0 != 0) goto L37
            r0 = 4
            boolean r0 = defpackage.a.p(r6, r0)
            if (r0 == 0) goto L20
            goto L37
        L20:
            boolean r0 = defpackage.a.p(r6, r2)
            if (r0 != 0) goto L44
            r0 = 2
            boolean r0 = defpackage.a.p(r6, r0)
            if (r0 == 0) goto L2e
            goto L44
        L2e:
            defpackage.byi.at()
            uer r4 = new uer
            r4.<init>()
            throw r4
        L37:
            aii r0 = r4.b
            aii r3 = defpackage.aii.a
            if (r0 != r3) goto L44
            goto L5c
        L3e:
            aii r0 = r4.b
            aii r3 = defpackage.aii.b
            if (r0 == r3) goto L5c
        L44:
            boolean r6 = r4.l(r6)
            if (r6 == 0) goto L57
            int r5 = r5.b
            ocq r4 = r4.d
            int r4 = r4.aD()
            int r4 = r4 + (-1)
            if (r5 >= r4) goto L5c
            return r2
        L57:
            int r4 = r5.a
            if (r4 <= 0) goto L5c
            return r2
        L5c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anz.k(anw, int):boolean");
    }

    public final boolean l(int i) {
        if (a.p(i, 1)) {
            return false;
        }
        if (a.p(i, 2)) {
            return true;
        }
        if (a.p(i, 5)) {
            return false;
        }
        if (a.p(i, 6)) {
            return true;
        }
        if (a.p(i, 3)) {
            int iOrdinal = bko.F(this).ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal == 1) {
                return true;
            }
            throw new uet();
        }
        if (!a.p(i, 4)) {
            byi.at();
            throw new uer();
        }
        int iOrdinal2 = bko.F(this).ordinal();
        if (iOrdinal2 == 0) {
            return true;
        }
        if (iOrdinal2 == 1) {
            return false;
        }
        throw new uet();
    }

    @Override // defpackage.bud
    public final /* synthetic */ Object m(ocq ocqVar) {
        return bqs.v(this, ocqVar);
    }
}
