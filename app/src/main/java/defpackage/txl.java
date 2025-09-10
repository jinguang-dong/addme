package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class txl {
    public float a;
    public float b;
    public float c;
    public float d;

    public txl() {
    }

    public final txn a() {
        float f = this.d;
        float f2 = this.a * f;
        float f3 = this.b;
        float f4 = this.c;
        float f5 = f2 - (f3 * f4);
        if (f5 > 0.49999994f) {
            return new txn(90.0f, (float) Math.toDegrees(Math.atan2(f4, f) * (-2.0d)), 0.0f);
        }
        if (f5 < -0.49999994f) {
            double dAtan2 = Math.atan2(f4, f);
            return new txn(-90.0f, (float) Math.toDegrees(dAtan2 + dAtan2), 0.0f);
        }
        double dAsin = Math.asin(f5 + f5);
        float f6 = this.d;
        float f7 = this.b;
        float f8 = this.a;
        float f9 = (f6 * f7) + (this.c * f8);
        float f10 = (f8 * f8) + (f7 * f7);
        double dAtan22 = Math.atan2(f9 + f9, 1.0d - (f10 + f10));
        float f11 = this.d;
        float f12 = this.c;
        float f13 = this.a;
        float f14 = (f11 * f12) + (this.b * f13);
        float f15 = (f13 * f13) + (f12 * f12);
        return new txn((float) Math.toDegrees(dAsin), (float) Math.toDegrees(dAtan22), (float) Math.toDegrees(Math.atan2(f14 + f14, 1.0d - (f15 + f15))));
    }

    public final void b() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 1.0f;
    }

    public final String toString() {
        return "[x=" + this.a + ", y=" + this.b + ", z=" + this.c + ", w=" + this.d + "]";
    }

    public txl(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        float f5 = (f * f) + (f2 * f2) + (f3 * f3) + (f4 * f4);
        if (f5 <= 0.0f) {
            b();
            return;
        }
        float fI = thu.i(f5);
        this.a *= fI;
        this.b *= fI;
        this.c *= fI;
        this.d *= fI;
    }
}
