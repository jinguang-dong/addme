package defpackage;

import androidx.compose.foundation.text.modifiers.Yk.LmJPKwPBa;
import com.google.android.gms.common.internal.oQFY.clFzVRcygwbq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bnv extends bof {
    public final float a;
    public final float b;
    public final float c;
    public final boolean d;
    public final boolean e;
    public final float f;
    public final float g;

    public bnv(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        super(false, false, 3);
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = z;
        this.e = z2;
        this.f = f4;
        this.g = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bnv)) {
            return false;
        }
        bnv bnvVar = (bnv) obj;
        return Float.compare(this.a, bnvVar.a) == 0 && Float.compare(this.b, bnvVar.b) == 0 && Float.compare(this.c, bnvVar.c) == 0 && this.d == bnvVar.d && this.e == bnvVar.e && Float.compare(this.f, bnvVar.f) == 0 && Float.compare(this.g, bnvVar.g) == 0;
    }

    public final int hashCode() {
        int iFloatToIntBits = (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c);
        float f = this.f;
        return (((((((iFloatToIntBits * 31) + a.o(this.d)) * 31) + a.o(this.e)) * 31) + Float.floatToIntBits(f)) * 31) + Float.floatToIntBits(this.g);
    }

    public final String toString() {
        return "RelativeArcTo(horizontalEllipseRadius=" + this.a + LmJPKwPBa.LXeprqG + this.b + clFzVRcygwbq.raCF + this.c + ", isMoreThanHalf=" + this.d + ", isPositiveArc=" + this.e + ", arcStartDx=" + this.f + ", arcStartDy=" + this.g + ')';
    }
}
