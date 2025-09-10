package defpackage;

import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hru {
    public final RectF a;
    public final RectF b;
    public final float c;
    private final float d;

    public hru() {
        throw null;
    }

    public static hru a(ttn ttnVar) {
        ttl ttlVar = ttnVar.c;
        if (ttlVar == null) {
            ttlVar = ttl.a;
        }
        float f = ttlVar.e;
        float f2 = ttlVar.c;
        float f3 = f - f2;
        float f4 = ttlVar.f;
        float f5 = ttlVar.d;
        float f6 = f4 - f5;
        RectF rectF = new RectF(f2, f5, f, f4);
        float f7 = ttlVar.e + ttlVar.c;
        float f8 = (ttlVar.f + ttlVar.d) / 2.0f;
        float f9 = f7 / 2.0f;
        float fMax = (Math.max(f3, f6) * 8.0f) / 2.0f;
        return new hru(rectF, new RectF(f9 - fMax, f8 - fMax, f9 + fMax, f8 + fMax), f3 * f6, fMax * fMax * 4.0f);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hru) {
            hru hruVar = (hru) obj;
            if (this.a.equals(hruVar.a) && this.b.equals(hruVar.b)) {
                if (Float.floatToIntBits(this.c) == Float.floatToIntBits(hruVar.c)) {
                    if (Float.floatToIntBits(this.d) == Float.floatToIntBits(hruVar.d)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ Float.floatToIntBits(this.c);
        return Float.floatToIntBits(this.d) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        RectF rectF = this.b;
        return "{" + this.a.toString() + ", " + rectF.toString() + ", " + this.c + ", " + this.d + "}";
    }

    public hru(RectF rectF, RectF rectF2, float f, float f2) {
        this.a = rectF;
        this.b = rectF2;
        this.c = f;
        this.d = f2;
    }
}
