package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hwz {
    public final float a;
    public final float b;
    public final float c;

    public hwz() {
        throw null;
    }

    public static hwz a(hbj hbjVar, nkw nkwVar, boolean z, boolean z2) {
        float fFloatValue = ((Float) hbjVar.e(hac.B).get()).floatValue();
        float fMax = Math.max(((Float) hbjVar.e(hac.C).get()).floatValue(), fFloatValue);
        if (z) {
            float fFloatValue2 = ((Float) hbjVar.e(gzs.ag).get()).floatValue();
            float fMax2 = Math.max(((Float) hbjVar.e(gzs.ah).get()).floatValue(), fFloatValue2);
            fFloatValue = Math.min(fFloatValue, fFloatValue2);
            fMax = Math.min(fMax, fMax2);
        }
        if (z2) {
            fFloatValue = ((Float) hbjVar.e(hac.I).get()).floatValue();
            fMax = ((Float) hbjVar.e(hac.J).get()).floatValue();
        }
        float fFloatValue3 = ((Float) hbjVar.e(hac.D).get()).floatValue();
        float fMax3 = Math.max(((Float) hbjVar.e(hac.E).get()).floatValue(), fFloatValue3);
        float fFloatValue4 = ((Float) hbjVar.e(haw.s).get()).floatValue();
        float fMax4 = Math.max(((Float) hbjVar.e(haw.t).get()).floatValue(), fFloatValue4);
        float fFloatValue5 = ((Float) hbjVar.e(hax.h).get()).floatValue();
        float fMax5 = Math.max(((Float) hbjVar.e(hax.i).get()).floatValue(), fFloatValue5);
        float fMin = Math.min(((Float) hbjVar.e(hac.F).get()).floatValue(), fMax);
        nkw nkwVar2 = nkw.UNINITIALIZED;
        int iOrdinal = nkwVar.ordinal();
        if (iOrdinal == 2) {
            fFloatValue = fFloatValue5;
            fMax = fMax5;
        } else if (iOrdinal == 6) {
            fFloatValue = fFloatValue3;
            fMax = fMax3;
        } else if (iOrdinal == 11) {
            fFloatValue = fFloatValue4;
            fMax = fMax4;
        }
        return new hwz(fFloatValue, fMax, fMin);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hwz) {
            hwz hwzVar = (hwz) obj;
            if (Float.floatToIntBits(this.a) == Float.floatToIntBits(hwzVar.a)) {
                if (Float.floatToIntBits(this.b) == Float.floatToIntBits(hwzVar.b)) {
                    if (Float.floatToIntBits(this.c) == Float.floatToIntBits(hwzVar.c)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iFloatToIntBits = ((Float.floatToIntBits(this.a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b);
        return Float.floatToIntBits(this.c) ^ (iFloatToIntBits * 1000003);
    }

    public final String toString() {
        return "{" + this.a + ", " + this.b + ", " + this.c + "}";
    }

    public hwz(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }
}
