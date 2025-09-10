package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bkg {
    public static final bkg a = new bkg(0.0f, 0.0f, 0.0f, 0.0f);
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public bkg(float f, float f2, float f3, float f4) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    public final long a() {
        float f = this.d;
        float f2 = this.b;
        long jFloatToRawIntBits = Float.floatToRawIntBits(f2 + ((f - f2) / 2.0f));
        float f3 = this.e;
        float f4 = this.c;
        return (jFloatToRawIntBits << 32) | (Float.floatToRawIntBits(f4 + ((f3 - f4) / 2.0f)) & 4294967295L);
    }

    public final long b() {
        return (Float.floatToRawIntBits(this.d - this.b) << 32) | (Float.floatToRawIntBits(this.e - this.c) & 4294967295L);
    }

    public final bkg c(bkg bkgVar) {
        float f = this.e;
        float f2 = bkgVar.e;
        float f3 = this.d;
        float f4 = bkgVar.d;
        return new bkg(Math.max(this.b, bkgVar.b), Math.max(this.c, bkgVar.c), Math.min(f3, f4), Math.min(f, f2));
    }

    public final bkg d(float f, float f2) {
        float f3 = this.e;
        float f4 = this.d;
        return new bkg(this.b + f, this.c + f2, f4 + f, f3 + f2);
    }

    public final bkg e(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new bkg(this.b + Float.intBitsToFloat(i), this.c + Float.intBitsToFloat(i2), this.d + Float.intBitsToFloat(i), this.e + Float.intBitsToFloat(i2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bkg)) {
            return false;
        }
        bkg bkgVar = (bkg) obj;
        return Float.compare(this.b, bkgVar.b) == 0 && Float.compare(this.c, bkgVar.c) == 0 && Float.compare(this.d, bkgVar.d) == 0 && Float.compare(this.e, bkgVar.e) == 0;
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.b) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + acv.p(this.b) + ", " + acv.p(this.c) + ", " + acv.p(this.d) + ", " + acv.p(this.e) + ')';
    }
}
