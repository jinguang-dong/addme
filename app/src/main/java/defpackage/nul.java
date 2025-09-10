package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nul {
    public static final nul a = new nul();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nul) {
            if (Float.floatToIntBits(1.0f) == Float.floatToIntBits(1.0f) && Float.floatToIntBits(1.0f) == Float.floatToIntBits(1.0f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(1.0f) ^ ((Float.floatToIntBits(1.0f) ^ 385623362) * 1000003);
    }

    public final String toString() {
        return "{false, 1.0, 1.0}";
    }
}
