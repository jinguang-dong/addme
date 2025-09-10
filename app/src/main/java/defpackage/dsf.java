package defpackage;

import com.google.googlex.gcam.creativecamera.portraitmode.axeo.pAAtrB;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dsf {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public dsf(float f, float f2, float f3, float f4, float f5) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        if (f4 < 0.0f || f4 > 1.0f) {
            throw new IllegalArgumentException("transformationZoneEnterFraction must be between 0 and 1, inclusive");
        }
        if (f5 < 0.0f || f5 > 1.0f) {
            throw new IllegalArgumentException("transformationZoneExitFraction must be between 0 and 1, inclusive");
        }
        if (f4 >= f5) {
            throw new IllegalArgumentException(pAAtrB.MpTzE);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!a.ao(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        dsf dsfVar = (dsf) obj;
        return this.a == dsfVar.a && this.b == dsfVar.b && this.c == dsfVar.c && this.d == dsfVar.d && this.e == dsfVar.e;
    }

    public final int hashCode() {
        return (((((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e);
    }

    public final String toString() {
        return "TransformationVariableSpec(topValue=" + this.a + ", targetValue=" + this.b + ", bottomValue=" + this.c + ", transformationZoneEnterFraction=" + this.d + ", transformationZoneExitFraction=" + this.e + ')';
    }

    public /* synthetic */ dsf(float f) {
        this(f, 1.0f, f, 0.0f, 1.0f);
    }
}
