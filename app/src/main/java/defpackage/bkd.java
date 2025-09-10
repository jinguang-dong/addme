package defpackage;

/* compiled from: PG */
@uid
/* loaded from: classes.dex */
public final class bkd {
    public static String a(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) == Float.intBitsToFloat(i)) {
            return "CornerRadius.circular(" + acv.p(Float.intBitsToFloat(i2)) + ')';
        }
        return "CornerRadius.elliptical(" + acv.p(Float.intBitsToFloat(i2)) + ", " + acv.p(Float.intBitsToFloat(i)) + ')';
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
