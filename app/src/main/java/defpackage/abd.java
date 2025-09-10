package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abd {
    public final float a;
    public final float b;
    private final chq c;

    public abd(float f, chq chqVar) {
        this.a = f;
        this.c = chqVar;
        float fA = chqVar.a();
        float f2 = abe.a;
        this.b = fA * 386.0878f * 160.0f * 0.84f;
    }

    public final double a(float f) {
        int i = aag.a;
        return Math.log((Math.abs(f) * 0.35f) / (this.a * this.b));
    }

    public final abc b(float f) {
        double dA = a(f);
        double d = abe.a;
        double d2 = (-1.0d) + d;
        return new abc(f, (float) (this.a * this.b * Math.exp((d / d2) * dA)), (long) (Math.exp(dA / d2) * 1000.0d));
    }
}
