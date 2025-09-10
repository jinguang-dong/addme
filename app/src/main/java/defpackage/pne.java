package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pne extends pnf {
    public double b;
    public double c;
    public double d;
    public double e;
    public double[] f = new double[4];
    public double a = 1.0d;

    public pne(double d) {
        this.b = d;
        this.c = d;
        this.d = d;
        this.e = d;
    }

    @Override // defpackage.pnf
    public final pnf a() {
        double d = this.e;
        pne pneVar = new pne(d);
        pneVar.a = this.a;
        pneVar.b = this.b;
        pneVar.c = this.c;
        pneVar.d = this.d;
        pneVar.e = d;
        pneVar.f = this.f;
        return pneVar;
    }
}
