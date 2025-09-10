package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amn extends bij implements bve {
    public uiu a;
    public int b = 3;

    public amn(uiu uiuVar) {
        this.a = uiuVar;
    }

    @Override // defpackage.bve
    public final bss a(final bst bstVar, bsq bsqVar, long j) {
        int i = this.b;
        final bte bteVarR = bsqVar.r(chp.d(i != 1 ? 0 : cho.d(j), cho.b(j), i == 2 ? cho.c(j) : 0, cho.a(j)));
        final int iP = ukc.p(bteVarR.a, cho.d(j), cho.b(j));
        final int iP2 = ukc.p(bteVarR.b, cho.c(j), cho.a(j));
        return bstVar.ds(iP, iP2, ufx.a, new uiq() { // from class: amm
            @Override // defpackage.uiq
            public final Object a(Object obj) {
                uiu uiuVar = this.a.a;
                bte bteVar = bteVarR;
                ((btd) obj).r(bteVar, ((chy) uiuVar.a(new cia(((iP2 - bteVar.b) & 4294967295L) | ((iP - bteVar.a) << 32)), bstVar.m())).a);
                return ufg.a;
            }
        });
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
}
