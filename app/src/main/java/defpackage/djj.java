package defpackage;

/* compiled from: PG */
@uid
/* loaded from: classes2.dex */
public final class djj {
    public final float a = 0.5f;

    public final boolean equals(Object obj) {
        if (!(obj instanceof djj)) {
            return false;
        }
        float f = ((djj) obj).a;
        return Float.compare(0.5f, 0.5f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(0.5f);
    }

    public final String toString() {
        return "Radial(ratio=0.5)";
    }
}
