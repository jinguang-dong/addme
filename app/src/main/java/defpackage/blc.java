package defpackage;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class blc extends bln {
    private final List a;
    private final long c;
    private final long d;
    private final List b = null;
    private final int e = 0;

    public blc(List list, long j, long j2) {
        this.a = list;
        this.c = j;
        this.d = j2;
    }

    @Override // defpackage.bln
    public final Shader b(long j) {
        long j2 = this.c;
        int i = (int) (j2 >> 32);
        if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
            i = (int) (j >> 32);
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
            i2 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        long j3 = this.d;
        int i3 = (int) (j3 >> 32);
        if (Float.intBitsToFloat(i3) == Float.POSITIVE_INFINITY) {
            i3 = (int) (j >> 32);
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat(i3);
        int i4 = (int) (j3 & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i4) == Float.POSITIVE_INFINITY ? Float.intBitsToFloat((int) (j & 4294967295L)) : Float.intBitsToFloat(i4);
        List list = this.a;
        long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L;
        long jFloatToRawIntBits3 = Float.floatToRawIntBits(fIntBitsToFloat3);
        blb.o(list, null);
        long jFloatToRawIntBits4 = (Float.floatToRawIntBits(fIntBitsToFloat4) & 4294967295L) | (jFloatToRawIntBits3 << 32);
        long j4 = (jFloatToRawIntBits << 32) | jFloatToRawIntBits2;
        return new LinearGradient(Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), Float.intBitsToFloat((int) (jFloatToRawIntBits4 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits4 & 4294967295L)), blb.p(list), (float[]) null, blb.n());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blc)) {
            return false;
        }
        blc blcVar = (blc) obj;
        if (!a.ao(this.a, blcVar.a)) {
            return false;
        }
        List list = blcVar.b;
        if (!a.ao(null, null) || !a.q(this.c, blcVar.c) || !a.q(this.d, blcVar.d)) {
            return false;
        }
        int i = blcVar.e;
        return a.p(0, 0);
    }

    public final int hashCode() {
        return ((((this.a.hashCode() * 961) + a.r(this.c)) * 31) + a.r(this.d)) * 31;
    }

    public final String toString() {
        String str;
        long j = this.c;
        String str2 = "";
        if (((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((Object) bkf.c(j)) + ", ";
        } else {
            str = "";
        }
        long j2 = this.d;
        if (((((j2 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) bkf.c(j2)) + ", ";
        }
        return "LinearGradient(colors=" + this.a + ", stops=null, " + str + str2 + "tileMode=" + ((Object) bls.a()) + ')';
    }
}
