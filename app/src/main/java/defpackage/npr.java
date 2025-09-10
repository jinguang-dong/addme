package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class npr {
    public final pdn a;
    public final peo b;
    public final owf c;
    public final npt d;
    private final pjo e;
    private final owf f;
    private final hbj g;

    public npr(pjo pjoVar, pdn pdnVar, peo peoVar, npt nptVar, owf owfVar, hbj hbjVar) {
        pjoVar.getClass();
        pdnVar.getClass();
        peoVar.getClass();
        owfVar.getClass();
        hbjVar.getClass();
        this.e = pjoVar;
        this.a = pdnVar;
        this.b = peoVar;
        this.d = nptVar;
        this.f = owfVar;
        this.g = hbjVar;
        this.c = hbjVar.p(gza.d) ? owfVar : new owi(Integer.valueOf(pjoVar.g()));
    }

    public final boolean a() {
        pka pkaVarL = this.e.l();
        pkaVarL.getClass();
        return pkaVarL == pka.FRONT;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof npr)) {
            return false;
        }
        npr nprVar = (npr) obj;
        return a.ao(this.e, nprVar.e) && a.ao(this.a, nprVar.a) && a.ao(this.b, nprVar.b) && a.ao(this.d, nprVar.d) && a.ao(this.f, nprVar.f) && a.ao(this.g, nprVar.g);
    }

    public final int hashCode() {
        int iHashCode = (((this.e.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode();
        npt nptVar = this.d;
        return (((((iHashCode * 31) + (nptVar == null ? 0 : nptVar.hashCode())) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "ViewfinderSource(characteristics=" + this.e + ", frameBuffer=" + this.a + ", stream=" + this.b + ", stealerHost=" + this.d + ", dynamicSensorOrientations=" + this.f + ", config=" + this.g + ")";
    }
}
