package defpackage;

import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lau implements pdk {
    public final pdk a;
    public final peo b;
    public final peo c;
    public final peo d;
    public final int e;
    private final Map f;
    private final peo g;
    private final peo h;
    private final peo i;
    private final peo j;
    private final peo k;
    private final peo l;
    private final peo m;
    private final peo n;
    private final peo o;
    private final peo p;
    private final peo q;

    public lau(pdk pdkVar, Map map, int i) {
        this.a = pdkVar;
        this.f = map;
        this.g = (peo) map.get(lcz.a);
        this.h = (peo) map.get(lcz.RAW_WIDE);
        this.i = (peo) map.get(lcz.RAW_WIDE_RM);
        this.j = (peo) map.get(lcz.RAW_TELE);
        this.k = (peo) map.get(lcz.RAW_TELE_RM);
        this.l = (peo) map.get(lcz.RAW_ULTRAWIDE);
        this.m = (peo) map.get(lcz.RAW_ULTRAWIDE_RM);
        this.n = (peo) map.get(lcz.PD);
        this.o = (peo) map.get(lcz.l);
        this.p = (peo) map.get(lcz.PD_TELE);
        this.b = (peo) map.get(lcz.DEPTH);
        this.q = (peo) map.get(lcz.YUV_ANALYSIS);
        this.c = (peo) map.get(lcz.YUV_TELE_ZOOM);
        this.d = (peo) map.get(lcz.YUV_TELE_ZOOM_RM);
        this.e = i;
    }

    @Override // defpackage.pdk
    public final pdk a() {
        return this.a.a();
    }

    @Override // defpackage.pdk
    public final pdo b() {
        return this.a.b();
    }

    @Override // defpackage.pdk
    public final pdv c() {
        return this.a.c();
    }

    @Override // defpackage.paq, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.pdk
    public final poe d() {
        return this.a.d();
    }

    @Override // defpackage.pdk
    public final poj e(peo peoVar) {
        if (peoVar == null) {
            return null;
        }
        try {
            return this.a.e(peoVar);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // defpackage.pdk
    public final boolean f() {
        return this.a.f();
    }

    @Override // defpackage.pdk
    public final boolean g() {
        return this.a.g();
    }

    @Override // defpackage.pdk
    public final boolean h() {
        return this.a.h();
    }

    @Override // defpackage.pdk
    public final boolean i() {
        return this.a.i();
    }

    @Override // defpackage.pdk
    public final void j(ojl ojlVar) {
        this.a.j(ojlVar);
    }

    public final lau k() {
        pdk pdkVarA = this.a.a();
        if (pdkVarA != null) {
            return new lau(pdkVarA, this.f, this.e);
        }
        return null;
    }

    public final peo l() {
        Set setD = this.a.c().d();
        peo peoVar = this.g;
        if (!setD.contains(peoVar)) {
            peoVar = this.h;
            if (!setD.contains(peoVar)) {
                peoVar = this.i;
                if (!setD.contains(peoVar)) {
                    peoVar = this.j;
                    if (!setD.contains(peoVar)) {
                        peoVar = this.k;
                        if (!setD.contains(peoVar)) {
                            peoVar = this.l;
                            if (!setD.contains(peoVar)) {
                                peoVar = this.m;
                                if (!setD.contains(peoVar)) {
                                    peoVar = null;
                                }
                            }
                        }
                    }
                }
            }
        }
        peoVar.getClass();
        return peoVar;
    }

    public final peo m() {
        peo peoVar = this.h;
        if (peoVar == null && this.i == null) {
            return null;
        }
        peo peoVar2 = this.j;
        if (peoVar2 == null && this.l == null) {
            return null;
        }
        Set setD = this.a.c().d();
        if (!setD.contains(peoVar) && !setD.contains(this.i)) {
            return null;
        }
        if (setD.contains(peoVar2)) {
            return peoVar2;
        }
        peo peoVar3 = this.l;
        if (setD.contains(peoVar3)) {
            return peoVar3;
        }
        return null;
    }

    public final poj n(lcz lczVar) {
        return e((peo) this.f.get(lczVar));
    }

    public final poj o() {
        poj pojVarE = e(this.n);
        if (pojVarE != null) {
            return pojVarE;
        }
        poj pojVarE2 = e(this.o);
        return pojVarE2 != null ? pojVarE2 : e(this.p);
    }

    public final poj p() {
        return e(l());
    }

    public final poj q() {
        return e(m());
    }

    public final poj r() {
        return e(this.q);
    }

    public final poj s() {
        poj pojVarE = e(this.q);
        if (pojVarE != null) {
            return pojVarE;
        }
        poj pojVarN = n(lcz.VIEWFINDER);
        if (pojVarN == null || pojVarN.a() != 35) {
            return null;
        }
        return pojVarN;
    }

    public final boolean t() {
        return m() != null;
    }
}
