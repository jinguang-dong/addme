package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jho {
    public final owq a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    private final hbj e;

    public jho(hbj hbjVar, luj lujVar) {
        boolean zP = hbjVar.p(han.c);
        this.b = zP;
        this.e = hbjVar;
        if (!zP) {
            this.a = owp.a(Integer.valueOf(lts.DEFAULT.c));
            this.c = false;
            this.d = false;
            return;
        }
        boolean zP2 = hbjVar.p(han.e);
        owq owqVarA = lujVar.a(luf.aS);
        this.a = owqVarA;
        this.c = hbjVar.p(han.d);
        this.d = hbjVar.p(han.l);
        if (zP2) {
            owqVarA.a(Integer.valueOf(lts.HI_RES.c));
        }
    }

    public final void a() {
        owq owqVar = this.a;
        Integer num = (Integer) owqVar.dL();
        Integer numValueOf = Integer.valueOf(lts.DEFAULT.c);
        if (num.equals(numValueOf)) {
            owqVar.a(Integer.valueOf(lts.HI_RES.c));
        } else {
            owqVar.a(numValueOf);
        }
    }

    public final boolean b(nkw nkwVar, pka pkaVar, lts ltsVar) {
        return c(nkwVar) && pkaVar.equals(pka.BACK) && ltsVar == lts.HI_RES;
    }

    public final boolean c(nkw nkwVar) {
        lcz lczVar = lcz.a;
        nkw nkwVar2 = nkw.UNINITIALIZED;
        int iOrdinal = nkwVar.ordinal();
        if (iOrdinal == 1) {
            return this.b;
        }
        if (iOrdinal != 10) {
            return false;
        }
        return this.c;
    }

    public final boolean d(boolean z, nkw nkwVar) {
        nkw nkwVar2 = nkw.PORTRAIT;
        if (nkwVar == nkwVar2) {
            gzi gziVar = han.a;
        }
        return z && (nkwVar != nkwVar2 && this.e.p(han.h));
    }
}
