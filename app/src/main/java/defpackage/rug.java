package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rug {
    public float a;
    public float b;
    public float c;

    public rug() {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
    }

    public static float a(rug rugVar, rug rugVar2) {
        return (rugVar.a * rugVar2.a) + (rugVar.b * rugVar2.b) + (rugVar.c * rugVar2.c);
    }

    public static rug b() {
        rug rugVar = new rug();
        rugVar.f(-1.0f);
        return rugVar;
    }

    public final rug c() {
        rug rugVar = new rug(this);
        float fA = a(this, this);
        if (qsz.f(fA, 0.0f)) {
            rugVar.f(0.0f);
            return rugVar;
        }
        if (fA != 1.0f) {
            rugVar.e(d((float) (1.0d / Math.sqrt(fA))));
        }
        return rugVar;
    }

    public final rug d(float f) {
        return new rug(this.a * f, this.b * f, this.c * f);
    }

    public final void e(rug rugVar) {
        this.a = rugVar.a;
        this.b = rugVar.b;
        this.c = rugVar.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rug)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        rug rugVar = (rug) obj;
        if (rugVar == null) {
            throw new NullPointerException("Parameter \"rhs\" was null.");
        }
        return qsz.f(this.c, rugVar.c) & qsz.f(this.a, rugVar.a) & qsz.f(this.b, rugVar.b);
    }

    public final void f(float f) {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = f;
    }

    public final int hashCode() {
        return ((((Float.floatToIntBits(this.a) + 31) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c);
    }

    public final String toString() {
        return "[x=" + this.a + ", y=" + this.b + ", z=" + this.c + "]";
    }

    public rug(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public rug(rug rugVar) {
        e(rugVar);
    }
}
