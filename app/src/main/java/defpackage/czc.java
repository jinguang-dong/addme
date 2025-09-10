package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class czc implements cyu {
    public final float a;
    public final float b;

    public czc(float f, float f2) {
        boolean z = false;
        if (f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f) {
            z = true;
        }
        coi.w(z, "Invalid latitude or longitude");
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            czc czcVar = (czc) obj;
            if (this.a == czcVar.a && this.b == czcVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.a) + 527) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "xyz: latitude=" + this.a + ", longitude=" + this.b;
    }
}
