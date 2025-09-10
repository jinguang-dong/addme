package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hgn {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final Rect e;
    public final float f;
    public final boolean g;
    public final int h;
    public final String i;
    private final float j;

    public hgn() {
        throw null;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof hgn) {
            hgn hgnVar = (hgn) obj;
            if (this.a == hgnVar.a && this.b == hgnVar.b && this.c == hgnVar.c && this.d == hgnVar.d && this.e.equals(hgnVar.e)) {
                if (Float.floatToIntBits(this.j) == Float.floatToIntBits(hgnVar.j)) {
                    if (Float.floatToIntBits(this.f) == Float.floatToIntBits(hgnVar.f) && this.g == hgnVar.g && this.h == hgnVar.h && ((str = this.i) != null ? str.equals(hgnVar.i) : hgnVar.i == null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.d;
        long j2 = this.a;
        Rect rect = this.e;
        long j3 = this.c;
        long j4 = this.b;
        int iHashCode = ((((((((int) (j ^ (j >>> 32))) ^ ((((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003)) * 1000003) ^ rect.hashCode()) * 1000003) ^ Float.floatToIntBits(this.j)) * 1000003) ^ Float.floatToIntBits(this.f);
        String str = this.i;
        return ((this.h ^ (((iHashCode * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003)) * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "{" + this.a + ", " + this.b + ", " + this.c + ", " + this.d + ", " + String.valueOf(this.e) + ", " + this.j + ", " + this.f + ", " + this.g + ", " + this.h + ", " + this.i + "}";
    }

    public hgn(long j, long j2, long j3, long j4, Rect rect, float f, float f2, boolean z, int i, String str) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = rect;
        this.j = f;
        this.f = f2;
        this.g = z;
        this.h = i;
        this.i = str;
    }
}
