package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agd extends bup implements bun, bwm {
    private ajd a;
    private aii b;
    private boolean c;
    private afy d;
    private ajc e;
    private buo f;
    private afz g;
    private boolean h;
    private apg i;
    private ocq j;

    public agd(ajd ajdVar, aii aiiVar, boolean z, apg apgVar, ocq ocqVar, afy afyVar) {
        this.a = ajdVar;
        this.b = aiiVar;
        this.c = z;
        this.i = apgVar;
        this.j = ocqVar;
        this.d = afyVar;
    }

    private final void e() {
        buo buoVar = this.f;
        if (buoVar != null) {
            if (buoVar.B().w) {
                return;
            }
            M(buoVar);
            return;
        }
        afy afyVar = this.d;
        if (afyVar != null) {
            buo buoVarD = afyVar.d();
            if (buoVarD.B().w) {
                return;
            }
            M(buoVarD);
            this.f = buoVarD;
        }
    }

    public final boolean c() {
        cib cibVarF = cib.a;
        if (this.w) {
            cibVarF = bko.F(this);
        }
        return byi.aO(cibVarF, this.b);
    }

    @Override // defpackage.bij
    public final void cO() {
        boolean zC = c();
        if (this.h != zC) {
            this.h = zC;
            d(this.a, this.b, this.d, this.c, this.i, this.j);
        }
    }

    @Override // defpackage.bij
    public final void cW() {
        this.h = c();
        e();
        if (this.e == null) {
            ajc ajcVar = new ajc(this.a, this.d, this.i, this.b, this.c, this.h, this.j);
            M(ajcVar);
            this.e = ajcVar;
        }
    }

    @Override // defpackage.bij
    public final void cZ() {
        buo buoVar = this.f;
        if (buoVar != null) {
            L(buoVar);
        }
    }

    public final void d(ajd ajdVar, aii aiiVar, afy afyVar, boolean z, apg apgVar, ocq ocqVar) {
        this.a = ajdVar;
        this.b = aiiVar;
        if (!a.ao(this.d, afyVar)) {
            this.d = afyVar;
            buo buoVar = this.f;
            if (buoVar != null) {
                L(buoVar);
            }
            this.f = null;
            e();
        }
        this.c = z;
        this.i = apgVar;
        this.j = ocqVar;
        boolean zC = c();
        this.h = zC;
        ajc ajcVar = this.e;
        if (ajcVar != null) {
            ajcVar.A(ajdVar, aiiVar, this.d, z, zC, apgVar, ocqVar);
        }
    }

    @Override // defpackage.bij
    public final boolean db() {
        return false;
    }

    @Override // defpackage.bwm
    public final void k() {
        afz afzVar = (afz) bko.H(this, aga.a);
        if (a.ao(afzVar, this.g)) {
            return;
        }
        this.g = afzVar;
        buo buoVar = this.f;
        if (buoVar != null) {
            L(buoVar);
        }
        this.f = null;
        e();
        ajc ajcVar = this.e;
        if (ajcVar != null) {
            ajcVar.A(this.a, this.b, this.d, this.c, this.h, this.i, this.j);
        }
    }
}
