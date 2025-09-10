package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bso extends btd {
    private final bvt b;

    public bso(bvt bvtVar) {
        this.b = bvtVar;
    }

    @Override // defpackage.btd, defpackage.chq
    public final float a() {
        return this.b.a();
    }

    @Override // defpackage.btd, defpackage.chw
    public final float b() {
        return this.b.b();
    }

    @Override // defpackage.btd
    public final int l() {
        return this.b.t();
    }

    @Override // defpackage.btd
    public final bry m() {
        bvt bvtVar = this.b;
        bry bryVarF = bvtVar.k ? null : bvtVar.F();
        if (bryVarF == null) {
            bvtVar.H().t.f();
        }
        return bryVarF;
    }

    @Override // defpackage.btd
    public final cib n() {
        return this.b.m();
    }

    @Override // defpackage.btd
    public final float o(btk btkVar) {
        uiu uiuVar = btkVar.a;
        if (uiuVar != null) {
            return ((Number) uiuVar.a(this, Float.valueOf(Float.NaN))).floatValue();
        }
        bvt bvtVar = this.b;
        if (bvtVar.k) {
            return Float.NaN;
        }
        bvt bvtVar2 = bvtVar;
        while (true) {
            bad badVar = bvtVar2.n;
            if (!Float.isNaN(Float.NaN)) {
                bvtVar2.K(bvtVar.H(), btkVar);
                return btkVar.a(bvtVar2.F(), bvtVar.F());
            }
            bvt bvtVarJ = bvtVar2.J();
            if (bvtVarJ == null) {
                bvtVar2.K(bvtVar.H(), btkVar);
                return Float.NaN;
            }
            bvtVar2 = bvtVarJ;
        }
    }
}
