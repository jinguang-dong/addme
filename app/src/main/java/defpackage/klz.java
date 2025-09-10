package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class klz {
    public final Rect a;
    public final int b;
    public final int c;
    public final PointF d;
    public final PointF e;
    public final PointF f;
    public final PointF g;
    private final int h;
    private final boolean i;
    private final PointF j;
    private final PointF k;

    public klz() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof klz) {
            klz klzVar = (klz) obj;
            if (this.a.equals(klzVar.a) && this.h == klzVar.h && this.b == klzVar.b && this.c == klzVar.c && this.i == klzVar.i && this.j.equals(klzVar.j) && this.k.equals(klzVar.k) && this.d.equals(klzVar.d) && this.e.equals(klzVar.e) && this.f.equals(klzVar.f) && this.g.equals(klzVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        return this.g.hashCode() ^ (((((((((((((((((((iHashCode * 1000003) ^ this.h) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003);
    }

    public final String toString() {
        PointF pointF = this.g;
        PointF pointF2 = this.f;
        PointF pointF3 = this.e;
        PointF pointF4 = this.d;
        PointF pointF5 = this.k;
        PointF pointF6 = this.j;
        return "{" + String.valueOf(this.a) + ", " + this.h + ", " + this.b + ", " + this.c + ", " + this.i + ", " + String.valueOf(pointF6) + ", " + String.valueOf(pointF5) + ", " + String.valueOf(pointF4) + ", " + String.valueOf(pointF3) + ", " + String.valueOf(pointF2) + ", " + String.valueOf(pointF) + "}";
    }

    public klz(Rect rect, int i, int i2, int i3, boolean z, PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4, PointF pointF5, PointF pointF6) {
        this.a = rect;
        this.h = i;
        this.b = i2;
        this.c = i3;
        this.i = z;
        this.j = pointF;
        this.k = pointF2;
        this.d = pointF3;
        this.e = pointF4;
        this.f = pointF5;
        this.g = pointF6;
    }
}
