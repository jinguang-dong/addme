package defpackage;

import com.google.android.apps.camera.jni.saliency.tLp.KsvNaXS;

/* compiled from: PG */
@uid
/* loaded from: classes.dex */
public final class bkf {
    public final long a;

    public /* synthetic */ bkf(long j) {
        this.a = j;
    }

    public static final float a(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (float) Math.sqrt((fIntBitsToFloat * fIntBitsToFloat) + (fIntBitsToFloat2 * fIntBitsToFloat2));
    }

    public static final long b(long j, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) * f;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) * f;
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L);
    }

    public static /* synthetic */ long d(long j, int i) {
        return (Float.floatToRawIntBits((i & 1) != 0 ? Float.intBitsToFloat((int) (j >> 32)) : 0.0f) << 32) | (Float.floatToRawIntBits((i & 2) != 0 ? Float.intBitsToFloat((int) (j & 4294967295L)) : 0.0f) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bkf) && this.a == ((bkf) obj).a;
    }

    public final int hashCode() {
        return a.r(this.a);
    }

    public final String toString() {
        return c(this.a);
    }

    public static String c(long j) {
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            return KsvNaXS.PDLcZkgVr;
        }
        return "Offset(" + acv.p(Float.intBitsToFloat((int) (j >> 32))) + ", " + acv.p(Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
    }
}
