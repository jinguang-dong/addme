package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqv extends bup implements bve, buu, buv {
    public aqw a;
    public final arb b;

    public aqv(ccm ccmVar, cdo cdoVar, qqq qqqVar, uiq uiqVar, int i, boolean z, int i2, int i3, List list, uiq uiqVar2, aqw aqwVar, bkx bkxVar) {
        this.a = aqwVar;
        arb arbVar = new arb(ccmVar, cdoVar, qqqVar, uiqVar, i, z, i2, i3, list, uiqVar2, this.a, bkxVar, null);
        M(arbVar);
        this.b = arbVar;
        if (this.a != null) {
            return;
        }
        akg.a("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        throw new uer();
    }

    @Override // defpackage.bve
    public final bss a(bst bstVar, bsq bsqVar, long j) {
        return this.b.a(bstVar, bsqVar, j);
    }

    @Override // defpackage.bve
    public final int c(brv brvVar, bru bruVar, int i) {
        return this.b.c(brvVar, bruVar, i);
    }

    @Override // defpackage.buv
    public final void cQ(bry bryVar) {
        aqw aqwVar = this.a;
        if (aqwVar != null) {
            aqwVar.c = aqz.a(aqwVar.c, bryVar, null, 2);
            aqwVar.b.d();
        }
    }

    @Override // defpackage.buu
    public final void cS(bvo bvoVar) {
        this.b.cS(bvoVar);
    }

    @Override // defpackage.bve
    public final int d(brv brvVar, bru bruVar, int i) {
        return this.b.d(brvVar, bruVar, i);
    }

    @Override // defpackage.bij
    public final boolean db() {
        return false;
    }

    @Override // defpackage.bve
    public final int e(brv brvVar, bru bruVar, int i) {
        return this.b.e(brvVar, bruVar, i);
    }

    @Override // defpackage.bve
    public final int f(brv brvVar, bru bruVar, int i) {
        return this.b.f(brvVar, bruVar, i);
    }

    @Override // defpackage.buu
    public final /* synthetic */ void cR() {
    }
}
