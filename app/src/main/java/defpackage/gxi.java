package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxi {
    public final float a;
    public final float b;
    public final float c;

    public gxi() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxi)) {
            return false;
        }
        gxi gxiVar = (gxi) obj;
        return Float.compare(this.a, gxiVar.a) == 0 && Float.compare(this.b, gxiVar.b) == 0 && Float.compare(this.c, gxiVar.c) == 0;
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c);
    }

    public final String toString() {
        return "ZoomLimit(minZoom=" + this.a + ", maxZoom=" + this.b + ", normalizationFactor=" + this.c + ")";
    }

    public gxi(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    public /* synthetic */ gxi(byte[] bArr) {
        this(1.0f, 1.0f, 1.0f);
    }
}
