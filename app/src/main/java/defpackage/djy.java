package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class djy extends djd {
    private final uiu b;
    private float c;
    private float e;
    private djm f;

    public djy(djk djkVar, uiu uiuVar) {
        super(djkVar);
        this.b = uiuVar;
    }

    @Override // defpackage.djd, defpackage.djk
    public final float a(float f, float f2, long j) {
        float f3 = this.c;
        float f4 = this.e;
        this.f = new djm(f2, f3, f4, j, f3 - (f4 / 2.0f), f);
        return ((djd) this).a.k(f, f2, j);
    }

    @Override // defpackage.djd, defpackage.djk
    public final dkd c(float f, float f2) {
        this.e = f2;
        this.c = f;
        return ((djd) this).a.p(f, f2);
    }

    @Override // defpackage.djd, defpackage.djk
    public final void d(bmv bmvVar) {
        djm djmVar = this.f;
        if (djmVar == null) {
            ujp.c("outerLayoutInfo");
            djmVar = null;
        }
        this.b.a(bmvVar, djmVar);
        ((djd) this).a.d(bmvVar);
    }
}
