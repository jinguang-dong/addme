package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cvk {
    public static final /* synthetic */ int a = 0;

    static {
        a.t(0.0f, 0.0f);
    }

    public static final float a(float f, float f2) {
        return (float) Math.sqrt((f * f) + (f2 * f2));
    }

    public static final float b(float f, float f2, float f3) {
        return ((1.0f - f3) * f) + (f3 * f2);
    }

    public static final long c(float f, float f2) {
        float fA = a(f, f2);
        if (fA > 0.0f) {
            return a.t(f / fA, f2 / fA);
        }
        throw new IllegalArgumentException("Required distance greater than zero");
    }

    public static final long d(long j) {
        return a.t(-Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j >> 32)));
    }

    public static final float e(float f) {
        return ((f % 1.0f) + 1.0f) % 1.0f;
    }
}
