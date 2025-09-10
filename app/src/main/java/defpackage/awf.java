package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awf extends bij implements bun, bve {
    private Map a;

    @Override // defpackage.bve
    public final bss a(bst bstVar, bsq bsqVar, long j) {
        float fK = ukc.k(((cht) bko.H(this, awa.c)).a, 0.0f);
        bte bteVarR = bsqVar.r(j);
        int i = 0;
        boolean z = this.w && !Float.isNaN(fK) && Float.compare(fK, 0.0f) > 0;
        int iDo = !Float.isNaN(fK) ? bstVar.mo0do(fK) : 0;
        int iMax = z ? Math.max(bteVarR.a, iDo) : bteVarR.a;
        int iMax2 = z ? Math.max(bteVarR.b, iDo) : bteVarR.b;
        if (z) {
            Map linkedHashMap = this.a;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.a = linkedHashMap;
            }
            linkedHashMap.put(awa.b, Integer.valueOf(ukc.n(Math.round((iDo - bteVarR.a) / 2.0f), 0)));
            linkedHashMap.put(awa.a, Integer.valueOf(ukc.n(Math.round((iDo - bteVarR.b) / 2.0f), 0)));
        }
        Map map = this.a;
        if (map == null) {
            map = ufx.a;
        }
        return bstVar.ds(iMax, iMax2, map, new awe(iMax, bteVarR, iMax2, i));
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
