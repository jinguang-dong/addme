package defpackage;

import android.graphics.RadialGradient;
import android.graphics.Shader;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class blj extends bln {
    private final List a;
    private final List b;
    private final long c;
    private final float d;
    private final int e = 0;

    public blj(List list, List list2, long j, float f) {
        this.a = list;
        this.b = list2;
        this.c = j;
        this.d = f;
    }

    @Override // defpackage.bln
    public final Shader b(long j) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        long j2 = this.c;
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            long jQ = bko.q(j);
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (jQ >> 32));
            fIntBitsToFloat = Float.intBitsToFloat((int) (jQ & 4294967295L));
        } else {
            int i = (int) (j2 >> 32);
            if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
                i = (int) (j >> 32);
            }
            float fIntBitsToFloat3 = Float.intBitsToFloat(i);
            int i2 = (int) (j2 & 4294967295L);
            if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
                i2 = (int) (j & 4294967295L);
            }
            fIntBitsToFloat = Float.intBitsToFloat(i2);
            fIntBitsToFloat2 = fIntBitsToFloat3;
        }
        List list = this.a;
        List list2 = this.b;
        long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat2) << 32;
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L;
        float fA = this.d;
        if (fA == Float.POSITIVE_INFINITY) {
            fA = bki.a(j) / 2.0f;
        }
        float f = fA;
        long j3 = jFloatToRawIntBits | jFloatToRawIntBits2;
        blb.o(list, list2);
        return new RadialGradient(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), f, blb.p(list), ske.bS(list2), blb.n());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blj)) {
            return false;
        }
        blj bljVar = (blj) obj;
        if (!a.ao(this.a, bljVar.a) || !a.ao(this.b, bljVar.b) || !a.q(this.c, bljVar.c) || this.d != bljVar.d) {
            return false;
        }
        int i = bljVar.e;
        return a.p(0, 0);
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + a.r(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31;
    }

    public final String toString() {
        String str;
        long j = this.c;
        String str2 = "";
        if ((9223372034707292159L & j) != 9205357640488583168L) {
            str = "center=" + ((Object) bkf.c(j)) + ", ";
        } else {
            str = "";
        }
        float f = this.d;
        if ((Float.floatToRawIntBits(f) & Integer.MAX_VALUE) < 2139095040) {
            str2 = "radius=" + f + ", ";
        }
        return "RadialGradient(colors=" + this.a + ", stops=" + this.b + ", " + str + str2 + "tileMode=" + ((Object) bls.a()) + ')';
    }
}
