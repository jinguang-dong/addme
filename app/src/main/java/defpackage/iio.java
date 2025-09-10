package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iio {
    public double a;
    public double b;
    public boolean c;

    public iio() {
        this.a = Double.NaN;
        this.b = Double.NaN;
        this.c = false;
    }

    public final double a(double d) {
        if (!this.c) {
            this.b = d;
            this.a = d;
            this.c = true;
            return d;
        }
        double d2 = d - this.b;
        this.b = d;
        if (d2 > 180.0d) {
            d2 -= 360.0d;
        }
        if (d2 < -180.0d) {
            d2 += 360.0d;
        }
        double d3 = this.a + d2;
        this.a = d3;
        return d3;
    }

    public iio(byte[] bArr) {
        this.a = Double.NaN;
        this.b = Double.NaN;
    }
}
