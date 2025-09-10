package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nni {
    public double a;
    public double b;
    public double c;

    public static double a(nni nniVar, nni nniVar2) {
        return (nniVar.a * nniVar2.a) + (nniVar.b * nniVar2.b) + (nniVar.c * nniVar2.c);
    }

    public static void c(nni nniVar, nni nniVar2, nni nniVar3) {
        double d = nniVar.b;
        double d2 = nniVar2.c;
        double d3 = nniVar.c;
        double d4 = nniVar2.b;
        double d5 = nniVar2.a;
        double d6 = nniVar.a;
        nniVar3.g((d * d2) - (d3 * d4), (d3 * d5) - (d2 * d6), (d6 * d4) - (d * d5));
    }

    public final double b() {
        double d = this.a;
        double d2 = this.b;
        double d3 = this.c;
        return Math.sqrt((d * d) + (d2 * d2) + (d3 * d3));
    }

    public final void d() {
        double dB = b();
        if (dB != 0.0d) {
            e(1.0d / dB);
        }
    }

    public final void e(double d) {
        this.a *= d;
        this.b *= d;
        this.c *= d;
    }

    public final void f(nni nniVar) {
        this.a = nniVar.a;
        this.b = nniVar.b;
        this.c = nniVar.c;
    }

    public final void g(double d, double d2, double d3) {
        this.a = d;
        this.b = d2;
        this.c = d3;
    }

    public final void h() {
        this.c = 0.0d;
        this.b = 0.0d;
        this.a = 0.0d;
    }
}
