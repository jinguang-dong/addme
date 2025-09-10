package defpackage;

import com.google.android.build.data.JKx.wzgaYJqO;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mmw {
    public final float a;
    public final float b;

    public mmw(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mmw)) {
            return false;
        }
        mmw mmwVar = (mmw) obj;
        return Float.compare(this.a, mmwVar.a) == 0 && Float.compare(this.b, mmwVar.b) == 0;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "SpringAttributes(dampingRatio=" + this.a + wzgaYJqO.LSIrOoTPifZOJq + this.b + ")";
    }
}
