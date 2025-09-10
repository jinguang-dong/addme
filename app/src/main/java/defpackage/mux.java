package defpackage;

import android.graphics.RectF;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mux {
    public final muz a;
    public final int b;
    public final int c;
    public final RectF d;
    public final String e;
    public final String f;
    public final float g;
    public final float h;
    public final float i;
    public final Optional j;
    public final int k;

    public mux() {
        throw null;
    }

    public static muw a() {
        muw muwVar = new muw((byte[]) null);
        muwVar.j(muz.UNKNOWN);
        muwVar.c(0);
        muwVar.h(0);
        muwVar.a = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        muwVar.d("");
        muwVar.b(1);
        muwVar.e("");
        muwVar.b = Optional.empty();
        muwVar.f(0.0f);
        muwVar.g(0.0f);
        muwVar.i(0.0f);
        return muwVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mux) {
            mux muxVar = (mux) obj;
            if (this.a.equals(muxVar.a) && this.b == muxVar.b && this.c == muxVar.c && this.d.equals(muxVar.d) && this.e.equals(muxVar.e) && this.f.equals(muxVar.f)) {
                int i = this.k;
                int i2 = muxVar.k;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    if (Float.floatToIntBits(this.g) == Float.floatToIntBits(muxVar.g)) {
                        if (Float.floatToIntBits(this.h) == Float.floatToIntBits(muxVar.h)) {
                            if (Float.floatToIntBits(this.i) == Float.floatToIntBits(muxVar.i) && this.j.equals(muxVar.j)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
        int i = this.k;
        a.aF(i);
        int iFloatToIntBits = (((((((iHashCode * 1000003) ^ i) * 1000003) ^ Float.floatToIntBits(this.g)) * 1000003) ^ Float.floatToIntBits(this.h)) * 1000003) ^ Float.floatToIntBits(this.i);
        return this.j.hashCode() ^ (iFloatToIntBits * 1000003);
    }

    public final String toString() {
        int i = this.k;
        RectF rectF = this.d;
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(rectF);
        String str = i != 1 ? i != 2 ? i != 3 ? "null" : "ANNOUNCED" : "ANNOUNCING" : "NEW";
        String str2 = this.f;
        String str3 = this.e;
        int i2 = this.c;
        return "{" + strValueOf + ", " + this.b + ", " + i2 + ", " + strValueOf2 + ", " + str3 + ", " + str2 + ", " + str + ", " + this.g + ", " + this.h + ", " + this.i + ", " + String.valueOf(this.j) + "}";
    }

    public mux(muz muzVar, int i, int i2, RectF rectF, String str, String str2, int i3, float f, float f2, float f3, Optional optional) {
        this.a = muzVar;
        this.b = i;
        this.c = i2;
        this.d = rectF;
        this.e = str;
        this.f = str2;
        this.k = i3;
        this.g = f;
        this.h = f2;
        this.i = f3;
        this.j = optional;
    }
}
