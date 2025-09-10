package defpackage;

import com.google.android.apps.camera.coach.YOHg.INRGuObcrHjSQz;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bnm extends bof {
    public final float a;
    public final float b;
    public final float c;
    public final boolean d;
    public final boolean e;
    public final float f;
    public final float g;

    public bnm(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
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
        if (!(obj instanceof bnm)) {
            return false;
        }
        bnm bnmVar = (bnm) obj;
        return Float.compare(this.a, bnmVar.a) == 0 && Float.compare(this.b, bnmVar.b) == 0 && Float.compare(this.c, bnmVar.c) == 0 && this.d == bnmVar.d && this.e == bnmVar.e && Float.compare(this.f, bnmVar.f) == 0 && Float.compare(this.g, bnmVar.g) == 0;
    }

    public final int hashCode() {
        int iFloatToIntBits = (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c);
        float f = this.f;
        return (((((((iFloatToIntBits * 31) + a.o(this.d)) * 31) + a.o(this.e)) * 31) + Float.floatToIntBits(f)) * 31) + Float.floatToIntBits(this.g);
    }

    public final String toString() {
        return "ArcTo(horizontalEllipseRadius=" + this.a + ", verticalEllipseRadius=" + this.b + ", theta=" + this.c + ", isMoreThanHalf=" + this.d + INRGuObcrHjSQz.veP + this.e + ", arcStartX=" + this.f + ", arcStartY=" + this.g + ')';
    }
}
