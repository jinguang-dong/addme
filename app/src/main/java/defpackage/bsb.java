package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bsb extends bij implements bve {
    public uiv a;

    public bsb(uiv uivVar) {
        this.a = uivVar;
    }

    @Override // defpackage.bve
    public final bss a(bst bstVar, bsq bsqVar, long j) {
        return (bss) this.a.a(bstVar, bsqVar, new cho(j));
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

    public final String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.a + ')';
    }
}
