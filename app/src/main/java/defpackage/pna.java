package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pna implements pmw {
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public volatile pmw b = null;

    private final pmv d(String str, pmq[] pmqVarArr, pmv pmvVar) {
        pmv pmvVar2 = (pmv) this.a.putIfAbsent(str, pmvVar);
        if (pmvVar2 == null) {
            return pmvVar;
        }
        qpt.az(str, (pmq[]) pmvVar2.b, pmqVarArr);
        return pmvVar2;
    }

    @Override // defpackage.pmw
    public final void a() {
        throw null;
    }

    public final pmv b(String str, pmq... pmqVarArr) {
        pmv pmvVar = (pmv) this.a.get(str);
        if (pmvVar == null) {
            return d(str, pmqVarArr, new pmv(str, pmqVarArr, this, pmo.c(pmqVarArr, new pmt(1))));
        }
        qpt.az(str, (pmq[]) pmvVar.b, pmqVarArr);
        return pmvVar;
    }

    public final pmv c(String str, pmq... pmqVarArr) {
        pmv pmvVar = (pmv) this.a.get(str);
        if (pmvVar == null) {
            return d(str, pmqVarArr, new pmv(str, pmqVarArr, this, pmo.c(pmqVarArr, new pmt(0))));
        }
        qpt.az(str, (pmq[]) pmvVar.b, pmqVarArr);
        return pmvVar;
    }
}
